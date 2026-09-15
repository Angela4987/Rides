
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ride complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ride"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rideNumber" type="{http://www.w3.org/2001/XMLSchema}ID" minOccurs="0"/&gt;
 *         &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nPlaces" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="driver" type="{http://businessLogic/}driver" minOccurs="0"/&gt;
 *         &lt;element name="egoera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="baloratuta" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="erreserbak" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ride", propOrder = {
    "rideNumber",
    "from",
    "to",
    "nPlaces",
    "date",
    "price",
    "driver",
    "egoera",
    "baloratuta",
    "erreserbak"
})
public class Ride {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String rideNumber;
    protected String from;
    protected String to;
    protected int nPlaces;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    protected float price;
    protected Driver driver;
    protected String egoera;
    protected boolean baloratuta;
    @XmlElementRef(name = "erreserbak", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> erreserbak;

    /**
     * Obtiene el valor de la propiedad rideNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRideNumber() {
        return rideNumber;
    }

    /**
     * Define el valor de la propiedad rideNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRideNumber(String value) {
        this.rideNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad from.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrom() {
        return from;
    }

    /**
     * Define el valor de la propiedad from.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrom(String value) {
        this.from = value;
    }

    /**
     * Obtiene el valor de la propiedad to.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTo() {
        return to;
    }

    /**
     * Define el valor de la propiedad to.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTo(String value) {
        this.to = value;
    }

    /**
     * Obtiene el valor de la propiedad nPlaces.
     * 
     */
    public int getNPlaces() {
        return nPlaces;
    }

    /**
     * Define el valor de la propiedad nPlaces.
     * 
     */
    public void setNPlaces(int value) {
        this.nPlaces = value;
    }

    /**
     * Obtiene el valor de la propiedad date.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Define el valor de la propiedad date.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Obtiene el valor de la propiedad price.
     * 
     */
    public float getPrice() {
        return price;
    }

    /**
     * Define el valor de la propiedad price.
     * 
     */
    public void setPrice(float value) {
        this.price = value;
    }

    /**
     * Obtiene el valor de la propiedad driver.
     * 
     * @return
     *     possible object is
     *     {@link Driver }
     *     
     */
    public Driver getDriver() {
        return driver;
    }

    /**
     * Define el valor de la propiedad driver.
     * 
     * @param value
     *     allowed object is
     *     {@link Driver }
     *     
     */
    public void setDriver(Driver value) {
        this.driver = value;
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
     * Obtiene el valor de la propiedad baloratuta.
     * 
     */
    public boolean isBaloratuta() {
        return baloratuta;
    }

    /**
     * Define el valor de la propiedad baloratuta.
     * 
     */
    public void setBaloratuta(boolean value) {
        this.baloratuta = value;
    }

    /**
     * Gets the value of the erreserbak property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the erreserbak property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErreserbak().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getErreserbak() {
        if (erreserbak == null) {
            erreserbak = new ArrayList<JAXBElement<Object>>();
        }
        return this.erreserbak;
    }
    
	// GEHITU
	public String getGidariarenEmaila() {
		return driver.getEmail();
	}
	
	// GEHITU
	public float getBidaiarenPrezioa(int eserlekuKop) {
		return price*eserlekuKop;
	}

}
