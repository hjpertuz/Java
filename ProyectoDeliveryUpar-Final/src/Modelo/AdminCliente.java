
package Modelo;

import java.util.ArrayList;
import Datos.Datos;
import Datos.Persona;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AdminCliente extends javax.swing.JFrame {

    ArrayList<Persona> listaDatos;
    int filas;
    
    public AdminCliente() {
        initComponents();
        listaDatos = new ArrayList<>();
        cargarDatos();
    }
    
    private void cargarDatos() {
        listaDatos = Datos.leerArchivoPersona();
        pintarTabla();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        salirB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombreT = new javax.swing.JTextField();
        usuarioT = new javax.swing.JTextField();
        contraseñaT = new javax.swing.JPasswordField();
        guadarB = new javax.swing.JButton();
        atrasB = new javax.swing.JButton();
        editarB = new javax.swing.JButton();
        eliminarB = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
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

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre y Apellido", "Usuario", "Contraseña"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 580, 90));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("CREAR CLIENTE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nombre y Apellido:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Usuario:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Contraseña:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        nombreT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreTKeyTyped(evt);
            }
        });
        jPanel1.add(nombreT, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 110, -1));

        usuarioT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usuarioTKeyTyped(evt);
            }
        });
        jPanel1.add(usuarioT, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 110, -1));
        jPanel1.add(contraseñaT, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 110, -1));

        guadarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        guadarB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guadarBMouseClicked(evt);
            }
        });
        jPanel1.add(guadarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 60, 40));

        atrasB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        atrasB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atrasBMouseClicked(evt);
            }
        });
        jPanel1.add(atrasB, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 60, 40));

        editarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        editarB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarBMouseClicked(evt);
            }
        });
        jPanel1.add(editarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 60, 40));

        eliminarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.png"))); // NOI18N
        eliminarB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarBMouseClicked(evt);
            }
        });
        jPanel1.add(eliminarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 60, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cliente.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 130, 130));

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

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        try {
            int filaEditar = Tabla.getSelectedRow();
            Persona e = listaDatos.get(filaEditar);
            nombreT.setText(e.getNombre());
            usuarioT.setText(e.getUsuario());
            contraseñaT.setText(e.getContraseña());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_TablaMouseClicked

    private void guadarBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guadarBMouseClicked
        
        Datos.guardarPersonas(listaDatos);
        String nom, us, cont;
        if ( nombreT.getText().equals("") || usuarioT.getText().equals("") || contraseñaT.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "ERROR CAMPOS VACIOS");
            } else {         
                try {    
                nom = nombreT.getText().trim();
                us = usuarioT.getText().trim();
                cont = contraseñaT.getText().trim();

                if (validarUsuario(us)) {
                    JOptionPane.showMessageDialog(rootPane, "ERROR YA EL USUARIO EXISTE");
                } else {
                    Persona p = new Persona();
                    p.setNombre(nom);
                    p.setUsuario(us);
                    p.setContraseña(cont);
                    listaDatos.add(p);
                    pintarTabla();
                    limpiar();
        }
                
                } catch (Exception e) {
            }   
        }     
    }//GEN-LAST:event_guadarBMouseClicked

    private void eliminarBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarBMouseClicked
        eliminar();
    }//GEN-LAST:event_eliminarBMouseClicked

    private void editarBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarBMouseClicked
       editar();
    }//GEN-LAST:event_editarBMouseClicked

    private void nombreTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreTKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c) == false) {
        }else{
            evt.consume();
            JOptionPane.showMessageDialog(null, "NO SE PUEDE INGRESAR NUMEROS!!!", "", JOptionPane.ERROR_MESSAGE);   
        } 
    }//GEN-LAST:event_nombreTKeyTyped

    private void usuarioTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioTKeyTyped
       
    }//GEN-LAST:event_usuarioTKeyTyped

    private void atrasBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasBMouseClicked
        AdminRegistros ars = new AdminRegistros();
        ars.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_atrasBMouseClicked

    private void salirBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirBMouseClicked
        Bienvenida bvd = new Bienvenida();
        bvd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_salirBMouseClicked

    public void limpiar() {
        nombreT.setText("");
        usuarioT.setText("");
        contraseñaT.setText("");
        usuarioT.requestFocus();
    }
    
    public void eliminar() {
        if ( nombreT.getText().equals("") || usuarioT.getText().equals("") || contraseñaT.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "NO HA SELECIONADO DATOS");
        } else {

        int filaEliminar = Tabla.getSelectedRow();
        listaDatos.remove(filaEliminar);
        pintarTabla();
        limpiar();
    }
    }
    
    private void editar(){
        String usuario;

        usuario = usuarioT.getText().trim();
        if ( nombreT.getText().equals("") || usuarioT.getText().equals("") || contraseñaT.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "NO HA SELECIONADO DATOS");
        } else {
            if (validarUsuario(usuario)) {
                JOptionPane.showMessageDialog(rootPane, "ERROR YA EXISTE EL USUARIO");

            } else {
                try {
                    int filaEditar = Tabla.getSelectedRow();
                    Persona e = new Persona();

                    e.setUsuario(usuario);
                    e.setNombre(nombreT.getText().trim());
                    e.setUsuario(usuarioT.getText().trim());
                    e.setContraseña(contraseñaT.getText().trim());
                    listaDatos.set(filaEditar, e);
                    pintarTabla();
                    limpiar();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, "ERROR telefono celular y identificacion solo acepta numeros");
                }
            }
        }
    }
    
    private boolean validarUsuario(String usuario) {
        for (Persona e : listaDatos) {
            if (e.getUsuario().equals(usuario)) {
                return true;
            }
        }

        return false;
    }
    
    public void pintarTabla() {

        DefaultTableModel modeloTabla = new DefaultTableModel();
        String[] nombreColumnas = {"Nombre", "Usuario", "Contraseña"};
        modeloTabla.setColumnIdentifiers(nombreColumnas);
        for (Persona e : listaDatos) {
            String[] fila = {e.getNombre(), e.getUsuario(), e.getContraseña()};
            modeloTabla.addRow(fila);
        }
        Tabla.setModel(modeloTabla);

    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AdminCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton atrasB;
    private javax.swing.JPasswordField contraseñaT;
    private javax.swing.JButton editarB;
    private javax.swing.JButton eliminarB;
    private javax.swing.JButton guadarB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreT;
    private javax.swing.JButton salirB;
    private javax.swing.JTextField usuarioT;
    // End of variables declaration//GEN-END:variables
}
