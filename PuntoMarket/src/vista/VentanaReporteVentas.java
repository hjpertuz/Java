package vista;

import entidades.Venta;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import modelo.ReporteVentasBin;
import modelo.ReporteVentasTexto;


public class VentanaReporteVentas extends JDialog {

    private Container contenedor;
    private JPanel panelBase, panelBotones;
    private JScrollPane panelResultado;
    private JTable tabla;
    private JButton bReporte;
    private DefaultTableModel modeloTabla;
    private String titulos[] = {"CODIGO TIENDA", "NOMBRE", "CIUDAD", "DTO", "SUBTOTAL CONSOLIDADO", "DESCUENTO CONSOLIDADO", "TOTAL CONSOLIDADO"};
    private ReporteVentasBin modeloBin;
    private ReporteVentasTexto modeloTexto;

    public VentanaReporteVentas(JFrame frame, boolean bln) {
        super(frame, bln);
        this.modeloBin = new ReporteVentasBin();
        this.modeloTexto = new ReporteVentasTexto();
        this.setTitle("REPORTE DE VENTAS - PUNTO MARKET");
        this.iniciarComponentes();
        //this.pack(); 
        this.setSize(800, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    public void iniciarComponentes() {
        this.contenedor = this.getContentPane();
        this.panelBase = new JPanel();
        this.panelBase.setLayout(new BorderLayout());
        this.panelBase.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        initPanelBotones();
        this.iniciarPanelResultado();
        this.contenedor.add(this.panelBase);
    }

    public void initPanelBotones() {

        this.panelBotones = new JPanel();

        panelBotones.setLayout(new FlowLayout(FlowLayout.LEFT));

        this.bReporte = new JButton("Cargar Reporte de ventas");
        this.bReporte.addActionListener(new clickBotonReporte());

        this.panelBotones.add(bReporte);

        this.panelBase.add(this.panelBotones, BorderLayout.NORTH);

    }



    public void iniciarPanelResultado() {

        this.panelResultado = new JScrollPane();

        this.tabla = new JTable();
        this.modeloTabla = new DefaultTableModel(null, this.titulos);
        this.tabla.setModel(modeloTabla);
        this.panelResultado.setViewportView(this.tabla);

        this.panelBase.add(this.panelResultado, BorderLayout.CENTER);

    }

    //escuchador evento click para boton guardar
    class clickBotonReporte implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //System.out.println("Click en guardar");
            accionBotonReporte();
        }

    }

    private void accionBotonReporte() {
        try {
            List<Venta> listaVentas = modeloTexto.leer();
            modeloBin.registrarLista(listaVentas);
            JOptionPane.showMessageDialog(null, "Consolidado exitoso");
            cargarTabla();
        } catch (IOException ex) {
            VentanaEmergente.msgConfirmacion("Excepcion", ex.getMessage(), JOptionPane.ERROR_MESSAGE, this);
        }
    }

    private void cargarTabla() {
        try {
            tabla.setModel(modeloBin.getTabla());
        } catch (IOException ex) {
            VentanaEmergente.msgConfirmacion("Excepcion", ex.getMessage(), JOptionPane.ERROR_MESSAGE, this);
            
        }
    }

}
