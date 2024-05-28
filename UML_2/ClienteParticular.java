package UML_2;

public class ClienteParticular  extends Cliente{
    private String tarjeta ;
    
    ClienteParticular(String name, String tarjeta){
        super(name);
        this.tarjeta = tarjeta ;
    }
  
}
