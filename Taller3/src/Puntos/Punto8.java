/*
Escriba una aplicación que pida al usuario que introduzca el tamaño del lado de un cuadrado y que muestre un cuadrado
hueco de ese tamaño, compuesto de asteriscos. Su programa debe funcionar con cuadrados que tengan lados de
todas las longitudes entre 1 y 20.

 */
package Puntos;

import java.util.Scanner;

public class Punto8 {
    public void Principal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el lado de un cuadrado, mayor a 1 y menor a 20");
        int l = sc.nextInt();
        if (l > 0 && l <= 20 ) {
            for (int i = 0; i < l; i++) {
                for (int j = 0; j < l; j++) {
                    if (i == 0 || i == l-1) {
                        System.out.print("*");
                    }else if(j == 0 || j == l-1){
                        System.out.print("*");
                    }else if (j > 0 && j<l-1) {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }else{
            System.out.println("error");
        }
    }
}
