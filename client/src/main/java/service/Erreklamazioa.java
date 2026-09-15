
package service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para erreklamazioa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="erreklamazioa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="erreklamazioZenbaki" type="{http://www.w3.org/2001/XMLSchema}ID" minOccurs="0"/&gt;
 *         &lt;element name="egoera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deskripzioa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nork" type="{http://businessLogic/}bidaiaria" minOccurs="0"/&gt;
 *         &lt;element name="nori" type="{http://businessLogic/}driver" minOccurs="0"/&gt;
 *         &lt;element name="admin" type="{http://businessLogic/}admin" minOccurs="0"/&gt;
 *         &lt;element name="erreserba" type="{http://businessLogic/}erreserba" minOccurs="0"/&gt;
 *         &lt;element name="mezuak" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "erreklamazioa", propOrder = {
    "erreklamazioZenbaki",
    "egoera",
    "deskripzioa",
    "nork",
    "nori",
    "admin",
    "erreserba",
    "mezuak"
})
public class Erreklamazioa {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String erreklamazioZenbaki;
    protected String egoera;
    protected String deskripzioa;
    protected Bidaiaria nork;
    protected Driver nori;
    protected Admin admin;
    protected Erreserba erreserba;
    @XmlElementRef(name = "mezuak", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> mezuak;

    /**
     * Obtiene el valor de la propiedad erreklamazioZenbaki.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErreklamazioZenbaki() {
        return erreklamazioZenbaki;
    }

    /**
     * Define el valor de la propiedad erreklamazioZenbaki.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErreklamazioZenbaki(String value) {
        this.erreklamazioZenbaki = value;
    }

    /**
     * Obtiene el valor de la propiedad egoera.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEgoera() {
        return egoera;
    }

    /**
     * Define el valor de la propiedad egoera.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEgoera(String value) {
        this.egoera = value;
    }

    /**
     * Obtiene el valor de la propiedad deskripzioa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeskripzioa() {
        return deskripzioa;
    }

    /**
     * Define el valor de la propiedad deskripzioa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeskripzioa(String value) {
        this.deskripzioa = value;
    }

    /**
     * Obtiene el valor de la propiedad nork.
     * 
     * @return
     *     possible object is
     *     {@link Bidaiaria }
     *     
     */
    public Bidaiaria getNork() {
        return nork;
    }

    /**
     * Define el valor de la propiedad nork.
     * 
     * @param value
     *     allowed object is
     *     {@link Bidaiaria }
     *     
     */
    public void setNork(Bidaiaria value) {
        this.nork = value;
    }

    /**
     * Obtiene el valor de la propiedad nori.
     * 
     * @return
     *     possible object is
     *     {@link Driver }
     *     
     */
    public Driver getNori() {
        return nori;
    }

    /**
     * Define el valor de la propiedad nori.
     * 
     * @param value
     *     allowed object is
     *     {@link Driver }
     *     
     */
    public void setNori(Driver value) {
        this.nori = value;
    }

    /**
     * Obtiene el valor de la propiedad admin.
     * 
     * @return
     *     possible object is
     *     {@link Admin }
     *     
     */
    public Admin getAdmin() {
        return admin;
    }

    /**
     * Define el valor de la propiedad admin.
     * 
     * @param value
     *     allowed object is
     *     {@link Admin }
     *     
     */
    public void setAdmin(Admin value) {
        this.admin = value;
    }

    /**
     * Obtiene el valor de la propiedad erreserba.
     * 
     * @return
     *     possible object is
     *     {@link Erreserba }
     *     
     */
    public Erreserba getErreserba() {
        return erreserba;
    }

    /**
     * Define el valor de la propiedad erreserba.
     * 
     * @param value
     *     allowed object is
     *     {@link Erreserba }
     *     
     */
    public void setErreserba(Erreserba value) {
        this.erreserba = value;
    }

    /**
     * Gets the value of the mezuak property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mezuak property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMezuak().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getMezuak() {
        if (mezuak == null) {
            mezuak = new ArrayList<JAXBElement<Object>>();
        }
        return this.mezuak;
    }

}
