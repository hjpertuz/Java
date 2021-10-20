
package Punto4;

public class Directivo extends Empleado {;
        
        private String tipoEmpleado="Directivo";
        double gas=500;
 
    @Override
    public double obtenerSueldo(){
        sueldo=10000;
        return sueldo;
    }
 
    @Override
    public void calcularNominaEmpleado(){
        
        descuentos=ISR+SS+INFO;
        descuentos=sueldo*(-1*descuentos);
        valesDespensa=sueldo*.1;
        nomina=sueldo+valesDespensa+gas+descuentos-totalFaltasRetardos;
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
