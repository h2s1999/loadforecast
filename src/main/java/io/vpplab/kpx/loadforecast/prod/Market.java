
package io.vpplab.kpx.loadforecast.prod;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Market (e.g., Day Ahead Market, RealTime Market) with a
 *         description of the the Market operation control parameters.
 * 
 * <p>Market complex type에 대한 Java 클래스입니다.</p>
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.</p>
 * 
 * <pre>{@code
 * <complexType name="Market">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="tradingDay" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="submitDay" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Market", namespace = "http://www.kpx.or.kr/2014/schema/common#", propOrder = {
    "tradingDay",
    "submitDay"
})
public class Market {

    /**
     * 거래일자
     * 
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tradingDay;
    /**
     * 제출일자
     * 
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar submitDay;

    /**
     * 거래일자
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTradingDay() {
        return tradingDay;
    }

    /**
     * tradingDay 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getTradingDay()
     */
    public void setTradingDay(XMLGregorianCalendar value) {
        this.tradingDay = value;
    }

    /**
     * 제출일자
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmitDay() {
        return submitDay;
    }

    /**
     * submitDay 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getSubmitDay()
     */
    public void setSubmitDay(XMLGregorianCalendar value) {
        this.submitDay = value;
    }

}
