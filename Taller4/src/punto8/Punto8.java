/*
Crea una clase Libro que modele la información que se mantiene en una biblioteca sobre cada libro: título, primer
nombre, segundo nombre, primer apellido, ISBN, páginas, edición, editorial, ciudad, país y fecha de edición (String). La
clase debe proporcionar los siguientes servicios: getters y setters. Implementar una clase principal, en la cual, además
del método main, se debe implementar método para leer la información del Libro y método para mostrar su información.
Este último método mostrará la información del libro con este formato:
Título: Introduction to Java Programming
3a. edición
Autor: Liang, Y. Daniel
ISBN: 0-13-031997-X
Prentice-Hall, New Jersey (USA), viernes 16 de noviembre de 2001
784 páginas
*/
package punto8;

import java.util.ArrayList;
import java.util.Scanner;

public class Punto8 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Libro> Libros;
    public static void main(String[] args) {
        Libros = new ArrayList<>();
        menu();
    }
    public static void menu(){
        System.out.println("Menu");
        System.out.println("1. agregar un Libro");
        System.out.println("2. mostrar libros");
        int op = sc.nextInt();
        
        switch(op){
            case 1: agregar(); break;
            case 2: mostrar(); break;
            default: menu(); break;
        }
        menu();
    }
    public static void agregar(){
        Libro l = new Libro();
        System.out.println("Ingrese el titulo del libro");
        l.setTitulo(sc.next());
        sc.nextLine();
        System.out.println("Ingrese el primer nombre");
        l.setPrimerNombre(sc.next());
        sc.nextLine();
        System.out.println("Ingrese el segundo nombre");
        l.setSegundoNombre(sc.next());
        sc.nextLine();
        System.out.println("Ingrese el primer apellido");
        l.setPrimerApellido(sc.next());
        sc.nextLine();
        System.out.println("Ingrese el ISBN");
        l.setISBN(sc.next());
        sc.nextLine();
        System.out.println("Ingrese el Numero de paginas");
        l.setPaginas(sc.nextInt());
        sc.nextLine();
        System.out.println("Ingrese la edicion");
        l.setEdicion(sc.next());
        sc.nextLine();
        System.out.println("Ingrese la editorial");
        l.setEditorial(sc.next());
        sc.nextLine();
        System.out.println("Ingrese la ciudad");
        l.setCiudad(sc.next());
        sc.nextLine();
        System.out.println("Ingrese el pais");
        l.setPais(sc.next());
        sc.nextLine();
        System.out.println("Ingrese la fecha");
        l.setFechaEdicion(sc.next());
        Libros.add(l);
        sc.nextLine();
    }
    public static void mostrar(){
        for (Libro item : Libros) {
            System.out.println(item.toString());
        }
    }
}
