
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
 * <p>Clase Java para admin complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="admin"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}ID" minOccurs="0"/&gt;
 *         &lt;element name="pasahitza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jasotakoErreklamazioak" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "admin", propOrder = {
    "email",
    "pasahitza",
    "jasotakoErreklamazioak"
})
public class Admin {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String email;
    protected String pasahitza;
    @XmlElementRef(name = "jasotakoErreklamazioak", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> jasotakoErreklamazioak;

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
     * Gets the value of the jasotakoErreklamazioak property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jasotakoErreklamazioak property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJasotakoErreklamazioak().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getJasotakoErreklamazioak() {
        if (jasotakoErreklamazioak == null) {
            jasotakoErreklamazioak = new ArrayList<JAXBElement<Object>>();
        }
        return this.jasotakoErreklamazioak;
    }

}
