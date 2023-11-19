
package org.example;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WeatherService", targetNamespace = "http://example.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WeatherService {


    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cal", targetNamespace = "http://example.org/", className = "org.example.Cal")
    @ResponseWrapper(localName = "calResponse", targetNamespace = "http://example.org/", className = "org.example.CalResponse")
    @Action(input = "http://example.org/WeatherService/calRequest", output = "http://example.org/WeatherService/calResponse")
    public double cal(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

}
