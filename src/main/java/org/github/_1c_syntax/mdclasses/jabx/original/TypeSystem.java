//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package org.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for TypeSystem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TypeSystem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="enums" type="{http://v8.1c.ru/8.2/managed-application/core}EnumTypeSet" minOccurs="0"/&gt;
 *         &lt;element name="refs" type="{http://v8.1c.ru/8.2/managed-application/core}RefTypeSet" minOccurs="0"/&gt;
 *         &lt;element name="regs" type="{http://v8.1c.ru/8.2/managed-application/core}RegKeyTypeSet" minOccurs="0"/&gt;
 *         &lt;element name="infoRegs" type="{http://v8.1c.ru/8.2/managed-application/core}InfoRegKeyTypeSet" minOccurs="0"/&gt;
 *         &lt;element name="typeSet" type="{http://v8.1c.ru/8.2/managed-application/core}TypeSet" minOccurs="0"/&gt;
 *         &lt;element name="extRef" type="{http://v8.1c.ru/8.2/managed-application/core}ExtRefTypeSet" minOccurs="0"/&gt;
 *         &lt;element name="extKey" type="{http://v8.1c.ru/8.2/managed-application/core}ExtKeyTypeSet" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="namespace" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeSystem", namespace = "http://v8.1c.ru/8.2/managed-application/core", propOrder = {
    "enums",
    "refs",
    "regs",
    "infoRegs",
    "typeSet",
    "extRef",
    "extKey"
})
public class TypeSystem {

    protected EnumTypeSet enums;
    protected RefTypeSet refs;
    protected RegKeyTypeSet regs;
    protected InfoRegKeyTypeSet infoRegs;
    protected TypeSet typeSet;
    protected ExtRefTypeSet extRef;
    protected ExtKeyTypeSet extKey;
    @XmlAttribute(name = "namespace")
    @XmlSchemaType(name = "anyURI")
    protected String namespace;

    /**
     * Gets the value of the enums property.
     * 
     * @return
     *     possible object is
     *     {@link EnumTypeSet }
     *     
     */
    public EnumTypeSet getEnums() {
        return enums;
    }

    /**
     * Sets the value of the enums property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumTypeSet }
     *     
     */
    public void setEnums(EnumTypeSet value) {
        this.enums = value;
    }

    /**
     * Gets the value of the refs property.
     * 
     * @return
     *     possible object is
     *     {@link RefTypeSet }
     *     
     */
    public RefTypeSet getRefs() {
        return refs;
    }

    /**
     * Sets the value of the refs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefTypeSet }
     *     
     */
    public void setRefs(RefTypeSet value) {
        this.refs = value;
    }

    /**
     * Gets the value of the regs property.
     * 
     * @return
     *     possible object is
     *     {@link RegKeyTypeSet }
     *     
     */
    public RegKeyTypeSet getRegs() {
        return regs;
    }

    /**
     * Sets the value of the regs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegKeyTypeSet }
     *     
     */
    public void setRegs(RegKeyTypeSet value) {
        this.regs = value;
    }

    /**
     * Gets the value of the infoRegs property.
     * 
     * @return
     *     possible object is
     *     {@link InfoRegKeyTypeSet }
     *     
     */
    public InfoRegKeyTypeSet getInfoRegs() {
        return infoRegs;
    }

    /**
     * Sets the value of the infoRegs property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoRegKeyTypeSet }
     *     
     */
    public void setInfoRegs(InfoRegKeyTypeSet value) {
        this.infoRegs = value;
    }

    /**
     * Gets the value of the typeSet property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSet }
     *     
     */
    public TypeSet getTypeSet() {
        return typeSet;
    }

    /**
     * Sets the value of the typeSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSet }
     *     
     */
    public void setTypeSet(TypeSet value) {
        this.typeSet = value;
    }

    /**
     * Gets the value of the extRef property.
     * 
     * @return
     *     possible object is
     *     {@link ExtRefTypeSet }
     *     
     */
    public ExtRefTypeSet getExtRef() {
        return extRef;
    }

    /**
     * Sets the value of the extRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtRefTypeSet }
     *     
     */
    public void setExtRef(ExtRefTypeSet value) {
        this.extRef = value;
    }

    /**
     * Gets the value of the extKey property.
     * 
     * @return
     *     possible object is
     *     {@link ExtKeyTypeSet }
     *     
     */
    public ExtKeyTypeSet getExtKey() {
        return extKey;
    }

    /**
     * Sets the value of the extKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtKeyTypeSet }
     *     
     */
    public void setExtKey(ExtKeyTypeSet value) {
        this.extKey = value;
    }

    /**
     * Gets the value of the namespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * Sets the value of the namespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespace(String value) {
        this.namespace = value;
    }

}
