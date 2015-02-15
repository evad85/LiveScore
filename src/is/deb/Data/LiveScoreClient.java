/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.deb.Data;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import is.ksi.www2.vefthjonustur.mot.Mot;
import is.ksi.www2.vefthjonustur.mot.MotSoap;
import is.ksi.www2.vefthjonustur.mot.MotStadaResponse;


/**
 *
 * @author evadoggsteingrimsdottir
 */
public class LiveScoreClient {
    
    static MotSoap motSoap;

    public LiveScoreClient() throws MalformedURLException {
        String wsdlURL = "http://www2.ksi.is/vefthjonustur/mot.asmx?WSDL";
        String namespace = "http://www2.ksi.is/vefthjonustur/mot/";
        String serviceName = "mot";
        QName serviceQN = new QName(namespace, serviceName);
        Mot mot = new Mot(new URL (wsdlURL),serviceQN);
        motSoap = mot.getMotSoap();
        ((BindingProvider)motSoap).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,"http://www2.ksi.is/vefthjonustur/mot.asmx");
    }
    
    
    
}
