
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para mezua complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="mezua"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mezuzbk" type="{http://www.w3.org/2001/XMLSchema}ID" minOccurs="0"/&gt;
 *         &lt;element name="testua" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "mezua", propOrder = {
    "mezuzbk",
    "testua",
    "erreklamazioa"
})
public class Mezua {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String mezuzbk;
    protected String testua;
    protected Erreklamazioa erreklamazioa;

    /**
     * Obtiene el valor de la propiedad mezuzbk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMezuzbk() {
        return mezuzbk;
    }

    /**
     * Define el valor de la propiedad mezuzbk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMezuzbk(String value) {
        this.mezuzbk = value;
    }

    /**
     * Obtiene el valor de la propiedad testua.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestua() {
        return testua;
    }

    /**
     * Define el valor de la propiedad testua.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestua(String value) {
        this.testua = value;
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

}
