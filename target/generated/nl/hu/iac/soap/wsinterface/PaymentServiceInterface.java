
package nl.hu.iac.soap.wsinterface;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "PaymentServiceInterface", targetNamespace = "http://nl.hu.iac/berichten/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PaymentServiceInterface {


    /**
     * 
     * @param paymentRequest
     * @return
     *     returns nl.hu.iac.soap.wsinterface.PaymentResponse
     * @throws PaymentFault_Exception
     */
    @WebMethod(operationName = "PaySim")
    @WebResult(name = "paymentResponse", targetNamespace = "http://nl.hu.iac/berichten/response", partName = "paymentResponse")
    public PaymentResponse paySim(
        @WebParam(name = "paymentRequest", targetNamespace = "http://nl.hu.iac/berichten/request", partName = "paymentRequest")
        PaymentRequest paymentRequest)
        throws PaymentFault_Exception
    ;

}
