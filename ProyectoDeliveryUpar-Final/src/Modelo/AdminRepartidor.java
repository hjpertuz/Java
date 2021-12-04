
package Modelo;

import Datos.Datos;
import Datos.Repartidor;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdminRepartidor extends javax.swing.JFrame {

    ArrayList<Repartidor> listaDatos;
    int filas;
    
    public AdminRepartidor() {
        initComponents();
        listaDatos = new ArrayList<>();
        cargarDatos();
    }
    
    private void cargarDatos() {
        listaDatos = Datos.leerArchivoRepartidor();
        pintarTabla();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRepartidor = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        contraseñaT = new javax.swing.JPasswordField();
        usuarioT = new javax.swing.JTextField();
        nombreT = new javax.swing.JTextField();
        categoriaC = new javax.swing.JComboBox<>();
        zonaC = new javax.swing.JComboBox<>();
        documentoT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        salirB = new javax.swing.JButton();
        guardarB = new javax.swing.JButton();
        editarB = new javax.swing.JButton();
        eliminarB = new javax.swing.JButton();
        atrasB = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaRepartidor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nº Documento", "Nombre y Apellido", "Zona de Entrega", "Categoria", "Usuario", "Contraseña"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaRepartidor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaRepartidorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaRepartidor);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 580, 90));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nº Documento:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nombre y Apellido:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Zona de Entregas Asignadas:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Categoria:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Usuario:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Contraseña:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));
        jPanel1.add(contraseñaT, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 110, -1));
        jPanel1.add(usuarioT, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 110, -1));

        nombreT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreTKeyTyped(evt);
            }
        });
        jPanel1.add(nombreT, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 110, -1));

        categoriaC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione: ", "A", "B", "C" }));
        jPanel1.add(categoriaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 110, -1));

        zonaC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione: ", "Valledupar", "Barraquilla", "Medellin" }));
        jPanel1.add(zonaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 110, -1));

        documentoT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                documentoTKeyTyped(evt);
            }
        });
        jPanel1.add(documentoT, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 110, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Repartidor.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 140, 140));

        salirB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        salirB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirBMouseClicked(evt);
            }
        });
        jPanel1.add(salirB, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 30, 30));

        guardarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        guardarB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarBMouseClicked(evt);
            }
        });
        jPanel1.add(guardarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 60, -1));

        editarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        editarB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarBMouseClicked(evt);
            }
        });
        jPanel1.add(editarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 60, -1));

        eliminarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.png"))); // NOI18N
        eliminarB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarBMouseClicked(evt);
            }
        });
        jPanel1.add(eliminarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 60, 40));

        atrasB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        atrasB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atrasBMouseClicked(evt);
            }
        });
        jPanel1.add(atrasB, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 60, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("CREAR REPARTIDOR");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

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
        AdminRegistros ars = new AdminRegistros();
        ars.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_atrasBMouseClicked

    private void guardarBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarBMouseClicked
        Datos.guardarRepartidor(listaDatos);
        String doc, nom, zon, cat, us, cont;
        if ( documentoT.getText().equals("") || nombreT.getText().equals("") || zonaC.getSelectedItem().equals("") || categoriaC.getSelectedItem().equals("") || usuarioT.getText().equals("") || contraseñaT.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "ERROR CAMPOS VACIOS");
            } else {         
                try {    
                doc = documentoT.getText().trim();
                nom = nombreT.getText().trim();
                zon = zonaC.getSelectedItem().toString().trim();
                cat = categoriaC.getSelectedItem().toString().trim();
                us = usuarioT.getText().trim();
                cont = contraseñaT.getText().trim();

                if (validarDocumento(doc)) {
                    JOptionPane.showMessageDialog(rootPane, "ERROR YA EL USUARIO EXISTE");
                } else {
                    Repartidor r = new Repartidor();
                    r.setDocumento(doc);
                    r.setNombre(nom);
                    r.setZona(zon);
                    r.setCategoria(cat);
                    r.setUsuario(us);
                    r.setContraseña(cont);
                    listaDatos.add(r);
                    pintarTabla();
                    limpiar();
        }
                
                } catch (Exception e) {
            }   
        } 
    }//GEN-LAST:event_guardarBMouseClicked

    private void editarBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarBMouseClicked
        editar();
    }//GEN-LAST:event_editarBMouseClicked

    private void tablaRepartidorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaRepartidorMouseClicked
        try {
            int filaEditar = tablaRepartidor.getSelectedRow();
            Repartidor e = listaDatos.get(filaEditar);
            documentoT.setText(e.getNombre());
            zonaC.setSelectedItem(e.getZona());
            categoriaC.setSelectedItem(e.getCategoria());
            nombreT.setText(e.getNombre());
            usuarioT.setText(e.getUsuario());
            contraseñaT.setText(e.getContraseña());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tablaRepartidorMouseClicked

    private void eliminarBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarBMouseClicked
        eliminar();
    }//GEN-LAST:event_eliminarBMouseClicked

    private void nombreTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreTKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c) == false) {
        }else{
            evt.consume();
            JOptionPane.showMessageDialog(null, "NO SE PUEDE INGRESAR NUMEROS!!!", "", JOptionPane.ERROR_MESSAGE);   
        }
    }//GEN-LAST:event_nombreTKeyTyped

    private void documentoTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_documentoTKeyTyped
        int pValor = 10;
        int k = (int) evt.getKeyChar();
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90 || documentoT.getText().length()>=pValor) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "NO SE PUEDE INGRESAR LETRAS!!!", "", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 241 || k == 209 || documentoT.getText().length()>=pValor) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "NO SE PUEDE INGRESAR MAS NUMEROS!!!", "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_documentoTKeyTyped

    private void editar(){
        String documento;

        documento = documentoT.getText().trim();
        if ( documentoT.getText().equals("") || nombreT.getText().equals("") || zonaC.getSelectedItem().equals("Seleccionar :") || categoriaC.getSelectedItem().equals("Seleccionar :") || usuarioT.getText().equals("") || contraseñaT.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "NO HA SELECIONADO DATOS");
        } else {
            if (validarDocumento(documento)) {
                JOptionPane.showMessageDialog(rootPane, "ERROR YA EXISTE EL DOCUMENTO");

            } else {
                try {
                    int filaEditar = tablaRepartidor.getSelectedRow();
                    Repartidor e = new Repartidor();

                    e.setDocumento(documento);
                    e.setDocumento(documentoT.getText().trim());
                    e.setNombre(nombreT.getText().trim());
                    e.setZona(zonaC.getSelectedItem().toString());
                    e.setCategoria(categoriaC.getSelectedItem().toString());
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
    
    public void eliminar() {
        if ( documentoT.getText().equals("") || nombreT.getText().equals("") || zonaC.getSelectedItem().equals("Seleccionar :") || categoriaC.getSelectedItem().equals("Seleccionar :") || usuarioT.getText().equals("") || contraseñaT.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "NO HA SELECIONADO DATOS");
        } else {

        int filaEliminar = tablaRepartidor.getSelectedRow();
        listaDatos.remove(filaEliminar);
        pintarTabla();
        limpiar();
    }
    }
    
    public void limpiar() {
        documentoT.setText("");
        nombreT.setText("");
        zonaC.setSelectedIndex(0);
        categoriaC.setSelectedIndex(0);
        usuarioT.setText("");
        contraseñaT.setText("");
        usuarioT.requestFocus();
    }
     
     private boolean validarDocumento(String usuario) {
        for (Repartidor e : listaDatos) {
            if (e.getUsuario().equals(usuario)) {
                return true;
            }
        }

        return false;
    }
     
    public void pintarTabla() {

        DefaultTableModel modeloTabla = new DefaultTableModel();
        String[] nombreColumnas = {"Documento", "Nombre", "Zona", "Categoria", "Usuario", "Contraseña"};
        modeloTabla.setColumnIdentifiers(nombreColumnas);
        for (Repartidor e : listaDatos) {
            String[] fila = {e.getDocumento(), e.getNombre(), e.getZona(), e.getCategoria(), e.getUsuario(), e.getContraseña()};
            modeloTabla.addRow(fila);
        }
        tablaRepartidor.setModel(modeloTabla);

    }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminRepartidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasB;
    private javax.swing.JComboBox<String> categoriaC;
    private javax.swing.JPasswordField contraseñaT;
    private javax.swing.JTextField documentoT;
    private javax.swing.JButton editarB;
    private javax.swing.JButton eliminarB;
    private javax.swing.JButton guardarB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreT;
    private javax.swing.JButton salirB;
    private javax.swing.JTable tablaRepartidor;
    private javax.swing.JTextField usuarioT;
    private javax.swing.JComboBox<String> zonaC;
    // End of variables declaration//GEN-END:variables
}
