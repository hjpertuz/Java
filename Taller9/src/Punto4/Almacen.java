
package Punto4;

public class Almacen extends Empleado {
    
    private String tipoEmpleado = "Almacén";
    
    @Override
    public double obtenerSueldo(){
        sueldo = 2000;
        return sueldo;
    }
    
    @Override
    public void calcularNominaEmpleado(){
        descuentos = ISR+SS+INFO;
        descuentos = sueldo*(-1*descuentos);
        valesDespensa = (sueldo*.12);
        nomina=sueldo+valesDespensa+descuentos-totalFaltasRetardos;
    }
    
    @Override
    public void obtenerDatosNomina(){
        
        obtenerNombreEmpleado();
        obtenerTipoEmpleado(tipoEmpleado);
        obtenerSueldo();
        obtenerRetardosFaltas();
        calcularRetardosFaltas();
        calcularNominaEmpleado();
    } 
 
}
