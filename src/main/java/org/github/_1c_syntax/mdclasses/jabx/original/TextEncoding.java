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
 * <p>Java class for TextEncoding.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TextEncoding"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UTF16"/&gt;
 *     &lt;enumeration value="UTF8"/&gt;
 *     &lt;enumeration value="ANSI"/&gt;
 *     &lt;enumeration value="OEM"/&gt;
 *     &lt;enumeration value="System"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TextEncoding", namespace = "http://v8.1c.ru/8.1/data/ui")
@XmlEnum
public enum TextEncoding {

    @XmlEnumValue("UTF16")
    UTF_16("UTF16"),
    @XmlEnumValue("UTF8")
    UTF_8("UTF8"),
    ANSI("ANSI"),
    OEM("OEM"),
    @XmlEnumValue("System")
    SYSTEM("System");
    private final String value;

    TextEncoding(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TextEncoding fromValue(String v) {
        for (TextEncoding c: TextEncoding.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
