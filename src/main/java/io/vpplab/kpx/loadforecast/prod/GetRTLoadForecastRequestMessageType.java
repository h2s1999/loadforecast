
package io.vpplab.kpx.loadforecast.prod;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>GetRTLoadForecastRequestMessageType complex type에 대한 Java 클래스입니다.</p>
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.</p>
 * 
 * <pre>{@code
 * <complexType name="GetRTLoadForecastRequestMessageType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Header" type="{http://iec.ch/TC57/2011/schema/message}HeaderType"/>
 *         <element name="Request" type="{http://www.kpx.or.kr/2014/schema/loadforecast#}RTLoadForecastRequestType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetRTLoadForecastRequestMessageType", namespace = "http://www.kpx.or.kr/2014/schema/loadforecast#", propOrder = {
    "header",
    "request"
})
public class GetRTLoadForecastRequestMessageType {

    @XmlElement(name = "Header", required = true)
    protected HeaderType header;
    @XmlElement(name = "Request", required = true)
    protected RTLoadForecastRequestType request;

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
     * request 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link RTLoadForecastRequestType }
     *     
     */
    public RTLoadForecastRequestType getRequest() {
        return request;
    }

    /**
     * request 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link RTLoadForecastRequestType }
     *     
     */
    public void setRequest(RTLoadForecastRequestType value) {
        this.request = value;
    }

}
