
package Punto7;


public class AutoCompacto extends Auto {
    
    private int pasajeros;

    AutoCompacto(int numSerieMotor, int año, String marca,double precio){
        super(numSerieMotor,año,marca,precio);
    }
    AutoCompacto(){
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
