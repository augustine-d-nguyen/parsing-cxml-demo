//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.20 at 08:08:13 PM ICT 
//


package com.tinyolo.cxml.parsing.demo.jaxb.fulfill;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lower",
    "upper"
})
@XmlRootElement(name = "ASNInstruction")
public class ASNInstruction {

    @XmlAttribute(name = "value", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String value;
    @XmlElement(name = "Lower")
    protected Lower lower;
    @XmlElement(name = "Upper")
    protected Upper upper;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the lower property.
     * 
     * @return
     *     possible object is
     *     {@link Lower }
     *     
     */
    public Lower getLower() {
        return lower;
    }

    /**
     * Sets the value of the lower property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lower }
     *     
     */
    public void setLower(Lower value) {
        this.lower = value;
    }

    /**
     * Gets the value of the upper property.
     * 
     * @return
     *     possible object is
     *     {@link Upper }
     *     
     */
    public Upper getUpper() {
        return upper;
    }

    /**
     * Sets the value of the upper property.
     * 
     * @param value
     *     allowed object is
     *     {@link Upper }
     *     
     */
    public void setUpper(Upper value) {
        this.upper = value;
    }

}
