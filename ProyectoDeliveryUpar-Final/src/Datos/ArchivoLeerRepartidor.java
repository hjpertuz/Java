
package Datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class ArchivoLeerRepartidor {
    
    public static ArrayList<Repartidor> leerArchivoRepartidor(){
        File archivo;
        FileReader lector = null;
        BufferedReader lectorComodo;
       ArrayList<Repartidor> lista = new ArrayList<>();
        try{
              
        archivo = new File("Datos_Repartidor.txt");
        lector = new FileReader(archivo);
        lectorComodo = new BufferedReader(lector);  
        
        String linea, valores[];
           Repartidor repartidor;
        while((linea= lectorComodo.readLine())!=null){
            try{
                
            repartidor = new Repartidor();
            valores = linea.split(";");
            repartidor.setDocumento(valores[0]);
            repartidor.setNombre(valores[1]);
            repartidor.setZona(valores[2]);
            repartidor.setCategoria(valores[3]);
            repartidor.setUsuario(valores[4]);
            repartidor.setContraseña(valores[5]);
            lista.add(repartidor);
            }catch(Exception er){}
        }
        }catch(IOException error){
        }finally{
            if(lector!=null){
                try{
                lector.close();
                }catch(IOException e){}
            }
        }
        return lista;
  }
}
