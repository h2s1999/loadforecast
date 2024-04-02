
package io.vpplab.kpx.loadforecast.prod;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Process location where error was encountered
 * 
 * <p>LocationType complex type에 대한 Java 클래스입니다.</p>
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.</p>
 * 
 * <pre>{@code
 * <complexType name="LocationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="node" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pipeline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="stage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationType", propOrder = {
    "node",
    "pipeline",
    "stage"
})
public class LocationType {

    /**
     * Name of the pipeline/branch/route node where error occurred
     * 
     */
    protected String node;
    /**
     * Name of the pipeline where error occurred (if applicable)
     * 
     */
    protected String pipeline;
    /**
     * Name of the stage where error occurred (if applicable)
     * 
     */
    protected String stage;

    /**
     * Name of the pipeline/branch/route node where error occurred
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNode() {
        return node;
    }

    /**
     * node 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNode()
     */
    public void setNode(String value) {
        this.node = value;
    }

    /**
     * Name of the pipeline where error occurred (if applicable)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPipeline() {
        return pipeline;
    }

    /**
     * pipeline 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPipeline()
     */
    public void setPipeline(String value) {
        this.pipeline = value;
    }

    /**
     * Name of the stage where error occurred (if applicable)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStage() {
        return stage;
    }

    /**
     * stage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStage()
     */
    public void setStage(String value) {
        this.stage = value;
    }

}
