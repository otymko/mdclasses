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
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Addition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Addition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="source" type="{http://v8.1c.ru/8.2/managed-application/logform}AdditionSource"/&gt;
 *         &lt;element name="searchStringData" type="{http://v8.1c.ru/8.2/managed-application/logform}SearchStringData" minOccurs="0"/&gt;
 *         &lt;element name="viewStatusData" type="{http://v8.1c.ru/8.2/managed-application/logform}ViewStatusData" minOccurs="0"/&gt;
 *         &lt;element name="searchControlData" type="{http://v8.1c.ru/8.2/managed-application/logform}SearchControlData" minOccurs="0"/&gt;
 *         &lt;element name="predefined" type="{http://v8.1c.ru/8.2/managed-application/logform}Predefined" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tooltip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="event" type="{http://v8.1c.ru/8.2/managed-application/logform}Event" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="group" type="{http://v8.1c.ru/8.2/managed-application/logform}GroupLogForm" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="button" type="{http://v8.1c.ru/8.2/managed-application/logform}Button" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="org" type="{http://v8.1c.ru/8.2/managed-application/logform}FormElementOrigin" /&gt;
 *       &lt;attribute name="users" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="kind" type="{http://v8.1c.ru/8.2/managed-application/logform}LogFormElementAdditionKind" /&gt;
 *       &lt;attribute name="visible" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="userVisible" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="plcm" type="{http://v8.1c.ru/8.2/managed-application/logform}MenuElementPlacementArea" /&gt;
 *       &lt;attribute name="tooltipRepres" type="{http://v8.1c.ru/8.2/managed-application/logform}TooltipRepresentation" /&gt;
 *       &lt;attribute name="groupHAlign" type="{http://v8.1c.ru/8.2/managed-application/logform}ItemHorizontalAlignment" /&gt;
 *       &lt;attribute name="groupVAlign" type="{http://v8.1c.ru/8.2/managed-application/logform}ItemVerticalAlignment" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Addition", namespace = "http://v8.1c.ru/8.2/managed-application/logform", propOrder = {
    "source",
    "searchStringData",
    "viewStatusData",
    "searchControlData",
    "predefined",
    "title",
    "tooltip",
    "event",
    "group",
    "button"
})
public class Addition {

