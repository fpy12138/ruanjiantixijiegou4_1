
package service.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CalculatePersonalIncomeTaxResponse_QNAME = new QName("http://service/", "calculatePersonalIncomeTaxResponse");
    private final static QName _CalculatePersonalIncomeTax_QNAME = new QName("http://service/", "calculatePersonalIncomeTax");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculatePersonalIncomeTaxResponse }
     * 
     */
    public CalculatePersonalIncomeTaxResponse createCalculatePersonalIncomeTaxResponse() {
        return new CalculatePersonalIncomeTaxResponse();
    }

    /**
     * Create an instance of {@link CalculatePersonalIncomeTax }
     * 
     */
    public CalculatePersonalIncomeTax createCalculatePersonalIncomeTax() {
        return new CalculatePersonalIncomeTax();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculatePersonalIncomeTaxResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "calculatePersonalIncomeTaxResponse")
    public JAXBElement<CalculatePersonalIncomeTaxResponse> createCalculatePersonalIncomeTaxResponse(CalculatePersonalIncomeTaxResponse value) {
        return new JAXBElement<CalculatePersonalIncomeTaxResponse>(_CalculatePersonalIncomeTaxResponse_QNAME, CalculatePersonalIncomeTaxResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculatePersonalIncomeTax }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "calculatePersonalIncomeTax")
    public JAXBElement<CalculatePersonalIncomeTax> createCalculatePersonalIncomeTax(CalculatePersonalIncomeTax value) {
        return new JAXBElement<CalculatePersonalIncomeTax>(_CalculatePersonalIncomeTax_QNAME, CalculatePersonalIncomeTax.class, null, value);
    }

}
