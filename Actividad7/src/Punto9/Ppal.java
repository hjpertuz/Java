
package Punto9;


public class Ppal {
    
    public static void main(String[] args) {
        
        Producto ListaProductos[]=new Producto[3];
       
       ListaProductos[0]=new Producto("producto1", 1000);
       ListaProductos[1]=new Perecedero(1, "producto2",2000);
       ListaProductos[2]=new NoPerecedero("tipo 1", "producto 3", 1);
       
     
       
       double suma=0;
       for(int i=0;i<ListaProductos.length;i++){
           suma=suma+ListaProductos[i].Calcular(5);
       }
        System.out.println("El precio total de productos es: " + suma);
      
      
    }
}
