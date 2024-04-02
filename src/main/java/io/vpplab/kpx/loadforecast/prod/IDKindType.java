
package io.vpplab.kpx.loadforecast.prod;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * ID Kind Type
 * 
 * <p>IDKindType에 대한 Java 클래스입니다.</p>
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.</p>
 * <pre>{@code
 * <simpleType name="IDKindType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="name"/>
 *     <enumeration value="uuid"/>
 *     <enumeration value="transaction"/>
 *     <enumeration value="other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "IDKindType")
@XmlEnum
public enum IDKindType {

    @XmlEnumValue("name")
    NAME("name"),
    @XmlEnumValue("uuid")
    UUID("uuid"),
    @XmlEnumValue("transaction")
    TRANSACTION("transaction"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    IDKindType(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     * 
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static IDKindType fromValue(String v) {
        for (IDKindType c: IDKindType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
