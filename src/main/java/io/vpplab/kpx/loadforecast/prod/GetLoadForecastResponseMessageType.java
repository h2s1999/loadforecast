
package io.vpplab.kpx.loadforecast.prod;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>GetLoadForecastResponseMessageType complex type에 대한 Java 클래스입니다.</p>
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.</p>
 * 
 * <pre>{@code
 * <complexType name="GetLoadForecastResponseMessageType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Header" type="{http://iec.ch/TC57/2011/schema/message}HeaderType"/>
 *         <element name="Reply" type="{http://iec.ch/TC57/2011/schema/message}ReplyType"/>
 *         <element name="Payload" type="{http://www.kpx.or.kr/2014/schema/loadforecast#}LoadForecastPayloadType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetLoadForecastResponseMessageType", namespace = "http://www.kpx.or.kr/2014/schema/loadforecast#", propOrder = {
    "header",
    "reply",
    "payload"
})
public class GetLoadForecastResponseMessageType {

    @XmlElement(name = "Header", required = true)
    protected HeaderType header;
    @XmlElement(name = "Reply", required = true)
    protected ReplyType reply;
    @XmlElement(name = "Payload", required = true)
    protected LoadForecastPayloadType payload;

    /**
     * header 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link HeaderType }
     *     
     */
    public HeaderType getHeader() {
        return header;
    }

    /**
     * header 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType }
     *     
     */
    public void setHeader(HeaderType value) {
        this.header = value;
    }

    /**
     * reply 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ReplyType }
     *     
     */
    public ReplyType getReply() {
        return reply;
    }

    /**
     * reply 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplyType }
     *     
     */
    public void setReply(ReplyType value) {
        this.reply = value;
    }

    /**
     * payload 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link LoadForecastPayloadType }
     *     
     */
    public LoadForecastPayloadType getPayload() {
        return payload;
    }

    /**
     * payload 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadForecastPayloadType }
     *     
     */
    public void setPayload(LoadForecastPayloadType value) {
        this.payload = value;
    }

}
