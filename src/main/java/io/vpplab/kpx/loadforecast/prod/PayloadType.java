
package io.vpplab.kpx.loadforecast.prod;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import org.w3c.dom.Element;


/**
 * Payload container
 * 
 * <p>PayloadType complex type에 대한 Java 클래스입니다.</p>
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.</p>
 * 
 * <pre>{@code
 * <complexType name="PayloadType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <any processContents='skip' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *           <element name="OperationSet" type="{http://iec.ch/TC57/2011/schema/message}OperationSet" minOccurs="0"/>
 *           <element name="Compressed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           <element name="ID" maxOccurs="unbounded" minOccurs="0">
 *             <complexType>
 *               <simpleContent>
 *                 <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *                   <attGroup ref="{http://iec.ch/TC57/2011/schema/message}IDatts"/>
 *                 </extension>
 *               </simpleContent>
 *             </complexType>
 *           </element>
 *         </choice>
 *         <element name="Format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayloadType", propOrder = {
    "any",
    "operationSet",
    "compressed",
    "id",
    "format"
})
public class PayloadType {

    /**
     * For XML payloads, usually CIM profiles defined using an
     * XSD in a profile-specific namespace. May also be used for custom extensions.
     * 
     */
    @XmlAnyElement
    protected List<Element> any;
    /**
     * Each operation set is a collection of operations that
     * may require operational-integrity and/or sequence control.
     * 
     */
    @XmlElement(name = "OperationSet")
    protected OperationSet operationSet;
    /**
     * For compressed and/or binary, uuencoded payloads If
     * compressed, Gzip compression is used.
     * 
     */
    @XmlElement(name = "Compressed")
    protected String compressed;
    /**
     * Used to supply object IDs for cancel/close/delete
     * operations in cases where they are not otherwise specified using a type-specific
     * payload
     * 
     */
    @XmlElement(name = "ID")
    protected List<PayloadType.ID> id;
    /**
     * Hint as to format of payload, e.g. XML, RDF, SVF, BINARY, PDF, ...
     * 
     */
    @XmlElement(name = "Format")
    protected String format;

    /**
     * For XML payloads, usually CIM profiles defined using an
     * XSD in a profile-specific namespace. May also be used for custom extensions.
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
     * {@link Element }
     * </p>
     * 
     * 
     * @return
     *     The value of the any property.
     */
    public List<Element> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    /**
     * Each operation set is a collection of operations that
     * may require operational-integrity and/or sequence control.
     * 
     * @return
     *     possible object is
     *     {@link OperationSet }
     *     
     */
    public OperationSet getOperationSet() {
        return operationSet;
    }

    /**
     * operationSet 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationSet }
     *     
     * @see #getOperationSet()
     */
    public void setOperationSet(OperationSet value) {
        this.operationSet = value;
    }

    /**
     * For compressed and/or binary, uuencoded payloads If
     * compressed, Gzip compression is used.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompressed() {
        return compressed;
    }

    /**
     * compressed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCompressed()
     */
    public void setCompressed(String value) {
        this.compressed = value;
    }

    /**
     * Used to supply object IDs for cancel/close/delete
     * operations in cases where they are not otherwise specified using a type-specific
     * payload
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
     * {@link PayloadType.ID }
     * </p>
     * 
     * 
     * @return
     *     The value of the id property.
     */
    public List<PayloadType.ID> getID() {
        if (id == null) {
            id = new ArrayList<>();
        }
        return this.id;
    }

    /**
     * Hint as to format of payload, e.g. XML, RDF, SVF, BINARY, PDF, ...
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * format 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFormat()
     */
    public void setFormat(String value) {
        this.format = value;
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
