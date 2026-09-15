
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para balorazioa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="balorazioa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="balorazioZenbaki" type="{http://www.w3.org/2001/XMLSchema}ID" minOccurs="0"/&gt;
 *         &lt;element name="puntuazioa" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="deskripzioa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="user" type="{http://businessLogic/}user" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "balorazioa", propOrder = {
    "balorazioZenbaki",
    "puntuazioa",
    "deskripzioa",
    "user"
})
public class Balorazioa {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String balorazioZenbaki;
    protected Integer puntuazioa;
    protected String deskripzioa;
    protected User user;

    /**
     * Obtiene el valor de la propiedad balorazioZenbaki.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalorazioZenbaki() {
        return balorazioZenbaki;
    }

    /**
     * Define el valor de la propiedad balorazioZenbaki.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalorazioZenbaki(String value) {
        this.balorazioZenbaki = value;
    }

    /**
     * Obtiene el valor de la propiedad puntuazioa.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPuntuazioa() {
        return puntuazioa;
    }

    /**
     * Define el valor de la propiedad puntuazioa.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPuntuazioa(Integer value) {
        this.puntuazioa = value;
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
     * Obtiene el valor de la propiedad user.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Define el valor de la propiedad user.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }
    
    // GEHITU
	public String getUserEmail() {
		return user.getEmail();
	}

}
