/*
Se desea crear una aplicación en java para el registro del inventario de productos de una tienda. Para ello, se solicita
diseñar e implementar la clase Producto, con atributos de instancia para el Código, nombre, precio de compra,
porcentaje de utilidad. La clase debe implementar método constructor, getters y setters para sus atributos y el método
precioVenta, que retornara el precio de venta al público (a partir del % de utilidad del producto). Implementar una clase
principal, en la que se defina un arreglo de Productos, se registren datos de diferentes productos y luego se impriman
incluyendo el precio de venta
*/
package punto7;

import java.util.ArrayList;

public class Punto7 {
    
    public static void main(String[] args) {
        ArrayList<Producto> Lista = new ArrayList<>();
        Lista.add(new Producto("1", "manzana", 1000, 50));
        Lista.add(new Producto("2", "pera", 2000, 20));
        Lista.add(new Producto("3", "arroz", 700, 80));
        Lista.add(new Producto("4", "mani", 500, 10));
        Lista.add(new Producto("5", "mango", 500, 30));
        for(Producto item : Lista){
            System.out.println(item.toString());
        }
    }
    
}
