/*
Desarrolle una aplicación en Java que determine si alguno de los clientes de una tienda de departamentos se ha
excedido del límite de crédito en una cuenta. Para cada cliente se tienen los siguientes datos:
a) el saldo al inicio del mes.
b) el total de abonos en el mes.
c) el total de créditos aplicados a la cuenta del cliente en el mes.
d) el límite de crédito permitido.
El programa debe contar con estos datos cargados en variables de tipo entera, y debe calcular el nuevo saldo (= saldo
inicial + abonos - créditos), mostrar el nuevo balance y determinar si éste excede el límite de crédito del cliente.
Para los clientes cuyo límite de crédito sea excedido, el programa debe mostrar el mensaje "Se excedió el límite de su
crédito”.
 */
package Puntos;

import java.util.ArrayList;
import java.util.Scanner;
import objetos.Cliente;

public class Punto2 {    
    private ArrayList<Cliente> Clientes = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    public void Principal(){
        System.out.println("*************************************");
        System.out.println("Menu");
        System.out.println("1. Agregar Cliente");
        System.out.println("2. Mostrar balance");
        int op = sc.nextInt();
        switch(op){
            case 1: Agregar(); break;
            case 2: Mostrar(); break;
            default: System.out.println("error"); Principal(); break;
        }
        Principal();
    }
    private void Agregar(){
        System.out.println("*************************************");
        Cliente c = new Cliente();
        System.out.println("Ingrese el nombre del cliente: ");
        c.setNombreCliente(sc.next());
        System.out.println("Ingrese el saldo al inicio del mes: ");
        c.setSaldoInicial(sc.nextInt());
        System.out.println("Ingrese el total de abonos en el mes: ");
        c.setTotalAbonos(sc.nextInt());
        System.out.println("Ingrese el total de créditos aplicados a la cuenta del cliente en el mes: ");
        c.setCreditosAplicados(sc.nextInt());
        System.out.println("Ingrese el límite de crédito permitido: ");
        c.setLimiteCredito(sc.nextInt());;
        Clientes.add(c);
    }
    private void Mostrar(){
        System.out.println("*************************************");
        for (Cliente item : Clientes) {
            System.out.println("Nombre del Cliente: " + item.getNombreCliente());
            System.out.println("saldo al inicio del mes:" + item.getSaldoInicial());
            System.out.println("total de abonos en el mes:"  + item.getTotalAbonos());
            System.out.println("total de créditos aplicados a la cuenta del cliente en el mes:" + item.getCreditosAplicados());
            System.out.println("límite de crédito permitido: " + item.getLimiteCredito());
            System.out.println("El nuevo saldo es: " + item.getNuevoSaldo());
            System.out.println(item.getMensaje());
            System.out.println("*************************************");
        }
    }
    
}
