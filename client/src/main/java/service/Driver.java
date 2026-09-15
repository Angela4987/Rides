
package service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para driver complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="driver"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://businessLogic/}user"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rides" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="kotxeak" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="JasotakoErreklamazioak" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "driver", propOrder = {
    "rides",
    "kotxeak",
    "jasotakoErreklamazioak"
})
public class Driver
    extends User
{

    @XmlElementRef(name = "rides", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> rides;
    @XmlElementRef(name = "kotxeak", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> kotxeak;
    @XmlElementRef(name = "JasotakoErreklamazioak", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> jasotakoErreklamazioak;

    /**
     * Gets the value of the rides property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rides property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRides().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getRides() {
        if (rides == null) {
            rides = new ArrayList<JAXBElement<Object>>();
        }
        return this.rides;
    }

    /**
     * Gets the value of the kotxeak property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kotxeak property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKotxeak().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getKotxeak() {
        if (kotxeak == null) {
            kotxeak = new ArrayList<JAXBElement<Object>>();
        }
        return this.kotxeak;
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
