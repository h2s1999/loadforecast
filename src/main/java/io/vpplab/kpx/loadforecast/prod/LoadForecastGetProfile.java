
package io.vpplab.kpx.loadforecast.prod;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>LoadForecastGetProfile complex type에 대한 Java 클래스입니다.</p>
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.</p>
 * 
 * <pre>{@code
 * <complexType name="LoadForecastGetProfile">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Market" type="{http://www.kpx.or.kr/2014/schema/common#}Market"/>
 *         <element name="MktLoadArea" type="{http://www.kpx.or.kr/2014/schema/common#}MktLoadArea"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadForecastGetProfile", namespace = "http://www.kpx.or.kr/2014/schema/loadforecast#", propOrder = {
    "market",
    "mktLoadArea"
})
public class LoadForecastGetProfile {

    @XmlElement(name = "Market", required = true)
    protected Market market;
    @XmlElement(name = "MktLoadArea", required = true)
    protected MktLoadArea mktLoadArea;

    /**
     * market 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Market }
     *     
     */
    public Market getMarket() {
        return market;
    }

    /**
     * market 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Market }
     *     
     */
    public void setMarket(Market value) {
        this.market = value;
    }

    /**
     * mktLoadArea 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MktLoadArea }
     *     
     */
    public MktLoadArea getMktLoadArea() {
        return mktLoadArea;
    }

    /**
     * mktLoadArea 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MktLoadArea }
     *     
     */
    public void setMktLoadArea(MktLoadArea value) {
        this.mktLoadArea = value;
    }

}
