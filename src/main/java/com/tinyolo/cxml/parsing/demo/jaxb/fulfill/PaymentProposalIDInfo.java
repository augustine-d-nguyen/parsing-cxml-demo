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
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "PaymentProposalIDInfo")
public class PaymentProposalIDInfo {

    @XmlAttribute(name = "paymentProposalID", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String paymentProposalID;

    /**
     * Gets the value of the paymentProposalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentProposalID() {
        return paymentProposalID;
    }

    /**
     * Sets the value of the paymentProposalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentProposalID(String value) {
        this.paymentProposalID = value;
    }

}
