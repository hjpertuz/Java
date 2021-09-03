/*
Una empresa grande paga a sus vendedores mediante comisiones. Los vendedores reciben $200 por semana, más el
9% de sus ventas brutas durante esa semana. Por ejemplo, un vendedor que vende $5,000 de mercancía en una
semana, recibe $200 más el 9% de 5,000, o un total de $650 en esa semana.
Del mismo modo, la empresa premia a los vendedores que cumplan los objetivos de venta con un incremento en el
pago de la semana, de acuerdo a las siguientes categorías de vendedores:
A – incrementa el pago semanal en 5% si las ventas superan $3000, en 7% sin son entre $5000 y $7000, y 10% si
superan los $7000.
B – incrementa el pago semanal en 7% si las ventas superan $5000, %10 si son entre %10000 y $15000, 13% si
superan los $15000.
Si usted cuenta con el registro de ventas semanales realizadas por un vendedor almacenados en un arreglo, cuál sería
el pago semanal en cada categoría?
 */
package Puntos;

import java.util.Scanner;

public class Punto3 {
    private double vendedores[][];
    private int n = 0, agregados = 0;
    private Scanner sc = new Scanner(System.in);
    public void Principal(){
        System.out.println("Ingrese la cantidad de vendedores que desea registrar: ");
        n = sc.nextInt();
        vendedores = new double[n][3];
        menu();
    }
    private void menu(){
        System.out.println("Menu");
        System.out.println("1. ingresar un nuevo vendedor");
        System.out.println("2. ver comisiones");
        int op = sc.nextInt();
        switch(op){
            case 1: Agregar(); break;
            case 2: Mostrar(); break;
            default: System.out.println("error");break;
        }
        menu();
    }
    private void Agregar(){
        if (n > agregados) {
            System.out.println("elija una categoria");
            System.out.println("1. A");
            System.out.println("2. B");
            double categoria = sc.nextInt();
            if (categoria>0 && categoria<=2) {
                System.out.println("Ingrese el valor de la venta semanal: ");
                vendedores[agregados][0] = categoria;
                vendedores[agregados][1] = sc.nextInt();
                
                vendedores[agregados][2] = calcularComision(categoria,vendedores[agregados][1]);
                
                agregados++;
            }else{
                System.out.println("Error");
                Agregar();
            }
            
        }else{
            System.out.println("no se pueden agregar mas");
        }
    }
    private void Mostrar(){
        for (int i = 0; i < agregados; i++) {
            System.out.println(vendedores[i][0] + "|" + vendedores[i][1] + "|" + vendedores[i][2]);
        }
    }
    private double calcularComision(double c,double v){
        double total = 200 + (v * 0.09);
        if (c==1) {
            if (v >= 3000 && v < 5000) {
                total = total + (v*0.05);
            }else if(v >= 5000 && v < 7000){
                total = total + (v*0.07);
            }else if(v >= 7000){
                total = total + (v*0.10);
            }
        }else{
            if (v >= 5000 && v < 10000) {
                total = total + (v*0.07);
            }else if(v >= 10000 && v < 15000){
                total = total + (v*0.10);
            }else if(v >= 15000){
                total = total + (v*0.13);
            }
        }
        return total;
    }
}
