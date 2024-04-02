
package io.vpplab.kpx.loadforecast.prod;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * AnalogValue represents an analog MeasurementValue.
 * 
 * <p>QuarterValue complex type에 대한 Java 클래스입니다.</p>
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.</p>
 * 
 * <pre>{@code
 * <complexType name="QuarterValue">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="rtoId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuarterValue", namespace = "http://www.kpx.or.kr/2014/schema/common#", propOrder = {
    "rtoId",
    "sequenceNumber",
    "timeStamp",
    "value"
})
public class QuarterValue {

    /**
     * 발전기코드
     * 
     */
    protected String rtoId;
    /**
     * 일련번호
     * 
     */
    protected Integer sequenceNumber;
    /**
     * The time when the value was last updated
     * 
     */
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    /**
     * The value to supervise.
     * 
     */
    protected String value;

    /**
     * 발전기코드
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtoId() {
        return rtoId;
    }

    /**
     * rtoId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRtoId()
     */
    public void setRtoId(String value) {
        this.rtoId = value;
    }

    /**
     * 일련번호
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * sequenceNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getSequenceNumber()
     */
    public void setSequenceNumber(Integer value) {
        this.sequenceNumber = value;
    }

    /**
     * The time when the value was last updated
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * timeStamp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getTimeStamp()
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * The value to supervise.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * value 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getValue()
     */
    public void setValue(String value) {
        this.value = value;
    }

}
