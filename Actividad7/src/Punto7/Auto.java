
package Punto7;

public class Auto {
    
    private int numSerieMotor,año;
    private String marca;
    private double precio;

    Auto(){
        
    }
    Auto(int numSerieMotor, int año, String marca,double precio){
        this.numSerieMotor=numSerieMotor;
        this.año=año;
        this.marca=marca;
        this.precio=precio;
    }

    public String mostrarDatos(){ 
        return numSerieMotor+" "+ año+" "+marca+" "+ precio;
    }
    
}
