/*
    Un vendedor minorista en línea requiere un informe de las ventas del día. Para ello cuenta con tres arreglos de n
    elementos cada uno: A, B y C. El primero almacena el código de los productos vendidos en el día, El segundo almacena
    el valor de venta de cada producto, y el tercero la cantidad de unidades vendidas de cada producto.
    Requiere un aplicativo que le calcule rápidamente los siguientes datos:
    -Total productos vendidos en el día.
    -Total ingresos por ventas del día.
    -El producto más vendido.
    -El producto más costoso vendido
 */
package Puntos;

import java.util.Scanner;

public class Punto1 {
    public void proceso(){
        Scanner sc = new Scanner(System.in);
        /*
            n = cantidad de productos
            tp = total de productos vendidos
            pmv = producto mas vendido
            pmvp = posicion del producto mas vendido
            pmc = producto mas costoso
            pmcp = posicion del producto mas costoso
            TID = total ingresos por venta del dia
        */
        //El primero almacena el código de los productos vendidos en el día
        int codigo[];
        //El segundo almacena el valor de venta de cada producto
        double valor[], pmc = 0, TID = 0;
        //El tercero la cantidad de unidades vendidas de cada producto
        int cantidad[];
        //calcula el Total ingresos por ventas del día.
        double TIVD[];
        int n, tp = 0, pmv = 0, pmvp = 0, pmcp = 0;
        
        /*pregunta al usuario el numero de productos que quiere registrar*/
        System.out.println("Ingrese la cantidad de productos a registrar: ");
        n = sc.nextInt();
        
        /*crea los arrays con la cantidad de elementos que va a tener*/
        codigo = new int[n];
        valor = new double[n];
        cantidad = new int[n];
        TIVD = new double[n];
        
        /*pide al usuario los datos y llena los 3 arrays*/
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el código del producto: ");
            codigo[i] = sc.nextInt();
            
            System.out.println("Ingrese el valor del producto: ");
            valor[i] = sc.nextDouble();
            
            System.out.println("Ingrese el numero de unidades vendidas: ");
            cantidad[i] = sc.nextInt();   
            
            /*calcula el valor total del producto*/
            TIVD[i] = valor[i] * cantidad[i] ;
        }
        
        for (int i = 0; i < n; i++) {
            /*mustra todos los productos registrados*/
            System.out.println("Codigo: "+codigo[i] + " | Valor: " + valor[i] + " | Cantidad: " +cantidad[i] + " | Total Ingresos: " + TIVD[i]);
            
            /*suma la cantidad de productos vendidos*/
            tp = tp + cantidad[i];
            
            /*toma la posicion del producto mas vendido*/
            if (pmv < cantidad[i]) {
                pmv = cantidad[i];
                pmvp = i;
            }
            
            /*toma la posicion del producto mas costoso*/
            if (pmc < valor[i] && cantidad[i] > 0){
                pmc = valor[i];
                pmcp = i;
            }
            
            /*suma el precio total de todos los productos vendidos */
            TID = TID + TIVD[i];
        }
        
        System.out.println("-Total productos vendidos en el día: " + tp);
        System.out.println("-El total de ingresos por dia es: " + TID);
        System.out.println("-El producto mas vendido es: " + codigo[pmvp] + " con " + cantidad[pmvp] + " unidades vendidas");
        System.out.println("-El producto mas costoso es: " + codigo[pmcp] + " con un valor de " + valor[pmcp]);
        
    }
}
