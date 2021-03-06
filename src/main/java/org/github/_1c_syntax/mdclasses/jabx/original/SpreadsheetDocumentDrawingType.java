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
 * <p>Java class for SpreadsheetDocumentDrawingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpreadsheetDocumentDrawingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Line"/&gt;
 *     &lt;enumeration value="Rectangle"/&gt;
 *     &lt;enumeration value="Text"/&gt;
 *     &lt;enumeration value="Ellipse"/&gt;
 *     &lt;enumeration value="Picture"/&gt;
 *     &lt;enumeration value="Object"/&gt;
 *     &lt;enumeration value="Group"/&gt;
 *     &lt;enumeration value="Chart"/&gt;
 *     &lt;enumeration value="GanttChart"/&gt;
 *     &lt;enumeration value="PivotChart"/&gt;
 *     &lt;enumeration value="Dendrogram"/&gt;
 *     &lt;enumeration value="GeographicalSchema"/&gt;
 *     &lt;enumeration value="Control"/&gt;
 *     &lt;enumeration value="Comment"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SpreadsheetDocumentDrawingType", namespace = "http://v8.1c.ru/8.2/data/spreadsheet")
@XmlEnum
public enum SpreadsheetDocumentDrawingType {

    @XmlEnumValue("Line")
    LINE("Line"),
    @XmlEnumValue("Rectangle")
    RECTANGLE("Rectangle"),
    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("Ellipse")
    ELLIPSE("Ellipse"),
    @XmlEnumValue("Picture")
    PICTURE("Picture"),
    @XmlEnumValue("Object")
    OBJECT("Object"),
    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("Chart")
    CHART("Chart"),
    @XmlEnumValue("GanttChart")
    GANTT_CHART("GanttChart"),
    @XmlEnumValue("PivotChart")
    PIVOT_CHART("PivotChart"),
    @XmlEnumValue("Dendrogram")
    DENDROGRAM("Dendrogram"),
    @XmlEnumValue("GeographicalSchema")
    GEOGRAPHICAL_SCHEMA("GeographicalSchema"),
    @XmlEnumValue("Control")
    CONTROL("Control"),
    @XmlEnumValue("Comment")
    COMMENT("Comment");
    private final String value;

    SpreadsheetDocumentDrawingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpreadsheetDocumentDrawingType fromValue(String v) {
        for (SpreadsheetDocumentDrawingType c: SpreadsheetDocumentDrawingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
