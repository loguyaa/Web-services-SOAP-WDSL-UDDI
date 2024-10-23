import jakarta.xml.ws.Endpoint;
import ws.banqueService;

public class serverJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9191/",new banqueService());
        System.out.println("Web service deploye sur http://0.0.0.0:9191");



    }
}
