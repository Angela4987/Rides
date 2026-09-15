
package service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para user complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="user"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="izena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="abizena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jaiotzeData" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="sexua" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}ID" minOccurs="0"/&gt;
 *         &lt;element name="pasahitza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dirua" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="mugimenduak" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="balorazioak" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user", propOrder = {
    "izena",
    "abizena",
    "jaiotzeData",
    "sexua",
    "email",
    "pasahitza",
    "dirua",
    "mugimenduak",
    "balorazioak"
})
@XmlSeeAlso({
    Driver.class,
    Bidaiaria.class
})
public abstract class User {

    protected String izena;
    protected String abizena;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar jaiotzeData;
    protected String sexua;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String email;
    protected String pasahitza;
    protected float dirua;
    @XmlElementRef(name = "mugimenduak", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> mugimenduak;
    @XmlElementRef(name = "balorazioak", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> balorazioak;

    /**
     * Obtiene el valor de la propiedad izena.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIzena() {
        return izena;
    }

    /**
     * Define el valor de la propiedad izena.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIzena(String value) {
        this.izena = value;
    }

    /**
     * Obtiene el valor de la propiedad abizena.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbizena() {
        return abizena;
    }

    /**
     * Define el valor de la propiedad abizena.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbizena(String value) {
        this.abizena = value;
    }

    /**
     * Obtiene el valor de la propiedad jaiotzeData.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getJaiotzeData() {
        return jaiotzeData;
    }

    /**
     * Define el valor de la propiedad jaiotzeData.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setJaiotzeData(XMLGregorianCalendar value) {
        this.jaiotzeData = value;
    }

    /**
     * Obtiene el valor de la propiedad sexua.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexua() {
        return sexua;
    }

    /**
     * Define el valor de la propiedad sexua.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexua(String value) {
        this.sexua = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad pasahitza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasahitza() {
        return pasahitza;
    }

    /**
     * Define el valor de la propiedad pasahitza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasahitza(String value) {
        this.pasahitza = value;
    }

    /**
     * Obtiene el valor de la propiedad dirua.
     * 
     */
    public float getDirua() {
        return dirua;
    }

    /**
     * Define el valor de la propiedad dirua.
     * 
     */
    public void setDirua(float value) {
        this.dirua = value;
    }

    /**
     * Gets the value of the mugimenduak property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mugimenduak property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMugimenduak().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getMugimenduak() {
        if (mugimenduak == null) {
            mugimenduak = new ArrayList<JAXBElement<Object>>();
        }
        return this.mugimenduak;
    }

    /**
     * Gets the value of the balorazioak property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balorazioak property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalorazioak().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getBalorazioak() {
        if (balorazioak == null) {
            balorazioak = new ArrayList<JAXBElement<Object>>();
        }
        return this.balorazioak;
    }
    
	// GEHITU
	public void diruaKendu(float d) {
		dirua -= d;
	}

}
