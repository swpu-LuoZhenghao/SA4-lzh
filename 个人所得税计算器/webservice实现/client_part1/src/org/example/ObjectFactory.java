
package org.example;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example package. 
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

    private final static QName _CalResponse_QNAME = new QName("http://example.org/", "calResponse");
    private final static QName _Cal_QNAME = new QName("http://example.org/", "cal");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalResponse }
     * 
     */
    public CalResponse createCalResponse() {
        return new CalResponse();
    }

    /**
     * Create an instance of {@link Cal }
     * 
     */
    public Cal createCal() {
        return new Cal();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "calResponse")
    public JAXBElement<CalResponse> createCalResponse(CalResponse value) {
        return new JAXBElement<CalResponse>(_CalResponse_QNAME, CalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "cal")
    public JAXBElement<Cal> createCal(Cal value) {
        return new JAXBElement<Cal>(_Cal_QNAME, Cal.class, null, value);
    }

}
