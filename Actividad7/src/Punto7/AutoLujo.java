
package Punto7;


public class AutoLujo extends Auto{
    
    private int pasajeros;

     AutoLujo(int numSerieMotor, int año, String marca,double precio){
        super(numSerieMotor,año,marca,precio);
    } 
     public  int getCantidadPasajeros(){
     return pasajeros;
    }
     
    public void setCantidadPasajeros(int n){
    pasajeros=n;
    }
    
    @Override
    public String mostrarDatos(){   
       return super.mostrarDatos()+" "+pasajeros;
    }
}
