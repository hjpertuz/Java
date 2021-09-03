/*
Escriba un método que tome un valor entero y devuelva el número con sus dígitos invertidos. Por ejemplo, para el
número 7631, el método debe regresar 1367. Incorpore el método en una aplicación que reciba como entrada un
valor del usuario y muestre el resultado.
 */
package Puntos;

import java.util.Scanner;

public class Punto11 {
    public void Principal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        String n = sc.next();
        char c[] = n.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[c.length-1-i]);
        }
        System.out.println("");
    }
}
