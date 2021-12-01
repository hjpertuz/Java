
package datos;

import entidades.Venta;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class VentaArrayList implements IArchivo, Serializable{

    private final ArrayList<Venta> lista;
    public VentaArrayList() {
        lista = new ArrayList<>();
    }

    
    @Override
    public List<Venta> leer() throws IOException {
        return this.getLista();
    }

    @Override
    public Venta buscar(String codigo) throws IOException {
        for(Venta v: this.getLista()){
            if(v.getCodigoTienda().equals(codigo)){
                return v;
            }
        }
        return null;
    }

    @Override
    public Venta eliminar(String codigo) throws IOException {
        Iterator<Venta> i = this.getLista().iterator();
        while(i.hasNext()){
            Venta venta = i.next();
            if(venta.getCodigoTienda().equals(codigo)){
                i.remove();
                return venta;
            }
        }
        return null;}

    @Override
    public boolean escribir(Venta venta) throws IOException {
        return this.getLista().add(venta);
    }
    public List<Venta> getLista() {
        return lista;
    }
}
