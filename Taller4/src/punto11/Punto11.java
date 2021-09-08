/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto11;

public class Punto11 {

    public static void main(String[] args) {
        Fraccion f1 = new Fraccion(5, 3);
        f1.Sumar(4, 2);
        System.out.println(f1.toString());
        Fraccion f2 = new Fraccion(5, 3);
        f2.Restar(4, 2);
        System.out.println(f2.toString());
        Fraccion f3 = new Fraccion(5, 3);
        f3.Multiplicar(4, 2);
        System.out.println(f3.toString());
        Fraccion f4 = new Fraccion(5, 3);
        f4.Dividir(4, 2);
        System.out.println(f4.toString());
    }
    
}
