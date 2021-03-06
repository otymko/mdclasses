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
 * <p>Java class for FlowchartFieldData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowchartFieldData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="brdClr" type="{http://v8.1c.ru/8.1/data/ui}Color" minOccurs="0"/&gt;
 *         &lt;element name="event" type="{http://v8.1c.ru/8.2/managed-application/logform}Event" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="horStretch" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="verStretch" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="autoMaxWidth" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="maxWidth" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="minWidth" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="autoMaxHeight" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="maxHeight" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="useOutput" type="{http://v8.1c.ru/8.1/data/ui}UseOutput" /&gt;
 *       &lt;attribute name="edit" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="clearEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowchartFieldData", namespace = "http://v8.1c.ru/8.2/managed-application/logform", propOrder = {
    "brdClr",
    "event"
})
public class FlowchartFieldData {

    @XmlSchemaType(name = "anySimpleType")
    protected String brdClr;
    protected List<Event> event;
    @XmlAttribute(name = "width")
    protected BigDecimal width;
    @XmlAttribute(name = "height")
    protected BigDecimal height;
    @XmlAttribute(name = "horStretch")
    protected Boolean horStretch;
    @XmlAttribute(name = "verStretch")
    protected Boolean verStretch;
    @XmlAttribute(name = "autoMaxWidth")
    protected Boolean autoMaxWidth;
    @XmlAttribute(name = "maxWidth")
    protected BigDecimal maxWidth;
    @XmlAttribute(name = "minWidth")
    protected BigDecimal minWidth;
    @XmlAttribute(name = "autoMaxHeight")
    protected Boolean autoMaxHeight;
    @XmlAttribute(name = "maxHeight")
    protected BigDecimal maxHeight;
    @XmlAttribute(name = "useOutput")
    protected UseOutput useOutput;
    @XmlAttribute(name = "edit")
    protected Boolean edit;
    @XmlAttribute(name = "clearEvents")
    protected Boolean clearEvents;

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
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWidth(BigDecimal value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeight(BigDecimal value) {
        this.height = value;
    }

    /**
     * Gets the value of the horStretch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHorStretch() {
        return horStretch;
    }

    /**
     * Sets the value of the horStretch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHorStretch(Boolean value) {
        this.horStretch = value;
    }

    /**
     * Gets the value of the verStretch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerStretch() {
        return verStretch;
    }

    /**
     * Sets the value of the verStretch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerStretch(Boolean value) {
        this.verStretch = value;
    }

    /**
     * Gets the value of the autoMaxWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoMaxWidth() {
        return autoMaxWidth;
    }

    /**
     * Sets the value of the autoMaxWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoMaxWidth(Boolean value) {
        this.autoMaxWidth = value;
    }

    /**
     * Gets the value of the maxWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxWidth() {
        return maxWidth;
    }

    /**
     * Sets the value of the maxWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxWidth(BigDecimal value) {
        this.maxWidth = value;
    }

    /**
     * Gets the value of the minWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinWidth() {
        return minWidth;
    }

    /**
     * Sets the value of the minWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinWidth(BigDecimal value) {
        this.minWidth = value;
    }

    /**
     * Gets the value of the autoMaxHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoMaxHeight() {
        return autoMaxHeight;
    }

    /**
     * Sets the value of the autoMaxHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoMaxHeight(Boolean value) {
        this.autoMaxHeight = value;
    }

    /**
     * Gets the value of the maxHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxHeight() {
        return maxHeight;
    }

    /**
     * Sets the value of the maxHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxHeight(BigDecimal value) {
        this.maxHeight = value;
    }

    /**
     * Gets the value of the useOutput property.
     * 
     * @return
     *     possible object is
     *     {@link UseOutput }
     *     
     */
    public UseOutput getUseOutput() {
        return useOutput;
    }

    /**
     * Sets the value of the useOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link UseOutput }
     *     
     */
    public void setUseOutput(UseOutput value) {
        this.useOutput = value;
    }

    /**
     * Gets the value of the edit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEdit() {
        return edit;
    }

    /**
     * Sets the value of the edit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEdit(Boolean value) {
        this.edit = value;
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
