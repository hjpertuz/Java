
package Datos;

import java.awt.HeadlessException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArchivoGuardarRepartidor {
    
     public static String guardarRepartidor(ArrayList<Repartidor> lista1 ) {
        FileWriter archivo;
        PrintWriter escritor = null;
        String respuesta;
        try{
              archivo = new FileWriter("Datos_Repartidor.txt");
               escritor = new PrintWriter(archivo);
               for(Repartidor e:lista1){
      
        
        escritor = new PrintWriter(archivo);
        escritor.print(e.getDocumento()+";");
        escritor.print(e.getNombre()+";");
        escritor.print(e.getZona()+";");
        escritor.print(e.getCategoria()+";");
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
