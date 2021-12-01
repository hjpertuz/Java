package datos;

import entidades.Venta;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArchivoVentasTextoImpl implements IArchivo {

    private File archivo;
    private FileWriter aEscritura;
    private Scanner aLectura;

    public ArchivoVentasTextoImpl() {
        this.archivo = new File("ReporteVentas.txt");
    }

    public ArchivoVentasTextoImpl(String name) {
        this.archivo = new File(name);
    }

    @Override
    public List<Venta> leer() throws IOException {
        List<Venta> lista = null;
        try {
            this.aLectura = new Scanner(this.archivo);
            lista = new ArrayList();
            while (this.aLectura.hasNext()) {
                String linea[] = this.aLectura.nextLine().split(";");
                Venta venta = this.leerVenta(linea);
                lista.add(venta);
            }
            return lista;

        } catch (FileNotFoundException ex) {
            throw new IOException("Error al leer el archivo");
        } finally {
            if (this.aLectura != null) {
                this.aLectura.close();
            }
        }
    }

    @Override
    public Venta buscar(String codigo) throws IOException {
        Venta buscado = null;

        try {
            this.aLectura = new Scanner(this.archivo);
            while (this.aLectura.hasNext()) {
                Venta venta = this.leerVenta(this.aLectura.nextLine().split(";"));
                if (venta.getCodigoTienda().equals(codigo)) {
                    buscado = venta;
                    break;
                }
            }
            return buscado;
        } catch (FileNotFoundException ex) {
            throw new IOException("No fue posible abrir el archivo para leer");
        } finally {
            if (this.aLectura != null) {
                this.aLectura.close();
            }
        }
    }

    @Override
    public Venta eliminar(String codigo) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean escribir(Venta venta) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public FileWriter getaEscritura() {
        return aEscritura;
    }

    public void setaEscritura(FileWriter aEscritura) {
        this.aEscritura = aEscritura;
    }

    public Scanner getaLectura() {
        return aLectura;
    }

    public void setaLectura(Scanner aLectura) {
        this.aLectura = aLectura;
    }

    public Venta leerVenta(String linea[]) {
        Venta venta = new Venta();
        venta.setCodigoTienda(linea[0]);
        venta.setNombreTienda(linea[1]);
        venta.setCiudad(linea[2]);
        venta.setDepartamento(linea[3]);
        venta.setNombreProducto(linea[4]);
        venta.setSubtotal(Double.parseDouble(linea[5]));
        venta.setDescuentoAplicado(Double.parseDouble(linea[6]));
        venta.setTotal(Double.parseDouble(linea[7]));
        return venta;
    }
}
