
package Modelo;

import Datos.ArchivoLeerPedido;
import Datos.Datos;
import Datos.Pedido;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClienteEstadoPedido extends javax.swing.JFrame {

    ArrayList<Pedido> listaDatos;
    int filas;
    
    public ClienteEstadoPedido() {
        initComponents();
        listaDatos = new ArrayList<>();
        
        datosPaqueteT.setEditable(false);
        fechaVisitaT.setEditable(false);
        horaVisitaT.setEditable(false);
        datosRepartidor.setEditable(false);
        datosPaqueteT.setEditable(false);
        entregarT.setEditable(false);
        personaRecibeT.setEditable(false);
        observacionT.setEditable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        salirB = new javax.swing.JButton();
        atrasB = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        datosPaqueteT = new javax.swing.JTextField();
        fechaVisitaT = new javax.swing.JTextField();
        horaVisitaT = new javax.swing.JTextField();
        datosRepartidor = new javax.swing.JTextField();
        entregarT = new javax.swing.JTextField();
        personaRecibeT = new javax.swing.JTextField();
        observacionT = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        nºPaqueteT = new javax.swing.JTextField();
        buscarB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salirB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        salirB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirBMouseClicked(evt);
            }
        });
        jPanel1.add(salirB, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 30, 30));

        atrasB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        atrasB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atrasBMouseClicked(evt);
            }
        });
        jPanel1.add(atrasB, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("ESTADO DEL PEDIDO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Datos del Paquete:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Fecha de Visita:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Hora de Visita:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Datos del Repartidor:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("La Entrega Fue Posible:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Persona que Recibe:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Observacion:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));
        jPanel1.add(datosPaqueteT, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 120, -1));
        jPanel1.add(fechaVisitaT, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 140, -1));
        jPanel1.add(horaVisitaT, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 140, -1));
        jPanel1.add(datosRepartidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 100, -1));
        jPanel1.add(entregarT, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 90, -1));
        jPanel1.add(personaRecibeT, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 110, -1));
        jPanel1.add(observacionT, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 160, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("NºPaquete:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));
        jPanel1.add(nºPaqueteT, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 160, -1));

        buscarB.setText("Buscar");
        buscarB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarBMouseClicked(evt);
            }
        });
        jPanel1.add(buscarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

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

    private void buscarBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarBMouseClicked
        buscar();
    }//GEN-LAST:event_buscarBMouseClicked

    private void salirBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirBMouseClicked
        ClienteLoguin cll = new ClienteLoguin();
        cll.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_salirBMouseClicked

    private void atrasBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasBMouseClicked
        Cliente cll = new Cliente();
        cll.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_atrasBMouseClicked

    public void buscar() {
        try {
            int validar = 0;
            String pedidos = nºPaqueteT.getText().trim();

            ArrayList<Pedido> listas = ArchivoLeerPedido.leerArchivoPedido();

            int pedido = Integer.parseInt(nºPaqueteT.getText());

            if (listas != null) {
                if (pedido > 0) {
                    for (Pedido ped : listas) {
                        if (ped.getNºpaquete().trim().equals(pedidos)) {
                            validar = 1;
                            JOptionPane.showMessageDialog(rootPane, "PEDIDO ENCONTRADO");
                            datosPaqueteT.setText(ped.getTipo());
                            fechaVisitaT.setText(ped.getFechaVisita());
                            horaVisitaT.setText(ped.getHoraVisita());
                            datosRepartidor.setText(ped.getDatosRepartidor());
                            entregarT.setText(ped.getEntregar());
                            personaRecibeT.setText(ped.getNombre());
                            observacionT.setText(ped.getObservaciones());
                        }

                    }
                    if (validar == 0) {

                        JOptionPane.showMessageDialog(rootPane, "PEDIDO NO REGISTRADO");
                        int valor = JOptionPane.showConfirmDialog(rootPane, "DESEA REGISTRAR UN PEDIDO");
                        
                        if (valor == JOptionPane.YES_OPTION) {
                            ClientePedido clp = new ClientePedido();
                            clp.setVisible(true);
                            this.dispose();
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "PEDIDO DEBE SER EN NUMEROS");
                }
            } else {
                JOptionPane.showMessageDialog(null, "NO HAY PEDIDOS REGISTRADOS");
            }
        } catch (NumberFormatException e) {

        }

    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteEstadoPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasB;
    private javax.swing.JButton buscarB;
    private javax.swing.JTextField datosPaqueteT;
    private javax.swing.JTextField datosRepartidor;
    private javax.swing.JTextField entregarT;
    private javax.swing.JTextField fechaVisitaT;
    private javax.swing.JTextField horaVisitaT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nºPaqueteT;
    private javax.swing.JTextField observacionT;
    private javax.swing.JTextField personaRecibeT;
    private javax.swing.JButton salirB;
    // End of variables declaration//GEN-END:variables
}
