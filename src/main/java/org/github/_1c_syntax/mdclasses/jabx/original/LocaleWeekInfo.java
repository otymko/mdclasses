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


/**
 * <p>Java class for LocaleWeekInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocaleWeekInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="firstDayOfWeek" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="weekendOnSet" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="weekendCease" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocaleWeekInfo", namespace = "http://v8.1c.ru/8.2/managed-application/core")
public class LocaleWeekInfo {

    @XmlAttribute(name = "firstDayOfWeek")
    protected Integer firstDayOfWeek;
    @XmlAttribute(name = "weekendOnSet")
    protected Integer weekendOnSet;
    @XmlAttribute(name = "weekendCease")
    protected Integer weekendCease;

    /**
     * Gets the value of the firstDayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFirstDayOfWeek() {
        return firstDayOfWeek;
    }

    /**
     * Sets the value of the firstDayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFirstDayOfWeek(Integer value) {
        this.firstDayOfWeek = value;
    }

    /**
     * Gets the value of the weekendOnSet property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeekendOnSet() {
        return weekendOnSet;
    }

    /**
     * Sets the value of the weekendOnSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeekendOnSet(Integer value) {
        this.weekendOnSet = value;
    }

    /**
     * Gets the value of the weekendCease property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeekendCease() {
        return weekendCease;
    }

    /**
     * Sets the value of the weekendCease property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeekendCease(Integer value) {
        this.weekendCease = value;
    }

}
