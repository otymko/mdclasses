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
 * <p>Java class for DimensionAttributePlacementType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DimensionAttributePlacementType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="WithDimensions"/&gt;
 *     &lt;enumeration value="Separately"/&gt;
 *     &lt;enumeration value="Together"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DimensionAttributePlacementType", namespace = "http://v8.1c.ru/8.2/data/spreadsheet")
@XmlEnum
public enum DimensionAttributePlacementType {

    @XmlEnumValue("WithDimensions")
    WITH_DIMENSIONS("WithDimensions"),
    @XmlEnumValue("Separately")
    SEPARATELY("Separately"),
    @XmlEnumValue("Together")
    TOGETHER("Together");
    private final String value;

    DimensionAttributePlacementType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DimensionAttributePlacementType fromValue(String v) {
        for (DimensionAttributePlacementType c: DimensionAttributePlacementType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
