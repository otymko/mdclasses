//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package org.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for DimensionProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DimensionProperties"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Synonym" type="{http://v8.1c.ru/8.1/data/core}LocalStringType" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ObjectBelonging" type="{http://v8.1c.ru/8.3/xcf/enums}ObjectBelonging" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://v8.1c.ru/8.1/data/core}TypeDescription" minOccurs="0"/&gt;
 *         &lt;element name="PasswordMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Format" type="{http://v8.1c.ru/8.1/data/core}LocalStringType" minOccurs="0"/&gt;
 *         &lt;element name="EditFormat" type="{http://v8.1c.ru/8.1/data/core}LocalStringType" minOccurs="0"/&gt;
 *         &lt;element name="ToolTip" type="{http://v8.1c.ru/8.1/data/core}LocalStringType" minOccurs="0"/&gt;
 *         &lt;element name="MarkNegatives" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Mask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MultiLine" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExtendedEdit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinValue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="MaxValue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="FillChecking" type="{http://v8.1c.ru/8.1/data/core}FillChecking" minOccurs="0"/&gt;
 *         &lt;element name="ChoiceFoldersAndItems" type="{http://v8.1c.ru/8.1/data/enterprise}FoldersAndItemsUse" minOccurs="0"/&gt;
 *         &lt;element name="ChoiceParameterLinks" type="{http://v8.1c.ru/8.3/xcf/readable}ChoiceParameterLinks" minOccurs="0"/&gt;
 *         &lt;element name="ChoiceParameters" type="{http://v8.1c.ru/8.2/managed-application/core}ChoiceParameters" minOccurs="0"/&gt;
 *         &lt;element name="QuickChoice" type="{http://v8.1c.ru/8.3/xcf/enums}UseQuickChoice" minOccurs="0"/&gt;
 *         &lt;element name="CreateOnInput" type="{http://v8.1c.ru/8.3/xcf/enums}CreateOnInput" minOccurs="0"/&gt;
 *         &lt;element name="ChoiceForm" type="{http://v8.1c.ru/8.3/xcf/readable}MDObjectRef" minOccurs="0"/&gt;
 *         &lt;element name="LinkByType" type="{http://v8.1c.ru/8.3/xcf/readable}TypeLink" minOccurs="0"/&gt;
 *         &lt;element name="ChoiceHistoryOnInput" type="{http://v8.1c.ru/8.2/managed-application/logform}ChoiceHistoryOnInput" minOccurs="0"/&gt;
 *         &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AccountingFlag" type="{http://v8.1c.ru/8.3/xcf/readable}MDObjectRef" minOccurs="0"/&gt;
 *         &lt;element name="DenyIncompleteValues" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Indexing" type="{http://v8.1c.ru/8.3/xcf/enums}Indexing" minOccurs="0"/&gt;
 *         &lt;element name="FullTextSearch" type="{http://v8.1c.ru/8.3/xcf/enums}FullTextSearchUsing" minOccurs="0"/&gt;
 *         &lt;element name="UseInTotals" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RegisterDimension" type="{http://v8.1c.ru/8.3/xcf/readable}MDObjectRef" minOccurs="0"/&gt;
 *         &lt;element name="LeadingRegisterData" type="{http://v8.1c.ru/8.3/xcf/readable}MDListType" minOccurs="0"/&gt;
 *         &lt;element name="FillFromFillingValue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FillValue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Master" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MainFilter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BaseDimension" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ScheduleLink" type="{http://v8.1c.ru/8.3/xcf/readable}MDObjectRef" minOccurs="0"/&gt;
 *         &lt;element name="DocumentMap" type="{http://v8.1c.ru/8.3/xcf/readable}MDListType" minOccurs="0"/&gt;
 *         &lt;element name="RegisterRecordsMap" type="{http://v8.1c.ru/8.3/xcf/readable}MDListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DimensionProperties", propOrder = {
    "name",
    "synonym",
    "comment",
    "objectBelonging",
    "type",
    "passwordMode",
    "format",
    "editFormat",
    "toolTip",
    "markNegatives",
    "mask",
    "multiLine",
    "extendedEdit",
    "minValue",
    "maxValue",
    "fillChecking",
    "choiceFoldersAndItems",
    "choiceParameterLinks",
    "choiceParameters",
    "quickChoice",
    "createOnInput",
    "choiceForm",
    "linkByType",
    "choiceHistoryOnInput",
    "balance",
    "accountingFlag",
    "denyIncompleteValues",
    "indexing",
    "fullTextSearch",
    "useInTotals",
    "registerDimension",
    "leadingRegisterData",
    "fillFromFillingValue",
    "fillValue",
    "master",
    "mainFilter",
    "baseDimension",
    "scheduleLink",
    "documentMap",
    "registerRecordsMap"
})
public class DimensionProperties {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Synonym")
    protected LocalStringType synonym;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "ObjectBelonging")
    @XmlSchemaType(name = "string")
    protected ObjectBelonging objectBelonging;
    @XmlElement(name = "Type")
    protected TypeDescription type;
    @XmlElement(name = "PasswordMode")
    protected Boolean passwordMode;
    @XmlElement(name = "Format")
    protected LocalStringType format;
    @XmlElement(name = "EditFormat")
    protected LocalStringType editFormat;
    @XmlElement(name = "ToolTip")
    protected LocalStringType toolTip;
    @XmlElement(name = "MarkNegatives")
    protected Boolean markNegatives;
    @XmlElement(name = "Mask")
    protected String mask;
    @XmlElement(name = "MultiLine")
    protected Boolean multiLine;
    @XmlElement(name = "ExtendedEdit")
    protected Boolean extendedEdit;
    @XmlElement(name = "MinValue")
    protected Object minValue;
    @XmlElement(name = "MaxValue")
    protected Object maxValue;
    @XmlElement(name = "FillChecking")
    @XmlSchemaType(name = "string")
    protected FillChecking fillChecking;
    @XmlElement(name = "ChoiceFoldersAndItems")
    @XmlSchemaType(name = "string")
    protected FoldersAndItemsUse choiceFoldersAndItems;
    @XmlElement(name = "ChoiceParameterLinks")
    protected ChoiceParameterLinks choiceParameterLinks;
    @XmlElement(name = "ChoiceParameters")
    protected ChoiceParameters choiceParameters;
    @XmlElement(name = "QuickChoice")
    @XmlSchemaType(name = "string")
    protected UseQuickChoice quickChoice;
    @XmlElement(name = "CreateOnInput")
    @XmlSchemaType(name = "string")
    protected CreateOnInput createOnInput;
    @XmlElement(name = "ChoiceForm")
    protected String choiceForm;
    @XmlElement(name = "LinkByType")
    protected TypeLink linkByType;
    @XmlElement(name = "ChoiceHistoryOnInput")
    @XmlSchemaType(name = "string")
    protected ChoiceHistoryOnInput choiceHistoryOnInput;
    @XmlElement(name = "Balance")
    protected Boolean balance;
    @XmlElement(name = "AccountingFlag")
    protected String accountingFlag;
    @XmlElement(name = "DenyIncompleteValues")
    protected Boolean denyIncompleteValues;
    @XmlElement(name = "Indexing")
    @XmlSchemaType(name = "string")
    protected Indexing indexing;
    @XmlElement(name = "FullTextSearch")
    @XmlSchemaType(name = "string")
    protected FullTextSearchUsing fullTextSearch;
    @XmlElement(name = "UseInTotals")
    protected Boolean useInTotals;
    @XmlElement(name = "RegisterDimension")
    protected String registerDimension;
    @XmlElement(name = "LeadingRegisterData")
    protected MDListType leadingRegisterData;
    @XmlElement(name = "FillFromFillingValue")
    protected Boolean fillFromFillingValue;
    @XmlElement(name = "FillValue")
    protected Object fillValue;
    @XmlElement(name = "Master")
    protected Boolean master;
    @XmlElement(name = "MainFilter")
    protected Boolean mainFilter;
    @XmlElement(name = "BaseDimension")
    protected Boolean baseDimension;
    @XmlElement(name = "ScheduleLink")
    protected String scheduleLink;
    @XmlElement(name = "DocumentMap")
    protected MDListType documentMap;
    @XmlElement(name = "RegisterRecordsMap")
    protected MDListType registerRecordsMap;

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
     * Gets the value of the synonym property.
     * 
     * @return
     *     possible object is
     *     {@link LocalStringType }
     *     
     */
    public LocalStringType getSynonym() {
        return synonym;
    }

    /**
     * Sets the value of the synonym property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalStringType }
     *     
     */
    public void setSynonym(LocalStringType value) {
        this.synonym = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the objectBelonging property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectBelonging }
     *     
     */
    public ObjectBelonging getObjectBelonging() {
        return objectBelonging;
    }

    /**
     * Sets the value of the objectBelonging property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectBelonging }
     *     
     */
    public void setObjectBelonging(ObjectBelonging value) {
        this.objectBelonging = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDescription }
     *     
     */
    public TypeDescription getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDescription }
     *     
     */
    public void setType(TypeDescription value) {
        this.type = value;
    }

    /**
     * Gets the value of the passwordMode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPasswordMode() {
        return passwordMode;
    }

    /**
     * Sets the value of the passwordMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPasswordMode(Boolean value) {
        this.passwordMode = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link LocalStringType }
     *     
     */
    public LocalStringType getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalStringType }
     *     
     */
    public void setFormat(LocalStringType value) {
        this.format = value;
    }

    /**
     * Gets the value of the editFormat property.
     * 
     * @return
     *     possible object is
     *     {@link LocalStringType }
     *     
     */
    public LocalStringType getEditFormat() {
        return editFormat;
    }

    /**
     * Sets the value of the editFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalStringType }
     *     
     */
    public void setEditFormat(LocalStringType value) {
        this.editFormat = value;
    }

    /**
     * Gets the value of the toolTip property.
     * 
     * @return
     *     possible object is
     *     {@link LocalStringType }
     *     
     */
    public LocalStringType getToolTip() {
        return toolTip;
    }

    /**
     * Sets the value of the toolTip property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalStringType }
     *     
     */
    public void setToolTip(LocalStringType value) {
        this.toolTip = value;
    }

    /**
     * Gets the value of the markNegatives property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarkNegatives() {
        return markNegatives;
    }

    /**
     * Sets the value of the markNegatives property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarkNegatives(Boolean value) {
        this.markNegatives = value;
    }

    /**
     * Gets the value of the mask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMask() {
        return mask;
    }

    /**
     * Sets the value of the mask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMask(String value) {
        this.mask = value;
    }

    /**
     * Gets the value of the multiLine property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultiLine() {
        return multiLine;
    }

    /**
     * Sets the value of the multiLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultiLine(Boolean value) {
        this.multiLine = value;
    }

    /**
     * Gets the value of the extendedEdit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtendedEdit() {
        return extendedEdit;
    }

    /**
     * Sets the value of the extendedEdit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtendedEdit(Boolean value) {
        this.extendedEdit = value;
    }

    /**
     * Gets the value of the minValue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMinValue() {
        return minValue;
    }

    /**
     * Sets the value of the minValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMinValue(Object value) {
        this.minValue = value;
    }

    /**
     * Gets the value of the maxValue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMaxValue(Object value) {
        this.maxValue = value;
    }

    /**
     * Gets the value of the fillChecking property.
     * 
     * @return
     *     possible object is
     *     {@link FillChecking }
     *     
     */
    public FillChecking getFillChecking() {
        return fillChecking;
    }

    /**
     * Sets the value of the fillChecking property.
     * 
     * @param value
     *     allowed object is
     *     {@link FillChecking }
     *     
     */
    public void setFillChecking(FillChecking value) {
        this.fillChecking = value;
    }

    /**
     * Gets the value of the choiceFoldersAndItems property.
     * 
     * @return
     *     possible object is
     *     {@link FoldersAndItemsUse }
     *     
     */
    public FoldersAndItemsUse getChoiceFoldersAndItems() {
        return choiceFoldersAndItems;
    }

    /**
     * Sets the value of the choiceFoldersAndItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link FoldersAndItemsUse }
     *     
     */
    public void setChoiceFoldersAndItems(FoldersAndItemsUse value) {
        this.choiceFoldersAndItems = value;
    }

    /**
     * Gets the value of the choiceParameterLinks property.
     * 
     * @return
     *     possible object is
     *     {@link ChoiceParameterLinks }
     *     
     */
    public ChoiceParameterLinks getChoiceParameterLinks() {
        return choiceParameterLinks;
    }

    /**
     * Sets the value of the choiceParameterLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChoiceParameterLinks }
     *     
     */
    public void setChoiceParameterLinks(ChoiceParameterLinks value) {
        this.choiceParameterLinks = value;
    }

    /**
     * Gets the value of the choiceParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ChoiceParameters }
     *     
     */
    public ChoiceParameters getChoiceParameters() {
        return choiceParameters;
    }

    /**
     * Sets the value of the choiceParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChoiceParameters }
     *     
     */
    public void setChoiceParameters(ChoiceParameters value) {
        this.choiceParameters = value;
    }

    /**
     * Gets the value of the quickChoice property.
     * 
     * @return
     *     possible object is
     *     {@link UseQuickChoice }
     *     
     */
    public UseQuickChoice getQuickChoice() {
        return quickChoice;
    }

    /**
     * Sets the value of the quickChoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link UseQuickChoice }
     *     
     */
    public void setQuickChoice(UseQuickChoice value) {
        this.quickChoice = value;
    }

    /**
     * Gets the value of the createOnInput property.
     * 
     * @return
     *     possible object is
     *     {@link CreateOnInput }
     *     
     */
    public CreateOnInput getCreateOnInput() {
        return createOnInput;
    }

    /**
     * Sets the value of the createOnInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateOnInput }
     *     
     */
    public void setCreateOnInput(CreateOnInput value) {
        this.createOnInput = value;
    }

    /**
     * Gets the value of the choiceForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChoiceForm() {
        return choiceForm;
    }

    /**
     * Sets the value of the choiceForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChoiceForm(String value) {
        this.choiceForm = value;
    }

    /**
     * Gets the value of the linkByType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeLink }
     *     
     */
    public TypeLink getLinkByType() {
        return linkByType;
    }

    /**
     * Sets the value of the linkByType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeLink }
     *     
     */
    public void setLinkByType(TypeLink value) {
        this.linkByType = value;
    }

    /**
     * Gets the value of the choiceHistoryOnInput property.
     * 
     * @return
     *     possible object is
     *     {@link ChoiceHistoryOnInput }
     *     
     */
    public ChoiceHistoryOnInput getChoiceHistoryOnInput() {
        return choiceHistoryOnInput;
    }

    /**
     * Sets the value of the choiceHistoryOnInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChoiceHistoryOnInput }
     *     
     */
    public void setChoiceHistoryOnInput(ChoiceHistoryOnInput value) {
        this.choiceHistoryOnInput = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBalance(Boolean value) {
        this.balance = value;
    }

    /**
     * Gets the value of the accountingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountingFlag() {
        return accountingFlag;
    }

    /**
     * Sets the value of the accountingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountingFlag(String value) {
        this.accountingFlag = value;
    }

    /**
     * Gets the value of the denyIncompleteValues property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDenyIncompleteValues() {
        return denyIncompleteValues;
    }

    /**
     * Sets the value of the denyIncompleteValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDenyIncompleteValues(Boolean value) {
        this.denyIncompleteValues = value;
    }

    /**
     * Gets the value of the indexing property.
     * 
     * @return
     *     possible object is
     *     {@link Indexing }
     *     
     */
    public Indexing getIndexing() {
        return indexing;
    }

    /**
     * Sets the value of the indexing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Indexing }
     *     
     */
    public void setIndexing(Indexing value) {
        this.indexing = value;
    }

    /**
     * Gets the value of the fullTextSearch property.
     * 
     * @return
     *     possible object is
     *     {@link FullTextSearchUsing }
     *     
     */
    public FullTextSearchUsing getFullTextSearch() {
        return fullTextSearch;
    }

    /**
     * Sets the value of the fullTextSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullTextSearchUsing }
     *     
     */
    public void setFullTextSearch(FullTextSearchUsing value) {
        this.fullTextSearch = value;
    }

    /**
     * Gets the value of the useInTotals property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseInTotals() {
        return useInTotals;
    }

    /**
     * Sets the value of the useInTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseInTotals(Boolean value) {
        this.useInTotals = value;
    }

    /**
     * Gets the value of the registerDimension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterDimension() {
        return registerDimension;
    }

    /**
     * Sets the value of the registerDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterDimension(String value) {
        this.registerDimension = value;
    }

    /**
     * Gets the value of the leadingRegisterData property.
     * 
     * @return
     *     possible object is
     *     {@link MDListType }
     *     
     */
    public MDListType getLeadingRegisterData() {
        return leadingRegisterData;
    }

    /**
     * Sets the value of the leadingRegisterData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDListType }
     *     
     */
    public void setLeadingRegisterData(MDListType value) {
        this.leadingRegisterData = value;
    }

    /**
     * Gets the value of the fillFromFillingValue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFillFromFillingValue() {
        return fillFromFillingValue;
    }

    /**
     * Sets the value of the fillFromFillingValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFillFromFillingValue(Boolean value) {
        this.fillFromFillingValue = value;
    }

    /**
     * Gets the value of the fillValue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFillValue() {
        return fillValue;
    }

    /**
     * Sets the value of the fillValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFillValue(Object value) {
        this.fillValue = value;
    }

    /**
     * Gets the value of the master property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaster() {
        return master;
    }

    /**
     * Sets the value of the master property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaster(Boolean value) {
        this.master = value;
    }

    /**
     * Gets the value of the mainFilter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMainFilter() {
        return mainFilter;
    }

    /**
     * Sets the value of the mainFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMainFilter(Boolean value) {
        this.mainFilter = value;
    }

    /**
     * Gets the value of the baseDimension property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBaseDimension() {
        return baseDimension;
    }

    /**
     * Sets the value of the baseDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBaseDimension(Boolean value) {
        this.baseDimension = value;
    }

    /**
     * Gets the value of the scheduleLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleLink() {
        return scheduleLink;
    }

    /**
     * Sets the value of the scheduleLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleLink(String value) {
        this.scheduleLink = value;
    }

    /**
     * Gets the value of the documentMap property.
     * 
     * @return
     *     possible object is
     *     {@link MDListType }
     *     
     */
    public MDListType getDocumentMap() {
        return documentMap;
    }

    /**
     * Sets the value of the documentMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDListType }
     *     
     */
    public void setDocumentMap(MDListType value) {
        this.documentMap = value;
    }

    /**
     * Gets the value of the registerRecordsMap property.
     * 
     * @return
     *     possible object is
     *     {@link MDListType }
     *     
     */
    public MDListType getRegisterRecordsMap() {
        return registerRecordsMap;
    }

    /**
     * Sets the value of the registerRecordsMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDListType }
     *     
     */
    public void setRegisterRecordsMap(MDListType value) {
        this.registerRecordsMap = value;
    }

}