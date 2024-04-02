
package io.vpplab.kpx.loadforecast.prod;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import org.w3c.dom.Element;


/**
 * Request type definition
 * 
 * <p>RequestType complex type에 대한 Java 클래스입니다.</p>
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.</p>
 * 
 * <pre>{@code
 * <complexType name="RequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="Option" type="{http://iec.ch/TC57/2011/schema/message}OptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ID" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <simpleContent>
 *               <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *                 <attGroup ref="{http://iec.ch/TC57/2011/schema/message}IDatts"/>
 *               </extension>
 *             </simpleContent>
 *           </complexType>
 *         </element>
 *         <any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestType", propOrder = {
    "startTime",
    "endTime",
    "option",
    "id",
    "any"
})
public class RequestType {

    /**
     * Start time of interest
     * 
     */
    @XmlElement(name = "StartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    /**
     * End time of interest
     * 
     */
    @XmlElement(name = "EndTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    /**
     * Request type specialization
     * 
     */
    @XmlElement(name = "Option")
    protected List<OptionType> option;
    /**
     * Object ID for request
     * 
     */
    @XmlElement(name = "ID")
    protected List<RequestType.ID> id;
    /**
     * This can be a CIM profile defined as an XSD with a CIM specific namespace. This may also be used for custom extensions.
     * 
     */
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Start time of interest
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
     * End time of interest
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * endTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEndTime()
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Request type specialization
     * 
     * Gets the value of the option property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the option property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionType }
     * </p>
     * 
     * 
     * @return
     *     The value of the option property.
     */
    public List<OptionType> getOption() {
        if (option == null) {
            option = new ArrayList<>();
        }
        return this.option;
    }

    /**
     * Object ID for request
     * 
     * Gets the value of the id property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestType.ID }
     * </p>
     * 
     * 
     * @return
     *     The value of the id property.
     */
    public List<RequestType.ID> getID() {
        if (id == null) {
            id = new ArrayList<>();
        }
        return this.id;
    }

    /**
     * This can be a CIM profile defined as an XSD with a CIM specific namespace. This may also be used for custom extensions.
     * 
     * Gets the value of the any property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * </p>
     * 
     * 
     * @return
     *     The value of the any property.
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }


    /**
     * <p>anonymous complex type에 대한 Java 클래스입니다.</p>
     * 
     * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <simpleContent>
     *     <extension base="<http://www.w3.org/2001/XMLSchema>string">
     *       <attGroup ref="{http://iec.ch/TC57/2011/schema/message}IDatts"/>
     *     </extension>
     *   </simpleContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ID {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "idType")
        protected String idType;
        @XmlAttribute(name = "idAuthority")
        protected String idAuthority;
        @XmlAttribute(name = "kind")
        protected IDKindType kind;
        @XmlAttribute(name = "objectType")
        protected String objectType;

        /**
         * value 속성의 값을 가져옵니다.
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
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * idType 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdType() {
            return idType;
        }

        /**
         * idType 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdType(String value) {
            this.idType = value;
        }

        /**
         * idAuthority 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdAuthority() {
            return idAuthority;
        }

        /**
         * idAuthority 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdAuthority(String value) {
            this.idAuthority = value;
        }

        /**
         * kind 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link IDKindType }
         *     
         */
        public IDKindType getKind() {
            return kind;
        }

        /**
         * kind 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link IDKindType }
         *     
         */
        public void setKind(IDKindType value) {
            this.kind = value;
        }

        /**
         * objectType 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getObjectType() {
            return objectType;
        }

        /**
         * objectType 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setObjectType(String value) {
            this.objectType = value;
        }

    }

}
