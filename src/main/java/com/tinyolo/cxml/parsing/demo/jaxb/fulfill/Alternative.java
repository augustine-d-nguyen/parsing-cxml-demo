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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Alternative")
public class Alternative {

    @XmlAttribute(name = "alternativeType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String alternativeType;
    @XmlAttribute(name = "basicLineNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String basicLineNumber;

    /**
     * Gets the value of the alternativeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternativeType() {
        return alternativeType;
    }

    /**
     * Sets the value of the alternativeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternativeType(String value) {
        this.alternativeType = value;
    }

    /**
     * Gets the value of the basicLineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasicLineNumber() {
        return basicLineNumber;
    }

    /**
     * Sets the value of the basicLineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasicLineNumber(String value) {
        this.basicLineNumber = value;
    }

}
