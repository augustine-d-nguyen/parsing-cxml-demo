//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.20 at 08:08:13 PM ICT 
//


package com.tinyolo.cxml.parsing.demo.jaxb.fulfill;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "xadesInclude",
    "dsCanonicalizationMethod",
    "xadesEncapsulatedTimeStampOrXadesXMLTimeStamp"
})
@XmlRootElement(name = "xades:SigAndRefsTimeStamp")
public class XadesSigAndRefsTimeStamp {

    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlElement(name = "xades:Include")
    protected List<XadesInclude> xadesInclude;
    @XmlElement(name = "ds:CanonicalizationMethod")
    protected DsCanonicalizationMethod dsCanonicalizationMethod;
    @XmlElements({
        @XmlElement(name = "xades:EncapsulatedTimeStamp", required = true, type = XadesEncapsulatedTimeStamp.class),
        @XmlElement(name = "xades:XMLTimeStamp", required = true, type = XadesXMLTimeStamp.class)
    })
    protected List<Object> xadesEncapsulatedTimeStampOrXadesXMLTimeStamp;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the xadesInclude property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xadesInclude property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXadesInclude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XadesInclude }
     * 
     * 
     */
    public List<XadesInclude> getXadesInclude() {
        if (xadesInclude == null) {
            xadesInclude = new ArrayList<XadesInclude>();
        }
        return this.xadesInclude;
    }

    /**
     * Gets the value of the dsCanonicalizationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link DsCanonicalizationMethod }
     *     
     */
    public DsCanonicalizationMethod getDsCanonicalizationMethod() {
        return dsCanonicalizationMethod;
    }

    /**
     * Sets the value of the dsCanonicalizationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DsCanonicalizationMethod }
     *     
     */
    public void setDsCanonicalizationMethod(DsCanonicalizationMethod value) {
        this.dsCanonicalizationMethod = value;
    }

    /**
     * Gets the value of the xadesEncapsulatedTimeStampOrXadesXMLTimeStamp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xadesEncapsulatedTimeStampOrXadesXMLTimeStamp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXadesEncapsulatedTimeStampOrXadesXMLTimeStamp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XadesEncapsulatedTimeStamp }
     * {@link XadesXMLTimeStamp }
     * 
     * 
     */
    public List<Object> getXadesEncapsulatedTimeStampOrXadesXMLTimeStamp() {
        if (xadesEncapsulatedTimeStampOrXadesXMLTimeStamp == null) {
            xadesEncapsulatedTimeStampOrXadesXMLTimeStamp = new ArrayList<Object>();
        }
        return this.xadesEncapsulatedTimeStampOrXadesXMLTimeStamp;
    }

}
