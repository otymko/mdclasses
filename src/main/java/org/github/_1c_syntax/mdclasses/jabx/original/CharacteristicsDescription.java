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
 * <p>Java class for CharacteristicsDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharacteristicsDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CharacteristicTypes" type="{http://v8.1c.ru/8.3/xcf/readable}CharacteristicTypes"/&gt;
 *         &lt;element name="CharacteristicValues" type="{http://v8.1c.ru/8.3/xcf/readable}CharacteristicValues"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CharacteristicsDescription", namespace = "http://v8.1c.ru/8.3/xcf/readable", propOrder = {
    "characteristicTypes",
    "characteristicValues"
})
public class CharacteristicsDescription {

    @XmlElement(name = "CharacteristicTypes", required = true)
    protected CharacteristicTypes characteristicTypes;
    @XmlElement(name = "CharacteristicValues", required = true)
    protected CharacteristicValues characteristicValues;

    /**
     * Gets the value of the characteristicTypes property.
     * 
     * @return
     *     possible object is
     *     {@link CharacteristicTypes }
     *     
     */
    public CharacteristicTypes getCharacteristicTypes() {
        return characteristicTypes;
    }

    /**
     * Sets the value of the characteristicTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacteristicTypes }
     *     
     */
    public void setCharacteristicTypes(CharacteristicTypes value) {
        this.characteristicTypes = value;
    }

    /**
     * Gets the value of the characteristicValues property.
     * 
     * @return
     *     possible object is
     *     {@link CharacteristicValues }
     *     
     */
    public CharacteristicValues getCharacteristicValues() {
        return characteristicValues;
    }

    /**
     * Sets the value of the characteristicValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacteristicValues }
     *     
     */
    public void setCharacteristicValues(CharacteristicValues value) {
        this.characteristicValues = value;
    }

}
