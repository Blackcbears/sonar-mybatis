//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.25 at 09:04:39 PM EET 
//


package org.sonarsource.plugins.mybatis.rules;

import org.apache.commons.lang.StringUtils;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ruleResultType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ruleResultType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="FailIfFound"/>
 *     &lt;enumeration value="FailIfNotFound"/>
 *     &lt;enumeration value="FailIfLessFound"/>
 *     &lt;enumeration value="FailIfMoreFound"/>
 *     &lt;enumeration value="SkipIfFound"/>
 *     &lt;enumeration value="SkipIfNotFound"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ruleResultType")
@XmlEnum
public enum RuleResultType {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("FailIfFound")
    FAIL_IF_FOUND("FailIfFound"),
    @XmlEnumValue("FailIfNotFound")
    FAIL_IF_NOT_FOUND("FailIfNotFound"),
    @XmlEnumValue("FailIfLessFound")
    FAIL_IF_LESS_FOUND("FailIfLessFound"),
    @XmlEnumValue("FailIfMoreFound")
    FAIL_IF_MORE_FOUND("FailIfMoreFound"),
    @XmlEnumValue("SkipIfFound")
    SKIP_IF_FOUND("SkipIfFound"),
    @XmlEnumValue("SkipIfNotFound")
    SKIP_IF_NOT_FOUND("SkipIfNotFound");
    private final String value;

    RuleResultType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RuleResultType fromValue(String v) {
        if (StringUtils.isBlank(v)) {
            return RuleResultType.DEFAULT;
        }
        
        for (RuleResultType c: RuleResultType.values()) {
            if (c.value.equalsIgnoreCase(v) || c.name().equalsIgnoreCase(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
