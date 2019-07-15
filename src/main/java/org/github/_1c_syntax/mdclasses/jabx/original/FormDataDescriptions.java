//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package org.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for FormDataDescriptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormDataDescriptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="structure" type="{http://v8.1c.ru/8.2/uobjects}FormDataStructureDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="collection" type="{http://v8.1c.ru/8.2/uobjects}FormDataCollectionDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="structureAndCollection" type="{http://v8.1c.ru/8.2/uobjects}FormDataStructureAndCollectionDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tree" type="{http://v8.1c.ru/8.2/uobjects}FormDataTreeDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="remoteKey" use="required" type="{http://v8.1c.ru/8.2/uobjects}RemoteKey" /&gt;
 *       &lt;attribute name="trackChanges" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="sinDe" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&gt;
 *       &lt;attribute name="seqDe" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&gt;
 *       &lt;attribute name="sinUo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&gt;
 *       &lt;attribute name="seqUo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormDataDescriptions", namespace = "http://v8.1c.ru/8.2/uobjects", propOrder = {
    "structure",
    "collection",
    "structureAndCollection",
    "tree"
})
public class FormDataDescriptions {

    protected List<FormDataStructureDescription> structure;
    protected List<FormDataCollectionDescription> collection;
    protected List<FormDataStructureAndCollectionDescription> structureAndCollection;
    protected List<FormDataTreeDescription> tree;
    @XmlAttribute(name = "remoteKey", required = true)
    protected String remoteKey;
    @XmlAttribute(name = "trackChanges", required = true)
    protected boolean trackChanges;
    @XmlAttribute(name = "sinDe", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long sinDe;
    @XmlAttribute(name = "seqDe", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long seqDe;
    @XmlAttribute(name = "sinUo", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long sinUo;
    @XmlAttribute(name = "seqUo", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long seqUo;

    /**
     * Gets the value of the structure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormDataStructureDescription }
     * 
     * 
     */
    public List<FormDataStructureDescription> getStructure() {
        if (structure == null) {
            structure = new ArrayList<FormDataStructureDescription>();
        }
        return this.structure;
    }

    /**
     * Gets the value of the collection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormDataCollectionDescription }
     * 
     * 
     */
    public List<FormDataCollectionDescription> getCollection() {
        if (collection == null) {
            collection = new ArrayList<FormDataCollectionDescription>();
        }
        return this.collection;
    }

    /**
     * Gets the value of the structureAndCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structureAndCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructureAndCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormDataStructureAndCollectionDescription }
     * 
     * 
     */
    public List<FormDataStructureAndCollectionDescription> getStructureAndCollection() {
        if (structureAndCollection == null) {
            structureAndCollection = new ArrayList<FormDataStructureAndCollectionDescription>();
        }
        return this.structureAndCollection;
    }

    /**
     * Gets the value of the tree property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tree property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTree().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormDataTreeDescription }
     * 
     * 
     */
    public List<FormDataTreeDescription> getTree() {
        if (tree == null) {
            tree = new ArrayList<FormDataTreeDescription>();
        }
        return this.tree;
    }

    /**
     * Gets the value of the remoteKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteKey() {
        return remoteKey;
    }

    /**
     * Sets the value of the remoteKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteKey(String value) {
        this.remoteKey = value;
    }

    /**
     * Gets the value of the trackChanges property.
     * 
     */
    public boolean isTrackChanges() {
        return trackChanges;
    }

    /**
     * Sets the value of the trackChanges property.
     * 
     */
    public void setTrackChanges(boolean value) {
        this.trackChanges = value;
    }

    /**
     * Gets the value of the sinDe property.
     * 
     */
    public long getSinDe() {
        return sinDe;
    }

    /**
     * Sets the value of the sinDe property.
     * 
     */
    public void setSinDe(long value) {
        this.sinDe = value;
    }

    /**
     * Gets the value of the seqDe property.
     * 
     */
    public long getSeqDe() {
        return seqDe;
    }

    /**
     * Sets the value of the seqDe property.
     * 
     */
    public void setSeqDe(long value) {
        this.seqDe = value;
    }

    /**
     * Gets the value of the sinUo property.
     * 
     */
    public long getSinUo() {
        return sinUo;
    }

    /**
     * Sets the value of the sinUo property.
     * 
     */
    public void setSinUo(long value) {
        this.sinUo = value;
    }

    /**
     * Gets the value of the seqUo property.
     * 
     */
    public long getSeqUo() {
        return seqUo;
    }

    /**
     * Sets the value of the seqUo property.
     * 
     */
    public void setSeqUo(long value) {
        this.seqUo = value;
    }

}