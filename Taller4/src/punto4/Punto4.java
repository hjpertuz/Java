/*
Crear una clase Coche, a través de la cual se pueda conocer el color del coche, la marca, el modelo, el número de
caballos, el número de puertas y la matricula. Crear el constructor del coche, así como los métodos que considere
necesarios. Crear una clase PruebaCoche que instancie varios coches, cambiándole el color a lo largo de la vida a
algunos de ellos y mostrándolo por pantalla
 */
package punto4;

public class Punto4 {

    public static void main(String[] args) {
        Coche carro1 = new Coche("rojo", "renault", "Megane", 135, 4, "asd997");
        Coche carro2 = new Coche("azul", "renault", "Mobilize Limo", 500, 4, "jkl001");
        Coche carro3 = new Coche("negro", "mazda", "CX-30", 135, 4, "mnd002");
        System.out.println(carro1.toString());
        System.out.println(carro2.toString());
        System.out.println(carro3.toString());
        carro1.setColor("azul");
        carro2.setColor("verde");
        carro3.setColor("blanco");
        System.out.println(carro1.toString());
        System.out.println(carro2.toString());
        System.out.println(carro3.toString());
    }
    
}