    protected AdditionSource source;
    protected SearchStringData searchStringData;
    protected ViewStatusData viewStatusData;
    protected SearchControlData searchControlData;
    protected List<Predefined> predefined;
    protected String title;
    protected String tooltip;
    protected List<Event> event;
    protected List<GroupLogForm> group;
    protected List<Button> button;
    @XmlAttribute(name = "id")
    protected BigDecimal id;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "org")
    protected FormElementOrigin org;
    @XmlAttribute(name = "users")
    protected Boolean users;
    @XmlAttribute(name = "kind")
    protected LogFormElementAdditionKind kind;
    @XmlAttribute(name = "visible")
    protected Boolean visible;
    @XmlAttribute(name = "userVisible")
    protected Boolean userVisible;
    @XmlAttribute(name = "enabled")
    protected Boolean enabled;
    @XmlAttribute(name = "plcm")
    protected MenuElementPlacementArea plcm;
    @XmlAttribute(name = "tooltipRepres")
    protected TooltipRepresentation tooltipRepres;
    @XmlAttribute(name = "groupHAlign")
    protected ItemHorizontalAlignment groupHAlign;
    @XmlAttribute(name = "groupVAlign")
    protected ItemVerticalAlignment groupVAlign;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionSource }
     *     
     */
    public AdditionSource getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionSource }
     *     
     */
    public void setSource(AdditionSource value) {
        this.source = value;
    }

    /**
     * Gets the value of the searchStringData property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringData }
     *     
     */
    public SearchStringData getSearchStringData() {
        return searchStringData;
    }

    /**
     * Sets the value of the searchStringData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringData }
     *     
     */
    public void setSearchStringData(SearchStringData value) {
        this.searchStringData = value;
    }

    /**
     * Gets the value of the viewStatusData property.
     * 
     * @return
     *     possible object is
     *     {@link ViewStatusData }
     *     
     */
    public ViewStatusData getViewStatusData() {
        return viewStatusData;
    }

    /**
     * Sets the value of the viewStatusData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewStatusData }
     *     
     */
    public void setViewStatusData(ViewStatusData value) {
        this.viewStatusData = value;
    }

    /**
     * Gets the value of the searchControlData property.
     * 
     * @return
     *     possible object is
     *     {@link SearchControlData }
     *     
     */
    public SearchControlData getSearchControlData() {
        return searchControlData;
    }

    /**
     * Sets the value of the searchControlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchControlData }
     *     
     */
    public void setSearchControlData(SearchControlData value) {
        this.searchControlData = value;
    }

    /**
     * Gets the value of the predefined property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the predefined property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredefined().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Predefined }
     * 
     * 
     */
    public List<Predefined> getPredefined() {
        if (predefined == null) {
            predefined = new ArrayList<Predefined>();
        }
        return this.predefined;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the tooltip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTooltip() {
        return tooltip;
    }

    /**
     * Sets the value of the tooltip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTooltip(String value) {
        this.tooltip = value;
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
     * Gets the value of the group property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the group property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupLogForm }
     * 
     * 
     */
    public List<GroupLogForm> getGroup() {
        if (group == null) {
            group = new ArrayList<GroupLogForm>();
        }
        return this.group;
    }

    /**
     * Gets the value of the button property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the button property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getButton().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Button }
     * 
     * 
     */
    public List<Button> getButton() {
        if (button == null) {
            button = new ArrayList<Button>();
        }
        return this.button;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setId(BigDecimal value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the org property.
     * 
     * @return
     *     possible object is
     *     {@link FormElementOrigin }
     *     
     */
    public FormElementOrigin getOrg() {
        return org;
    }

    /**
     * Sets the value of the org property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormElementOrigin }
     *     
     */
    public void setOrg(FormElementOrigin value) {
        this.org = value;
    }

    /**
     * Gets the value of the users property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsers() {
        return users;
    }

    /**
     * Sets the value of the users property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsers(Boolean value) {
        this.users = value;
    }

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link LogFormElementAdditionKind }
     *     
     */
    public LogFormElementAdditionKind getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogFormElementAdditionKind }
     *     
     */
    public void setKind(LogFormElementAdditionKind value) {
        this.kind = value;
    }

    /**
     * Gets the value of the visible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisible(Boolean value) {
        this.visible = value;
    }

    /**
     * Gets the value of the userVisible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserVisible() {
        return userVisible;
    }

    /**
     * Sets the value of the userVisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserVisible(Boolean value) {
        this.userVisible = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the plcm property.
     * 
     * @return
     *     possible object is
     *     {@link MenuElementPlacementArea }
     *     
     */
    public MenuElementPlacementArea getPlcm() {
        return plcm;
    }

    /**
     * Sets the value of the plcm property.
     * 
     * @param value
     *     allowed object is
     *     {@link MenuElementPlacementArea }
     *     
     */
    public void setPlcm(MenuElementPlacementArea value) {
        this.plcm = value;
    }

    /**
     * Gets the value of the tooltipRepres property.
     * 
     * @return
     *     possible object is
     *     {@link TooltipRepresentation }
     *     
     */
    public TooltipRepresentation getTooltipRepres() {
        return tooltipRepres;
    }

    /**
     * Sets the value of the tooltipRepres property.
     * 
     * @param value
     *     allowed object is
     *     {@link TooltipRepresentation }
     *     
     */
    public void setTooltipRepres(TooltipRepresentation value) {
        this.tooltipRepres = value;
    }

    /**
     * Gets the value of the groupHAlign property.
     * 
     * @return
     *     possible object is
     *     {@link ItemHorizontalAlignment }
     *     
     */
    public ItemHorizontalAlignment getGroupHAlign() {
        return groupHAlign;
    }

    /**
     * Sets the value of the groupHAlign property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemHorizontalAlignment }
     *     
     */
    public void setGroupHAlign(ItemHorizontalAlignment value) {
        this.groupHAlign = value;
    }

    /**
     * Gets the value of the groupVAlign property.
     * 
     * @return
     *     possible object is
     *     {@link ItemVerticalAlignment }
     *     
     */
    public ItemVerticalAlignment getGroupVAlign() {
        return groupVAlign;
    }

    /**
     * Sets the value of the groupVAlign property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemVerticalAlignment }
     *     
     */
    public void setGroupVAlign(ItemVerticalAlignment value) {
        this.groupVAlign = value;
    }

}
