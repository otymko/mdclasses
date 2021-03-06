//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package org.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for TextDecorationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TextDecorationData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bkClr" type="{http://v8.1c.ru/8.1/data/ui}Color" minOccurs="0"/&gt;
 *         &lt;element name="brdClr" type="{http://v8.1c.ru/8.1/data/ui}Color" minOccurs="0"/&gt;
 *         &lt;element name="brd" type="{http://v8.1c.ru/8.1/data/ui}Border" minOccurs="0"/&gt;
 *         &lt;element name="event" type="{http://v8.1c.ru/8.2/managed-application/logform}Event" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="hyper" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="hAlign" type="{http://v8.1c.ru/8.2/managed-application/logform}ItemHorizontalAlignment" /&gt;
 *       &lt;attribute name="vAlign" type="{http://v8.1c.ru/8.2/managed-application/logform}ItemVerticalAlignment" /&gt;
 *       &lt;attribute name="titleHeight" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="clearEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextDecorationData", namespace = "http://v8.1c.ru/8.2/managed-application/logform", propOrder = {
    "bkClr",
    "brdClr",
    "brd",
    "event"
})
public class TextDecorationData {

    @XmlSchemaType(name = "anySimpleType")
    protected String bkClr;
    @XmlSchemaType(name = "anySimpleType")
    protected String brdClr;
    protected Border brd;
    protected List<Event> event;
    @XmlAttribute(name = "hyper")
    protected Boolean hyper;
    @XmlAttribute(name = "hAlign")
    protected ItemHorizontalAlignment hAlign;
    @XmlAttribute(name = "vAlign")
    protected ItemVerticalAlignment vAlign;
    @XmlAttribute(name = "titleHeight")
    protected BigDecimal titleHeight;
    @XmlAttribute(name = "clearEvents")
    protected Boolean clearEvents;

    /**
     * Gets the value of the bkClr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBkClr() {
        return bkClr;
    }

    /**
     * Sets the value of the bkClr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBkClr(String value) {
        this.bkClr = value;
    }

    /**
     * Gets the value of the brdClr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrdClr() {
        return brdClr;
    }

    /**
     * Sets the value of the brdClr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrdClr(String value) {
        this.brdClr = value;
    }

    /**
     * Gets the value of the brd property.
     * 
     * @return
     *     possible object is
     *     {@link Border }
     *     
     */
    public Border getBrd() {
        return brd;
    }

    /**
     * Sets the value of the brd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Border }
     *     
     */
    public void setBrd(Border value) {
        this.brd = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the event property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Event }
     * 
     * 
     */
    public List<Event> getEvent() {
        if (event == null) {
            event = new ArrayList<Event>();
        }
        return this.event;
    }

    /**
     * Gets the value of the hyper property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHyper() {
        return hyper;
    }

    /**
     * Sets the value of the hyper property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHyper(Boolean value) {
        this.hyper = value;
    }

    /**
     * Gets the value of the hAlign property.
     * 
     * @return
     *     possible object is
     *     {@link ItemHorizontalAlignment }
     *     
     */
    public ItemHorizontalAlignment getHAlign() {
        return hAlign;
    }

    /**
     * Sets the value of the hAlign property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemHorizontalAlignment }
     *     
     */
    public void setHAlign(ItemHorizontalAlignment value) {
        this.hAlign = value;
    }

    /**
     * Gets the value of the vAlign property.
     * 
     * @return
     *     possible object is
     *     {@link ItemVerticalAlignment }
     *     
     */
    public ItemVerticalAlignment getVAlign() {
        return vAlign;
    }

    /**
     * Sets the value of the vAlign property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemVerticalAlignment }
     *     
     */
    public void setVAlign(ItemVerticalAlignment value) {
        this.vAlign = value;
    }

    /**
     * Gets the value of the titleHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTitleHeight() {
        return titleHeight;
    }

    /**
     * Sets the value of the titleHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTitleHeight(BigDecimal value) {
        this.titleHeight = value;
    }

    /**
     * Gets the value of the clearEvents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClearEvents() {
        return clearEvents;
    }

    /**
     * Sets the value of the clearEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClearEvents(Boolean value) {
        this.clearEvents = value;
    }

}
