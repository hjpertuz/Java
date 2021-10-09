
package Punto7;

public class Camioneta extends Auto{
    
    private int capacidadCarga;
    private int cantidadEjes;
    private int cantidadRodadas;

    Camioneta (int numSerieMotor, int año, String marca,double precio,int capacidadCarga,int cantidadEjes,int cantidadRodadas){
        super(numSerieMotor,año,marca,precio);
        this.capacidadCarga=capacidadCarga;
        this.cantidadEjes=cantidadEjes;
        this.cantidadRodadas=cantidadRodadas;
    }

    int getCarga(){
       return capacidadCarga; 
    }
    
     int getEjes(){
       return cantidadEjes; 
    }
     
      int getRodadas(){
       return cantidadRodadas; 
    }
      
      void setCarga(int n){
          capacidadCarga=n;
      }
      
      void setEjes(int n){
          cantidadEjes=n;
      }
      
      void setRodadas(int n){
          cantidadRodadas=n;
      }
      
    @Override
      public String mostrarDatos(){
          return super.mostrarDatos()+" "+capacidadCarga+" "+cantidadEjes+" "+cantidadRodadas;
      }
}
