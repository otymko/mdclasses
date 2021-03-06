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
 * <p>Java class for CommandGroupCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommandGroupCategory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NavigationPanel"/&gt;
 *     &lt;enumeration value="ActionsPanel"/&gt;
 *     &lt;enumeration value="FormNavigationPanel"/&gt;
 *     &lt;enumeration value="FormCommandBar"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CommandGroupCategory", namespace = "http://v8.1c.ru/8.2/managed-application/core")
@XmlEnum
public enum CommandGroupCategory {

    @XmlEnumValue("NavigationPanel")
    NAVIGATION_PANEL("NavigationPanel"),
    @XmlEnumValue("ActionsPanel")
    ACTIONS_PANEL("ActionsPanel"),
    @XmlEnumValue("FormNavigationPanel")
    FORM_NAVIGATION_PANEL("FormNavigationPanel"),
    @XmlEnumValue("FormCommandBar")
    FORM_COMMAND_BAR("FormCommandBar");
    private final String value;

    CommandGroupCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommandGroupCategory fromValue(String v) {
        for (CommandGroupCategory c: CommandGroupCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
