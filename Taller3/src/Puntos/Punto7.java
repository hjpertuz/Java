/*
Escriba un programa en Java que reciba como entrada una serie de 10 números enteros, y que determine e imprima
el mayor de los números. Su programa debe utilizar cuando menos las siguientes tres variables:
a) contador: Un contador para contar hasta 10 (para llevar el registro de cuántos números se han introducido, y para
determinar cuándo se hayan procesado los 10 números).
b) número: El entero más reciente introducido por el usuario.
c) mayor: El número más grande encontrado hasta ahora
 */
package Puntos;

import java.util.Scanner;

public class Punto7 {
    public void Principal(){
        int numero=0,mayor=0,ingresados=0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero");
            numero = sc.nextInt();
            
            if (numero>mayor) {
                mayor=numero;
            }
            
            ingresados++;
            
            System.out.println("El numero mayor es " + mayor);
            System.out.println("El ultimo numero ingresado es " + numero);
            System.out.println("ha ingresado " + ingresados + " numeros");

        }
    }
}
