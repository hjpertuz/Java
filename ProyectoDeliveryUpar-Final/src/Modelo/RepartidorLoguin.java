
package Modelo;

import javax.swing.JOptionPane;
import Datos.Repartidor;
import java.awt.HeadlessException;


public class RepartidorLoguin extends javax.swing.JFrame {

    public RepartidorLoguin() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        salirB = new javax.swing.JButton();
        atrasB = new javax.swing.JButton();
        entrarB = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombreT = new javax.swing.JTextField();
        contraseñaT = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
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
        jPanel1.add(atrasB, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 50, 40));

        entrarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Entrar.png"))); // NOI18N
        entrarB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarBMouseClicked(evt);
            }
        });
        jPanel1.add(entrarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 50, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nombre de Usuario:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Contraseña:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));
        jPanel1.add(nombreT, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 110, -1));
        jPanel1.add(contraseñaT, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 110, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Repartidor.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 130, 150));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("BIENVENIDO REPARTIDOR");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

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
        Bienvenida bvd = new Bienvenida();
        bvd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_atrasBMouseClicked

    private void entrarBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarBMouseClicked
        ingreso();
    }//GEN-LAST:event_entrarBMouseClicked

    public void ingreso(){
        String usuario = nombreT.getText(), contra = contraseñaT.getText();
        String usuarioIngresado = "", claveIngresada = "";
        try{
           usuarioIngresado = nombreT.getText();
           claveIngresada = contraseñaT.getText();
           
        if(usuarioIngresado.equals(usuario)== false || claveIngresada.equals(contra)== false){
            JOptionPane.showMessageDialog(null, "DATOS INCORRECTOS","",JOptionPane.ERROR_MESSAGE);
        
        }else{
           JOptionPane.showMessageDialog(null, "BIENVENIDO!!");
           this.dispose();
            Modelo.Repartidor rpr = new Modelo.Repartidor();
            rpr.setVisible(true);
       }
        }catch(HeadlessException e){
        e.printStackTrace();
    }
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RepartidorLoguin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RepartidorLoguin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RepartidorLoguin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RepartidorLoguin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RepartidorLoguin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasB;
    private javax.swing.JPasswordField contraseñaT;
    private javax.swing.JButton entrarB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombreT;
    private javax.swing.JButton salirB;
    // End of variables declaration//GEN-END:variables
}
