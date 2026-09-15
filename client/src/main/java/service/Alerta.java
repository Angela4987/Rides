
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para alerta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="alerta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Alertazbk" type="{http://www.w3.org/2001/XMLSchema}ID" minOccurs="0"/&gt;
 *         &lt;element name="nondik" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="abisatuta" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="bidaiari" type="{http://businessLogic/}bidaiaria" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alerta", propOrder = {
    "alertazbk",
    "nondik",
    "nora",
    "data",
    "abisatuta",
    "bidaiari"
})
public class Alerta {

    @XmlElement(name = "Alertazbk")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String alertazbk;
    protected String nondik;
    protected String nora;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar data;
    protected boolean abisatuta;
    protected Bidaiaria bidaiari;

    /**
     * Obtiene el valor de la propiedad alertazbk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertazbk() {
        return alertazbk;
    }

    /**
     * Define el valor de la propiedad alertazbk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertazbk(String value) {
        this.alertazbk = value;
    }

    /**
     * Obtiene el valor de la propiedad nondik.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNondik() {
        return nondik;
    }

    /**
     * Define el valor de la propiedad nondik.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNondik(String value) {
        this.nondik = value;
    }

    /**
     * Obtiene el valor de la propiedad nora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNora() {
        return nora;
    }

    /**
     * Define el valor de la propiedad nora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNora(String value) {
        this.nora = value;
    }

    /**
     * Obtiene el valor de la propiedad data.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getData() {
        return data;
    }

    /**
     * Define el valor de la propiedad data.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setData(XMLGregorianCalendar value) {
        this.data = value;
    }

    /**
     * Obtiene el valor de la propiedad abisatuta.
     * 
     */
    public boolean isAbisatuta() {
        return abisatuta;
    }

    /**
     * Define el valor de la propiedad abisatuta.
     * 
     */
    public void setAbisatuta(boolean value) {
        this.abisatuta = value;
    }

    /**
     * Obtiene el valor de la propiedad bidaiari.
     * 
     * @return
     *     possible object is
     *     {@link Bidaiaria }
     *     
     */
    public Bidaiaria getBidaiari() {
        return bidaiari;
    }

    /**
     * Define el valor de la propiedad bidaiari.
     * 
     * @param value
     *     allowed object is
     *     {@link Bidaiaria }
     *     
     */
    public void setBidaiari(Bidaiaria value) {
        this.bidaiari = value;
    }

}
