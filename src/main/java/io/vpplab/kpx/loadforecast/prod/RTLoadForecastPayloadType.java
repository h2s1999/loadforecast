
package io.vpplab.kpx.loadforecast.prod;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>RTLoadForecastPayloadType complex type에 대한 Java 클래스입니다.</p>
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.</p>
 * 
 * <pre>{@code
 * <complexType name="RTLoadForecastPayloadType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RTLoadForecast" type="{http://www.kpx.or.kr/2014/schema/loadforecast#}RTLoadForecast" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RTLoadForecastPayloadType", namespace = "http://www.kpx.or.kr/2014/schema/loadforecast#", propOrder = {
    "rtLoadForecast"
})
public class RTLoadForecastPayloadType {

    @XmlElement(name = "RTLoadForecast", required = true)
    protected List<RTLoadForecast> rtLoadForecast;

    /**
     * Gets the value of the rtLoadForecast property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rtLoadForecast property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRTLoadForecast().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RTLoadForecast }
     * </p>
     * 
     * 
     * @return
     *     The value of the rtLoadForecast property.
     */
    public List<RTLoadForecast> getRTLoadForecast() {
        if (rtLoadForecast == null) {
            rtLoadForecast = new ArrayList<>();
        }
        return this.rtLoadForecast;
    }

}
