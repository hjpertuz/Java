package modelo;

import datos.ArchivoVentasBinImpl;
import datos.IArchivo;
import entidades.Venta;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ReporteVentasBin {

    private IArchivo datos;

    public ReporteVentasBin() {
        datos = new ArchivoVentasBinImpl();
    }

    public IArchivo getDatos() {
        return datos;
    }

    public void setDatos(ArchivoVentasBinImpl datos) {
        this.datos = datos;
    }

    private List<Venta> filtrarConsolidado(List<Venta> lista) throws IOException {
        List<Venta> listaConsolidado = new ArrayList<>();
        Venta venta = null;
        
        for (int i = 0; i < lista.size(); i++) {
            venta = lista.get(i);
            double subtotal = venta.getSubtotal();
            double descuento = venta.getDescuentoAplicado();
            double total = venta.getTotal();
            
            for (int j = i+1; j < lista.size();) {
                if(venta.getCodigoTienda().equals(lista.get(j).getCodigoTienda())){
                    subtotal +=lista.get(j).getSubtotal();
                    descuento +=lista.get(j).getDescuentoAplicado();
                    total +=lista.get(j).getTotal();  
                    
                    lista.remove(j); 
                }else{
                    j++;
                }  
            }
            venta.setSubtotal(subtotal);
            venta.setDescuentoAplicado(descuento);
            venta.setTotal(total);
            listaConsolidado.add(venta);
        }
        
        return listaConsolidado;
    }
    public void registrarLista(List<Venta> lista) throws IOException {
        List<Venta> listaConsolidado = filtrarConsolidado(lista);
        
        for (Venta venta : listaConsolidado) {
            System.out.println(venta.toString());
            this.datos.escribir(venta);
        }
    }
    public boolean registrarLista(Venta venta) throws IOException {
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

    public DefaultTableModel getTabla() throws IOException {

        String[] columnas = {"CODIGO TIENDA", "NOMBRE", "CIUDAD", "DTO", "SUBTOTAL CONSOLIDADO", "DESCUENTO CONSOLIDADO", "TOTAL CONSOLIDADO"};
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(columnas);

        String[] fila = new String[columnas.length];
        for (Venta venta : leer()) {
            fila[0] = venta.getCodigoTienda();
            fila[1] = venta.getNombreTienda();
            fila[2] = venta.getCiudad();
            fila[3] = venta.getDepartamento();
            fila[4] = "" + venta.getSubtotal();
            fila[5] = "" + venta.getDescuentoAplicado();
            fila[6] = "" + venta.getTotal();
            modelo.addRow(fila);
        }
        return modelo;
    }
}
