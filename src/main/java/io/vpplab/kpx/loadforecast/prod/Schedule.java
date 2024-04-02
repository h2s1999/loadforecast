
package io.vpplab.kpx.loadforecast.prod;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Schedule complex type에 대한 Java 클래스입니다.</p>
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.</p>
 * 
 * <pre>{@code
 * <complexType name="Schedule">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="scheduleType" type="{http://www.kpx.or.kr/2014/schema/common#}ScheduleType"/>
 *         <element name="confirmationYn" type="{http://www.kpx.or.kr/2014/schema/common#}ConfirmationYn"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Schedule", namespace = "http://www.kpx.or.kr/2014/schema/common#", propOrder = {
    "scheduleType",
    "confirmationYn"
})
public class Schedule {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ScheduleType scheduleType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ConfirmationYn confirmationYn;

    /**
     * scheduleType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleType }
     *     
     */
    public ScheduleType getScheduleType() {
        return scheduleType;
    }

    /**
     * scheduleType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleType }
     *     
     */
    public void setScheduleType(ScheduleType value) {
        this.scheduleType = value;
    }

    /**
     * confirmationYn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationYn }
     *     
     */
    public ConfirmationYn getConfirmationYn() {
        return confirmationYn;
    }

    /**
     * confirmationYn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationYn }
     *     
     */
    public void setConfirmationYn(ConfirmationYn value) {
        this.confirmationYn = value;
    }

}
