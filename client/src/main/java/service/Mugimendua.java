
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para mugimendua complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="mugimendua"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mugimenduZenbaki" type="{http://www.w3.org/2001/XMLSchema}ID" minOccurs="0"/&gt;
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
@XmlType(name = "mugimendua", propOrder = {
    "mugimenduZenbaki",
    "deskripzioa",
    "user"
})
public class Mugimendua {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String mugimenduZenbaki;
    protected String deskripzioa;
    protected User user;

    /**
     * Obtiene el valor de la propiedad mugimenduZenbaki.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMugimenduZenbaki() {
        return mugimenduZenbaki;
    }

    /**
     * Define el valor de la propiedad mugimenduZenbaki.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMugimenduZenbaki(String value) {
        this.mugimenduZenbaki = value;
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

}
