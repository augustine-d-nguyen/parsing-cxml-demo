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
    "bookingClassCode",
    "description"
})
@XmlRootElement(name = "Meal")
public class Meal {

    @XmlElement(name = "BookingClassCode")
    protected BookingClassCode bookingClassCode;
    @XmlElement(name = "Description")
    protected Description description;

    /**
     * Gets the value of the bookingClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link BookingClassCode }
     *     
     */
    public BookingClassCode getBookingClassCode() {
        return bookingClassCode;
    }

    /**
     * Sets the value of the bookingClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingClassCode }
     *     
     */
    public void setBookingClassCode(BookingClassCode value) {
        this.bookingClassCode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Description }
     *     
     */
    public Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description }
     *     
     */
    public void setDescription(Description value) {
        this.description = value;
    }

}
