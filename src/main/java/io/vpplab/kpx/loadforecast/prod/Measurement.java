
package io.vpplab.kpx.loadforecast.prod;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * When the sensor location is needed both Measurement-PSR and Measurement-Terminal are used. The Measurement-Terminal association is never used alone.
 * 
 * <p>Measurement complex type에 대한 Java 클래스입니다.</p>
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.</p>
 * 
 * <pre>{@code
 * <complexType name="Measurement">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="measurementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="unitMultiplier" type="{http://www.kpx.or.kr/2014/schema/common#}UnitMultiplier" minOccurs="0"/>
 *         <element name="unitSymbol" type="{http://www.kpx.or.kr/2014/schema/common#}UnitSymbol" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Measurement", namespace = "http://www.kpx.or.kr/2014/schema/common#", propOrder = {
    "measurementType",
    "unitMultiplier",
    "unitSymbol"
})
@XmlSeeAlso({
    Analog.class
})
public class Measurement {

    /**
     * Specifies the type of measurement.  For example, this specifies if the measurement represents an indoor temperature, outdoor temperature, bus voltage, line flow, etc.
     * 
     */
    protected String measurementType;
    /**
     * The unit multiplier of the measured quantity.
     * 
     */
    protected String unitMultiplier;
    /**
     * The unit of measure of the measured quantity.
     * 
     */
    protected String unitSymbol;

    /**
     * Specifies the type of measurement.  For example, this specifies if the measurement represents an indoor temperature, outdoor temperature, bus voltage, line flow, etc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementType() {
        return measurementType;
    }

    /**
     * measurementType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMeasurementType()
     */
    public void setMeasurementType(String value) {
        this.measurementType = value;
    }

    /**
     * The unit multiplier of the measured quantity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitMultiplier() {
        return unitMultiplier;
    }

    /**
     * unitMultiplier 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUnitMultiplier()
     */
    public void setUnitMultiplier(String value) {
        this.unitMultiplier = value;
    }

    /**
     * The unit of measure of the measured quantity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitSymbol() {
        return unitSymbol;
    }

    /**
     * unitSymbol 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUnitSymbol()
     */
    public void setUnitSymbol(String value) {
        this.unitSymbol = value;
    }

}
