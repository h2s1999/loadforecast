
package io.vpplab.kpx.loadforecast.prod;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * User type definition
 * 
 * <p>UserType complex type에 대한 Java 클래스입니다.</p>
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.</p>
 * 
 * <pre>{@code
 * <complexType name="UserType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Organization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserType", propOrder = {
    "userID",
    "password",
    "organization"
})
public class UserType {

    /**
     * 거래소 e-PowerMarket 로그인ID
     * 
     */
    @XmlElement(name = "UserID", required = true)
    protected String userID;
    /**
     * 암호화된 사용자 비밀번호
     * 
     */
    @XmlElement(name = "Password", required = true)
    protected String password;
    /**
     * 거래소에서 부여한 회원사코드 (숫자 4자리)
     * 
     */
    @XmlElement(name = "Organization")
    protected String organization;

    /**
     * 거래소 e-PowerMarket 로그인ID
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * userID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUserID()
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * 암호화된 사용자 비밀번호
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * password 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPassword()
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * 거래소에서 부여한 회원사코드 (숫자 4자리)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * organization 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrganization()
     */
    public void setOrganization(String value) {
        this.organization = value;
    }

}
