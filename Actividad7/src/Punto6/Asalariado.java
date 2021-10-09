
package Punto6;


public class Asalariado extends Empleado{
    
    private double salario=60000000;
    
    public Asalariado(String n, int id, double sal) {
        super(n, id);
        salario=sal;
    }
    
    public void pagar(){
        System.out.println("su salario es "+salario);
    }
    
}
