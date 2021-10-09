
package Punto2;

public class Tecnico extends Operario{

    public Tecnico() {
    }

    public Tecnico(String nombre) {
        super(nombre);
    }
    
    @Override
    public String toString() {
        return "Empleado " + getNombre() + "-> Operario -> Tecnico";
    }
    
    
    
}
