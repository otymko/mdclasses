//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package org.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for FormProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormProperties"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Synonym" type="{http://v8.1c.ru/8.1/data/core}LocalStringType" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ObjectBelonging" type="{http://v8.1c.ru/8.3/xcf/enums}ObjectBelonging" minOccurs="0"/&gt;
 *         &lt;element name="Form" type="{http://v8.1c.ru/8.3/xcf/readable}ExternalProperty" minOccurs="0"/&gt;
 *         &lt;element name="FormType" type="{http://v8.1c.ru/8.3/xcf/enums}FormType" minOccurs="0"/&gt;
 *         &lt;element name="IncludeHelpInContents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Help" type="{http://v8.1c.ru/8.3/xcf/readable}ExternalProperty" minOccurs="0"/&gt;
 *         &lt;element name="UsePurposes" type="{http://v8.1c.ru/8.1/data/core}FixedArray" minOccurs="0"/&gt;
 *         &lt;element name="ExtendedPresentation" type="{http://v8.1c.ru/8.1/data/core}LocalStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormProperties", propOrder = {
    "name",
    "synonym",
    "comment",
    "objectBelonging",
    "form",
    "formType",
    "includeHelpInContents",
    "help",
    "usePurposes",
    "extendedPresentation"
})
public class FormProperties {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Synonym")
    protected LocalStringType synonym;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "ObjectBelonging")
    @XmlSchemaType(name = "string")
    protected ObjectBelonging objectBelonging;
    @XmlElement(name = "Form")
    protected String form;
    @XmlElement(name = "FormType")
    @XmlSchemaType(name = "string")
    protected FormType formType;
    @XmlElement(name = "IncludeHelpInContents")
    protected Boolean includeHelpInContents;
    @XmlElement(name = "Help")
    protected String help;
    @XmlElement(name = "UsePurposes")
    protected FixedArray usePurposes;
    @XmlElement(name = "ExtendedPresentation")
    protected LocalStringType extendedPresentation;

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
     * Gets the value of the form property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForm() {
        return form;
    }

    /**
     * Sets the value of the form property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForm(String value) {
        this.form = value;
    }

    /**
     * Gets the value of the formType property.
     * 
     * @return
     *     possible object is
     *     {@link FormType }
     *     
     */
    public FormType getFormType() {
        return formType;
    }

    /**
     * Sets the value of the formType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormType }
     *     
     */
    public void setFormType(FormType value) {
        this.formType = value;
    }

    /**
     * Gets the value of the includeHelpInContents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeHelpInContents() {
        return includeHelpInContents;
    }

    /**
     * Sets the value of the includeHelpInContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeHelpInContents(Boolean value) {
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
     * Gets the value of the usePurposes property.
     * 
     * @return
     *     possible object is
     *     {@link FixedArray }
     *     
     */
    public FixedArray getUsePurposes() {
        return usePurposes;
    }

    /**
     * Sets the value of the usePurposes property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixedArray }
     *     
     */
    public void setUsePurposes(FixedArray value) {
        this.usePurposes = value;
    }

    /**
     * Gets the value of the extendedPresentation property.
     * 
     * @return
     *     possible object is
     *     {@link LocalStringType }
     *     
     */
    public LocalStringType getExtendedPresentation() {
        return extendedPresentation;
    }

    /**
     * Sets the value of the extendedPresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalStringType }
     *     
     */
    public void setExtendedPresentation(LocalStringType value) {
        this.extendedPresentation = value;
    }

}
