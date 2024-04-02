
package io.vpplab.kpx.loadforecast.prod;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * Message header type definition
 * 
 * <p>HeaderType complex type에 대한 Java 클래스입니다.</p>
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.</p>
 * 
 * <pre>{@code
 * <complexType name="HeaderType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Verb">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="cancel"/>
 *               <enumeration value="canceled"/>
 *               <enumeration value="change"/>
 *               <enumeration value="changed"/>
 *               <enumeration value="create"/>
 *               <enumeration value="created"/>
 *               <enumeration value="close"/>
 *               <enumeration value="closed"/>
 *               <enumeration value="delete"/>
 *               <enumeration value="deleted"/>
 *               <enumeration value="get"/>
 *               <enumeration value="reply"/>
 *               <enumeration value="execute"/>
 *               <enumeration value="executed"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Noun" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Revision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ReplayDetection" type="{http://iec.ch/TC57/2011/schema/message}ReplayDetectionType" minOccurs="0"/>
 *         <element name="Context" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AsyncReplyFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ReplyAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AckRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="User" type="{http://iec.ch/TC57/2011/schema/message}UserType"/>
 *         <element name="MessageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CorrelationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Property" type="{http://iec.ch/TC57/2011/schema/message}MessageProperty" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "HeaderType", propOrder = {
    "verb",
    "noun",
    "revision",
    "replayDetection",
    "context",
    "timestamp",
    "source",
    "asyncReplyFlag",
    "replyAddress",
    "ackRequired",
    "user",
    "messageID",
    "correlationID",
    "comment",
    "property",
    "any"
})
public class HeaderType {

    /**
     * This enumerated list of verbs that can be used to form message types in compliance with the IEC 61968 standard.
     * 
     */
    @XmlElement(name = "Verb", required = true)
    protected String verb;
    /**
     * The Noun of the Control Area identifies the main subject of the message type, 
     * typically a real world object defined in the CIM.
     * 
     */
    @XmlElement(name = "Noun", required = true)
    protected String noun;
    /**
     * Revision level of the message type.
     * 
     */
    @XmlElement(name = "Revision")
    protected String revision;
    /**
     * Use to introduce randomness in the message to enhance effectiveness of encryption
     * 
     */
    @XmlElement(name = "ReplayDetection")
    protected ReplayDetectionType replayDetection;
    /**
     * Intended context for information usage, e.g. PRODUCTION, TESTING, TRAINING, ...
     * 
     */
    @XmlElement(name = "Context")
    protected String context;
    /**
     * Application level relevant time and date for when this
     * instance of the message type was produced. This is not intended to be used by
     * middleware for message management.
     * 
     */
    @XmlElement(name = "Timestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    /**
     * Source system or application that sends the message
     * 
     */
    @XmlElement(name = "Source")
    protected String source;
    /**
     * Indicates whether or not reply should be asynchronous
     * 
     */
    @XmlElement(name = "AsyncReplyFlag")
    protected Boolean asyncReplyFlag;
    /**
     * Address to be used for asynchronous replies, typically a URL/topic/queue.
     * 
     */
    @XmlElement(name = "ReplyAddress")
    protected String replyAddress;
    /**
     * Indicates whether or not an acknowledgement is required
     * 
     */
    @XmlElement(name = "AckRequired")
    protected Boolean ackRequired;
    /**
     * User information of the sender
     * 
     */
    @XmlElement(name = "User", required = true)
    protected UserType user;
    /**
     * Unique message ID to be used for tracking messages
     * 
     */
    @XmlElement(name = "MessageID")
    protected String messageID;
    /**
     * ID to be used by applications for correlating replies
     * 
     */
    @XmlElement(name = "CorrelationID")
    protected String correlationID;
    /**
     * Optional comment
     * 
     */
    @XmlElement(name = "Comment")
    protected String comment;
    /**
     * Message properties can be used to identify information
     * needed for extended routing and filtering capabilities
     * 
     */
    @XmlElement(name = "Property")
    protected List<MessageProperty> property;
    /**
     * Used to allow custom extensions
     * 
     */
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * This enumerated list of verbs that can be used to form message types in compliance with the IEC 61968 standard.
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
     * The Noun of the Control Area identifies the main subject of the message type, 
     * typically a real world object defined in the CIM.
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
     * Revision level of the message type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevision() {
        return revision;
    }

    /**
     * revision 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRevision()
     */
    public void setRevision(String value) {
        this.revision = value;
    }

    /**
     * Use to introduce randomness in the message to enhance effectiveness of encryption
     * 
     * @return
     *     possible object is
     *     {@link ReplayDetectionType }
     *     
     */
    public ReplayDetectionType getReplayDetection() {
        return replayDetection;
    }

    /**
     * replayDetection 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplayDetectionType }
     *     
     * @see #getReplayDetection()
     */
    public void setReplayDetection(ReplayDetectionType value) {
        this.replayDetection = value;
    }

    /**
     * Intended context for information usage, e.g. PRODUCTION, TESTING, TRAINING, ...
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContext() {
        return context;
    }

    /**
     * context 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContext()
     */
    public void setContext(String value) {
        this.context = value;
    }

    /**
     * Application level relevant time and date for when this
     * instance of the message type was produced. This is not intended to be used by
     * middleware for message management.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * timestamp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getTimestamp()
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Source system or application that sends the message
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * source 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSource()
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Indicates whether or not reply should be asynchronous
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAsyncReplyFlag() {
        return asyncReplyFlag;
    }

    /**
     * asyncReplyFlag 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAsyncReplyFlag()
     */
    public void setAsyncReplyFlag(Boolean value) {
        this.asyncReplyFlag = value;
    }

    /**
     * Address to be used for asynchronous replies, typically a URL/topic/queue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyAddress() {
        return replyAddress;
    }

    /**
     * replyAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getReplyAddress()
     */
    public void setReplyAddress(String value) {
        this.replyAddress = value;
    }

    /**
     * Indicates whether or not an acknowledgement is required
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAckRequired() {
        return ackRequired;
    }

    /**
     * ackRequired 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAckRequired()
     */
    public void setAckRequired(Boolean value) {
        this.ackRequired = value;
    }

    /**
     * User information of the sender
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getUser() {
        return user;
    }

    /**
     * user 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     * @see #getUser()
     */
    public void setUser(UserType value) {
        this.user = value;
    }

    /**
     * Unique message ID to be used for tracking messages
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageID() {
        return messageID;
    }

    /**
     * messageID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMessageID()
     */
    public void setMessageID(String value) {
        this.messageID = value;
    }

    /**
     * ID to be used by applications for correlating replies
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationID() {
        return correlationID;
    }

    /**
     * correlationID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCorrelationID()
     */
    public void setCorrelationID(String value) {
        this.correlationID = value;
    }

    /**
     * Optional comment
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * comment 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getComment()
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Message properties can be used to identify information
     * needed for extended routing and filtering capabilities
     * 
     * Gets the value of the property property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageProperty }
     * </p>
     * 
     * 
     * @return
     *     The value of the property property.
     */
    public List<MessageProperty> getProperty() {
        if (property == null) {
            property = new ArrayList<>();
        }
        return this.property;
    }

    /**
     * Used to allow custom extensions
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

}
