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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "headerOrMessageOrRequestOrResponse",
    "dsSignature"
})
@XmlRootElement(name = "cXML")
public class CXML {

    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String version;
    @XmlAttribute(name = "payloadID", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String payloadID;
    @XmlAttribute(name = "timestamp", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String timestamp;
    @XmlAttribute(name = "signatureVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String signatureVersion;
    @XmlAttribute(name = "xml:lang")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String xmlLang;
    @XmlElements({
        @XmlElement(name = "Header", required = true, type = Header.class),
        @XmlElement(name = "Message", required = true, type = Message.class),
        @XmlElement(name = "Request", required = true, type = Request.class),
        @XmlElement(name = "Response", required = true, type = Response.class)
    })
    protected List<Object> headerOrMessageOrRequestOrResponse;
    @XmlElement(name = "ds:Signature")
    protected List<DsSignature> dsSignature;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1.2.048";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the payloadID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayloadID() {
        return payloadID;
    }

    /**
     * Sets the value of the payloadID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayloadID(String value) {
        this.payloadID = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestamp(String value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the signatureVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureVersion() {
        return signatureVersion;
    }

    /**
     * Sets the value of the signatureVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureVersion(String value) {
        this.signatureVersion = value;
    }

    /**
     * Gets the value of the xmlLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlLang() {
        return xmlLang;
    }

    /**
     * Sets the value of the xmlLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlLang(String value) {
        this.xmlLang = value;
    }

    /**
     * Gets the value of the headerOrMessageOrRequestOrResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the headerOrMessageOrRequestOrResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeaderOrMessageOrRequestOrResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Header }
     * {@link Message }
     * {@link Request }
     * {@link Response }
     * 
     * 
     */
    public List<Object> getHeaderOrMessageOrRequestOrResponse() {
        if (headerOrMessageOrRequestOrResponse == null) {
            headerOrMessageOrRequestOrResponse = new ArrayList<Object>();
        }
        return this.headerOrMessageOrRequestOrResponse;
    }

    /**
     * Gets the value of the dsSignature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dsSignature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDsSignature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DsSignature }
     * 
     * 
     */
    public List<DsSignature> getDsSignature() {
        if (dsSignature == null) {
            dsSignature = new ArrayList<DsSignature>();
        }
        return this.dsSignature;
    }

}
