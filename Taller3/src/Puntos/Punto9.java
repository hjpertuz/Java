/*
Un vendedor minorista en línea vende cinco productos cuyos precios de venta son los siguientes: producto 1, $2.98;
producto 2, $4.50; producto 3, $9.98; producto 4, $4.49 y producto 5, $6.87. Escriba una aplicación que lea una serie
de pares de números, como se muestra a continuación:
a) número del producto;
b) cantidad vendida.
Su programa debe utilizar una instrucción switch para determinar el precio de venta de cada producto. Debe calcular y
mostrar el valor total de venta de todos los productos vendidos. Use un ciclo repetitivo para determinar cuándo debe el
programa dejar de iterar para mostrar los resultados finales.
 */
package Puntos;

import java.util.Scanner;

public class Punto9 {
    Scanner sc = new Scanner(System.in);
    public void Principal(){
        int numero, cantidad;
        String mas;
        do {            
            System.out.println("ingrese el numero del producto: ");
            numero = sc.nextInt();
            System.out.println("Ingrese la cantidad vendida: ");
            cantidad = sc.nextInt();
            System.out.println(calcular(numero, cantidad));
            System.out.println("Desea calcular el precio de otro producto s/n? ");
            mas = sc.next();
        } while (mas.equals("s") || mas.equals("S"));
    }
    private String calcular(int n, int c){
        double precio = 0;
        switch(n){
            case 1: precio = c*2.98; break;
            case 2: precio = c*2.98; break;
            case 3: precio = c*2.98; break;
            case 4: precio = c*2.98; break;
            case 5: precio = c*2.98; break;
            default: precio = -3999; break;
        }
        return precio!=-3999 ? "El precio es de venta del producto es " + precio:"Error";
    }
}
