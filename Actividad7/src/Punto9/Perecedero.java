
package Punto9;

public class Perecedero extends Producto{
    
    private int DiasCaducar;
    
    public Perecedero(int DiasCaducar,String Nombre,double Precio){
     super( Nombre, Precio);
     this.DiasCaducar = DiasCaducar;
    }

    public int getDiasCaducar() {
        return DiasCaducar;
    }

    public void setDiasCaducar(int DiasCaducar) {
        this.DiasCaducar = DiasCaducar;
    }
    
   public double  Calcular(int Cantidad){
     double  PrecioTotal = Cantidad*this.getPrecio();
     
     switch(this.DiasCaducar){
         case 1:
               PrecioTotal = (PrecioTotal/4);
             break;
         case 2:
             PrecioTotal = (PrecioTotal/3);
             break;
         case 3:
             PrecioTotal= (PrecioTotal/2);
             break;
     }  
       return ( PrecioTotal);
   }
   
    @Override
  public String MostrarDatos(){
      return("Nombre: "+this.getNombre()+" Precio: "+this.getPrecio()+" Dia a caducar: "+this.DiasCaducar);
  } 
    
}
