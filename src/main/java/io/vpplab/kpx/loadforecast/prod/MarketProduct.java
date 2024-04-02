
package io.vpplab.kpx.loadforecast.prod;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>MarketProduct complex type에 대한 Java 클래스입니다.</p>
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.</p>
 * 
 * <pre>{@code
 * <complexType name="MarketProduct">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="marketProductType" type="{http://www.kpx.or.kr/2014/schema/common#}MarketProductType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketProduct", namespace = "http://www.kpx.or.kr/2014/schema/common#", propOrder = {
    "marketProductType"
})
public class MarketProduct {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected MarketProductType marketProductType;

    /**
     * marketProductType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MarketProductType }
     *     
     */
    public MarketProductType getMarketProductType() {
        return marketProductType;
    }

    /**
     * marketProductType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketProductType }
     *     
     */
    public void setMarketProductType(MarketProductType value) {
        this.marketProductType = value;
    }

}
