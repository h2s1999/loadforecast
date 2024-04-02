
package io.vpplab.kpx.loadforecast.prod;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Multi-purpose data points for defining a curve. The use of this
 *         generic class is discouraged if a more specific class can be
 *         used to specify the x and y axis values along with their
 *         specific data types.
 * 
 * <p>CurveData complex type에 대한 Java 클래스입니다.</p>
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.</p>
 * 
 * <pre>{@code
 * <complexType name="CurveData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="xvalue" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="y1value" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="y2value" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurveData", namespace = "http://www.kpx.or.kr/2014/schema/common#", propOrder = {
    "xvalue",
    "y1Value",
    "y2Value"
})
public class CurveData {

    /**
     * The data value of the X-axis variable, depending on the
     *             X-axis units.
     * 
     */
    protected Float xvalue;
    /**
     * The data value of the first Y-axis variable, depending on
     *             the Y-axis units.
     * 
     */
    @XmlElement(name = "y1value")
    protected Float y1Value;
    /**
     * The data value of the second Y-axis variable (if present),
     *             depending on the Y-axis units.
     * 
     */
    @XmlElement(name = "y2value")
    protected Float y2Value;

    /**
     * The data value of the X-axis variable, depending on the
     *             X-axis units.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getXvalue() {
        return xvalue;
    }

    /**
     * xvalue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getXvalue()
     */
    public void setXvalue(Float value) {
        this.xvalue = value;
    }

    /**
     * The data value of the first Y-axis variable, depending on
     *             the Y-axis units.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getY1Value() {
        return y1Value;
    }

    /**
     * y1Value 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getY1Value()
     */
    public void setY1Value(Float value) {
        this.y1Value = value;
    }

    /**
     * The data value of the second Y-axis variable (if present),
     *             depending on the Y-axis units.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getY2Value() {
        return y2Value;
    }

    /**
     * y2Value 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getY2Value()
     */
    public void setY2Value(Float value) {
        this.y2Value = value;
    }

}
