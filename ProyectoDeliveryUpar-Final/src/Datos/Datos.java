
package Datos;

import java.util.ArrayList;


public class Datos {
    
    public static ArrayList<Persona> leerArchivoPersona(){
        return ArchivoLeerPersona.leerArchivoPersona();
    }
    
     public static String guardarPersonas(ArrayList<Persona> lista1){
        return ArchivoGuardarPersona.guardarPersonas(lista1);
    }
     
     public static ArrayList<Pedido> leerArchivoPedido(){
        return ArchivoLeerPedido.leerArchivoPedido();
    }
    
     public static String guardarPedido(ArrayList<Pedido> lista1){
        return ArchivoGuardarPedido.guardarPedido(lista1);
    }
     
     public static ArrayList<Repartidor> leerArchivoRepartidor(){
        return ArchivoLeerRepartidor.leerArchivoRepartidor();
    }
    
     public static String guardarRepartidor(ArrayList<Repartidor> lista1){
        return ArchivoGuardarRepartidor.guardarRepartidor(lista1);
    }
     
}
