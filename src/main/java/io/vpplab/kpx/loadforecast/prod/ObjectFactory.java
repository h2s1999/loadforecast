
package io.vpplab.kpx.loadforecast.prod;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.vpplab.kpx.loadforecast.prod package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _Message_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "Message");
    private static final QName _RequestMessage_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "RequestMessage");
    private static final QName _ResponseMessage_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "ResponseMessage");
    private static final QName _EventMessage_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "EventMessage");
    private static final QName _FaultMessage_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "FaultMessage");
    private static final QName _GetRequestLoadForecasts_QNAME = new QName("http://www.kpx.or.kr/2014/schema/loadforecast#", "GetRequestLoadForecasts");
    private static final QName _GetResponseLoadForecasts_QNAME = new QName("http://www.kpx.or.kr/2014/schema/loadforecast#", "GetResponseLoadForecasts");
    private static final QName _GetRequestRTLoadForecasts_QNAME = new QName("http://www.kpx.or.kr/2014/schema/loadforecast#", "GetRequestRTLoadForecasts");
    private static final QName _GetResponseRTLoadForecasts_QNAME = new QName("http://www.kpx.or.kr/2014/schema/loadforecast#", "GetResponseRTLoadForecasts");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.vpplab.kpx.loadforecast.prod
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     * @return
     *     the new instance of {@link ErrorType }
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link PayloadType }
     * 
     * @return
     *     the new instance of {@link PayloadType }
     */
    public PayloadType createPayloadType() {
        return new PayloadType();
    }

    /**
     * Create an instance of {@link ReplyType }
     * 
     * @return
     *     the new instance of {@link ReplyType }
     */
    public ReplyType createReplyType() {
        return new ReplyType();
    }

    /**
     * Create an instance of {@link RequestType }
     * 
     * @return
     *     the new instance of {@link RequestType }
     */
    public RequestType createRequestType() {
        return new RequestType();
    }

    /**
     * Create an instance of {@link MessageType }
     * 
     * @return
     *     the new instance of {@link MessageType }
     */
    public MessageType createMessageType() {
        return new MessageType();
    }

    /**
     * Create an instance of {@link RequestMessageType }
     * 
     * @return
     *     the new instance of {@link RequestMessageType }
     */
    public RequestMessageType createRequestMessageType() {
        return new RequestMessageType();
    }

    /**
     * Create an instance of {@link ResponseMessageType }
     * 
     * @return
     *     the new instance of {@link ResponseMessageType }
     */
    public ResponseMessageType createResponseMessageType() {
        return new ResponseMessageType();
    }

    /**
     * Create an instance of {@link EventMessageType }
     * 
     * @return
     *     the new instance of {@link EventMessageType }
     */
    public EventMessageType createEventMessageType() {
        return new EventMessageType();
    }

    /**
     * Create an instance of {@link FaultMessageType }
     * 
     * @return
     *     the new instance of {@link FaultMessageType }
     */
    public FaultMessageType createFaultMessageType() {
        return new FaultMessageType();
    }

    /**
     * Create an instance of {@link OperationType }
     * 
     * @return
     *     the new instance of {@link OperationType }
     */
    public OperationType createOperationType() {
        return new OperationType();
    }

    /**
     * Create an instance of {@link OperationSet }
     * 
     * @return
     *     the new instance of {@link OperationSet }
     */
    public OperationSet createOperationSet() {
        return new OperationSet();
    }

    /**
     * Create an instance of {@link ReplayDetectionType }
     * 
     * @return
     *     the new instance of {@link ReplayDetectionType }
     */
    public ReplayDetectionType createReplayDetectionType() {
        return new ReplayDetectionType();
    }

    /**
     * Create an instance of {@link UserType }
     * 
     * @return
     *     the new instance of {@link UserType }
     */
    public UserType createUserType() {
        return new UserType();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     * @return
     *     the new instance of {@link HeaderType }
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link MessageProperty }
     * 
     * @return
     *     the new instance of {@link MessageProperty }
     */
    public MessageProperty createMessageProperty() {
        return new MessageProperty();
    }

    /**
     * Create an instance of {@link OptionType }
     * 
     * @return
     *     the new instance of {@link OptionType }
     */
    public OptionType createOptionType() {
        return new OptionType();
    }

    /**
     * Create an instance of {@link LocationType }
     * 
     * @return
     *     the new instance of {@link LocationType }
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link ObjectType }
     * 
     * @return
     *     the new instance of {@link ObjectType }
     */
    public ObjectType createObjectType() {
        return new ObjectType();
    }

    /**
     * Create an instance of {@link NameType }
     * 
     * @return
     *     the new instance of {@link NameType }
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link Name }
     * 
     * @return
     *     the new instance of {@link Name }
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link NameTypeAuthority }
     * 
     * @return
     *     the new instance of {@link NameTypeAuthority }
     */
    public NameTypeAuthority createNameTypeAuthority() {
        return new NameTypeAuthority();
    }

    /**
     * Create an instance of {@link GetLoadForecastRequestMessageType }
     * 
     * @return
     *     the new instance of {@link GetLoadForecastRequestMessageType }
     */
    public GetLoadForecastRequestMessageType createGetLoadForecastRequestMessageType() {
        return new GetLoadForecastRequestMessageType();
    }

    /**
     * Create an instance of {@link GetLoadForecastResponseMessageType }
     * 
     * @return
     *     the new instance of {@link GetLoadForecastResponseMessageType }
     */
    public GetLoadForecastResponseMessageType createGetLoadForecastResponseMessageType() {
        return new GetLoadForecastResponseMessageType();
    }

    /**
     * Create an instance of {@link GetRTLoadForecastRequestMessageType }
     * 
     * @return
     *     the new instance of {@link GetRTLoadForecastRequestMessageType }
     */
    public GetRTLoadForecastRequestMessageType createGetRTLoadForecastRequestMessageType() {
        return new GetRTLoadForecastRequestMessageType();
    }

    /**
     * Create an instance of {@link GetRTLoadForecastResponseMessageType }
     * 
     * @return
     *     the new instance of {@link GetRTLoadForecastResponseMessageType }
     */
    public GetRTLoadForecastResponseMessageType createGetRTLoadForecastResponseMessageType() {
        return new GetRTLoadForecastResponseMessageType();
    }

    /**
     * Create an instance of {@link LoadForecastGetProfile }
     * 
     * @return
     *     the new instance of {@link LoadForecastGetProfile }
     */
    public LoadForecastGetProfile createLoadForecastGetProfile() {
        return new LoadForecastGetProfile();
    }

    /**
     * Create an instance of {@link LoadForecast }
     * 
     * @return
     *     the new instance of {@link LoadForecast }
     */
    public LoadForecast createLoadForecast() {
        return new LoadForecast();
    }

    /**
     * Create an instance of {@link RTLoadForecastGetProfile }
     * 
     * @return
     *     the new instance of {@link RTLoadForecastGetProfile }
     */
    public RTLoadForecastGetProfile createRTLoadForecastGetProfile() {
        return new RTLoadForecastGetProfile();
    }

    /**
     * Create an instance of {@link RTLoadForecast }
     * 
     * @return
     *     the new instance of {@link RTLoadForecast }
     */
    public RTLoadForecast createRTLoadForecast() {
        return new RTLoadForecast();
    }

    /**
     * Create an instance of {@link AreaLoadCurve }
     * 
     * @return
     *     the new instance of {@link AreaLoadCurve }
     */
    public AreaLoadCurve createAreaLoadCurve() {
        return new AreaLoadCurve();
    }

    /**
     * Create an instance of {@link RegularTimePoint }
     * 
     * @return
     *     the new instance of {@link RegularTimePoint }
     */
    public RegularTimePoint createRegularTimePoint() {
        return new RegularTimePoint();
    }

    /**
     * Create an instance of {@link LoadForecastRequestType }
     * 
     * @return
     *     the new instance of {@link LoadForecastRequestType }
     */
    public LoadForecastRequestType createLoadForecastRequestType() {
        return new LoadForecastRequestType();
    }

    /**
     * Create an instance of {@link LoadForecastPayloadType }
     * 
     * @return
     *     the new instance of {@link LoadForecastPayloadType }
     */
    public LoadForecastPayloadType createLoadForecastPayloadType() {
        return new LoadForecastPayloadType();
    }

    /**
     * Create an instance of {@link RTLoadForecastRequestType }
     * 
     * @return
     *     the new instance of {@link RTLoadForecastRequestType }
     */
    public RTLoadForecastRequestType createRTLoadForecastRequestType() {
        return new RTLoadForecastRequestType();
    }

    /**
     * Create an instance of {@link RTLoadForecastPayloadType }
     * 
     * @return
     *     the new instance of {@link RTLoadForecastPayloadType }
     */
    public RTLoadForecastPayloadType createRTLoadForecastPayloadType() {
        return new RTLoadForecastPayloadType();
    }

    /**
     * Create an instance of {@link MktLoadArea }
     * 
     * @return
     *     the new instance of {@link MktLoadArea }
     */
    public MktLoadArea createMktLoadArea() {
        return new MktLoadArea();
    }

    /**
     * Create an instance of {@link DateTimeInterval }
     * 
     * @return
     *     the new instance of {@link DateTimeInterval }
     */
    public DateTimeInterval createDateTimeInterval() {
        return new DateTimeInterval();
    }

    /**
     * Create an instance of {@link Document }
     * 
     * @return
     *     the new instance of {@link Document }
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link CurveData }
     * 
     * @return
     *     the new instance of {@link CurveData }
     */
    public CurveData createCurveData() {
        return new CurveData();
    }

    /**
     * Create an instance of {@link Measurement }
     * 
     * @return
     *     the new instance of {@link Measurement }
     */
    public Measurement createMeasurement() {
        return new Measurement();
    }

    /**
     * Create an instance of {@link Analog }
     * 
     * @return
     *     the new instance of {@link Analog }
     */
    public Analog createAnalog() {
        return new Analog();
    }

    /**
     * Create an instance of {@link AnalogValue }
     * 
     * @return
     *     the new instance of {@link AnalogValue }
     */
    public AnalogValue createAnalogValue() {
        return new AnalogValue();
    }

    /**
     * Create an instance of {@link QuarterValue }
     * 
     * @return
     *     the new instance of {@link QuarterValue }
     */
    public QuarterValue createQuarterValue() {
        return new QuarterValue();
    }

    /**
     * Create an instance of {@link Market }
     * 
     * @return
     *     the new instance of {@link Market }
     */
    public Market createMarket() {
        return new Market();
    }

    /**
     * Create an instance of {@link MarketProduct }
     * 
     * @return
     *     the new instance of {@link MarketProduct }
     */
    public MarketProduct createMarketProduct() {
        return new MarketProduct();
    }

    /**
     * Create an instance of {@link Schedule }
     * 
     * @return
     *     the new instance of {@link Schedule }
     */
    public Schedule createSchedule() {
        return new Schedule();
    }

    /**
     * Create an instance of {@link ErrorType.ID }
     * 
     * @return
     *     the new instance of {@link ErrorType.ID }
     */
    public ErrorType.ID createErrorTypeID() {
        return new ErrorType.ID();
    }

    /**
     * Create an instance of {@link ErrorType.RelatedID }
     * 
     * @return
     *     the new instance of {@link ErrorType.RelatedID }
     */
    public ErrorType.RelatedID createErrorTypeRelatedID() {
        return new ErrorType.RelatedID();
    }

    /**
     * Create an instance of {@link PayloadType.ID }
     * 
     * @return
     *     the new instance of {@link PayloadType.ID }
     */
    public PayloadType.ID createPayloadTypeID() {
        return new PayloadType.ID();
    }

    /**
     * Create an instance of {@link ReplyType.ID }
     * 
     * @return
     *     the new instance of {@link ReplyType.ID }
     */
    public ReplyType.ID createReplyTypeID() {
        return new ReplyType.ID();
    }

    /**
     * Create an instance of {@link RequestType.ID }
     * 
     * @return
     *     the new instance of {@link RequestType.ID }
     */
    public RequestType.ID createRequestTypeID() {
        return new RequestType.ID();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MessageType }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "Message")
    public JAXBElement<MessageType> createMessage(MessageType value) {
        return new JAXBElement<>(_Message_QNAME, MessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestMessageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestMessageType }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "RequestMessage")
    public JAXBElement<RequestMessageType> createRequestMessage(RequestMessageType value) {
        return new JAXBElement<>(_RequestMessage_QNAME, RequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "ResponseMessage")
    public JAXBElement<ResponseMessageType> createResponseMessage(ResponseMessageType value) {
        return new JAXBElement<>(_ResponseMessage_QNAME, ResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventMessageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EventMessageType }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "EventMessage")
    public JAXBElement<EventMessageType> createEventMessage(EventMessageType value) {
        return new JAXBElement<>(_EventMessage_QNAME, EventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultMessageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultMessageType }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "FaultMessage")
    public JAXBElement<FaultMessageType> createFaultMessage(FaultMessageType value) {
        return new JAXBElement<>(_FaultMessage_QNAME, FaultMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLoadForecastRequestMessageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetLoadForecastRequestMessageType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kpx.or.kr/2014/schema/loadforecast#", name = "GetRequestLoadForecasts")
    public JAXBElement<GetLoadForecastRequestMessageType> createGetRequestLoadForecasts(GetLoadForecastRequestMessageType value) {
        return new JAXBElement<>(_GetRequestLoadForecasts_QNAME, GetLoadForecastRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLoadForecastResponseMessageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetLoadForecastResponseMessageType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kpx.or.kr/2014/schema/loadforecast#", name = "GetResponseLoadForecasts")
    public JAXBElement<GetLoadForecastResponseMessageType> createGetResponseLoadForecasts(GetLoadForecastResponseMessageType value) {
        return new JAXBElement<>(_GetResponseLoadForecasts_QNAME, GetLoadForecastResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRTLoadForecastRequestMessageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRTLoadForecastRequestMessageType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kpx.or.kr/2014/schema/loadforecast#", name = "GetRequestRTLoadForecasts")
    public JAXBElement<GetRTLoadForecastRequestMessageType> createGetRequestRTLoadForecasts(GetRTLoadForecastRequestMessageType value) {
        return new JAXBElement<>(_GetRequestRTLoadForecasts_QNAME, GetRTLoadForecastRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRTLoadForecastResponseMessageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRTLoadForecastResponseMessageType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kpx.or.kr/2014/schema/loadforecast#", name = "GetResponseRTLoadForecasts")
    public JAXBElement<GetRTLoadForecastResponseMessageType> createGetResponseRTLoadForecasts(GetRTLoadForecastResponseMessageType value) {
        return new JAXBElement<>(_GetResponseRTLoadForecasts_QNAME, GetRTLoadForecastResponseMessageType.class, null, value);
    }

}
