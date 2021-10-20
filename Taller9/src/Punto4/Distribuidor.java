
package Punto4;

public class Distribuidor extends Empleado{
    
    private double ventas,comisionVentas;
    private String tipoEmpleado="Distribuidor";
 
    @Override
    public double obtenerSueldo(){
        sueldo=(52.8*15);
        return sueldo;
    }
    
    public void obtenerVentas(){
        System.out.println("Ingresa ventas" + ventas);
    }
 
    @Override
    public void calcularNominaEmpleado(){
        descuentos=ISR+SS+INFO;
        descuentos=sueldo*(-1*descuentos);
        comisionVentas=ventas*.02;
        nomina=sueldo+comisionVentas+descuentos-totalFaltasRetardos;
 }
 
     @Override
     public void obtenerDatosNomina(){
         obtenerNombreEmpleado();
         obtenerTipoEmpleado(tipoEmpleado);
         obtenerSueldo();
         obtenerVentas();
         obtenerRetardosFaltas();
         calcularRetardosFaltas();
         calcularNominaEmpleado();
     }
  
     
    @Override
    public void imprimirNomina(){
  
        String cadena="";
        cadena+="Empleado: " + nombreEmpleado
                +"\nTipo de empleado: " + tipoEmpleado
                +"\nSueldo Bruto: $"+sueldo
                +"\n(+)Vales de despensa: $" + valesDespensa
                +"\nSueldo Neto: $" + nomina
                +"\nRetardos: " + retardos
                +"\nFaltas: " + faltas;
        
        System.out.println("._." + cadena);
 }    
  
}