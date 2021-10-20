
package Punto4;

public class Empleado extends Ppal {
    
    String nombreEmpleado,tipoEmpleado;
    int retardos;
    int faltas;
    int calcularRetardos,calcularFaltas,totalFaltasRetardos;
    double sueldo;
    double valesDespensa;
    double descuentos;
    double nomina;
    double descuento;
    static double ISR=.07,SS=.03,INFO=.03;
    
    String obtenerNombreEmpleado(){
        
        System.out.println("Ingresa nombre del empleado" + nombreEmpleado);
        return nombreEmpleado;
    }
    
    String obtenerTipoEmpleado(String tipoEmpleado){
        this.tipoEmpleado=tipoEmpleado;
        return this.tipoEmpleado;
    }
    
    public double obtenerSueldo(){
        System.out.println("Ingresa sueldo" + sueldo);
        return sueldo;
    }
    
    public int obtenerRetardosFaltas(){
         System.out.println("Ingresa Retardados de " + nombreEmpleado + retardos);
         System.out.println("Ingresa Faltas de " + nombreEmpleado + faltas);
         return retardos;
    }
    
    int calcularRetardosFaltas(){
        
        if((retardos/3)!=0){
            calcularRetardos = retardos / 3;
        }
        totalFaltasRetardos = (faltas+calcularRetardos)*(int)(sueldo/(10));
        
        return retardos;
    }
    
    public void calcularNominaEmpleado(){
        
        descuentos=ISR+SS+INFO;
        descuento=sueldo*(-1*descuentos);
        nomina=sueldo+valesDespensa+descuento-totalFaltasRetardos;
    }
    
    public void obtenerDatosNomina(){
        obtenerNombreEmpleado();
        obtenerTipoEmpleado(tipoEmpleado);
        obtenerSueldo();
        obtenerRetardosFaltas();
        calcularRetardosFaltas();
        calcularNominaEmpleado();
    }
    
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
