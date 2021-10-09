
package Punto7;

import java.util.Scanner;

public class Ppal {

    
    public static void main(String[] args) {
        
        Auto x[]=new Auto[4];
        x[1]=new AutoCompacto();
        
       Scanner s = new Scanner(System.in);

       System.out.println("***Introduzca los datos del auto de lujo***" + "\n");
       System.out.println("Introduzca el numero de serie del motor: ");
       int a=s.nextInt();
       System.out.println("Introduzca la marca: ");
       String b=s.next();
       System.out.println("Introduzca el año: " );
       int c=s.nextInt();
       System.out.println("Introduzca el precio: ");
       double d=s.nextDouble();
       System.out.println("Introduzca la cantidad de pasajeros: ");
       int e=s.nextInt();
       x[0]=new AutoLujo(a,c,b,d);
       ((AutoLujo)x[0]).setCantidadPasajeros(e);
       System.out.println(x[0].mostrarDatos());

       System.out.println("***Introduzca los datos del vagon***"+"\n");
       System.out.println("Introduzca el numero de serie del motor: ");
       int f=s.nextInt();
       System.out.println("Introduzca la marca: ");
       String g=s.next();
       System.out.println("Introduzca el año: ");
       int h=s.nextInt();
       System.out.println("Introduzca el precio: ");
       double i=s.nextDouble();
       System.out.println("Introduzca la cantidad de pasajeros: ");
       int j=s.nextInt();
       x[2]=new Vagon(f,h,g,i);
       ((Vagon)x[2]).setCantidadPasajeros(j);
       System.out.println(x[2].mostrarDatos());

       System.out.println("***Introduzca los datos de la camioneta***"+"\n");
       System.out.println("Introduzca el numero de serie del motor: ");
       int k=s.nextInt();
       System.out.println("Introduzca la marca: ");
       String l=s.next();
       System.out.println("Introduzca el año: ");
       int m=s.nextInt();
       System.out.println("Introduzca el precio: ");
       double n=s.nextDouble();
       System.out.println("Introduzca la cantidad de carga: ");
       int o=s.nextInt();
       System.out.println("Introduzca la cantidad de ejes: ");
       int p=s.nextInt();
       System.out.println("Introduzca la cantidad de rodadas: ");
       int q=s.nextInt();
       x[3]=new Camioneta(k,m,l,n,o,p,q);

       System.out.println(x[3].mostrarDatos());
    }
}
    
