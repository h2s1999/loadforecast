package io.vpplab.loadforecast.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StopWatch;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.WebServiceClientException;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.soap.saaj.SaajSoapMessage;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

@Slf4j
public class LoadForecastClientInterceptor implements ClientInterceptor {
    StopWatch stopWatch;

    @Override
    public boolean handleRequest(MessageContext messageContext) throws WebServiceClientException {
        stopWatch = new StopWatch();
        stopWatch.start("KPX_clearing");
        log.info("######################################## handleRequest ########################################");
        log.info("request envelope\r\n{}",commonInterceptorLogString(messageContext.getRequest()));
        log.info("######################################## handleRequest ########################################");
        return true;
    }

    @Override
    public boolean handleResponse(MessageContext messageContext) throws WebServiceClientException {
        stopWatch.stop();
        log.info("######################################## handleResponse ########################################");
        log.info("response envelope\r\n{}",commonInterceptorLogString(messageContext.getResponse()));
        log.info("request-response duration -> {} s",stopWatch.getTotalTimeSeconds());
        log.info("######################################## handleResponse ########################################");
        return true;
    }

    @Override
    public boolean handleFault(MessageContext messageContext) throws WebServiceClientException {
        log.error("######################################## handleFault ########################################");
        log.error("fault reason\r\n{}",((SaajSoapMessage)messageContext.getResponse()).getFaultReason());
        log.error("######################################## handleFault ########################################");
        return true;
    }

    @Override
    public void afterCompletion(MessageContext messageContext, Exception ex) throws WebServiceClientException {

    }

    private String commonInterceptorLogString(WebServiceMessage webServiceMessage) {
        SaajSoapMessage soapMessage = (SaajSoapMessage) webServiceMessage;
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()){
            soapMessage.writeTo(byteArrayOutputStream);
            Transformer transformer
                    = TransformerFactory.newInstance()
                    .newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            StreamResult result = new StreamResult(new StringWriter());

            ByteArrayInputStream byteArrayInputStream
                    = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            transformer.transform(new StreamSource(byteArrayInputStream), result);
            return result.getWriter().toString();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
