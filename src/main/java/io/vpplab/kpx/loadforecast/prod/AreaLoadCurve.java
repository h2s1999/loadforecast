
package io.vpplab.kpx.loadforecast.prod;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Area load curve definition.
 * 
 * <p>AreaLoadCurve complex type에 대한 Java 클래스입니다.</p>
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.</p>
 * 
 * <pre>{@code
 * <complexType name="AreaLoadCurve">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="timeStep" type="{http://www.kpx.or.kr/2014/schema/common#}Seconds"/>
 *         <element name="TimePoints" type="{http://www.kpx.or.kr/2014/schema/loadforecast#}RegularTimePoint" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AreaLoadCurve", namespace = "http://www.kpx.or.kr/2014/schema/loadforecast#", propOrder = {
    "startTime",
    "timeStep",
    "timePoints"
})
public class AreaLoadCurve {

    /**
     * The time for the first time point.
     * 
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    /**
     * The time between each pair of subsequent regular time points in sequence order.
     * 
     */
    protected float timeStep;
    /**
     * The regular interval time point data values that define this schedule.
     * 
     */
    @XmlElement(name = "TimePoints", required = true)
    protected List<RegularTimePoint> timePoints;

    /**
     * The time for the first time point.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * startTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getStartTime()
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * The time between each pair of subsequent regular time points in sequence order.
     * 
     */
    public float getTimeStep() {
        return timeStep;
    }

    /**
     * timeStep 속성의 값을 설정합니다.
     * 
     */
    public void setTimeStep(float value) {
        this.timeStep = value;
    }

    /**
     * The regular interval time point data values that define this schedule.
     * 
     * Gets the value of the timePoints property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timePoints property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTimePoints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegularTimePoint }
     * </p>
     * 
     * 
     * @return
     *     The value of the timePoints property.
     */
    public List<RegularTimePoint> getTimePoints() {
        if (timePoints == null) {
            timePoints = new ArrayList<>();
        }
        return this.timePoints;
    }

}
