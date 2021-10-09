
package Punto9;

public class NoPerecedero extends Producto{
    
    private String Tipo;
    
    public NoPerecedero(String Tipo, String Nombre, double Precio){
     super(Nombre, Precio);
     this.Tipo=Nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    @Override
 public String MostrarDatos(){
      return("Nombre: "+this.getNombre()+" Precio: "+this.getPrecio()+" Tipo: "+this.Tipo);
  }
}
