
package Punto8;

import java.util.Scanner;


public class Ppal {

    public static void main(String[] args) {
        
        String [] nombres= {"A","B","C","D","E","F","G","H","I","J"};
        String [] apellidos = {"AA","BB","CC","DD","EE","FF","GG","HH","II","JJ"};
        String nif,numero;
        Scanner sc = new Scanner (System.in); 
        int numCliente=0,saldo,numfondos,numFondos,numCuenta;
        double saldoMensual;
         System.out.println("***CLIENTE***");
         
            do{
                numCliente=(int)(Math.random()*10);
            }while(numCliente<1);
            
        Cliente []miCliente = new Cliente[numCliente];
        for (int i = 0; i < numCliente; i++) {
            Fondo miFondo = new Fondo();
            nif = String.valueOf((int)(Math.random()*10000)); 
            numCuenta=(int)(Math.random()*10);
            do{
               saldo=(int)(Math.random()*1000); 
            }while(saldo<100);
            miCliente[i] = new Cliente(nif,nombres[(int)(Math.random()*10)],apellidos[(int)(Math.random()*10)],numCuenta,saldo);
        }
        for (int i = 0; i < numCliente; i++) {
            System.out.print(" \n C. N°: "+(i+1) + "\n" + miCliente[i].toString());   
        }
        
        ClientePreferente []miPreferente = new ClientePreferente[numCliente];
        System.out.println(" \n ***CLIENTE PREFERENTE***");
        
              do{
                numCliente=(int)(Math.random()*10);
            }while(numCliente<1); 
               
        
        for (int i = 0; i < numCliente; i++) {
            nif = String.valueOf((int)(Math.random()*10000));
            numCuenta=(int)(Math.random()*10);
            do{
               saldo=(int)(Math.random()*1000); 
            }while(saldo<100);
               
            
                miPreferente[i] = new ClientePreferente(nif,nombres[(int)(Math.random()*10)],apellidos[(int)(Math.random()*10)],numCuenta,saldo);
                System.out.println(" \n C.P. N°: " + (i+1) + "\n" + miPreferente[i].toString());
                Fondo miFondo = new Fondo();
                System.out.print("Ingrese el numero de fondo: ");
                
                do{
                    numfondos=sc.nextInt();
                }while(numfondos<1);
                
                for (int j = 0; j < numfondos; j++) {
                    System.out.println("Ingresandofondo N°: " + (j+1));
                    System.out.print(" Ingrese el numero de fondo: ");
                    numero=String.valueOf(sc.next());
                    System.out.print(" Ingrese el saldo mensual: ");
                    do{
                        saldoMensual=sc.nextDouble();
                    }while(saldoMensual<1);
                    miFondo.setNumero(numero);
                    miFondo.setSaldoMensual(saldoMensual);
                    System.out.println( miFondo.toString());
                }
               
            } 
        }
}
   
