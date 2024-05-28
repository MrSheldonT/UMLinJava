package UML_2;

public class Cliente {
    private String name ;

    Cliente(String name){
        this.name = name ;
    }
    protected void pagar(Pedido p){
        /* ¿Pagar? */
        System.out.println("El cliente " + name + " pagó el pedido con el precio de " + p.getPrecio() );
    }
    public String getName() {
        return name;
    }
    
}
