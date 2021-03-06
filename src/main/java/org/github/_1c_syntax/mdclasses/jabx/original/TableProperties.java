//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package org.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for TableProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TableProperties"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Synonym" type="{http://v8.1c.ru/8.1/data/core}LocalStringType"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ObjectBelonging" type="{http://v8.1c.ru/8.3/xcf/enums}ObjectBelonging"/&gt;
 *         &lt;element name="TableType" type="{http://v8.1c.ru/8.3/xcf/enums}ExternalDataSourceTableType"/&gt;
 *         &lt;element name="NameInDataSource" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ExpressionInDataSource" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TableDataType" type="{http://v8.1c.ru/8.3/xcf/enums}ExternalDataSourceTableDataType"/&gt;
 *         &lt;element name="KeyFields" type="{http://v8.1c.ru/8.3/xcf/readable}FieldList"/&gt;
 *         &lt;element name="PresentationField" type="{http://v8.1c.ru/8.3/xcf/readable}MDObjectRef"/&gt;
 *         &lt;element name="ParentField" type="{http://v8.1c.ru/8.3/xcf/readable}MDObjectRef"/&gt;
 *         &lt;element name="UnfilledParentValue" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="Characteristics" type="{http://v8.1c.ru/8.3/xcf/readable}CharacteristicsDescriptions"/&gt;
 *         &lt;element name="UseStandardCommands" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="QuickChoice" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="InputByString" type="{http://v8.1c.ru/8.3/xcf/readable}FieldList"/&gt;
 *         &lt;element name="CreateOnInput" type="{http://v8.1c.ru/8.3/xcf/enums}CreateOnInput"/&gt;
 *         &lt;element name="SearchStringModeOnInputByString" type="{http://v8.1c.ru/8.2/managed-application/logform}SearchStringModeOnInputByString"/&gt;
 *         &lt;element name="ChoiceDataGetModeOnInputByString" type="{http://v8.1c.ru/8.2/managed-application/logform}ChoiceDataGetModeOnInputByString"/&gt;
 *         &lt;element name="ChoiceHistoryOnInput" type="{http://v8.1c.ru/8.2/managed-application/logform}ChoiceHistoryOnInput"/&gt;
 *         &lt;element name="DefaultObjectForm" type="{http://v8.1c.ru/8.3/xcf/readable}MDObjectRef"/&gt;
 *         &lt;element name="DefaultRecordForm" type="{http://v8.1c.ru/8.3/xcf/readable}MDObjectRef"/&gt;
 *         &lt;element name="DefaultListForm" type="{http://v8.1c.ru/8.3/xcf/readable}MDObjectRef"/&gt;
 *         &lt;element name="DefaultChoiceForm" type="{http://v8.1c.ru/8.3/xcf/readable}MDObjectRef"/&gt;
 *         &lt;element name="ObjectPresentation" type="{http://v8.1c.ru/8.1/data/core}LocalStringType"/&gt;
 *         &lt;element name="ExtendedObjectPresentation" type="{http://v8.1c.ru/8.1/data/core}LocalStringType"/&gt;
 *         &lt;element name="RecordPresentation" type="{http://v8.1c.ru/8.1/data/core}LocalStringType"/&gt;
 *         &lt;element name="ExtendedRecordPresentation" type="{http://v8.1c.ru/8.1/data/core}LocalStringType"/&gt;
 *         &lt;element name="ListPresentation" type="{http://v8.1c.ru/8.1/data/core}LocalStringType"/&gt;
 *         &lt;element name="ExtendedListPresentation" type="{http://v8.1c.ru/8.1/data/core}LocalStringType"/&gt;
 *         &lt;element name="Explanation" type="{http://v8.1c.ru/8.1/data/core}LocalStringType"/&gt;
 *         &lt;element name="ObjectModule" type="{http://v8.1c.ru/8.3/xcf/readable}ExternalProperty"/&gt;
 *         &lt;element name="RecordSetModule" type="{http://v8.1c.ru/8.3/xcf/readable}ExternalProperty"/&gt;
 *         &lt;element name="ManagerModule" type="{http://v8.1c.ru/8.3/xcf/readable}ExternalProperty"/&gt;
 *         &lt;element name="IncludeHelpInContents" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Help" type="{http://v8.1c.ru/8.3/xcf/readable}ExternalProperty"/&gt;
 *         &lt;element name="ReadOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TransactionsIsolationLevel" type="{http://v8.1c.ru/8.1/data/enterprise}TransactionsIsolationLevel"/&gt;
 *         &lt;element name="DataVersionField" type="{http://v8.1c.ru/8.3/xcf/readable}MDObjectRef"/&gt;
 *         &lt;element name="EditType" type="{http://v8.1c.ru/8.3/xcf/enums}EditType"/&gt;
 *         &lt;element name="BasedOn" type="{http://v8.1c.ru/8.3/xcf/readable}MDListType"/&gt;
 *         &lt;element name="DataLockFields" type="{http://v8.1c.ru/8.3/xcf/readable}FieldList"/&gt;
 *         &lt;element name="DataLockControlMode" type="{http://v8.1c.ru/8.3/xcf/enums}DefaultDataLockControlMode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableProperties", propOrder = {
    "name",
    "synonym",
    "comment",
    "objectBelonging",
    "tableType",
    "nameInDataSource",
    "expressionInDataSource",
    "tableDataType",
    "keyFields",
    "presentationField",
    "parentField",
    "unfilledParentValue",
    "characteristics",
    "useStandardCommands",
    "quickChoice",
    "inputByString",
    "createOnInput",
    "searchStringModeOnInputByString",
    "choiceDataGetModeOnInputByString",
    "choiceHistoryOnInput",
    "defaultObjectForm",
    "defaultRecordForm",
    "defaultListForm",
    "defaultChoiceForm",
    "objectPresentation",
    "extendedObjectPresentation",
    "recordPresentation",
    "extendedRecordPresentation",
    "listPresentation",
    "extendedListPresentation",
    "explanation",
    "objectModule",
    "recordSetModule",
    "managerModule",
    "includeHelpInContents",
    "help",
    "readOnly",
    "transactionsIsolationLevel",
    "dataVersionField",
    "editType",
    "basedOn",
    "dataLockFields",
    "dataLockControlMode"
})
public class TableProperties {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Synonym", required = true)
    protected LocalStringType synonym;
    @XmlElement(name = "Comment", required = true)
    protected String comment;
    @XmlElement(name = "ObjectBelonging", required = true)
    @XmlSchemaType(name = "string")
    protected ObjectBelonging objectBelonging;
    @XmlElement(name = "TableType", required = true)
    @XmlSchemaType(name = "string")
    protected ExternalDataSourceTableType tableType;
    @XmlElement(name = "NameInDataSource", required = true)
    protected String nameInDataSource;
    @XmlElement(name = "ExpressionInDataSource", required = true)
    protected String expressionInDataSource;
    @XmlElement(name = "TableDataType", required = true)
    @XmlSchemaType(name = "string")
    protected ExternalDataSourceTableDataType tableDataType;
    @XmlElement(name = "KeyFields", required = true)
    protected FieldList keyFields;
    @XmlElement(name = "PresentationField", required = true)
    protected String presentationField;
    @XmlElement(name = "ParentField", required = true)
    protected String parentField;
    @XmlElement(name = "UnfilledParentValue", required = true)
    protected Object unfilledParentValue;
    @XmlElement(name = "Characteristics", required = true)
    protected CharacteristicsDescriptions characteristics;
    @XmlElement(name = "UseStandardCommands")
    protected boolean useStandardCommands;
    @XmlElement(name = "QuickChoice")
    protected boolean quickChoice;
    @XmlElement(name = "InputByString", required = true)
    protected FieldList inputByString;
    @XmlElement(name = "CreateOnInput", required = true)
    @XmlSchemaType(name = "string")
    protected CreateOnInput createOnInput;
    @XmlElement(name = "SearchStringModeOnInputByString", required = true)
    @XmlSchemaType(name = "string")
    protected SearchStringModeOnInputByString searchStringModeOnInputByString;
    @XmlElement(name = "ChoiceDataGetModeOnInputByString", required = true)
    @XmlSchemaType(name = "string")
    protected ChoiceDataGetModeOnInputByString choiceDataGetModeOnInputByString;
    @XmlElement(name = "ChoiceHistoryOnInput", required = true)
    @XmlSchemaType(name = "string")
    protected ChoiceHistoryOnInput choiceHistoryOnInput;
    @XmlElement(name = "DefaultObjectForm", required = true)
    protected String defaultObjectForm;
    @XmlElement(name = "DefaultRecordForm", required = true)
    protected String defaultRecordForm;
    @XmlElement(name = "DefaultListForm", required = true)
    protected String defaultListForm;
    @XmlElement(name = "DefaultChoiceForm", required = true)
    protected String defaultChoiceForm;
    @XmlElement(name = "ObjectPresentation", required = true)
    protected LocalStringType objectPresentation;
    @XmlElement(name = "ExtendedObjectPresentation", required = true)
    protected LocalStringType extendedObjectPresentation;
    @XmlElement(name = "RecordPresentation", required = true)
    protected LocalStringType recordPresentation;
    @XmlElement(name = "ExtendedRecordPresentation", required = true)
    protected LocalStringType extendedRecordPresentation;
    @XmlElement(name = "ListPresentation", required = true)
    protected LocalStringType listPresentation;
    @XmlElement(name = "ExtendedListPresentation", required = true)
    protected LocalStringType extendedListPresentation;
    @XmlElement(name = "Explanation", required = true)
    protected LocalStringType explanation;
    @XmlElement(name = "ObjectModule", required = true)
    protected String objectModule;
    @XmlElement(name = "RecordSetModule", required = true)
    protected String recordSetModule;
    @XmlElement(name = "ManagerModule", required = true)
    protected String managerModule;
    @XmlElement(name = "IncludeHelpInContents")
    protected boolean includeHelpInContents;
    @XmlElement(name = "Help", required = true)
    protected String help;
    @XmlElement(name = "ReadOnly")
    protected boolean readOnly;
    @XmlElement(name = "TransactionsIsolationLevel", required = true)
    @XmlSchemaType(name = "string")
    protected TransactionsIsolationLevel transactionsIsolationLevel;
    @XmlElement(name = "DataVersionField", required = true)
    protected String dataVersionField;
    @XmlElement(name = "EditType", required = true)
    @XmlSchemaType(name = "string")
    protected EditType editType;
    @XmlElement(name = "BasedOn", required = true)
    protected MDListType basedOn;
    @XmlElement(name = "DataLockFields", required = true)
    protected FieldList dataLockFields;
    @XmlElement(name = "DataLockControlMode", required = true)
    @XmlSchemaType(name = "string")
    protected DefaultDataLockControlMode dataLockControlMode;

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
     * Gets the value of the tableType property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalDataSourceTableType }
     *     
     */
    public ExternalDataSourceTableType getTableType() {
        return tableType;
    }

    /**
     * Sets the value of the tableType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalDataSourceTableType }
     *     
     */
    public void setTableType(ExternalDataSourceTableType value) {
        this.tableType = value;
    }

    /**
     * Gets the value of the nameInDataSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameInDataSource() {
        return nameInDataSource;
    }

    /**
     * Sets the value of the nameInDataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameInDataSource(String value) {
        this.nameInDataSource = value;
    }

    /**
     * Gets the value of the expressionInDataSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpressionInDataSource() {
        return expressionInDataSource;
    }

    /**
     * Sets the value of the expressionInDataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpressionInDataSource(String value) {
        this.expressionInDataSource = value;
    }

    /**
     * Gets the value of the tableDataType property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalDataSourceTableDataType }
     *     
     */
    public ExternalDataSourceTableDataType getTableDataType() {
        return tableDataType;
    }

    /**
     * Sets the value of the tableDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalDataSourceTableDataType }
     *     
     */
    public void setTableDataType(ExternalDataSourceTableDataType value) {
        this.tableDataType = value;
    }

    /**
     * Gets the value of the keyFields property.
     * 
     * @return
     *     possible object is
     *     {@link FieldList }
     *     
     */
    public FieldList getKeyFields() {
        return keyFields;
    }

    /**
     * Sets the value of the keyFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldList }
     *     
     */
    public void setKeyFields(FieldList value) {
        this.keyFields = value;
    }

    /**
     * Gets the value of the presentationField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentationField() {
        return presentationField;
    }

    /**
     * Sets the value of the presentationField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentationField(String value) {
        this.presentationField = value;
    }

    /**
     * Gets the value of the parentField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentField() {
        return parentField;
    }

    /**
     * Sets the value of the parentField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentField(String value) {
        this.parentField = value;
    }

    /**
     * Gets the value of the unfilledParentValue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUnfilledParentValue() {
        return unfilledParentValue;
    }

    /**
     * Sets the value of the unfilledParentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUnfilledParentValue(Object value) {
        this.unfilledParentValue = value;
    }

    /**
     * Gets the value of the characteristics property.
     * 
     * @return
     *     possible object is
     *     {@link CharacteristicsDescriptions }
     *     
     */
    public CharacteristicsDescriptions getCharacteristics() {
        return characteristics;
    }

    /**
     * Sets the value of the characteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacteristicsDescriptions }
     *     
     */
    public void setCharacteristics(CharacteristicsDescriptions value) {
        this.characteristics = value;
    }

    /**
     * Gets the value of the useStandardCommands property.
     * 
     */
    public boolean isUseStandardCommands() {
        return useStandardCommands;
    }

    /**
     * Sets the value of the useStandardCommands property.
     * 
     */
    public void setUseStandardCommands(boolean value) {
        this.useStandardCommands = value;
    }

    /**
     * Gets the value of the quickChoice property.
     * 
     */
    public boolean isQuickChoice() {
        return quickChoice;
    }

    /**
     * Sets the value of the quickChoice property.
     * 
     */
    public void setQuickChoice(boolean value) {
        this.quickChoice = value;
    }

    /**
     * Gets the value of the inputByString property.
     * 
     * @return
     *     possible object is
     *     {@link FieldList }
     *     
     */
    public FieldList getInputByString() {
        return inputByString;
    }

    /**
     * Sets the value of the inputByString property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldList }
     *     
     */
    public void setInputByString(FieldList value) {
        this.inputByString = value;
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
     * Gets the value of the searchStringModeOnInputByString property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringModeOnInputByString }
     *     
     */
    public SearchStringModeOnInputByString getSearchStringModeOnInputByString() {
        return searchStringModeOnInputByString;
    }

    /**
     * Sets the value of the searchStringModeOnInputByString property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringModeOnInputByString }
     *     
     */
    public void setSearchStringModeOnInputByString(SearchStringModeOnInputByString value) {
        this.searchStringModeOnInputByString = value;
    }

    /**
     * Gets the value of the choiceDataGetModeOnInputByString property.
     * 
     * @return
     *     possible object is
     *     {@link ChoiceDataGetModeOnInputByString }
     *     
     */
    public ChoiceDataGetModeOnInputByString getChoiceDataGetModeOnInputByString() {
        return choiceDataGetModeOnInputByString;
    }

    /**
     * Sets the value of the choiceDataGetModeOnInputByString property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChoiceDataGetModeOnInputByString }
     *     
     */
    public void setChoiceDataGetModeOnInputByString(ChoiceDataGetModeOnInputByString value) {
        this.choiceDataGetModeOnInputByString = value;
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
     * Gets the value of the defaultObjectForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultObjectForm() {
        return defaultObjectForm;
    }

    /**
     * Sets the value of the defaultObjectForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultObjectForm(String value) {
        this.defaultObjectForm = value;
    }

    /**
     * Gets the value of the defaultRecordForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultRecordForm() {
        return defaultRecordForm;
    }

    /**
     * Sets the value of the defaultRecordForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultRecordForm(String value) {
        this.defaultRecordForm = value;
    }

    /**
     * Gets the value of the defaultListForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultListForm() {
        return defaultListForm;
    }

    /**
     * Sets the value of the defaultListForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultListForm(String value) {
        this.defaultListForm = value;
    }

    /**
     * Gets the value of the defaultChoiceForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultChoiceForm() {
        return defaultChoiceForm;
    }

    /**
     * Sets the value of the defaultChoiceForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultChoiceForm(String value) {
        this.defaultChoiceForm = value;
    }

    /**
     * Gets the value of the objectPresentation property.
     * 
     * @return
     *     possible object is
     *     {@link LocalStringType }
     *     
     */
    public LocalStringType getObjectPresentation() {
        return objectPresentation;
    }

    /**
     * Sets the value of the objectPresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalStringType }
     *     
     */
    public void setObjectPresentation(LocalStringType value) {
        this.objectPresentation = value;
    }

    /**
     * Gets the value of the extendedObjectPresentation property.
     * 
     * @return
     *     possible object is
     *     {@link LocalStringType }
     *     
     */
    public LocalStringType getExtendedObjectPresentation() {
        return extendedObjectPresentation;
    }

    /**
     * Sets the value of the extendedObjectPresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalStringType }
     *     
     */
    public void setExtendedObjectPresentation(LocalStringType value) {
        this.extendedObjectPresentation = value;
    }

    /**
     * Gets the value of the recordPresentation property.
     * 
     * @return
     *     possible object is
     *     {@link LocalStringType }
     *     
     */
    public LocalStringType getRecordPresentation() {
        return recordPresentation;
    }

    /**
     * Sets the value of the recordPresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalStringType }
     *     
     */
    public void setRecordPresentation(LocalStringType value) {
        this.recordPresentation = value;
    }

    /**
     * Gets the value of the extendedRecordPresentation property.
     * 
     * @return
     *     possible object is
     *     {@link LocalStringType }
     *     
     */
    public LocalStringType getExtendedRecordPresentation() {
        return extendedRecordPresentation;
    }

    /**
     * Sets the value of the extendedRecordPresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalStringType }
     *     
     */
    public void setExtendedRecordPresentation(LocalStringType value) {
        this.extendedRecordPresentation = value;
    }

    /**
     * Gets the value of the listPresentation property.
     * 
     * @return
     *     possible object is
     *     {@link LocalStringType }
     *     
     */
    public LocalStringType getListPresentation() {
        return listPresentation;
    }

    /**
     * Sets the value of the listPresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalStringType }
     *     
     */
    public void setListPresentation(LocalStringType value) {
        this.listPresentation = value;
    }

    /**
     * Gets the value of the extendedListPresentation property.
     * 
     * @return
     *     possible object is
     *     {@link LocalStringType }
     *     
     */
    public LocalStringType getExtendedListPresentation() {
        return extendedListPresentation;
    }

    /**
     * Sets the value of the extendedListPresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalStringType }
     *     
     */
    public void setExtendedListPresentation(LocalStringType value) {
        this.extendedListPresentation = value;
    }

    /**
     * Gets the value of the explanation property.
     * 
     * @return
     *     possible object is
     *     {@link LocalStringType }
     *     
     */
    public LocalStringType getExplanation() {
        return explanation;
    }

    /**
     * Sets the value of the explanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalStringType }
     *     
     */
    public void setExplanation(LocalStringType value) {
        this.explanation = value;
    }

    /**
     * Gets the value of the objectModule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectModule() {
        return objectModule;
    }

    /**
     * Sets the value of the objectModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectModule(String value) {
        this.objectModule = value;
    }

    /**
     * Gets the value of the recordSetModule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordSetModule() {
        return recordSetModule;
    }

    /**
     * Sets the value of the recordSetModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordSetModule(String value) {
        this.recordSetModule = value;
    }

    /**
     * Gets the value of the managerModule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerModule() {
        return managerModule;
    }

    /**
     * Sets the value of the managerModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerModule(String value) {
        this.managerModule = value;
    }

    /**
     * Gets the value of the includeHelpInContents property.
     * 
     */
    public boolean isIncludeHelpInContents() {
        return includeHelpInContents;
    }

    /**
     * Sets the value of the includeHelpInContents property.
     * 
     */
    public void setIncludeHelpInContents(boolean value) {
        this.includeHelpInContents = value;
    }

    /**
     * Gets the value of the help property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelp() {
        return help;
    }

    /**
     * Sets the value of the help property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelp(String value) {
        this.help = value;
    }

    /**
     * Gets the value of the readOnly property.
     * 
     */
    public boolean isReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     */
    public void setReadOnly(boolean value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the transactionsIsolationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionsIsolationLevel }
     *     
     */
    public TransactionsIsolationLevel getTransactionsIsolationLevel() {
        return transactionsIsolationLevel;
    }

    /**
     * Sets the value of the transactionsIsolationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionsIsolationLevel }
     *     
     */
    public void setTransactionsIsolationLevel(TransactionsIsolationLevel value) {
        this.transactionsIsolationLevel = value;
    }

    /**
     * Gets the value of the dataVersionField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataVersionField() {
        return dataVersionField;
    }

    /**
     * Sets the value of the dataVersionField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataVersionField(String value) {
        this.dataVersionField = value;
    }

    /**
     * Gets the value of the editType property.
     * 
     * @return
     *     possible object is
     *     {@link EditType }
     *     
     */
    public EditType getEditType() {
        return editType;
    }

    /**
     * Sets the value of the editType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditType }
     *     
     */
    public void setEditType(EditType value) {
        this.editType = value;
    }

    /**
     * Gets the value of the basedOn property.
     * 
     * @return
     *     possible object is
     *     {@link MDListType }
     *     
     */
    public MDListType getBasedOn() {
        return basedOn;
    }

    /**
     * Sets the value of the basedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDListType }
     *     
     */
    public void setBasedOn(MDListType value) {
        this.basedOn = value;
    }

    /**
     * Gets the value of the dataLockFields property.
     * 
     * @return
     *     possible object is
     *     {@link FieldList }
     *     
     */
    public FieldList getDataLockFields() {
        return dataLockFields;
    }

    /**
     * Sets the value of the dataLockFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldList }
     *     
     */
    public void setDataLockFields(FieldList value) {
        this.dataLockFields = value;
    }

    /**
     * Gets the value of the dataLockControlMode property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultDataLockControlMode }
     *     
     */
    public DefaultDataLockControlMode getDataLockControlMode() {
        return dataLockControlMode;
    }

    /**
     * Sets the value of the dataLockControlMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultDataLockControlMode }
     *     
     */
    public void setDataLockControlMode(DefaultDataLockControlMode value) {
        this.dataLockControlMode = value;
    }

}
