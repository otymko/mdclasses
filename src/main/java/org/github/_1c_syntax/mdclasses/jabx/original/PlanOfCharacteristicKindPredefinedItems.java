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
 * <p>Java class for PlanOfCharacteristicKindPredefinedItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlanOfCharacteristicKindPredefinedItems"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://v8.1c.ru/8.3/xcf/readable}EntityWithVersion"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Item" type="{http://v8.1c.ru/8.3/xcf/predef}PlanOfCharacteristicKindPredefinedItem"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlanOfCharacteristicKindPredefinedItems", namespace = "http://v8.1c.ru/8.3/xcf/predef", propOrder = {
    "item"
})
public class PlanOfCharacteristicKindPredefinedItems
    extends EntityWithVersion
{

    @XmlElement(name = "Item", required = true)
    protected PlanOfCharacteristicKindPredefinedItem item;

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link PlanOfCharacteristicKindPredefinedItem }
     *     
     */
    public PlanOfCharacteristicKindPredefinedItem getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanOfCharacteristicKindPredefinedItem }
     *     
     */
    public void setItem(PlanOfCharacteristicKindPredefinedItem value) {
        this.item = value;
    }

}
