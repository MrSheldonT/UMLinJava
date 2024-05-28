package UML_2;

public class ClienteCorporativo extends Cliente {
    
    private String cuenta ;
    
    ClienteCorporativo(String name, String cuenta){
        super(name);
        this.cuenta = cuenta ;
    }
}
