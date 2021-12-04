
package Datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivoLeerPersona {
    public static ArrayList<Persona> leerArchivoPersona(){
        File archivo;
        FileReader lector = null;
        BufferedReader lectorComodo;
       ArrayList<Persona> lista = new ArrayList<>();
        try{
              
        archivo = new File("Datos.txt");
        lector = new FileReader(archivo);
        lectorComodo = new BufferedReader(lector);  
        
        String linea, valores[];
           Persona persona;
        while((linea= lectorComodo.readLine())!=null){
            try{
                
            persona = new Persona();
            valores = linea.split(";");
           
            persona.setNombre(valores[0]);
            persona.setDireccion(valores[1]);
            persona.setNºVivienda(valores[2]);
            persona.setPais(valores[3]);
            persona.setCiudad(valores[4]);
            persona.setTelefono(valores[5]);
            persona.setUsuario(valores[6]);
            persona.setContraseña(valores[7]);
            lista.add(persona);
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
