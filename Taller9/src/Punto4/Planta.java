
package Punto4;

public class Planta extends Empleado {
    
    private String tipoEmpleado="Planta de Producción";
    private int metas,faltas,retardos;
    private double vales,bono;
    private boolean bon;

    @Override
    public double obtenerSueldo(){
        sueldo=2500;
        return sueldo;
    }
    
    public void obtenerBono(){
        System.out.println("Cuanto produjiste este mes" + metas);
    }
    
    public void calcularBono(){
        char accidente='n';
        System.out.println("Empleado " + nombreEmpleado + " tuvo accidentes? " + "\n S/N" + accidente);
        if(accidente=='s'&&metas!=249){
            System.out.println("No es merecedor del bono");
            bon=false;
        }else
            if(accidente=='n'||accidente=='N'&&metas>=250){
                System.out.println("Merece el bono");
                bono=sueldo*.10;
                bon=true;
            }else
                if(accidente=='n'||accidente=='N'&&metas<=249){
                    System.out.println(" No merece el bono");
                    bon=false;
                }
    }

    @Override
    public void calcularNominaEmpleado(){
        if(bon==false){
            descuentos=ISR+SS+INFO;
            descuentos=sueldo*(-1*descuentos);
            valesDespensa=sueldo*.12;
            nomina=sueldo+valesDespensa+descuentos-totalFaltasRetardos;
        }else{
            descuentos=ISR+SS+INFO;
            descuentos=sueldo*(-1*descuentos);
            valesDespensa=sueldo*.12;
            nomina=sueldo+bono+valesDespensa+descuentos-totalFaltasRetardos;
        }
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
    
    @Override
    public void imprimirNomina(){
        
        String cadena="";
        if(bon==false){
            
            cadena+="Empleado: " + nombreEmpleado
                +"\nTipo de empleado: " + tipoEmpleado
                +"\nSueldo Bruto: $"+sueldo
                +"\n(+)Vales de despensa: $" + valesDespensa
                +"\nSueldo Neto: $" + nomina
                +"\nRetardos: " + retardos
                +"\nFaltas: " + faltas;
        }else{
            
            cadena+="Empleado: " + nombreEmpleado
                +"\nTipo de empleado: " + tipoEmpleado
                +"\nSueldo Bruto: $"+sueldo
                +"\n(+)Vales de despensa: $" + valesDespensa
                +"\nSueldo Neto: $" + nomina
                +"\nRetardos: " + retardos
                +"\nFaltas: " + faltas;
        
        System.out.println("._." + cadena);
        }
        System.out.println("._." + cadena);
    }
}
