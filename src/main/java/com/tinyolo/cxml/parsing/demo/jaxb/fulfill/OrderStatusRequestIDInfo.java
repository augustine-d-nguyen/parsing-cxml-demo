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
@XmlRootElement(name = "OrderStatusRequestIDInfo")
public class OrderStatusRequestIDInfo {

    @XmlAttribute(name = "orderStatusRequestID", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String orderStatusRequestID;
    @XmlAttribute(name = "orderStatusRequestDate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String orderStatusRequestDate;

    /**
     * Gets the value of the orderStatusRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStatusRequestID() {
        return orderStatusRequestID;
    }

    /**
     * Sets the value of the orderStatusRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStatusRequestID(String value) {
        this.orderStatusRequestID = value;
    }

    /**
     * Gets the value of the orderStatusRequestDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStatusRequestDate() {
        return orderStatusRequestDate;
    }

    /**
     * Sets the value of the orderStatusRequestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStatusRequestDate(String value) {
        this.orderStatusRequestDate = value;
    }

}
