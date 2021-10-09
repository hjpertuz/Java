
package Punto6;

public class EmpleadoHora extends Empleado{
    
    double salario;
    int hora;
    
    public EmpleadoHora(String n, int id, double sa,int h) {
        super(n, id);
        salario=sa;
        hora=h;
    }
    
    public int getHora() {
        return hora;
    }
    
    public void setHora(int hora) {
        this.hora = hora;
    }
    
    public void pagar() {
       
        if (hora<=39){
            salario=getHora()*2500;
            System.out.println("su salario es:"+salario);
        }
        if (hora>=40){
            salario=getHora()*3750;
            System.out.println("su salario es:"+salario);
        }
           
        }
}
