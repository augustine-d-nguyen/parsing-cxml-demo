//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.20 at 08:07:34 PM ICT 
//


package com.tinyolo.cxml.parsing.demo.jaxb.cxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "xadesOrganization",
    "xadesNoticeNumbers"
})
@XmlRootElement(name = "xades:NoticeRef")
public class XadesNoticeRef {

    @XmlElement(name = "xades:Organization", required = true)
    protected String xadesOrganization;
    @XmlElement(name = "xades:NoticeNumbers", required = true)
    protected XadesNoticeNumbers xadesNoticeNumbers;

    /**
     * Gets the value of the xadesOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXadesOrganization() {
        return xadesOrganization;
    }

    /**
     * Sets the value of the xadesOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXadesOrganization(String value) {
        this.xadesOrganization = value;
    }

    /**
     * Gets the value of the xadesNoticeNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link XadesNoticeNumbers }
     *     
     */
    public XadesNoticeNumbers getXadesNoticeNumbers() {
        return xadesNoticeNumbers;
    }

    /**
     * Sets the value of the xadesNoticeNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link XadesNoticeNumbers }
     *     
     */
    public void setXadesNoticeNumbers(XadesNoticeNumbers value) {
        this.xadesNoticeNumbers = value;
    }

}
