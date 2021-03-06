//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package org.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>Java class for BinaryDataQualifiers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BinaryDataQualifiers"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="AllowedLength" type="{http://v8.1c.ru/8.1/data/core}AllowedLength"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinaryDataQualifiers", namespace = "http://v8.1c.ru/8.1/data/core", propOrder = {
    "length",
    "allowedLength"
})
public class BinaryDataQualifiers {

    @XmlElement(name = "Length", required = true)
    protected BigDecimal length;
    @XmlElement(name = "AllowedLength", required = true)
    @XmlSchemaType(name = "string")
    protected AllowedLength allowedLength;

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLength(BigDecimal value) {
        this.length = value;
    }

    /**
     * Gets the value of the allowedLength property.
     * 
     * @return
     *     possible object is
     *     {@link AllowedLength }
     *     
     */
    public AllowedLength getAllowedLength() {
        return allowedLength;
    }

    /**
     * Sets the value of the allowedLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowedLength }
     *     
     */
    public void setAllowedLength(AllowedLength value) {
        this.allowedLength = value;
    }

}
