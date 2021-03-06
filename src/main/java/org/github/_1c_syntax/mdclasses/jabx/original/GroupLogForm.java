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
 * <p>Java class for GroupLogForm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupLogForm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="titleTxtClr" type="{http://v8.1c.ru/8.1/data/ui}Color" minOccurs="0"/&gt;
 *         &lt;element name="titleFnt" type="{http://v8.1c.ru/8.1/data/ui}Font" minOccurs="0"/&gt;
 *         &lt;element name="stcut" type="{http://v8.1c.ru/8.1/data/ui}ShortCutType" minOccurs="0"/&gt;
 *         &lt;element name="menuData" type="{http://v8.1c.ru/8.2/managed-application/logform}MenuGroupData" minOccurs="0"/&gt;
 *         &lt;element name="autoMenuData" type="{http://v8.1c.ru/8.2/managed-application/logform}AutoMenuGroupData" minOccurs="0"/&gt;
 *         &lt;element name="subMenuData" type="{http://v8.1c.ru/8.2/managed-application/logform}SubmenuGroupData" minOccurs="0"/&gt;
 *         &lt;element name="buttonsData" type="{http://v8.1c.ru/8.2/managed-application/logform}ButtonsGroupData" minOccurs="0"/&gt;
 *         &lt;element name="contextMenuData" type="{http://v8.1c.ru/8.2/managed-application/logform}ContextMenuGroupData" minOccurs="0"/&gt;
 *         &lt;element name="columnsData" type="{http://v8.1c.ru/8.2/managed-application/logform}ColumnsGroupData" minOccurs="0"/&gt;
 *         &lt;element name="pagesData" type="{http://v8.1c.ru/8.2/managed-application/logform}PagesGroupData" minOccurs="0"/&gt;
 *         &lt;element name="pageData" type="{http://v8.1c.ru/8.2/managed-application/logform}PageGroupData" minOccurs="0"/&gt;
 *         &lt;element name="usualData" type="{http://v8.1c.ru/8.2/managed-application/logform}UsualGroupData" minOccurs="0"/&gt;
 *         &lt;element name="field" type="{http://v8.1c.ru/8.2/managed-application/logform}FieldLogForm" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="group" type="{http://v8.1c.ru/8.2/managed-application/logform}GroupLogForm" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="table" type="{http://v8.1c.ru/8.2/managed-application/logform}TableLogForm" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="button" type="{http://v8.1c.ru/8.2/managed-application/logform}Button" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="decoration" type="{http://v8.1c.ru/8.2/managed-application/logform}Decoration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="addition" type="{http://v8.1c.ru/8.2/managed-application/logform}Addition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tooltip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="predefined" type="{http://v8.1c.ru/8.2/managed-application/logform}Predefined" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="org" type="{http://v8.1c.ru/8.2/managed-application/logform}FormElementOrigin" /&gt;
 *       &lt;attribute name="users" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="kind" type="{http://v8.1c.ru/8.2/managed-application/logform}ManagedFormGroupType" /&gt;
 *       &lt;attribute name="visible" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="userVisible" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="contentChange" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="readOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="horStretch" type="{http://v8.1c.ru/8.2/managed-application/logform}BWAValue" /&gt;
 *       &lt;attribute name="verStretch" type="{http://v8.1c.ru/8.2/managed-application/logform}BWAValue" /&gt;
 *       &lt;attribute name="tooltipRepres" type="{http://v8.1c.ru/8.2/managed-application/logform}TooltipRepresentation" /&gt;
 *       &lt;attribute name="groupHAlign" type="{http://v8.1c.ru/8.2/managed-application/logform}ItemHorizontalAlignment" /&gt;
 *       &lt;attribute name="groupVAlign" type="{http://v8.1c.ru/8.2/managed-application/logform}ItemVerticalAlignment" /&gt;
 *       &lt;attribute name="degeneratable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupLogForm", namespace = "http://v8.1c.ru/8.2/managed-application/logform", propOrder = {
    "titleTxtClr",
    "titleFnt",
    "stcut",
    "menuData",
    "autoMenuData",
    "subMenuData",
    "buttonsData",
    "contextMenuData",
    "columnsData",
    "pagesData",
    "pageData",
    "usualData",
    "field",
    "group",
    "table",
    "button",
    "decoration",
    "addition",
    "title",
    "tooltip",
    "predefined"
})
public class GroupLogForm {

    @XmlSchemaType(name = "anySimpleType")
    protected String titleTxtClr;
    protected Font titleFnt;
    protected ShortCutType stcut;
    protected MenuGroupData menuData;
    protected AutoMenuGroupData autoMenuData;
    protected SubmenuGroupData subMenuData;
    protected ButtonsGroupData buttonsData;
    protected ContextMenuGroupData contextMenuData;
    protected ColumnsGroupData columnsData;
    protected PagesGroupData pagesData;
    protected PageGroupData pageData;
    protected UsualGroupData usualData;
    protected List<FieldLogForm> field;
    protected List<GroupLogForm> group;
    protected List<TableLogForm> table;
    protected List<Button> button;
    protected List<Decoration> decoration;
    protected List<Addition> addition;
    protected String title;
    protected String tooltip;
    protected List<Predefined> predefined;
    @XmlAttribute(name = "id")
    protected BigDecimal id;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "org")
    protected FormElementOrigin org;
    @XmlAttribute(name = "users")
    protected Boolean users;
    @XmlAttribute(name = "kind")
    protected ManagedFormGroupType kind;
    @XmlAttribute(name = "visible")
    protected Boolean visible;
    @XmlAttribute(name = "userVisible")
    protected Boolean userVisible;
    @XmlAttribute(name = "contentChange")
    protected Boolean contentChange;
    @XmlAttribute(name = "enabled")
    protected Boolean enabled;
    @XmlAttribute(name = "readOnly")
    protected Boolean readOnly;
    @XmlAttribute(name = "width")
    protected BigDecimal width;
    @XmlAttribute(name = "height")
    protected BigDecimal height;
    @XmlAttribute(name = "horStretch")
    protected BWAValue horStretch;
    @XmlAttribute(name = "verStretch")
    protected BWAValue verStretch;
    @XmlAttribute(name = "tooltipRepres")
    protected TooltipRepresentation tooltipRepres;
    @XmlAttribute(name = "groupHAlign")
    protected ItemHorizontalAlignment groupHAlign;
    @XmlAttribute(name = "groupVAlign")
    protected ItemVerticalAlignment groupVAlign;
    @XmlAttribute(name = "degeneratable")
    protected Boolean degeneratable;

    /**
     * Gets the value of the titleTxtClr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleTxtClr() {
        return titleTxtClr;
    }

    /**
     * Sets the value of the titleTxtClr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleTxtClr(String value) {
        this.titleTxtClr = value;
    }

    /**
     * Gets the value of the titleFnt property.
     * 
     * @return
     *     possible object is
     *     {@link Font }
     *     
     */
    public Font getTitleFnt() {
        return titleFnt;
    }

    /**
     * Sets the value of the titleFnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Font }
     *     
     */
    public void setTitleFnt(Font value) {
        this.titleFnt = value;
    }

    /**
     * Gets the value of the stcut property.
     * 
     * @return
     *     possible object is
     *     {@link ShortCutType }
     *     
     */
    public ShortCutType getStcut() {
        return stcut;
    }

    /**
     * Sets the value of the stcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortCutType }
     *     
     */
    public void setStcut(ShortCutType value) {
        this.stcut = value;
    }

    /**
     * Gets the value of the menuData property.
     * 
     * @return
     *     possible object is
     *     {@link MenuGroupData }
     *     
     */
    public MenuGroupData getMenuData() {
        return menuData;
    }

    /**
     * Sets the value of the menuData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MenuGroupData }
     *     
     */
    public void setMenuData(MenuGroupData value) {
        this.menuData = value;
    }

    /**
     * Gets the value of the autoMenuData property.
     * 
     * @return
     *     possible object is
     *     {@link AutoMenuGroupData }
     *     
     */
    public AutoMenuGroupData getAutoMenuData() {
        return autoMenuData;
    }

    /**
     * Sets the value of the autoMenuData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoMenuGroupData }
     *     
     */
    public void setAutoMenuData(AutoMenuGroupData value) {
        this.autoMenuData = value;
    }

    /**
     * Gets the value of the subMenuData property.
     * 
     * @return
     *     possible object is
     *     {@link SubmenuGroupData }
     *     
     */
    public SubmenuGroupData getSubMenuData() {
        return subMenuData;
    }

    /**
     * Sets the value of the subMenuData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmenuGroupData }
     *     
     */
    public void setSubMenuData(SubmenuGroupData value) {
        this.subMenuData = value;
    }

    /**
     * Gets the value of the buttonsData property.
     * 
     * @return
     *     possible object is
     *     {@link ButtonsGroupData }
     *     
     */
    public ButtonsGroupData getButtonsData() {
        return buttonsData;
    }

    /**
     * Sets the value of the buttonsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ButtonsGroupData }
     *     
     */
    public void setButtonsData(ButtonsGroupData value) {
        this.buttonsData = value;
    }

    /**
     * Gets the value of the contextMenuData property.
     * 
     * @return
     *     possible object is
     *     {@link ContextMenuGroupData }
     *     
     */
    public ContextMenuGroupData getContextMenuData() {
        return contextMenuData;
    }

    /**
     * Sets the value of the contextMenuData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextMenuGroupData }
     *     
     */
    public void setContextMenuData(ContextMenuGroupData value) {
        this.contextMenuData = value;
    }

    /**
     * Gets the value of the columnsData property.
     * 
     * @return
     *     possible object is
     *     {@link ColumnsGroupData }
     *     
     */
    public ColumnsGroupData getColumnsData() {
        return columnsData;
    }

    /**
     * Sets the value of the columnsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnsGroupData }
     *     
     */
    public void setColumnsData(ColumnsGroupData value) {
        this.columnsData = value;
    }

    /**
     * Gets the value of the pagesData property.
     * 
     * @return
     *     possible object is
     *     {@link PagesGroupData }
     *     
     */
    public PagesGroupData getPagesData() {
        return pagesData;
    }

    /**
     * Sets the value of the pagesData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagesGroupData }
     *     
     */
    public void setPagesData(PagesGroupData value) {
        this.pagesData = value;
    }

    /**
     * Gets the value of the pageData property.
     * 
     * @return
     *     possible object is
     *     {@link PageGroupData }
     *     
     */
    public PageGroupData getPageData() {
        return pageData;
    }

    /**
     * Sets the value of the pageData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageGroupData }
     *     
     */
    public void setPageData(PageGroupData value) {
        this.pageData = value;
    }

    /**
     * Gets the value of the usualData property.
     * 
     * @return
     *     possible object is
     *     {@link UsualGroupData }
     *     
     */
    public UsualGroupData getUsualData() {
        return usualData;
    }

    /**
     * Sets the value of the usualData property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsualGroupData }
     *     
     */
    public void setUsualData(UsualGroupData value) {
        this.usualData = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the field property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldLogForm }
     * 
     * 
     */
    public List<FieldLogForm> getField() {
        if (field == null) {
            field = new ArrayList<FieldLogForm>();
        }
        return this.field;
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
     * Gets the value of the table property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the table property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TableLogForm }
     * 
     * 
     */
    public List<TableLogForm> getTable() {
        if (table == null) {
            table = new ArrayList<TableLogForm>();
        }
        return this.table;
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
     * Gets the value of the decoration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the decoration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDecoration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Decoration }
     * 
     * 
     */
    public List<Decoration> getDecoration() {
        if (decoration == null) {
            decoration = new ArrayList<Decoration>();
        }
        return this.decoration;
    }

    /**
     * Gets the value of the addition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Addition }
     * 
     * 
     */
    public List<Addition> getAddition() {
        if (addition == null) {
            addition = new ArrayList<Addition>();
        }
        return this.addition;
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
     *     {@link ManagedFormGroupType }
     *     
     */
    public ManagedFormGroupType getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedFormGroupType }
     *     
     */
    public void setKind(ManagedFormGroupType value) {
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
     * Gets the value of the contentChange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContentChange() {
        return contentChange;
    }

    /**
     * Sets the value of the contentChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContentChange(Boolean value) {
        this.contentChange = value;
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
     * Gets the value of the readOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReadOnly(Boolean value) {
        this.readOnly = value;
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
     *     {@link BWAValue }
     *     
     */
    public BWAValue getHorStretch() {
        return horStretch;
    }

    /**
     * Sets the value of the horStretch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BWAValue }
     *     
     */
    public void setHorStretch(BWAValue value) {
        this.horStretch = value;
    }

    /**
     * Gets the value of the verStretch property.
     * 
     * @return
     *     possible object is
     *     {@link BWAValue }
     *     
     */
    public BWAValue getVerStretch() {
        return verStretch;
    }

    /**
     * Sets the value of the verStretch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BWAValue }
     *     
     */
    public void setVerStretch(BWAValue value) {
        this.verStretch = value;
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

    /**
     * Gets the value of the degeneratable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDegeneratable() {
        return degeneratable;
    }

    /**
     * Sets the value of the degeneratable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDegeneratable(Boolean value) {
        this.degeneratable = value;
    }

}
