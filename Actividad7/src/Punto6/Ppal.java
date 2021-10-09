
package Punto6;

import java.util.Scanner;

public class Ppal {

    public static void main(String[] args) {
        
        Empleado as= new Asalariado("",0,2520000);
        EmpleadoHora eh=new EmpleadoHora("", 0, 0, 0);
        EmpleadoComision ec=new EmpleadoComision("", 0, 0,0);
        AsalariadoComision ac=new AsalariadoComision("", 0, 0, 0);
        Scanner sc=new Scanner(System.in);
        int numero =1;
      
        while(numero<=5){
        System.out.println("ingrese la opcion: \n"+ 
                " 1) Asalariados "+ "\n" +
                " 2)Empleados por hora" + "\n" +
                " 3)Empleado por comision" + "\n" +
                " 4)Asalariado por comision" + "\n" +
                " 5)salir de la aplicacion");
        int op= sc.nextInt();
      
        if (op==1){
            System.out.println("ingrese su nombre: ");
            as.setNombre(sc.next());
            System.out.println("ingrese su identificacion: ");
            as.setIdentificacion(sc.nextInt());
            System.out.println("nombre:" + as.getNombre() + "\n id: "+as.getIdentificacion());
        
        as.pagar();
        numero ++;
        }
   
        if (op==2){
            System.out.println("ingrese su nombre: ");
            as.setNombre(sc.next());
            System.out.println("ingrese su identificacion: ");
            as.setIdentificacion(sc.nextInt());
            System.out.println("ingrese el numero de horas trabajadas: ");
            eh.setHora(sc.nextInt());
          
            System.out.println("nombre: "+as.getNombre() + "\n id: "+as.getIdentificacion());
          
            eh.pagar();
            numero ++;
      
        }
        
        if (op==3){
            System.out.println("ingrese su nombre: ");
            as.setNombre(sc.next());
            System.out.println("ingrese su identificacion: ");
            as.setIdentificacion(sc.nextInt());
            System.out.println("ingrese el valor de las ventas hechas: ");
            ec.setPorcentaje(sc.nextDouble());
            System.out.println("nombre: "+as.getNombre() + "\n id: "+as.getIdentificacion());
            ec.pagar();
            numero++;
        }
   
        if (op==4){
            System.out.println("ingrese su nombre: ");
            as.setNombre(sc.next());
            System.out.println("ingrese su identificacion: ");
            as.setIdentificacion(sc.nextInt());
            System.out.println("ingrese el valor de las ventas hechas: ");
            ac.setPorcentaje(sc.nextDouble());
            System.out.println("nombre: "+as.getNombre() + "\n id: "+as.getIdentificacion());
            ac.pagar();
            numero ++;
        }
      
        if (op==5){
            System.out.println("._.");
            break;
        }
        }
    }
}
