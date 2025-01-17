
package io.vpplab.kpx.loadforecast.prod;

import java.math.BigInteger;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * Error Structure
 * 
 * <p>ErrorType complex type에 대한 Java 클래스입니다.</p>
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.</p>
 * 
 * <pre>{@code
 * <complexType name="ErrorType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="level" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="INFORM"/>
 *               <enumeration value="WARNING"/>
 *               <enumeration value="FATAL"/>
 *               <enumeration value="CATASTROPHIC"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="xpath" type="{http://www.w3.org/2001/XMLSchema}QName" minOccurs="0"/>
 *         <element name="stackTrace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Location" type="{http://iec.ch/TC57/2011/schema/message}LocationType" minOccurs="0"/>
 *         <element name="ID" minOccurs="0">
 *           <complexType>
 *             <simpleContent>
 *               <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *                 <attGroup ref="{http://iec.ch/TC57/2011/schema/message}IDatts"/>
 *               </extension>
 *             </simpleContent>
 *           </complexType>
 *         </element>
 *         <element name="relatedID" minOccurs="0">
 *           <complexType>
 *             <simpleContent>
 *               <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *                 <attGroup ref="{http://iec.ch/TC57/2011/schema/message}IDatts"/>
 *               </extension>
 *             </simpleContent>
 *           </complexType>
 *         </element>
 *         <element name="object" type="{http://iec.ch/TC57/2011/schema/message}ObjectType" minOccurs="0"/>
 *         <element name="operationId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorType", propOrder = {
    "code",
    "level",
    "reason",
    "details",
    "xpath",
    "stackTrace",
    "location",
    "id",
    "relatedID",
    "object",
    "operationId"
})
public class ErrorType {

    /**
     * Defined error code, as defined by IEC 61968-100, related
     * standards or local implementation
     * 
     */
    protected String code;
    /**
     * Severity level, e.g. INFORM, WARNING, FATAL, CATASTROPHIC
     * 
     */
    protected String level;
    /**
     * Description of the error
     * 
     */
    protected String reason;
    /**
     * Free form detailed text description of error
     * 
     */
    protected String details;
    /**
     * XPath expression to identify specific XML element
     * 
     */
    protected QName xpath;
    /**
     * Stack trace as generated by software upon exception
     * 
     */
    protected String stackTrace;
    /**
     * Location of exception within software
     * 
     */
    @XmlElement(name = "Location")
    protected LocationType location;
    /**
     * ID of object
     * 
     */
    @XmlElement(name = "ID")
    protected ErrorType.ID id;
    /**
     * ID of related object, used in cases where there is an error between the relationship of two objects
     * 
     */
    protected ErrorType.RelatedID relatedID;
    /**
     * Deprecated
     * 
     */
    protected ObjectType object;
    /**
     * The reply.operationId provides the unique identifier of
     * the Operation for which this reply.result.error is relevant. Thus, it is assumed that
     * this is an error from one of the operations contained in an OperationSet request.
     * 
     */
    protected BigInteger operationId;

    /**
     * Defined error code, as defined by IEC 61968-100, related
     * standards or local implementation
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * code 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCode()
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Severity level, e.g. INFORM, WARNING, FATAL, CATASTROPHIC
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel() {
        return level;
    }

    /**
     * level 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLevel()
     */
    public void setLevel(String value) {
        this.level = value;
    }

    /**
     * Description of the error
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * reason 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getReason()
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Free form detailed text description of error
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetails() {
        return details;
    }

    /**
     * details 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDetails()
     */
    public void setDetails(String value) {
        this.details = value;
    }

    /**
     * XPath expression to identify specific XML element
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getXpath() {
        return xpath;
    }

    /**
     * xpath 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     * @see #getXpath()
     */
    public void setXpath(QName value) {
        this.xpath = value;
    }

    /**
     * Stack trace as generated by software upon exception
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStackTrace() {
        return stackTrace;
    }

    /**
     * stackTrace 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStackTrace()
     */
    public void setStackTrace(String value) {
        this.stackTrace = value;
    }

    /**
     * Location of exception within software
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLocation() {
        return location;
    }

    /**
     * location 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     * @see #getLocation()
     */
    public void setLocation(LocationType value) {
        this.location = value;
    }

    /**
     * ID of object
     * 
     * @return
     *     possible object is
     *     {@link ErrorType.ID }
     *     
     */
    public ErrorType.ID getID() {
        return id;
    }

    /**
     * id 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorType.ID }
     *     
     * @see #getID()
     */
    public void setID(ErrorType.ID value) {
        this.id = value;
    }

    /**
     * ID of related object, used in cases where there is an error between the relationship of two objects
     * 
     * @return
     *     possible object is
     *     {@link ErrorType.RelatedID }
     *     
     */
    public ErrorType.RelatedID getRelatedID() {
        return relatedID;
    }

    /**
     * relatedID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorType.RelatedID }
     *     
     * @see #getRelatedID()
     */
    public void setRelatedID(ErrorType.RelatedID value) {
        this.relatedID = value;
    }

    /**
     * Deprecated
     * 
     * @return
     *     possible object is
     *     {@link ObjectType }
     *     
     */
    public ObjectType getObject() {
        return object;
    }

    /**
     * object 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectType }
     *     
     * @see #getObject()
     */
    public void setObject(ObjectType value) {
        this.object = value;
    }

    /**
     * The reply.operationId provides the unique identifier of
     * the Operation for which this reply.result.error is relevant. Thus, it is assumed that
     * this is an error from one of the operations contained in an OperationSet request.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOperationId() {
        return operationId;
    }

    /**
     * operationId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getOperationId()
     */
    public void setOperationId(BigInteger value) {
        this.operationId = value;
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
    public static class RelatedID {

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
