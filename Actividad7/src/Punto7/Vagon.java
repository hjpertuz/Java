
package Punto7;


public class Vagon extends Auto{
    
    private int pasajeros;

       Vagon(int numSerieMotor, int año, String marca,double precio){
        super(numSerieMotor,año,marca,precio);
       }

      public int getCantidadPasajeros(){
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
