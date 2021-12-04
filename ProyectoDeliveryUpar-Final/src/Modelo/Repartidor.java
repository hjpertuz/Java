
package Modelo;

import Datos.Datos;
import Datos.Pedido;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Modelo.ClientePedido;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;


public class Repartidor extends javax.swing.JFrame {

    ArrayList<Pedido> listaDatos;
    int filas;
    public Repartidor() {
        initComponents();
        listaDatos = new ArrayList<>();
        cargarDatos();
    }
    
        private void cargarDatos() {
            listaDatos = Datos.leerArchivoPedido();
        pintarTabla();
        }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        salirB = new javax.swing.JButton();
        atrasB = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPedido = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salirB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        salirB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirBMouseClicked(evt);
            }
        });
        jPanel1.add(salirB, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 40, 30));

        atrasB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        jPanel1.add(atrasB, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 340, 50, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("PEDIDOS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        tablaPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPedidoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaPedido);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 570, 230));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirBMouseClicked
        Bienvenida bvd = new Bienvenida();
        bvd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_salirBMouseClicked

    private void tablaPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPedidoMouseClicked
        
        /* try {
            int filaEditar = tablaPedido.getSelectedRow();
            Pedido e = listaDatos.get(filaEditar);
            //nºPaqueteT.setText(e.getNombre());
            //usuarioT.setText(e.getUsuario());
            //contraseñaT.setText(e.getContraseña());
        } catch (Exception e) {
        }*/
    }//GEN-LAST:event_tablaPedidoMouseClicked

    public void pintarTabla() {

        DefaultTableModel modeloTabla = new DefaultTableModel();
        String[] nombreColumnas = {"NºPaquete", "Fecha Ingreso", "Nombre", "Direccion", "NºVivienda", "Codigo Postal", "Telefono",
            "Nombre", "Direccion", "NºVivienda", "Pais", "Ciudad", "Telefono", 
            "Tipo", "Peso", "Largo", "Ancho", "Alto", "Descripcion", "Peso(Kg)", "Valor Declarado", 
            "fecha Limite", "Observaciones"
        };
        modeloTabla.setColumnIdentifiers(nombreColumnas);
        for (Pedido e : listaDatos) {
            String[] fila = {e.getNºpaquete(), e.getFechaIngreso(), e.getNombre(), e.getDireccion(), e.getNºVivienda(), e.getCodigoPostal(), e.getTelefono(),
            e.getNombre(), e.getDireccion(), e.getNºVivienda(), e.getPais(), e.getCiudad(), e.getTelefono(),
            e.getTipo(), e.getPeso(), e.getLargo(), e.getAncho(), e.getAlto(), e.getDescripcion(), e.getPeso(), e.getValorDeclarado(),
            e.getFechaLimite(), e.getObservaciones()};
            modeloTabla.addRow(fila);
        }
        tablaPedido.setModel(modeloTabla);

    }
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Repartidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton salirB;
    private javax.swing.JTable tablaPedido;
    // End of variables declaration//GEN-END:variables
}
