
package service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para bidaiaria complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="bidaiaria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://businessLogic/}user"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="erreserbak" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="alertak" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="bidalitakoErreklamazioak" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bidaiaria", propOrder = {
    "erreserbak",
    "alertak",
    "bidalitakoErreklamazioak"
})
public class Bidaiaria
    extends User
{

    @XmlElementRef(name = "erreserbak", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> erreserbak;
    @XmlElementRef(name = "alertak", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> alertak;
    @XmlElementRef(name = "bidalitakoErreklamazioak", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> bidalitakoErreklamazioak;

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

    /**
     * Gets the value of the alertak property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alertak property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlertak().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getAlertak() {
        if (alertak == null) {
            alertak = new ArrayList<JAXBElement<Object>>();
        }
        return this.alertak;
    }

    /**
     * Gets the value of the bidalitakoErreklamazioak property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bidalitakoErreklamazioak property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBidalitakoErreklamazioak().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getBidalitakoErreklamazioak() {
        if (bidalitakoErreklamazioak == null) {
            bidalitakoErreklamazioak = new ArrayList<JAXBElement<Object>>();
        }
        return this.bidalitakoErreklamazioak;
    }

}
