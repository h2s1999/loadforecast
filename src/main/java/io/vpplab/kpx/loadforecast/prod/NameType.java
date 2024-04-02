
package io.vpplab.kpx.loadforecast.prod;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * From CIM
 * 
 * <p>NameType complex type에 대한 Java 클래스입니다.</p>
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.</p>
 * 
 * <pre>{@code
 * <complexType name="NameType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="NameTypeAuthority" type="{http://iec.ch/TC57/2011/schema/message}NameTypeAuthority" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameType", propOrder = {
    "name",
    "description",
    "nameTypeAuthority"
})
public class NameType {

    @XmlElement(required = true)
    protected String name;
    protected String description;
    @XmlElement(name = "NameTypeAuthority")
    protected NameTypeAuthority nameTypeAuthority;

    /**
     * name 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * name 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * description 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * description 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * nameTypeAuthority 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link NameTypeAuthority }
     *     
     */
    public NameTypeAuthority getNameTypeAuthority() {
        return nameTypeAuthority;
    }

    /**
     * nameTypeAuthority 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link NameTypeAuthority }
     *     
     */
    public void setNameTypeAuthority(NameTypeAuthority value) {
        this.nameTypeAuthority = value;
    }

}
