package io.vpplab.loadforecast.client;

import io.vpplab.external.client.datahub.DatahubDao;
import io.vpplab.external.client.vpf.VPFDao;
import io.vpplab.external.client.vpf.VPFDto;
import io.vpplab.kpx.loadforecast.prod.*;
import jakarta.annotation.PostConstruct;
import jakarta.xml.bind.JAXBElement;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.ws.client.WebServiceFaultException;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.SoapFaultClientException;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class LoadForecastClientServiceDev extends WebServiceGatewaySupport {

    private DatatypeFactory datatypeFactory;
    private ObjectFactory objectFactory;

    @Value("${cim-real.user-id}")
    private String realUserId;
    @Value("${cim-real.password}")
    private String realEncryptedPassword;

    private final VPFDao vpfDao;
    private final DatahubDao datahubDao;

    @PostConstruct
    public void initialize() {
        objectFactory = new ObjectFactory();

        try {
            datatypeFactory = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException e) {
            throw new Error(e);
        }
    }

    private HeaderType setRequestHeader(String verb, String noun, String epmId, String epmEncPw) {
        UserType userType = objectFactory.createUserType();
        userType.setUserID(epmId); // kpx 발급 id
        userType.setPassword(epmEncPw); // kpx 발급 password, 공개키로 RSA 암호화해서 전송 -> resources/cert/publicKey.key 이용

        HeaderType header = objectFactory.createHeaderType();
        header.setUser(userType);
        header.setVerb(verb);
        header.setNoun(noun); // payload entity 와 동일한 이름 표기
        return header;
    }

    public int insertRTLoadForecastData(Map<String,Object> param){
        int result = 0;

        try{
            String requestDate = "";
            String areaCode = "JEJU";
            String scheduleType = "RT";
            if(ObjectUtils.isEmpty(param)){
                LocalDateTime now = LocalDateTime.now();
                requestDate = now.format(DateTimeFormatter.ISO_DATE);
                areaCode = "JEJU";
                scheduleType = "RT";
            }else{
                requestDate = param.get("requestDate").toString();
                areaCode = param.get("areaCode").toString();
                scheduleType = param.get("scheduleType").toString();
            }

            GetRTLoadForecastResponseMessageType rtLoadForecastResponseMessageType = getRTLoadForecastData(param);
            String replyResult = rtLoadForecastResponseMessageType.getReply().getResult();
            if(!"OK".equals(replyResult)) {
                throw new WebServiceFaultException("RTLoadForecast(예측수요실시간) data result not OK");
            }

            if(rtLoadForecastResponseMessageType.getPayload().getRTLoadForecast().size() == 0){
                throw new NullPointerException("RTLoadForecast(예측수요실시간) list null");
            }

            List<RTLoadForecast> rtLoadForecasts
                    = rtLoadForecastResponseMessageType.getPayload()
                    .getRTLoadForecast();
            log.info("size="+rtLoadForecasts.size());

            String finalScheduleType = scheduleType;
            List<VPFDto.InsertLFRequest> insertLFRequests = rtLoadForecasts
                    .stream()
                    .flatMap(lfv -> lfv.getAreaLoadCurve().getTimePoints().stream()
                            .map(timePoint -> {
                                XMLGregorianCalendar startTime = lfv.getAreaLoadCurve().getStartTime();
                                startTime.setTimezone(9);
                                LocalDateTime baseLdt = startTime.toGregorianCalendar().toZonedDateTime().toLocalDateTime();
                                int seqNo = timePoint.getSequenceNumber();
                                LocalDateTime adjustedLdt = baseLdt.plusMinutes((seqNo - 1) * 15);
                                BigDecimal value = BigDecimal.valueOf(timePoint.getValue1());
                                return new VPFDto.InsertLFRequest(true, finalScheduleType, adjustedLdt, value);
                            }))
                    .collect(Collectors.toList());

            log.info("insertLFRequests=="+insertLFRequests.toString());

            // vpf insert
            result = vpfDao.insertLoadForecast(insertLFRequests);
            log.info("Count inserted into VPF == "+result);

            // datahub insert
            result += datahubDao.insertLoadForecast(insertLFRequests);
            log.info("Count inserted into datahub == "+result);
        }catch(SoapFaultClientException e) {
            log.error("{}", e.getMessage());
        } catch(Exception e) {
            log.error("{}", e.getMessage());
        }
        return result;
    }



    /**
     * 예측수요(실시간) 조회
     * @return
     */
    public GetRTLoadForecastResponseMessageType getRTLoadForecastData(Map<String,Object> param) {
        JAXBElement<GetRTLoadForecastResponseMessageType> responseMessageTypeJAXBElement;
        String username = realUserId;
        String encPassword = realEncryptedPassword;

        /*String username = "SM8001";
        String encPassword = "m8Alg1OrwjIULOlcyB4T5a0LGKEfI/NbrQfYEpL50uWuaanJ/3h9BTPBoM2K6rHwOBvAnpfuM2bN82CH2Lhbk3lEpVLafbXlacaja6ILUgfBhcalvby6xgWiyH+kIc2Jj/lwCKKsF+mv4THZgWhk6tcFacRQKVN7mTO8Ohgye618CqNxy9s5Gi2NarDU2MR5wRaKCgkmXmt0vrclJpWldWxe4NQ8HbqLs+fnOsezt0mr/N4nyFpWHMIS9ptm3SlPKLAGO4WIKp4UTCXPy1doB6Ib5Z5I3RrIiJMYQWxl8Z0htdmY1KNDvF40qOsthm4pWkqoEVIt+2s0E/UAiLM7xuoZaVG0WenisZshGm5rvUMOGU+Voq5ledSEBhw/pN/pRlhCmPRuT6BBiU5n01MKhq3tjk0gq/r+Wz60fdV44A0GpMTFTHG/cBfhxZ9ezvNir0wdlnuNXmE1iBDYaBQaFaBN9vJjhsO8Y0H9P1HJUXAI9txUhXWbz9xsStkSG4Kd";
*/
        HeaderType headerType = setRequestHeader("get","RTLoadForecast",username,encPassword);

        String requestDate = "";
        String areaCode = "JEJU";
        String sceduleType = "RT";
        if(ObjectUtils.isEmpty(param)){
            LocalDateTime now = LocalDateTime.now();
            requestDate = now.format(DateTimeFormatter.ISO_DATE);
        }else{
            requestDate = param.get("requestDate").toString();
            areaCode = param.get("areaCode").toString();
            sceduleType = param.get("scheduleType").toString();
        }


        XMLGregorianCalendar tradingDay = datatypeFactory.newXMLGregorianCalendar(requestDate);


        Market market = objectFactory.createMarket();
        market.setTradingDay(tradingDay);

        MktLoadArea mktLoadArea = objectFactory.createMktLoadArea();
        mktLoadArea.setAreaCode(areaCode);

        Schedule schedule = objectFactory.createSchedule();
        schedule.setScheduleType(ScheduleType.valueOf(sceduleType));  //당일 : OP / 실시간 : RT

        RTLoadForecastGetProfile rtLoadForecastGetProfile = objectFactory.createRTLoadForecastGetProfile();
        rtLoadForecastGetProfile.setMarket(market);
        rtLoadForecastGetProfile.setMktLoadArea(mktLoadArea);
        rtLoadForecastGetProfile.setSchedule(schedule);

        RTLoadForecastRequestType rtLoadForecastRequestType = objectFactory.createRTLoadForecastRequestType();
        rtLoadForecastRequestType.setRTLoadForecastGetProfile(rtLoadForecastGetProfile);

        GetRTLoadForecastRequestMessageType requestMessageType = objectFactory.createGetRTLoadForecastRequestMessageType();
        requestMessageType.setHeader(headerType);
        requestMessageType.setRequest(rtLoadForecastRequestType);

        try{
            JAXBElement<GetRTLoadForecastRequestMessageType> requestMessageTypeJAXBElement = objectFactory.createGetRequestRTLoadForecasts(requestMessageType);

            responseMessageTypeJAXBElement
                    = (JAXBElement<GetRTLoadForecastResponseMessageType>) getWebServiceTemplate()
                    .marshalSendAndReceive("http://services.kmos.kr/test/loadforecast"
                            , requestMessageTypeJAXBElement
                            , new SoapActionCallback("http://www.kpx.or.kr/2014/service/rtloadforecast"));

            log.info("{}",responseMessageTypeJAXBElement.getValue());

            return responseMessageTypeJAXBElement.getValue();
        }catch (SoapFaultClientException e){
            log.error("{}",e.getCause());
            throw e;
        }
    }

    /**
     * 예측수요(일반) 조회
     * @return
     */
    public GetLoadForecastResponseMessageType getLoadForecastData() {
        JAXBElement<GetLoadForecastResponseMessageType> responseMessageTypeJAXBElement;

        String username = realUserId;
        String encPassword = realEncryptedPassword;

        HeaderType headerType = setRequestHeader("get","LoadForecast",username,encPassword);

        LocalDateTime now = LocalDateTime.now();
        XMLGregorianCalendar tradingDay = datatypeFactory.newXMLGregorianCalendar(now.format(DateTimeFormatter.ISO_DATE));
        //XMLGregorianCalendar tradingDay = datatypeFactory.newXMLGregorianCalendar("2024-03-01");

        Market market = objectFactory.createMarket();
        market.setTradingDay(tradingDay);

        MktLoadArea mktLoadArea = objectFactory.createMktLoadArea();
        mktLoadArea.setAreaCode("JEJU");


        LoadForecastGetProfile loadForecastGetProfile = objectFactory.createLoadForecastGetProfile();
        loadForecastGetProfile.setMarket(market);
        loadForecastGetProfile.setMktLoadArea(mktLoadArea);

        LoadForecastRequestType loadForecastRequestType = objectFactory.createLoadForecastRequestType();
        loadForecastRequestType.setLoadForecastGetProfile(loadForecastGetProfile);

        GetLoadForecastRequestMessageType requestMessageType = objectFactory.createGetLoadForecastRequestMessageType();
        requestMessageType.setHeader(headerType);
        requestMessageType.setRequest(loadForecastRequestType);

        try{
            JAXBElement<GetLoadForecastRequestMessageType> requestMessageTypeJAXBElement = objectFactory.createGetRequestLoadForecasts(requestMessageType);

            responseMessageTypeJAXBElement
                    = (JAXBElement<GetLoadForecastResponseMessageType>) getWebServiceTemplate()
                    .marshalSendAndReceive("http://services.kmos.kr/loadforecast"
                            , requestMessageTypeJAXBElement
                            , new SoapActionCallback("http://www.kpx.or.kr/2014/service/loadforecast"));

            log.info("{}",responseMessageTypeJAXBElement.getValue());


            return responseMessageTypeJAXBElement.getValue();
        }catch (SoapFaultClientException e){
            log.error("{}",e.getCause());
            throw e;
        }
    }
}
