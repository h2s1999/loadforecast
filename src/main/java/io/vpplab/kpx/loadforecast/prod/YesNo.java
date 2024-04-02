
package io.vpplab.kpx.loadforecast.prod;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>YesNo에 대한 Java 클래스입니다.</p>
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.</p>
 * <pre>{@code
 * <simpleType name="YesNo">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NO"/>
 *     <enumeration value="YES"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "YesNo", namespace = "http://www.kpx.or.kr/2014/schema/common#")
@XmlEnum
public enum YesNo {

    NO,
    YES;

    public String value() {
        return name();
    }

    public static YesNo fromValue(String v) {
        return valueOf(v);
    }

}
