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
 * <p>Java class for FormChildrenAlign.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FormChildrenAlign"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Auto"/&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="ItemsLeftTitlesLeft"/&gt;
 *     &lt;enumeration value="ItemsRightTitlesLeft"/&gt;
 *     &lt;enumeration value="ItemsLeftTitlesRight"/&gt;
 *     &lt;enumeration value="ItemsRightTitlesRight"/&gt;
 *     &lt;enumeration value="TitlesLeftDataLeft"/&gt;
 *     &lt;enumeration value="TitlesLeftDataRight"/&gt;
 *     &lt;enumeration value="TitlesRightDataLeft"/&gt;
 *     &lt;enumeration value="TitlesRightDataRight"/&gt;
 *     &lt;enumeration value="TitlesLeftDataAuto"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FormChildrenAlign", namespace = "http://v8.1c.ru/8.2/managed-application/logform")
@XmlEnum
public enum FormChildrenAlign {

    @XmlEnumValue("Auto")
    AUTO("Auto"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("ItemsLeftTitlesLeft")
    ITEMS_LEFT_TITLES_LEFT("ItemsLeftTitlesLeft"),
    @XmlEnumValue("ItemsRightTitlesLeft")
    ITEMS_RIGHT_TITLES_LEFT("ItemsRightTitlesLeft"),
    @XmlEnumValue("ItemsLeftTitlesRight")
    ITEMS_LEFT_TITLES_RIGHT("ItemsLeftTitlesRight"),
    @XmlEnumValue("ItemsRightTitlesRight")
    ITEMS_RIGHT_TITLES_RIGHT("ItemsRightTitlesRight"),
    @XmlEnumValue("TitlesLeftDataLeft")
    TITLES_LEFT_DATA_LEFT("TitlesLeftDataLeft"),
    @XmlEnumValue("TitlesLeftDataRight")
    TITLES_LEFT_DATA_RIGHT("TitlesLeftDataRight"),
    @XmlEnumValue("TitlesRightDataLeft")
    TITLES_RIGHT_DATA_LEFT("TitlesRightDataLeft"),
    @XmlEnumValue("TitlesRightDataRight")
    TITLES_RIGHT_DATA_RIGHT("TitlesRightDataRight"),
    @XmlEnumValue("TitlesLeftDataAuto")
    TITLES_LEFT_DATA_AUTO("TitlesLeftDataAuto");
    private final String value;

    FormChildrenAlign(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FormChildrenAlign fromValue(String v) {
        for (FormChildrenAlign c: FormChildrenAlign.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
