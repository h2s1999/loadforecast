
package io.vpplab.kpx.loadforecast.prod;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Parent class for different groupings of information collected and managed as a part of a business process. It will frequently contain references to other objects, such as assets, people and power system resources.
 * 
 * <p>Document complex type에 대한 Java 클래스입니다.</p>
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.</p>
 * 
 * <pre>{@code
 * <complexType name="Document">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="revisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="finalRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", namespace = "http://www.kpx.or.kr/2014/schema/common#", propOrder = {
    "revisionNumber",
    "finalRevisionNumber"
})
public class Document {

    /**
     * Revision number for this document.
     * 
     */
    protected String revisionNumber;
    /**
     * 최종차수
     * 
     */
    protected String finalRevisionNumber;

    /**
     * Revision number for this document.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionNumber() {
        return revisionNumber;
    }

    /**
     * revisionNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRevisionNumber()
     */
    public void setRevisionNumber(String value) {
        this.revisionNumber = value;
    }

    /**
     * 최종차수
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalRevisionNumber() {
        return finalRevisionNumber;
    }

    /**
     * finalRevisionNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFinalRevisionNumber()
     */
    public void setFinalRevisionNumber(String value) {
        this.finalRevisionNumber = value;
    }

}
