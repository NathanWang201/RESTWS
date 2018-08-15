//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.15 at 06:04:30 PM ACST 
//


package domain.japan;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TitleInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="InitialCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TitleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MakerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MakerKana" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SalesDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SoftType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PlatformID" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="DlIconFlg" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="LinkURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ScreenshotImgFlg" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="ScreenshotImgURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "titleInfo"
})
@XmlRootElement(name = "TitleInfoList")
public class TitleInfoList {

    @XmlElement(name = "TitleInfo")
    protected List<TitleInfoList.TitleInfo> titleInfo;

    /**
     * Gets the value of the titleInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titleInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitleInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TitleInfoList.TitleInfo }
     * 
     * 
     */
    public List<TitleInfoList.TitleInfo> getTitleInfo() {
        if (titleInfo == null) {
            titleInfo = new ArrayList<TitleInfoList.TitleInfo>();
        }
        return this.titleInfo;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="InitialCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TitleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MakerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MakerKana" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SalesDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SoftType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PlatformID" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="DlIconFlg" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="LinkURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ScreenshotImgFlg" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="ScreenshotImgURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "initialCode",
        "titleName",
        "makerName",
        "makerKana",
        "price",
        "salesDate",
        "softType",
        "platformID",
        "dlIconFlg",
        "linkURL",
        "screenshotImgFlg",
        "screenshotImgURL"
    })
    public static class TitleInfo {

        @XmlElement(name = "InitialCode", required = true)
        protected String initialCode;
        @XmlElement(name = "TitleName", required = true)
        protected String titleName;
        @XmlElement(name = "MakerName", required = true)
        protected String makerName;
        @XmlElement(name = "MakerKana", required = true)
        protected String makerKana;
        @XmlElement(name = "Price", required = true)
        protected String price;
        @XmlElement(name = "SalesDate", required = true)
        protected String salesDate;
        @XmlElement(name = "SoftType", required = true)
        protected String softType;
        @XmlElement(name = "PlatformID")
        protected short platformID;
        @XmlElement(name = "DlIconFlg")
        protected byte dlIconFlg;
        @XmlElement(name = "LinkURL", required = true)
        protected String linkURL;
        @XmlElement(name = "ScreenshotImgFlg")
        protected byte screenshotImgFlg;
        @XmlElement(name = "ScreenshotImgURL", required = true)
        protected String screenshotImgURL;

        /**
         * Gets the value of the initialCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInitialCode() {
            return initialCode;
        }

        /**
         * Sets the value of the initialCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInitialCode(String value) {
            this.initialCode = value;
        }

        /**
         * Gets the value of the titleName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitleName() {
            return titleName;
        }

        /**
         * Sets the value of the titleName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitleName(String value) {
            this.titleName = value;
        }

        /**
         * Gets the value of the makerName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMakerName() {
            return makerName;
        }

        /**
         * Sets the value of the makerName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMakerName(String value) {
            this.makerName = value;
        }

        /**
         * Gets the value of the makerKana property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMakerKana() {
            return makerKana;
        }

        /**
         * Sets the value of the makerKana property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMakerKana(String value) {
            this.makerKana = value;
        }

        /**
         * Gets the value of the price property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrice() {
            return price;
        }

        /**
         * Sets the value of the price property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrice(String value) {
            this.price = value;
        }

        /**
         * Gets the value of the salesDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSalesDate() {
            return salesDate;
        }

        /**
         * Sets the value of the salesDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSalesDate(String value) {
            this.salesDate = value;
        }

        /**
         * Gets the value of the softType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSoftType() {
            return softType;
        }

        /**
         * Sets the value of the softType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSoftType(String value) {
            this.softType = value;
        }

        /**
         * Gets the value of the platformID property.
         * 
         */
        public short getPlatformID() {
            return platformID;
        }

        /**
         * Sets the value of the platformID property.
         * 
         */
        public void setPlatformID(short value) {
            this.platformID = value;
        }

        /**
         * Gets the value of the dlIconFlg property.
         * 
         */
        public byte getDlIconFlg() {
            return dlIconFlg;
        }

        /**
         * Sets the value of the dlIconFlg property.
         * 
         */
        public void setDlIconFlg(byte value) {
            this.dlIconFlg = value;
        }

        /**
         * Gets the value of the linkURL property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLinkURL() {
            return linkURL;
        }

        /**
         * Sets the value of the linkURL property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLinkURL(String value) {
            this.linkURL = value;
        }

        /**
         * Gets the value of the screenshotImgFlg property.
         * 
         */
        public byte getScreenshotImgFlg() {
            return screenshotImgFlg;
        }

        /**
         * Sets the value of the screenshotImgFlg property.
         * 
         */
        public void setScreenshotImgFlg(byte value) {
            this.screenshotImgFlg = value;
        }

        /**
         * Gets the value of the screenshotImgURL property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getScreenshotImgURL() {
            return screenshotImgURL;
        }

        /**
         * Sets the value of the screenshotImgURL property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setScreenshotImgURL(String value) {
            this.screenshotImgURL = value;
        }

    }

}
