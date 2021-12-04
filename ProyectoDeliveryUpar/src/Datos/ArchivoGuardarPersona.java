
package Datos;

import java.awt.HeadlessException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArchivoGuardarPersona {
    public static String guardarPersonas(ArrayList<Persona> lista1 ) {
        FileWriter archivo;
        PrintWriter escritor = null;
        String respuesta;
        try{
              archivo = new FileWriter("Datos.txt");
               escritor = new PrintWriter(archivo);
               for(Persona e:lista1){
      
        
        escritor = new PrintWriter(archivo);
        escritor.print(e.getNombre()+";");
        escritor.print(e.getDireccion()+";");
        escritor.print(e.getNºVivienda()+";");
        escritor.print(e.getPais()+";");
        escritor.print(e.getCiudad()+";");
        escritor.print(e.getTelefono()+";");
        escritor.print(e.getUsuario()+";");
        escritor.print(e.getContraseña()+";");
        escritor.println();
               }
            JOptionPane.showMessageDialog(null, "DATOS GUARDADOS!!!");
            respuesta= " DATOS GUARDADOS ";
        }catch(HeadlessException | IOException error){
            System.out.println(error.getMessage());
            respuesta= "NO SE PUDO GUARDAR POR: "+error.getMessage();
        }finally{
            if(escritor != null){
                escritor.close();
            }
        }
        return respuesta;
    }  
}
