
package io.vpplab.kpx.loadforecast.prod;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Each operation set is a collection of operations that may
 * require operational-integrity and/or sequence control.
 * 
 * <p>OperationSet complex type에 대한 Java 클래스입니다.</p>
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.</p>
 * 
 * <pre>{@code
 * <complexType name="OperationSet">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="enforceMsgSequence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="enforceTransactionalIntegrity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Operation" type="{http://iec.ch/TC57/2011/schema/message}OperationType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationSet", propOrder = {
    "enforceMsgSequence",
    "enforceTransactionalIntegrity",
    "operation"
})
public class OperationSet {

    /**
     * If set to TRUE, the Operation.##other messages must be
     * processed in the sequence presented. If omitted, assume FALSE.
     * 
     */
    protected Boolean enforceMsgSequence;
    /**
     * Set to TRUE when all of the Operation.##other messages
     * must be processed successfully or else the entire message set must be rolled back. If
     * omitted, assume FALSE.
     * 
     */
    protected Boolean enforceTransactionalIntegrity;
    @XmlElement(name = "Operation")
    protected List<OperationType> operation;

    /**
     * If set to TRUE, the Operation.##other messages must be
     * processed in the sequence presented. If omitted, assume FALSE.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnforceMsgSequence() {
        return enforceMsgSequence;
    }

    /**
     * enforceMsgSequence 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isEnforceMsgSequence()
     */
    public void setEnforceMsgSequence(Boolean value) {
        this.enforceMsgSequence = value;
    }

    /**
     * Set to TRUE when all of the Operation.##other messages
     * must be processed successfully or else the entire message set must be rolled back. If
     * omitted, assume FALSE.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnforceTransactionalIntegrity() {
        return enforceTransactionalIntegrity;
    }

    /**
     * enforceTransactionalIntegrity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isEnforceTransactionalIntegrity()
     */
    public void setEnforceTransactionalIntegrity(Boolean value) {
        this.enforceTransactionalIntegrity = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationType }
     * </p>
     * 
     * 
     * @return
     *     The value of the operation property.
     */
    public List<OperationType> getOperation() {
        if (operation == null) {
            operation = new ArrayList<>();
        }
        return this.operation;
    }

}
