
package Punto4;

public class Corporativo extends Empleado {
    
    private String tipoEmpleado = "Corporativo";
    private double gas=300;
    
    @Override
    public double obtenerSueldo(){
        sueldo=5000;
        return sueldo;
    }
 
    @Override
    public void calcularNominaEmpleado(){
        descuentos=ISR+SS+INFO;
        descuentos=sueldo*(-1*descuentos);
        valesDespensa=sueldo*.15;
        nomina=sueldo+gas+descuentos-totalFaltasRetardos;
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
