
package datos;

import entidades.Venta;
import java.io.IOException;
import java.util.List;

public interface IArchivo {
    public List<Venta> leer() throws IOException;
     public Venta buscar(String codigo) throws IOException ;
     public Venta eliminar(String codigo) throws IOException;
     public boolean escribir (Venta venta) throws IOException;
}
