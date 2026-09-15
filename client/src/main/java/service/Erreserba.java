
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para erreserba complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="erreserba"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bookNumber" type="{http://www.w3.org/2001/XMLSchema}ID" minOccurs="0"/&gt;
 *         &lt;element name="nPlaces" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="bidaia" type="{http://businessLogic/}ride" minOccurs="0"/&gt;
 *         &lt;element name="traveler" type="{http://businessLogic/}bidaiaria" minOccurs="0"/&gt;
 *         &lt;element name="egoera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="diruIzoztua" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="baloratutaBidaiari" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="baloratutaGidari" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="erreklamazioa" type="{http://businessLogic/}erreklamazioa" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "erreserba", propOrder = {
    "bookNumber",
    "nPlaces",
    "bidaia",
    "traveler",
    "egoera",
    "diruIzoztua",
    "baloratutaBidaiari",
    "baloratutaGidari",
    "erreklamazioa"
})
public class Erreserba {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String bookNumber;
    protected int nPlaces;
    protected Ride bidaia;
    protected Bidaiaria traveler;
    protected String egoera;
    protected float diruIzoztua;
    protected boolean baloratutaBidaiari;
    protected boolean baloratutaGidari;
    protected Erreklamazioa erreklamazioa;

    /**
     * Obtiene el valor de la propiedad bookNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookNumber() {
        return bookNumber;
    }

    /**
     * Define el valor de la propiedad bookNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookNumber(String value) {
        this.bookNumber = value;
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
     * Obtiene el valor de la propiedad bidaia.
     * 
     * @return
     *     possible object is
     *     {@link Ride }
     *     
     */
    public Ride getBidaia() {
        return bidaia;
    }

    /**
     * Define el valor de la propiedad bidaia.
     * 
     * @param value
     *     allowed object is
     *     {@link Ride }
     *     
     */
    public void setBidaia(Ride value) {
        this.bidaia = value;
    }

    /**
     * Obtiene el valor de la propiedad traveler.
     * 
     * @return
     *     possible object is
     *     {@link Bidaiaria }
     *     
     */
    public Bidaiaria getTraveler() {
        return traveler;
    }

    /**
     * Define el valor de la propiedad traveler.
     * 
     * @param value
     *     allowed object is
     *     {@link Bidaiaria }
     *     
     */
    public void setTraveler(Bidaiaria value) {
        this.traveler = value;
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
     * Obtiene el valor de la propiedad diruIzoztua.
     * 
     */
    public float getDiruIzoztua() {
        return diruIzoztua;
    }

    /**
     * Define el valor de la propiedad diruIzoztua.
     * 
     */
    public void setDiruIzoztua(float value) {
        this.diruIzoztua = value;
    }

    /**
     * Obtiene el valor de la propiedad baloratutaBidaiari.
     * 
     */
    public boolean isBaloratutaBidaiari() {
        return baloratutaBidaiari;
    }

    /**
     * Define el valor de la propiedad baloratutaBidaiari.
     * 
     */
    public void setBaloratutaBidaiari(boolean value) {
        this.baloratutaBidaiari = value;
    }

    /**
     * Obtiene el valor de la propiedad baloratutaGidari.
     * 
     */
    public boolean isBaloratutaGidari() {
        return baloratutaGidari;
    }

    /**
     * Define el valor de la propiedad baloratutaGidari.
     * 
     */
    public void setBaloratutaGidari(boolean value) {
        this.baloratutaGidari = value;
    }

    /**
     * Obtiene el valor de la propiedad erreklamazioa.
     * 
     * @return
     *     possible object is
     *     {@link Erreklamazioa }
     *     
     */
    public Erreklamazioa getErreklamazioa() {
        return erreklamazioa;
    }

    /**
     * Define el valor de la propiedad erreklamazioa.
     * 
     * @param value
     *     allowed object is
     *     {@link Erreklamazioa }
     *     
     */
    public void setErreklamazioa(Erreklamazioa value) {
        this.erreklamazioa = value;
    }
    
	// GEHITU
	public String getGidariarenEmaila() {
		return bidaia.getGidariarenEmaila();
	}
	
	// GEHITU
	public String getBidaiariarenEmaila() {
		return traveler.getEmail();
	}

}
