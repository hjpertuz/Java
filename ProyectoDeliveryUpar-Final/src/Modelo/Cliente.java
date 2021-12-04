
package Modelo;


public class Cliente extends javax.swing.JFrame {

   
    public Cliente() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pedidoB = new javax.swing.JButton();
        estadoB = new javax.swing.JButton();
        historialB = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        salirB = new javax.swing.JButton();
        atrasB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pedidoB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pedido.png"))); // NOI18N
        pedidoB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pedidoBMouseClicked(evt);
            }
        });
        jPanel1.add(pedidoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 120, 100));

        estadoB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Estado.png"))); // NOI18N
        estadoB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                estadoBMouseClicked(evt);
            }
        });
        jPanel1.add(estadoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 120, 100));

        historialB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Historial.png"))); // NOI18N
        historialB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                historialBMouseClicked(evt);
            }
        });
        jPanel1.add(historialB, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 120, 100));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Historial de Pedidos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Hacer un Pedido");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Estado del Pedido");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));

        salirB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        salirB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirBMouseClicked(evt);
            }
        });
        jPanel1.add(salirB, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 40, 30));

        atrasB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        atrasB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atrasBMouseClicked(evt);
            }
        });
        jPanel1.add(atrasB, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 50, 40));

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

    private void atrasBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasBMouseClicked
        ClienteLoguin cll = new ClienteLoguin();
        cll.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_atrasBMouseClicked

    private void pedidoBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pedidoBMouseClicked
        ClientePedido cpo = new ClientePedido();
        cpo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pedidoBMouseClicked

    private void estadoBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estadoBMouseClicked
        ClienteEstadoPedido cep = new ClienteEstadoPedido();
        cep.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_estadoBMouseClicked

    private void historialBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historialBMouseClicked
        ClienteHistorial ch = new ClienteHistorial();
        ch.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_historialBMouseClicked

   
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasB;
    private javax.swing.JButton estadoB;
    private javax.swing.JButton historialB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton pedidoB;
    private javax.swing.JButton salirB;
    // End of variables declaration//GEN-END:variables
}
