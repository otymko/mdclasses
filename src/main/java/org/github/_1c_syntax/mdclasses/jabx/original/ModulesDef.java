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
 * <p>Java class for ModulesDef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModulesDef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="main" type="{http://v8.1c.ru/8.2/managed-application/modules}ModuleDef"/&gt;
 *         &lt;element name="global" type="{http://v8.1c.ru/8.2/managed-application/modules}ModuleDef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="client" type="{http://v8.1c.ru/8.2/managed-application/modules}ModuleDef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="server" type="{http://v8.1c.ru/8.2/managed-application/modules}ModuleDef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="alias" type="{http://v8.1c.ru/8.2/managed-application/core}Alias" default="en" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModulesDef", namespace = "http://v8.1c.ru/8.2/managed-application/modules", propOrder = {
    "main",
    "global",
    "client",
    "server"
})
public class ModulesDef {

    @XmlElement(required = true)
    protected ModuleDef main;
    protected List<ModuleDef> global;
    protected List<ModuleDef> client;
    protected List<ModuleDef> server;
    @XmlAttribute(name = "alias")
    protected Alias alias;

    /**
     * Gets the value of the main property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleDef }
     *     
     */
    public ModuleDef getMain() {
        return main;
    }

    /**
     * Sets the value of the main property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleDef }
     *     
     */
    public void setMain(ModuleDef value) {
        this.main = value;
    }

    /**
     * Gets the value of the global property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the global property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModuleDef }
     * 
     * 
     */
    public List<ModuleDef> getGlobal() {
        if (global == null) {
            global = new ArrayList<ModuleDef>();
        }
        return this.global;
    }

    /**
     * Gets the value of the client property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the client property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModuleDef }
     * 
     * 
     */
    public List<ModuleDef> getClient() {
        if (client == null) {
            client = new ArrayList<ModuleDef>();
        }
        return this.client;
    }

    /**
     * Gets the value of the server property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the server property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModuleDef }
     * 
     * 
     */
    public List<ModuleDef> getServer() {
        if (server == null) {
            server = new ArrayList<ModuleDef>();
        }
        return this.server;
    }

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link Alias }
     *     
     */
    public Alias getAlias() {
        if (alias == null) {
            return Alias.EN;
        } else {
            return alias;
        }
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link Alias }
     *     
     */
    public void setAlias(Alias value) {
        this.alias = value;
    }

}
