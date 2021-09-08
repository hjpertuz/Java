/*
Diseñe e implemente en Java una clase que permita simular el movimiento de caída libre de un cuerpo. Defina las
variables que considere necesarias, método constructor, getter y setter, método miembros que permitan conocer la
distancia recorrida por el cuerpo en un tiempo t, y la velocidad final alcanzada. Cree una clase principal, instancia un
objeto y demuestre su comportamiento.
*/
package punto12;

public class Punto12 {

    public static void main(String[] args) {
        System.out.println(new Movimiento(0, 6.5).toString());
        System.out.println(new Movimiento(0, 5.5).toString());
        System.out.println(new Movimiento(11, 7.3).toString());
    }
    
}
