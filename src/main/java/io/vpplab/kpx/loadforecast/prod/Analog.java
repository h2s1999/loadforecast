
package io.vpplab.kpx.loadforecast.prod;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Analog represents an analog Measurement.
 * 
 * <p>Analog complex type에 대한 Java 클래스입니다.</p>
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.</p>
 * 
 * <pre>{@code
 * <complexType name="Analog">
 *   <complexContent>
 *     <extension base="{http://www.kpx.or.kr/2014/schema/common#}Measurement">
 *       <sequence>
 *         <element name="AnalogValues" type="{http://www.kpx.or.kr/2014/schema/common#}AnalogValue" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Analog", namespace = "http://www.kpx.or.kr/2014/schema/common#", propOrder = {
    "analogValues"
})
public class Analog
    extends Measurement
{

    /**
     * The values connected to this measurement.
     * 
     */
    @XmlElement(name = "AnalogValues")
    protected List<AnalogValue> analogValues;

    /**
     * The values connected to this measurement.
     * 
     * Gets the value of the analogValues property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the analogValues property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAnalogValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnalogValue }
     * </p>
     * 
     * 
     * @return
     *     The value of the analogValues property.
     */
    public List<AnalogValue> getAnalogValues() {
        if (analogValues == null) {
            analogValues = new ArrayList<>();
        }
        return this.analogValues;
    }

}
