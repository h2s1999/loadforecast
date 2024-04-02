
package io.vpplab.kpx.loadforecast.prod;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * For master data set synchronization XML payloads.
 * 
 * <p>OperationType complex type에 대한 Java 클래스입니다.</p>
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.</p>
 * 
 * <pre>{@code
 * <complexType name="OperationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="operationId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         <element name="noun" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="verb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="elementOperation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <any processContents='skip' namespace='##other' minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationType", propOrder = {
    "operationId",
    "noun",
    "verb",
    "elementOperation",
    "any"
})
public class OperationType {

    /**
     * The payload.operation.operationId provides the unique
     * identifier (within the OperationSet) of the Operation for the purpose of reference in
     * subsequent messages (e.g. OperationSet reply).
     * 
     */
    @XmlElement(required = true)
    protected BigInteger operationId;
    /**
     * The payload.operation.##other also identifies the noun,
     * this element is optionally supplied to simplify processing.
     * 
     */
    protected String noun;
    /**
     * "create", "delete", "change", etc.
     * 
     */
    protected String verb;
    /**
     * TRUE if the verb is operating at the element level. In
     * such a case, the verb is to be applied to the elements populated in the
     * payload.operation.##other below. If omitted, assume FALSE.
     * 
     */
    @XmlElement(defaultValue = "false")
    protected Boolean elementOperation;
    /**
     * An XML payload which carries a CIM profile defined using
     * an XSD in a profile-specific namespace. Individual payloads are used collectively to
     * create a series of related operations. See the "enforce" boolean flags in the header
     * for instructions on how to process these messages.
     * 
     */
    @XmlAnyElement
    protected Element any;

    /**
     * The payload.operation.operationId provides the unique
     * identifier (within the OperationSet) of the Operation for the purpose of reference in
     * subsequent messages (e.g. OperationSet reply).
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
     * The payload.operation.##other also identifies the noun,
     * this element is optionally supplied to simplify processing.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoun() {
        return noun;
    }

    /**
     * noun 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNoun()
     */
    public void setNoun(String value) {
        this.noun = value;
    }

    /**
     * "create", "delete", "change", etc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerb() {
        return verb;
    }

    /**
     * verb 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVerb()
     */
    public void setVerb(String value) {
        this.verb = value;
    }

    /**
     * TRUE if the verb is operating at the element level. In
     * such a case, the verb is to be applied to the elements populated in the
     * payload.operation.##other below. If omitted, assume FALSE.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isElementOperation() {
        return elementOperation;
    }

    /**
     * elementOperation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isElementOperation()
     */
    public void setElementOperation(Boolean value) {
        this.elementOperation = value;
    }

    /**
     * An XML payload which carries a CIM profile defined using
     * an XSD in a profile-specific namespace. Individual payloads are used collectively to
     * create a series of related operations. See the "enforce" boolean flags in the header
     * for instructions on how to process these messages.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     
     */
    public Element getAny() {
        return any;
    }

    /**
     * any 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     
     * @see #getAny()
     */
    public void setAny(Element value) {
        this.any = value;
    }

}
