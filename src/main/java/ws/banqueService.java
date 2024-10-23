package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.util.List;


@WebService(serviceName = "banqueWS")
public class banqueService {
    @WebMethod(operationName = "convert")
    public double conversion(@WebParam(name = "montant") double mt){
        return mt*10.54;
    }
    @WebMethod
    public Compte getCompte( @WebParam(name = "montant")int code){
        return new Compte(code, Math.random()*10);

    }
    @WebMethod
    public List<Compte> listeComptes (){
        return List.of(
                new Compte(1, Math.random()*10),
                new Compte(2, Math.random()*10),
                new Compte(3, Math.random()*10)
        );
    }
}
