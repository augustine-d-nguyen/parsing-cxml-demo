//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.20 at 08:07:34 PM ICT 
//


package com.tinyolo.cxml.parsing.demo.jaxb.cxml;

import java.util.ArrayList;
import java.util.List;
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
    "termsOfDeliveryCode",
    "shippingPaymentMethod",
    "transportTerms",
    "address",
    "comments"
})
@XmlRootElement(name = "TermsOfDelivery")
public class TermsOfDelivery {

    @XmlElement(name = "TermsOfDeliveryCode", required = true)
    protected TermsOfDeliveryCode termsOfDeliveryCode;
    @XmlElement(name = "ShippingPaymentMethod", required = true)
    protected ShippingPaymentMethod shippingPaymentMethod;
    @XmlElement(name = "TransportTerms")
    protected TransportTerms transportTerms;
    @XmlElement(name = "Address")
    protected Address address;
    @XmlElement(name = "Comments")
    protected List<Comments> comments;

    /**
     * Gets the value of the termsOfDeliveryCode property.
     * 
     * @return
     *     possible object is
     *     {@link TermsOfDeliveryCode }
     *     
     */
    public TermsOfDeliveryCode getTermsOfDeliveryCode() {
        return termsOfDeliveryCode;
    }

    /**
     * Sets the value of the termsOfDeliveryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermsOfDeliveryCode }
     *     
     */
    public void setTermsOfDeliveryCode(TermsOfDeliveryCode value) {
        this.termsOfDeliveryCode = value;
    }

    /**
     * Gets the value of the shippingPaymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingPaymentMethod }
     *     
     */
    public ShippingPaymentMethod getShippingPaymentMethod() {
        return shippingPaymentMethod;
    }

    /**
     * Sets the value of the shippingPaymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingPaymentMethod }
     *     
     */
    public void setShippingPaymentMethod(ShippingPaymentMethod value) {
        this.shippingPaymentMethod = value;
    }

    /**
     * Gets the value of the transportTerms property.
     * 
     * @return
     *     possible object is
     *     {@link TransportTerms }
     *     
     */
    public TransportTerms getTransportTerms() {
        return transportTerms;
    }

    /**
     * Sets the value of the transportTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportTerms }
     *     
     */
    public void setTransportTerms(TransportTerms value) {
        this.transportTerms = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Comments }
     * 
     * 
     */
    public List<Comments> getComments() {
        if (comments == null) {
            comments = new ArrayList<Comments>();
        }
        return this.comments;
    }

}
