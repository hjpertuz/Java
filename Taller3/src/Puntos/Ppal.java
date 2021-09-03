
package Puntos;

import java.util.Scanner;

public class Ppal {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Elija un punto: ");
        System.out.println("1. Primer punto");
        System.out.println("2. Segundo punto");
        System.out.println("3. tercer punto");
        System.out.println("5. quinto punto");
        System.out.println("6. sexto punto");
        System.out.println("7. septimo punto");
        System.out.println("8. octavo punto");
        System.out.println("9. noveno punto");
        System.out.println("11. punto 11");
        int opcion = lector.nextInt();
        
        switch(opcion){
            case 1: new Punto1().proceso(); break;
            case 2: new Punto2().Principal();break;
            case 3: new Punto3().Principal();break;
            case 5: new Punto5().Principal();break;
            case 6: new Punto6().Principal();break;
            case 7: new Punto7().Principal();break;
            case 8: new Punto8().Principal();break;
            case 9: new Punto9().Principal();break;
            case 11: new Punto11().Principal();break;
            default: System.out.println("error"); break;
        }
    }
    
}
