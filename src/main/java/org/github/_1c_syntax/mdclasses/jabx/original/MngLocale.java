//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package org.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for MngLocale complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MngLocale"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="boolFormat" type="{http://v8.1c.ru/8.2/managed-application/core}LocaleBoolFormat"/&gt;
 *         &lt;element name="numericFormat" type="{http://v8.1c.ru/8.2/managed-application/core}LocaleNumericFormat"/&gt;
 *         &lt;element name="dateFormat" type="{http://v8.1c.ru/8.2/managed-application/core}LocaleDateFormat"/&gt;
 *         &lt;element name="weekInfo" type="{http://v8.1c.ru/8.2/managed-application/core}LocaleWeekInfo"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="localeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="cdisplayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="localeName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MngLocale", namespace = "http://v8.1c.ru/8.2/managed-application/core", propOrder = {
    "boolFormat",
    "numericFormat",
    "dateFormat",
    "weekInfo"
})
public class MngLocale {

    @XmlElement(required = true)
    protected LocaleBoolFormat boolFormat;
    @XmlElement(required = true)
    protected LocaleNumericFormat numericFormat;
    @XmlElement(required = true)
    protected LocaleDateFormat dateFormat;
    @XmlElement(required = true)
    protected LocaleWeekInfo weekInfo;
    @XmlAttribute(name = "localeCode")
    protected String localeCode;
    @XmlAttribute(name = "displayName")
    protected String displayName;
    @XmlAttribute(name = "cdisplayName")
    protected String cdisplayName;
    @XmlAttribute(name = "localeName")
    protected String localeName;

    /**
     * Gets the value of the boolFormat property.
     * 
     * @return
     *     possible object is
     *     {@link LocaleBoolFormat }
     *     
     */
    public LocaleBoolFormat getBoolFormat() {
        return boolFormat;
    }

    /**
     * Sets the value of the boolFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocaleBoolFormat }
     *     
     */
    public void setBoolFormat(LocaleBoolFormat value) {
        this.boolFormat = value;
    }

    /**
     * Gets the value of the numericFormat property.
     * 
     * @return
     *     possible object is
     *     {@link LocaleNumericFormat }
     *     
     */
    public LocaleNumericFormat getNumericFormat() {
        return numericFormat;
    }

    /**
     * Sets the value of the numericFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocaleNumericFormat }
     *     
     */
    public void setNumericFormat(LocaleNumericFormat value) {
        this.numericFormat = value;
    }

    /**
     * Gets the value of the dateFormat property.
     * 
     * @return
     *     possible object is
     *     {@link LocaleDateFormat }
     *     
     */
    public LocaleDateFormat getDateFormat() {
        return dateFormat;
    }

    /**
     * Sets the value of the dateFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocaleDateFormat }
     *     
     */
    public void setDateFormat(LocaleDateFormat value) {
        this.dateFormat = value;
    }

    /**
     * Gets the value of the weekInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LocaleWeekInfo }
     *     
     */
    public LocaleWeekInfo getWeekInfo() {
        return weekInfo;
    }

    /**
     * Sets the value of the weekInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocaleWeekInfo }
     *     
     */
    public void setWeekInfo(LocaleWeekInfo value) {
        this.weekInfo = value;
    }

    /**
     * Gets the value of the localeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocaleCode() {
        return localeCode;
    }

    /**
     * Sets the value of the localeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocaleCode(String value) {
        this.localeCode = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the cdisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdisplayName() {
        return cdisplayName;
    }

    /**
     * Sets the value of the cdisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdisplayName(String value) {
        this.cdisplayName = value;
    }

    /**
     * Gets the value of the localeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocaleName() {
        return localeName;
    }

    /**
     * Sets the value of the localeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocaleName(String value) {
        this.localeName = value;
    }

}
