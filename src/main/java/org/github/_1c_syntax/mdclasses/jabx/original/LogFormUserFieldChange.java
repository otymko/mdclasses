//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package org.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Java class for LogFormUserFieldChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogFormUserFieldChange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="fId" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="spin" type="{http://v8.1c.ru/8.2/managed-application/logform}BWAValue" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogFormUserFieldChange", namespace = "http://v8.1c.ru/8.2/managed-application/logform")
public class LogFormUserFieldChange {

    @XmlAttribute(name = "fId")
    protected BigDecimal fId;
    @XmlAttribute(name = "spin")
    protected BWAValue spin;

    /**
     * Gets the value of the fId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFId() {
        return fId;
    }

    /**
     * Sets the value of the fId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFId(BigDecimal value) {
        this.fId = value;
    }

    /**
     * Gets the value of the spin property.
     * 
     * @return
     *     possible object is
     *     {@link BWAValue }
     *     
     */
    public BWAValue getSpin() {
        return spin;
    }

    /**
     * Sets the value of the spin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BWAValue }
     *     
     */
    public void setSpin(BWAValue value) {
        this.spin = value;
    }

}
