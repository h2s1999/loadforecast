
package io.vpplab.kpx.loadforecast.prod;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 송전단/발전단 구분
 * 
 * <p>GrossNet에 대한 Java 클래스입니다.</p>
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.</p>
 * <pre>{@code
 * <simpleType name="GrossNet">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="GROSS"/>
 *     <enumeration value="NET"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "GrossNet", namespace = "http://www.kpx.or.kr/2014/schema/common#")
@XmlEnum
public enum GrossNet {


    /**
     * 발전단
     * 
     */
    GROSS,

    /**
     * 송전단
     * 
     */
    NET;

    public String value() {
        return name();
    }

    public static GrossNet fromValue(String v) {
        return valueOf(v);
    }

}
