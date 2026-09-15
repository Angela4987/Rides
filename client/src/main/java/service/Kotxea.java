
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para kotxea complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="kotxea"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="matrikula" type="{http://www.w3.org/2001/XMLSchema}ID" minOccurs="0"/&gt;
 *         &lt;element name="nEserleku" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="marka" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gidari" type="{http://businessLogic/}driver" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kotxea", propOrder = {
    "matrikula",
    "nEserleku",
    "marka",
    "gidari"
})
public class Kotxea {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String matrikula;
    protected int nEserleku;
    protected String marka;
    protected Driver gidari;

    /**
     * Obtiene el valor de la propiedad matrikula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatrikula() {
        return matrikula;
    }

    /**
     * Define el valor de la propiedad matrikula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatrikula(String value) {
        this.matrikula = value;
    }

    /**
     * Obtiene el valor de la propiedad nEserleku.
     * 
     */
    public int getNEserleku() {
        return nEserleku;
    }

    /**
     * Define el valor de la propiedad nEserleku.
     * 
     */
    public void setNEserleku(int value) {
        this.nEserleku = value;
    }

    /**
     * Obtiene el valor de la propiedad marka.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarka() {
        return marka;
    }

    /**
     * Define el valor de la propiedad marka.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarka(String value) {
        this.marka = value;
    }

    /**
     * Obtiene el valor de la propiedad gidari.
     * 
     * @return
     *     possible object is
     *     {@link Driver }
     *     
     */
    public Driver getGidari() {
        return gidari;
    }

    /**
     * Define el valor de la propiedad gidari.
     * 
     * @param value
     *     allowed object is
     *     {@link Driver }
     *     
     */
    public void setGidari(Driver value) {
        this.gidari = value;
    }

}
