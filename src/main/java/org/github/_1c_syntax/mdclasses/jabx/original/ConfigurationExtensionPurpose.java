//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package org.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigurationExtensionPurpose.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConfigurationExtensionPurpose"&gt;
 *   &lt;restriction base="{http://v8.1c.ru/8.3/xcf/enums}BaseEnumType"&gt;
 *     &lt;enumeration value="Patch"/&gt;
 *     &lt;enumeration value="Customization"/&gt;
 *     &lt;enumeration value="AddOn"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConfigurationExtensionPurpose", namespace = "http://v8.1c.ru/8.3/xcf/enums")
@XmlEnum
public enum ConfigurationExtensionPurpose {

    @XmlEnumValue("Patch")
    PATCH("Patch"),
    @XmlEnumValue("Customization")
    CUSTOMIZATION("Customization"),
    @XmlEnumValue("AddOn")
    ADD_ON("AddOn");
    private final String value;

    ConfigurationExtensionPurpose(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfigurationExtensionPurpose fromValue(String v) {
        for (ConfigurationExtensionPurpose c: ConfigurationExtensionPurpose.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
