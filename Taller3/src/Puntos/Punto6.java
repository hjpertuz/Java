/*
Desarrolle un aplicativo en Java que dada un cantidad en binario (0 y 1) lo transforme a decimal, y viceversa
 */
package Puntos;

import java.util.Scanner;

public class Punto6 {
    Scanner sc = new Scanner(System.in);
    public void Principal(){
        String numero;
        System.out.println("menu");
        System.out.println("1. binario a decimal");
        System.out.println("2. decimal a binario");
        int op = sc.nextInt();
        if (op==1) {
            System.out.println("ingrese un numero binario");
            numero = sc.next();
            toBinario(numero);
        }else if(op==2){
            System.out.println("ingrese un numero decimal");
            numero = sc.next();
            toDecimal(numero);
        }
        Principal();
    }
    private void toBinario(String n){
        char binario2[] = n.toCharArray();
        double sum = 0;
        for (int i = 0; i < binario2.length; i++) {
            sum = sum + ((Integer.parseInt(""+binario2[binario2.length-1-i])) * Math.pow(2, i));
        }
        System.out.println("El numero "+ n + " en decimal es " +sum);
        System.out.println("Press Any Key To Continue...");
        new java.util.Scanner(System.in).nextLine();
    }
    private void toDecimal(String decimal){
        int numero=Integer.parseInt(decimal);
        String binario="";
        while(numero>0) {
            binario = (numero%2) + binario;
            numero = numero / 2;  
        }
        System.out.println("El numero " + decimal + " en binario es "+binario);
        System.out.println("Press Any Key To Continue...");
        new java.util.Scanner(System.in).nextLine();
    }
}
