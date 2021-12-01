package modelo;

import datos.ArchivoVentasTextoImpl;
import datos.IArchivo;
import entidades.Venta;
import java.io.IOException;
import java.util.List;

public class ReporteVentasTexto {

    private IArchivo datos;

    public ReporteVentasTexto() {
        datos = new ArchivoVentasTextoImpl();
    }

    public IArchivo getDatos() {
        return datos;
    }

    public void setDatos(ArchivoVentasTextoImpl datos) {
        this.datos = datos;
    }

    public boolean registrar(Venta venta) throws IOException {
        if (venta.getCodigoTienda()== null || venta.getCodigoTienda().trim().length() == 0) {
            throw new NullPointerException("La cedula no debe estar vacia");
        }

        return this.datos.escribir(venta);
    }

    public List<Venta> leer() throws IOException {
        return this.datos.leer();
    }

    public Venta eliminar(String codigo) throws IOException {
        return this.datos.eliminar(codigo);
    }

    public Venta buscar(String codigo) throws IOException {
        return this.datos.buscar(codigo);
    }

}
