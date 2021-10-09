
package Punto6;


public class AsalariadoComision extends Empleado{
    
    double salario=680000;
    double porcentaje;
    
    public AsalariadoComision(String n, int id, double sal, double por) {
        super(n, id);
        salario=sal;
        porcentaje = por;
    }
    
    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    public void pagar() {
        
        double sal=salario*0.1;
        double salt=salario+sal;
        double salu=getPorcentaje()*0.3;
        double salariototal=salario+salu+salt;
        System.out.println("su salario es:"+salariototal);
    }
    
}
