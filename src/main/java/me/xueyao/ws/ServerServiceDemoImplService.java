package me.xueyao.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.14
 * 2021-09-13T13:50:57.044+08:00
 * Generated source version: 3.2.14
 *
 */
@WebServiceClient(name = "ServerServiceDemoImplService",
                  wsdlLocation = "file:/Users/simonxue/Code/DuGu-SpringBoot/DuGu-SpringBoot-WebService-Client/src/main/java/me/xueyao/ws/api.wsdl",
                  targetNamespace = "http://server.webservice.example.com")
public class ServerServiceDemoImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://server.webservice.example.com", "ServerServiceDemoImplService");
    public final static QName ServerServiceDemoPort = new QName("http://server.webservice.example.com", "ServerServiceDemoPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/simonxue/Code/DuGu-SpringBoot/DuGu-SpringBoot-WebService-Client/src/main/java/me/xueyao/ws/api.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ServerServiceDemoImplService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/Users/simonxue/Code/DuGu-SpringBoot/DuGu-SpringBoot-WebService-Client/src/main/java/me/xueyao/ws/api.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ServerServiceDemoImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ServerServiceDemoImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServerServiceDemoImplService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ServerServiceDemoImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ServerServiceDemoImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ServerServiceDemoImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns ServerServiceDemo
     */
    @WebEndpoint(name = "ServerServiceDemoPort")
    public ServerServiceDemo getServerServiceDemoPort() {
        return super.getPort(ServerServiceDemoPort, ServerServiceDemo.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServerServiceDemo
     */
    @WebEndpoint(name = "ServerServiceDemoPort")
    public ServerServiceDemo getServerServiceDemoPort(WebServiceFeature... features) {
        return super.getPort(ServerServiceDemoPort, ServerServiceDemo.class, features);
    }

}