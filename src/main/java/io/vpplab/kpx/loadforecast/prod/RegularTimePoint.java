
package io.vpplab.kpx.loadforecast.prod;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Time point for a schedule where the time between the consecutive points is constant.
 * 
 * <p>RegularTimePoint complex type에 대한 Java 클래스입니다.</p>
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.</p>
 * 
 * <pre>{@code
 * <complexType name="RegularTimePoint">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="value1" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegularTimePoint", namespace = "http://www.kpx.or.kr/2014/schema/loadforecast#", propOrder = {
    "sequenceNumber",
    "value1"
})
public class RegularTimePoint {

    /**
     * The position of the regular time point in the sequence. Note that time points don't have to be sequential, i.e. time points may be omitted. The actual time for a RegularTimePoint is computed by multiplying the associated regular interval schedule's time step with the regular time point sequence number and adding the associated schedules start time.
     * 
     */
    protected int sequenceNumber;
    /**
     * The first value at the time. The meaning of the value is defined by the derived type of the associated schedule.
     * 
     */
    protected float value1;

    /**
     * The position of the regular time point in the sequence. Note that time points don't have to be sequential, i.e. time points may be omitted. The actual time for a RegularTimePoint is computed by multiplying the associated regular interval schedule's time step with the regular time point sequence number and adding the associated schedules start time.
     * 
     */
    public int getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * sequenceNumber 속성의 값을 설정합니다.
     * 
     */
    public void setSequenceNumber(int value) {
        this.sequenceNumber = value;
    }

    /**
     * The first value at the time. The meaning of the value is defined by the derived type of the associated schedule.
     * 
     */
    public float getValue1() {
        return value1;
    }

    /**
     * value1 속성의 값을 설정합니다.
     * 
     */
    public void setValue1(float value) {
        this.value1 = value;
    }

}
