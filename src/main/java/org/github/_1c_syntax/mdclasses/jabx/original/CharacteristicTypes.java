//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package org.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for CharacteristicTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharacteristicTypes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeyField" type="{http://v8.1c.ru/8.3/xcf/readable}FiedlRef"/&gt;
 *         &lt;element name="TypesFilterField" type="{http://v8.1c.ru/8.3/xcf/readable}FiedlRef"/&gt;
 *         &lt;element name="TypesFilterValue" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="from" type="{http://v8.1c.ru/8.3/xcf/readable}MDObjectRef" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CharacteristicTypes", namespace = "http://v8.1c.ru/8.3/xcf/readable", propOrder = {
    "keyField",
    "typesFilterField",
    "typesFilterValue"
})
public class CharacteristicTypes {

    @XmlElement(name = "KeyField", required = true)
    protected String keyField;
    @XmlElement(name = "TypesFilterField", required = true)
    protected String typesFilterField;
    @XmlElement(name = "TypesFilterValue", required = true)
    protected Object typesFilterValue;
    @XmlAttribute(name = "from")
    protected String from;

    /**
     * Gets the value of the keyField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyField() {
        return keyField;
    }

    /**
     * Sets the value of the keyField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyField(String value) {
        this.keyField = value;
    }

    /**
     * Gets the value of the typesFilterField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypesFilterField() {
        return typesFilterField;
    }

    /**
     * Sets the value of the typesFilterField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypesFilterField(String value) {
        this.typesFilterField = value;
    }

    /**
     * Gets the value of the typesFilterValue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTypesFilterValue() {
        return typesFilterValue;
    }

    /**
     * Sets the value of the typesFilterValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTypesFilterValue(Object value) {
        this.typesFilterValue = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrom(String value) {
        this.from = value;
    }

}
