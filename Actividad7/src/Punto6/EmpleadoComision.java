
package Punto6;

public class EmpleadoComision extends Empleado{
    
    double salario=2500000;
    double porcentaje;
    
    public EmpleadoComision(String n, int id, double sal,double por) {
        super(n, id);
        salario=sal;
        porcentaje=por;
    }
    
    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public void pagar() {
        salario=getPorcentaje()*0.3;
        double sal= getPorcentaje()-salario;
        System.out.println("salario:"+sal);
       
    }
}
