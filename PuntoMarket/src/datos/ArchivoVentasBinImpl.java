
package datos;

import entidades.Venta;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;


public class ArchivoVentasBinImpl implements IArchivo{
    private File archivo;
    private FileOutputStream aEscritura;
    private FileInputStream aLectura;

    public ArchivoVentasBinImpl() {
        this.archivo = new File("ConsolidadosVentas.dat");
    }

    @Override
    public List<Venta> leer() throws IOException {
        VentaArrayList lista = this.leerLista();
        return lista.getLista();
    }

    @Override
    public Venta buscar(String codigo) throws IOException {
        VentaArrayList lista = this.leerLista();
        return lista.buscar(codigo);
    }

    @Override
    public Venta eliminar(String codigo) throws IOException {
        VentaArrayList lista = this.leerLista();
        Venta eliminado = lista.eliminar(codigo);
        this.guardarLista(lista);
        return eliminado;
    }

    @Override
    public boolean escribir(Venta venta) throws IOException {
        VentaArrayList lista = this.leerLista();
        lista.escribir(venta);
        return this.guardarLista(lista);
    }
    
    private boolean guardarLista(VentaArrayList lista) throws IOException{
        
        this.aEscritura = new FileOutputStream(this.archivo);
        ObjectOutputStream escritor = new ObjectOutputStream(this.aEscritura);
        escritor.writeObject(lista);
        escritor.close();
        this.aEscritura.close();
        return true;
    }
    private VentaArrayList leerLista()throws IOException{
       if(this.archivo.exists()){
           this.aLectura = new FileInputStream(this.archivo);
           ObjectInputStream lector = new ObjectInputStream(this.aLectura);
           try{
                VentaArrayList lista = (VentaArrayList)lector.readObject();
                return lista;
           }catch(ClassNotFoundException nfe){
               throw new IOException("Error al leer");
           } finally{
                   lector.close();
                   this.aLectura.close();
           }
       }
       else{
            return new VentaArrayList();
       }
    }
}
