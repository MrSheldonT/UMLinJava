package UML_2;

public class Pedido {
    private int precio ;
    private String fecha ;

    Pedido(String fecha, int precio){
        this.fecha = fecha ;
        this.precio = precio;
    }
    public String getFecha() {
        return fecha;
    }
    public int getPrecio() {
        return precio;
    }

}
