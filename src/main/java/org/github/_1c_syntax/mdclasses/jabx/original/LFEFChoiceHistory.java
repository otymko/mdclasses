//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package org.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LFEFChoiceHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LFEFChoiceHistory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="group" type="{http://v8.1c.ru/8.2/managed-application/core}LFEFChoiceHistoryGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LFEFChoiceHistory", namespace = "http://v8.1c.ru/8.2/managed-application/core", propOrder = {
    "group"
})
public class LFEFChoiceHistory {

    @XmlElement(required = true)
    protected LFEFChoiceHistoryGroup group;

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link LFEFChoiceHistoryGroup }
     *     
     */
    public LFEFChoiceHistoryGroup getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link LFEFChoiceHistoryGroup }
     *     
     */
    public void setGroup(LFEFChoiceHistoryGroup value) {
        this.group = value;
    }

}
