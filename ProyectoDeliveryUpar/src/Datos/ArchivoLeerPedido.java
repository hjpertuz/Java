
package Datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivoLeerPedido {
    public static ArrayList<Pedido> leerArchivoPedido(){
        File archivo;
        FileReader lector = null;
        BufferedReader lectorComodo;
       ArrayList<Pedido> lista = new ArrayList<>();
        try{
              
        archivo = new File("Datos_Pedidos.txt");
        lector = new FileReader(archivo);
        lectorComodo = new BufferedReader(lector);  
        
        String linea, valores[];
           Pedido pedido;
        while((linea= lectorComodo.readLine())!=null){
            try{
                
            pedido = new Pedido();
            valores = linea.split(";");
           
            pedido.setNombre(valores[0]);
            pedido.setDireccion(valores[1]);
            pedido.setNºVivienda(valores[2]);
            pedido.setPais(valores[3]);
            pedido.setCiudad(valores[4]);
            pedido.setTelefono(valores[5]);
            pedido.setUsuario(valores[6]);
            pedido.setContraseña(valores[7]);
            pedido.setNºpaquete(valores[8]);
            pedido.setFechaIngreso(valores[9]);
            pedido.setCodigoPostal(valores[10]);
            pedido.setTipo(valores[11]);
            pedido.setPeso(valores[12]);
            pedido.setLargo(valores[13]);
            pedido.setAncho(valores[14]);
            pedido.setAlto(valores[15]);
            pedido.setDescripcion(valores[16]);
            pedido.setValorDeclarado(valores[17]);
            pedido.setFechaLimite(valores[18]);
            pedido.setObservaciones(valores[19]);
            lista.add(pedido);
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
