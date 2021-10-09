
package Punto2;

public class Oficial extends Operario{

    public Oficial() {
    }

    public Oficial(String nombre) {
        super(nombre);
    }
    
    @Override
    public String toString() {
        return "Empleado " + getNombre() + "-> Operario -> Oficial";
    }
    
    
    
}
