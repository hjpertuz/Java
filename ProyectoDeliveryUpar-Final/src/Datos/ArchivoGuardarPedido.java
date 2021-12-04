
package Datos;

import java.awt.HeadlessException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArchivoGuardarPedido {
    public static String guardarPedido(ArrayList<Pedido> lista1 ) {
        FileWriter archivo;
        PrintWriter escritor = null;
        String respuesta;
        try{
              archivo = new FileWriter("Datos_Pedido.txt");
               escritor = new PrintWriter(archivo);
               for(Pedido e:lista1){
      
        
        escritor = new PrintWriter(archivo);
        escritor.print(e.getNombre()+";");
        escritor.print(e.getDireccion()+";");
        escritor.print(e.getNºVivienda()+";");
        escritor.print(e.getPais()+";");
        escritor.print(e.getCiudad()+";");
        escritor.print(e.getTelefono()+";");
        escritor.print(e.getUsuario()+";");
        escritor.print(e.getContraseña()+";");
        escritor.print(e.getNºpaquete()+";");
        escritor.print(e.getFechaIngreso()+";");
        escritor.print(e.getCodigoPostal()+";");
        escritor.print(e.getTipo()+";");
        escritor.print(e.getPeso()+";");
        escritor.print(e.getLargo()+";");
        escritor.print(e.getAncho()+";");
        escritor.print(e.getAlto()+";");
        escritor.print(e.getDescripcion()+";");
        escritor.print(e.getValorDeclarado()+";");
        escritor.print(e.getFechaLimite()+";");
        escritor.print(e.getObservaciones()+";");
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
