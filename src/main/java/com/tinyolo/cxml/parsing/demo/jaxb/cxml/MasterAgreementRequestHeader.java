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
    "maxAmount",
    "minAmount",
    "maxReleaseAmount",
    "minReleaseAmount",
    "contact",
    "comments",
    "documentReference",
    "extrinsic"
})
@XmlRootElement(name = "MasterAgreementRequestHeader")
public class MasterAgreementRequestHeader {

    @XmlAttribute(name = "agreementID", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String agreementID;
    @XmlAttribute(name = "agreementDate", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String agreementDate;
    @XmlAttribute(name = "type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "effectiveDate", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String effectiveDate;
    @XmlAttribute(name = "expirationDate", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String expirationDate;
    @XmlAttribute(name = "parentAgreementPayloadID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String parentAgreementPayloadID;
    @XmlAttribute(name = "operation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String operation;
    @XmlElement(name = "MaxAmount")
    protected MaxAmount maxAmount;
    @XmlElement(name = "MinAmount")
    protected MinAmount minAmount;
    @XmlElement(name = "MaxReleaseAmount")
    protected MaxReleaseAmount maxReleaseAmount;
    @XmlElement(name = "MinReleaseAmount")
    protected MinReleaseAmount minReleaseAmount;
    @XmlElement(name = "Contact")
    protected List<Contact> contact;
    @XmlElement(name = "Comments")
    protected Comments comments;
    @XmlElement(name = "DocumentReference")
    protected DocumentReference documentReference;
    @XmlElement(name = "Extrinsic")
    protected List<Extrinsic> extrinsic;

    /**
     * Gets the value of the agreementID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementID() {
        return agreementID;
    }

    /**
     * Sets the value of the agreementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementID(String value) {
        this.agreementID = value;
    }

    /**
     * Gets the value of the agreementDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementDate() {
        return agreementDate;
    }

    /**
     * Sets the value of the agreementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementDate(String value) {
        this.agreementDate = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        if (type == null) {
            return "value";
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveDate(String value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the parentAgreementPayloadID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentAgreementPayloadID() {
        return parentAgreementPayloadID;
    }

    /**
     * Sets the value of the parentAgreementPayloadID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentAgreementPayloadID(String value) {
        this.parentAgreementPayloadID = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        if (operation == null) {
            return "new";
        } else {
            return operation;
        }
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

    /**
     * Gets the value of the maxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MaxAmount }
     *     
     */
    public MaxAmount getMaxAmount() {
        return maxAmount;
    }

    /**
     * Sets the value of the maxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxAmount }
     *     
     */
    public void setMaxAmount(MaxAmount value) {
        this.maxAmount = value;
    }

    /**
     * Gets the value of the minAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MinAmount }
     *     
     */
    public MinAmount getMinAmount() {
        return minAmount;
    }

    /**
     * Sets the value of the minAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinAmount }
     *     
     */
    public void setMinAmount(MinAmount value) {
        this.minAmount = value;
    }

    /**
     * Gets the value of the maxReleaseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MaxReleaseAmount }
     *     
     */
    public MaxReleaseAmount getMaxReleaseAmount() {
        return maxReleaseAmount;
    }

    /**
     * Sets the value of the maxReleaseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxReleaseAmount }
     *     
     */
    public void setMaxReleaseAmount(MaxReleaseAmount value) {
        this.maxReleaseAmount = value;
    }

    /**
     * Gets the value of the minReleaseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MinReleaseAmount }
     *     
     */
    public MinReleaseAmount getMinReleaseAmount() {
        return minReleaseAmount;
    }

    /**
     * Sets the value of the minReleaseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinReleaseAmount }
     *     
     */
    public void setMinReleaseAmount(MinReleaseAmount value) {
        this.minReleaseAmount = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    public List<Contact> getContact() {
        if (contact == null) {
            contact = new ArrayList<Contact>();
        }
        return this.contact;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link Comments }
     *     
     */
    public Comments getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Comments }
     *     
     */
    public void setComments(Comments value) {
        this.comments = value;
    }

    /**
     * Gets the value of the documentReference property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReference }
     *     
     */
    public DocumentReference getDocumentReference() {
        return documentReference;
    }

    /**
     * Sets the value of the documentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReference }
     *     
     */
    public void setDocumentReference(DocumentReference value) {
        this.documentReference = value;
    }

    /**
     * Gets the value of the extrinsic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extrinsic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtrinsic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extrinsic }
     * 
     * 
     */
    public List<Extrinsic> getExtrinsic() {
        if (extrinsic == null) {
            extrinsic = new ArrayList<Extrinsic>();
        }
        return this.extrinsic;
    }

}