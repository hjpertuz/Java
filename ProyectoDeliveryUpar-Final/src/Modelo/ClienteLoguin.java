
package Modelo;

import Datos.Datos;
import Datos.Persona;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ClienteLoguin extends javax.swing.JFrame {

   
    public ClienteLoguin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        salirB = new javax.swing.JButton();
        entrarB = new javax.swing.JButton();
        atrasB = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombreT = new javax.swing.JTextField();
        contraseñaT = new javax.swing.JPasswordField();
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

        entrarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Entrar.png"))); // NOI18N
        entrarB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarBMouseClicked(evt);
            }
        });
        entrarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarBActionPerformed(evt);
            }
        });
        jPanel1.add(entrarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 50, 40));

        atrasB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        atrasB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atrasBMouseClicked(evt);
            }
        });
        jPanel1.add(atrasB, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 50, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("BIENVENIDO CLIENTE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cliente.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Nombre de Usuario:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Contraseña:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, 20));
        jPanel1.add(nombreT, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 110, -1));
        jPanel1.add(contraseñaT, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 110, -1));

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

    private void entrarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entrarBActionPerformed

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
           Cliente cli = new Cliente();
           cli.setVisible(true);
       }
        }catch(HeadlessException e){
        e.printStackTrace();
    }
    }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteLoguin().setVisible(true);
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
