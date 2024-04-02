
package io.vpplab.kpx.loadforecast.prod;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>MarketProductType에 대한 Java 클래스입니다.</p>
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.</p>
 * <pre>{@code
 * <simpleType name="MarketProductType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EN"/>
 *     <enumeration value="RS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MarketProductType", namespace = "http://www.kpx.or.kr/2014/schema/common#")
@XmlEnum
public enum MarketProductType {


    /**
     * 에너지
     * 
     */
    EN,

    /**
     * 예비력
     * 
     */
    RS;

    public String value() {
        return name();
    }

    public static MarketProductType fromValue(String v) {
        return valueOf(v);
    }

}
