package UML_3;

public class Empleado {
    private String nombre;

    Empleado(String nombre){
        this.nombre = nombre ;
    }
    public boolean hacerTarea(Tarea t){
        if(Math.random() > 0.5) // cambiar por la lógica.
            return true;
        return false;
    }
    
}
