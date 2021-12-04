
package Modelo;

import Datos.Datos;
import Datos.Pedido;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ClientePedido extends javax.swing.JFrame {

    ArrayList<Pedido> listaDatos;
    int filas;
    
    public ClientePedido() {
        initComponents();
        fechaIngresoT.setText(fechaActual());
        fechaIngresoT.disable();
        listaDatos = new ArrayList<>();
        cargarDatos();  
        Repartidor rep = new Repartidor();
        rep.setVisible(true);
    }
    
    private void cargarDatos() {
        listaDatos = Datos.leerArchivoPedido();
        pintarTabla();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPedido = new javax.swing.JTable();
        salirB = new javax.swing.JButton();
        atrasB = new javax.swing.JButton();
        nºPaqueteT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fechaIngresoT = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombreDT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        direccionDT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nºViviendaDT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        codigoPostalDT = new javax.swing.JTextField();
        telefonoDT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        nombreRT = new javax.swing.JTextField();
        direccionRT = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        nºViviendaRT = new javax.swing.JTextField();
        paisRT = new javax.swing.JTextField();
        ciudadRT = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        telefonoRT = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        pesoT = new javax.swing.JTextField();
        valorDeclaradoT = new javax.swing.JTextField();
        fechaLimiteEntregaT = new javax.swing.JTextField();
        observacioneT = new javax.swing.JTextField();
        largoT = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        anchoT = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        altoT = new javax.swing.JTextField();
        pesoST = new javax.swing.JTextField();
        pesoCT = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        descripcionT = new javax.swing.JTextField();
        tipoCombo = new javax.swing.JComboBox<>();
        guardarB = new javax.swing.JButton();
        editarB = new javax.swing.JButton();
        eliminarB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 890, 60));

        salirB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        salirB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirBMouseClicked(evt);
            }
        });
        jPanel1.add(salirB, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 40, 30));

        atrasB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        atrasB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atrasBMouseClicked(evt);
            }
        });
        jPanel1.add(atrasB, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 330, 60, 40));

        nºPaqueteT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nºPaqueteTActionPerformed(evt);
            }
        });
        nºPaqueteT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nºPaqueteTKeyTyped(evt);
            }
        });
        jPanel1.add(nºPaqueteT, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 100, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Fecha Ingreso:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        fechaIngresoT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaIngresoTActionPerformed(evt);
            }
        });
        jPanel1.add(fechaIngresoT, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 100, -1));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setText("FORMATO REGISTRO DE PAQUETERIA");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nº Paquete:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        nombreDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreDTActionPerformed(evt);
            }
        });
        nombreDT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreDTKeyTyped(evt);
            }
        });
        jPanel1.add(nombreDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 250, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Codigo Postal:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        direccionDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionDTActionPerformed(evt);
            }
        });
        jPanel1.add(direccionDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 220, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Nº de Vivienda:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("DATOS DEL DESTINARIO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        nºViviendaDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nºViviendaDTActionPerformed(evt);
            }
        });
        jPanel1.add(nºViviendaDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 270, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Calle/Carrera:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Telefono:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        codigoPostalDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoPostalDTActionPerformed(evt);
            }
        });
        jPanel1.add(codigoPostalDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 270, -1));

        telefonoDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoDTActionPerformed(evt);
            }
        });
        telefonoDT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoDTKeyTyped(evt);
            }
        });
        jPanel1.add(telefonoDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 280, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Nombre Completos:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Direccion:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Calle/Carrera:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        nombreRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreRTActionPerformed(evt);
            }
        });
        nombreRT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreRTKeyTyped(evt);
            }
        });
        jPanel1.add(nombreRT, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 250, -1));

        direccionRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionRTActionPerformed(evt);
            }
        });
        jPanel1.add(direccionRT, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 220, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Telefono:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Nº de Vivienda:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("DATOS DEL REMITENTE");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Ciudad:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        nºViviendaRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nºViviendaRTActionPerformed(evt);
            }
        });
        jPanel1.add(nºViviendaRT, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 280, -1));

        paisRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paisRTActionPerformed(evt);
            }
        });
        paisRT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                paisRTKeyTyped(evt);
            }
        });
        jPanel1.add(paisRT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 340, -1));

        ciudadRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudadRTActionPerformed(evt);
            }
        });
        ciudadRT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ciudadRTKeyTyped(evt);
            }
        });
        jPanel1.add(ciudadRT, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 330, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Nombre Completos:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Pais:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Direccion:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        telefonoRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoRTActionPerformed(evt);
            }
        });
        telefonoRT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoRTKeyTyped(evt);
            }
        });
        jPanel1.add(telefonoRT, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 310, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Peso:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("DATOS DEL PAQUETE");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Tipo:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("Descripcion:");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Peso:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("Valor Declarado:");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, -1, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("Peso(kg):");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

        pesoT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoTActionPerformed(evt);
            }
        });
        pesoT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pesoTKeyTyped(evt);
            }
        });
        jPanel1.add(pesoT, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 330, -1));

        valorDeclaradoT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorDeclaradoTActionPerformed(evt);
            }
        });
        jPanel1.add(valorDeclaradoT, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 290, -1));

        fechaLimiteEntregaT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaLimiteEntregaTActionPerformed(evt);
            }
        });
        jPanel1.add(fechaLimiteEntregaT, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 260, -1));

        observacioneT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                observacioneTActionPerformed(evt);
            }
        });
        jPanel1.add(observacioneT, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 300, -1));

        largoT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                largoTActionPerformed(evt);
            }
        });
        jPanel1.add(largoT, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, 20, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setText("Observaciones:");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("Ancho:");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 70, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("Largo:");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, -1, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("Alto:");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 70, -1, -1));

        anchoT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anchoTActionPerformed(evt);
            }
        });
        jPanel1.add(anchoT, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 70, 20, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setText("Fecha Limite Entrega:");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, -1));

        altoT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altoTActionPerformed(evt);
            }
        });
        jPanel1.add(altoT, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, 20, -1));

        pesoST.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pesoSTMouseClicked(evt);
            }
        });
        pesoST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoSTActionPerformed(evt);
            }
        });
        pesoST.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pesoSTKeyTyped(evt);
            }
        });
        jPanel1.add(pesoST, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 50, -1));

        pesoCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoCTActionPerformed(evt);
            }
        });
        pesoCT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pesoCTKeyTyped(evt);
            }
        });
        jPanel1.add(pesoCT, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 50, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setText("OBSERVACIONES ADICIONALES");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));

        descripcionT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcionTActionPerformed(evt);
            }
        });
        jPanel1.add(descripcionT, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 180, -1));

        tipoCombo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tipoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleciona", "Sobre", "Caja", "Otro" }));
        tipoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoComboActionPerformed(evt);
            }
        });
        jPanel1.add(tipoCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, -1, -1));

        guardarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        guardarB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarBMouseClicked(evt);
            }
        });
        jPanel1.add(guardarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, -1, -1));

        editarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        editarB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarBMouseClicked(evt);
            }
        });
        jPanel1.add(editarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 60, -1));

        eliminarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.png"))); // NOI18N
        eliminarB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarBMouseClicked(evt);
            }
        });
        jPanel1.add(eliminarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 60, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/HD-wallpaper-courier-3d-icon-red-background-3d-symbols-courier-shipping-icons-3d-icons-courier-sign-shipping-3d-icons.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 800, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nºPaqueteTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nºPaqueteTActionPerformed
        
    }//GEN-LAST:event_nºPaqueteTActionPerformed

    private void fechaIngresoTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaIngresoTActionPerformed
       
    }//GEN-LAST:event_fechaIngresoTActionPerformed

    private void nombreDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreDTActionPerformed

    private void direccionDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionDTActionPerformed

    private void nºViviendaDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nºViviendaDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nºViviendaDTActionPerformed

    private void codigoPostalDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoPostalDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoPostalDTActionPerformed

    private void telefonoDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoDTActionPerformed
        
    }//GEN-LAST:event_telefonoDTActionPerformed

    private void salirBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirBMouseClicked
        Bienvenida bvd = new Bienvenida();
        bvd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_salirBMouseClicked

    private void telefonoDTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoDTKeyTyped
        int pValor = 10;
        int k = (int) evt.getKeyChar();
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90 || telefonoDT.getText().length()>=pValor) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "NO SE PUEDE INGRESAR LETRAS!!!", "", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 241 || k == 209 || telefonoDT.getText().length()>=pValor) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "NO PUEDE INGRESAR MAS NUMEROS!!!", "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_telefonoDTKeyTyped

    private void nombreDTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreDTKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c) == false) {
        }else{
            evt.consume();
            JOptionPane.showMessageDialog(null, "NO SE PUEDE INGRESAR NUMEROS!!!", "", JOptionPane.ERROR_MESSAGE);   
        } 
    }//GEN-LAST:event_nombreDTKeyTyped

    private void nºPaqueteTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nºPaqueteTKeyTyped
        aleatorio();
    }//GEN-LAST:event_nºPaqueteTKeyTyped

    private void nombreRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreRTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreRTActionPerformed

    private void nombreRTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreRTKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c) == false) {
        }else{
            evt.consume();
            JOptionPane.showMessageDialog(null, "NO SE PUEDE INGRESAR NUMEROS!!!", "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_nombreRTKeyTyped

    private void direccionRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionRTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionRTActionPerformed

    private void nºViviendaRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nºViviendaRTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nºViviendaRTActionPerformed

    private void paisRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paisRTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paisRTActionPerformed

    private void paisRTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paisRTKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c) == false) {
        }else{
            evt.consume();
            JOptionPane.showMessageDialog(null, "NO SE PUEDE INGRESAR NUMEROS!!!", "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_paisRTKeyTyped

    private void ciudadRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudadRTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciudadRTActionPerformed

    private void ciudadRTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ciudadRTKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c) == false) {
        }else{
            evt.consume();
            JOptionPane.showMessageDialog(null, "NO SE PUEDE INGRESAR NUMEROS!!!", "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ciudadRTKeyTyped

    private void telefonoRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoRTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoRTActionPerformed

    private void telefonoRTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoRTKeyTyped
        int pValor = 10;
        int k = (int) evt.getKeyChar();
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90 || telefonoRT.getText().length()>=pValor) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "NO SE PUEDE INGRESAR LETRAS!!!", "", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 241 || k == 209 || telefonoRT.getText().length()>=pValor) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "NO PUEDE INGRESAR MAS NUMEROS!!!", "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_telefonoRTKeyTyped

    private void pesoTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesoTActionPerformed

    private void valorDeclaradoTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorDeclaradoTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorDeclaradoTActionPerformed

    private void fechaLimiteEntregaTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaLimiteEntregaTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaLimiteEntregaTActionPerformed

    private void observacioneTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_observacioneTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_observacioneTActionPerformed

    private void largoTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_largoTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_largoTActionPerformed

    private void anchoTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anchoTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anchoTActionPerformed

    private void altoTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altoTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_altoTActionPerformed

    private void pesoSTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoSTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesoSTActionPerformed

    private void pesoCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoCTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesoCTActionPerformed

    private void descripcionTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcionTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descripcionTActionPerformed

    private void tipoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoComboActionPerformed

    private void guardarBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarBMouseClicked
        Datos.guardarPedido(listaDatos);
        String nº, fein, nomdt, didt, nºvd, cod, tel, nomr, dir, nºr, pa, ci, ter, tic, pes, pec, la, an, al, des, peso, vad, fele, ob;
        if ( nºPaqueteT.getText().equals("") || fechaIngresoT.getText().equals("") || nombreDT.getText().equals("") || direccionDT.getText().equals("") || nºViviendaDT .getText().equals("") ||
                codigoPostalDT.getText().equals("") || telefonoDT.getText().equals("") || nombreRT.getText().equals("") || direccionRT.getText().equals("") || nºViviendaRT.getText().equals("") || paisRT.getText().equals("") || 
                ciudadRT.getText().equals("") || telefonoRT.getText().equals("") || tipoCombo.getSelectedItem().equals("") || pesoST.getText().equals("") || pesoCT.getText().equals("") || largoT.getText().equals("") || anchoT.getText().equals("") || 
                altoT.getText().equals("") || descripcionT.getText().equals("") || pesoT.getText().equals("") || valorDeclaradoT.getText().equals("") || fechaLimiteEntregaT.getText().equals("") || observacioneT.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "ERROR CAMPOS VACIOS");
        } else {
            try {
                nº = nºPaqueteT.getText().trim();
                fein = fechaIngresoT.getText().trim();
                nomdt = nombreDT.getText().trim();
                didt = direccionDT.getText().trim();
                nºvd = nºViviendaDT.getText().trim();
                cod = codigoPostalDT.getText().trim();
                tel = telefonoDT.getText().trim();
                nomr = nombreRT.getText().trim();
                dir = direccionRT.getText().trim();
                nºr = nºViviendaRT.getText().trim();
                pa = paisRT.getText().trim();
                ci = ciudadRT.getText().trim();
                ter = telefonoRT.getText().trim();
                tic = tipoCombo.getSelectedItem().toString().trim();
                pes = pesoST.getText().trim();
                pec = pesoCT.getText().trim();
                la = largoT.getText().trim();
                an = anchoT.getText().trim();
                al = altoT.getText().trim();
                des = descripcionT.getText().trim();
                peso = pesoT.getText().trim();
                vad = valorDeclaradoT.getText().trim();
                fele = fechaLimiteEntregaT.getText().trim();
                ob = observacioneT.getText().trim();

                if (validarNºPaquete(nº)) {
                    JOptionPane.showMessageDialog(rootPane, "ERROR YA EXISTE EL PAQUETE");
                } else {
                    Pedido p = new Pedido();
                    p.setNºpaquete(nº);
                    p.setFechaIngreso(fein);
                    p.setNombre(nomdt);
                    p.setDireccion(didt);
                    p.setNºVivienda(nºvd);
                    p.setCodigoPostal(cod);
                    p.setTelefono(tel);
                    p.setNombre(nomr);
                    p.setDireccion(dir);
                    p.setNºVivienda(nºr);
                    p.setPais(pa);
                    p.setCiudad(ci);
                    p.setTelefono(ter);
                    p.setTipo(tic);
                    p.setPeso(pes);
                    p.setPeso(pec);
                    p.setLargo(la);
                    p.setAncho(an);
                    p.setAlto(al);
                    p.setDescripcion(des);
                    p.setPeso(peso);
                    p.setValorDeclarado(vad);
                    p.setFechaLimite(fele);
                    p.setObservaciones(ob);
                    listaDatos.add(p);
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

    private void eliminarBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarBMouseClicked
        eliminar();
    }//GEN-LAST:event_eliminarBMouseClicked

    private void atrasBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasBMouseClicked
        Cliente cl = new Cliente();
        cl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_atrasBMouseClicked

    private void tablaPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPedidoMouseClicked
        try {
            int filaEditar = tablaPedido.getSelectedRow();
            Pedido e = listaDatos.get(filaEditar);
            nºPaqueteT.setText(e.getNºpaquete());
            fechaIngresoT.setText(e.getFechaIngreso());
            nombreDT.setText(e.getNombre());
            direccionDT.setText(e.getDireccion());
            nºViviendaDT.setText(e.getNºVivienda());
            codigoPostalDT.setText(e.getCodigoPostal());
            telefonoDT.setText(e.getTelefono());
            nombreRT.setText(e.getNombre());
            direccionRT.setText(e.getDireccion());
            nºViviendaRT.setText(e.getNºVivienda());
            paisRT.setText(e.getPais());
            ciudadRT.setText(e.getCiudad());
            telefonoRT.setText(e.getTelefono());
            tipoCombo.setSelectedItem(e.getTipo());
            pesoST.setText(e.getPeso());
            pesoCT.setText(e.getPeso());
            largoT.setText(e.getLargo());
            anchoT.setText(e.getAncho());
            altoT.setText(e.getAlto());
            descripcionT.setText(e.getDescripcion());
            pesoT.setText(e.getPeso());
            valorDeclaradoT.setText(e.getValorDeclarado());
            fechaLimiteEntregaT.setText(e.getFechaLimite());
            observacioneT.setText(e.getObservaciones());
            } catch (Exception e) {
        }
    }//GEN-LAST:event_tablaPedidoMouseClicked

    private void pesoSTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesoSTMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pesoSTMouseClicked

    private void pesoSTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesoSTKeyTyped
        int pValor = 2;
        int k = (int) evt.getKeyChar();
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90 || pesoST.getText().length()>=pValor) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "NO SE PUEDE INGRESAR LETRAS!!!", "", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 241 || k == 209 || pesoST.getText().length()>=pValor) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "NO PUEDE INGRESAR MAS NUMEROS!!!", "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_pesoSTKeyTyped

    private void pesoCTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesoCTKeyTyped
        int pValor = 2;
        int k = (int) evt.getKeyChar();
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90 || pesoCT.getText().length()>=pValor) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "NO SE PUEDE INGRESAR LETRAS!!!", "", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 241 || k == 209 || pesoCT.getText().length()>=pValor) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "NO PUEDE INGRESAR MAS NUMEROS!!!", "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_pesoCTKeyTyped

    private void pesoTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesoTKeyTyped
        int pValor = 2;
        int k = (int) evt.getKeyChar();
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90 || pesoT.getText().length()>=pValor) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "NO SE PUEDE INGRESAR LETRAS!!!", "", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 241 || k == 209 || pesoT.getText().length()>=pValor) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "NO PUEDE INGRESAR MAS NUMEROS!!!", "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_pesoTKeyTyped

    public void limpiar() {
        nºPaqueteT.setText("");
        fechaIngresoT.setText("");
        nombreDT.setText("");
        direccionDT.setText("");
        nºViviendaDT.setText("");
        codigoPostalDT.setText("");
        telefonoDT.setText("");
        nombreRT.setText("");
        direccionRT.setText("");
        nºViviendaRT.setText("");
        paisRT.setText("");
        ciudadRT.setText("");
        telefonoRT.setText("");
        tipoCombo.setSelectedIndex(0);
        pesoST.setText("");
        pesoCT.setText("");
        largoT.setText("");
        anchoT.setText("");
        altoT.setText("");
        descripcionT.setText("");
        pesoT.setText("");
        valorDeclaradoT.setText("");
        fechaLimiteEntregaT.setText("");
        observacioneT.setText("");
        nºPaqueteT.requestFocus();
    }
    
    private void editar(){
        String nºPaquete;

        nºPaquete = nºPaqueteT.getText().trim();
        if ( nºPaqueteT.getText().equals("") || fechaIngresoT.getText().equals("") || nombreDT.getText().equals("") || direccionDT.getText().equals("") || nºViviendaDT .getText().equals("") ||
                codigoPostalDT.getText().equals("") || telefonoDT.getText().equals("") || nombreRT.getText().equals("") || direccionRT.getText().equals("") || nºViviendaRT.getText().equals("") || paisRT.getText().equals("") || 
                ciudadRT.getText().equals("") || telefonoRT.getText().equals("") || tipoCombo.getSelectedItem().equals("") || pesoST.getText().equals("") || pesoCT.getText().equals("") || largoT.getText().equals("") || anchoT.getText().equals("") || 
                altoT.getText().equals("") || descripcionT.getText().equals("") || pesoT.getText().equals("") || valorDeclaradoT.getText().equals("") || fechaLimiteEntregaT.getText().equals("") || observacioneT.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "NO HA SELECIONADO DATOS");
        } else {
            if (validarNºPaquete(nºPaquete)) {
                JOptionPane.showMessageDialog(rootPane, "ERROR YA EXISTE EL PAQUETE");

            } else {
                try {
                    int filaEditar = tablaPedido.getSelectedRow();
                    Pedido e = new Pedido();

                    e.setNºpaquete(nºPaquete);
                    e.setNºpaquete(nºPaqueteT.getText().trim());
                    e.setFechaIngreso(fechaIngresoT.getText().trim());
                    e.setNombre(nombreDT.getText().trim());
                    e.setDireccion(direccionDT.getText().trim());
                    e.setNºVivienda(nºViviendaDT.getText().trim());
                    e.setCodigoPostal(codigoPostalDT.getText().trim());
                    e.setTelefono(telefonoDT.getText().trim());
                    e.setNombre(nombreRT.getText().trim());
                    e.setDireccion(direccionRT.getText().trim());
                    e.setNºVivienda(nºViviendaRT.getText().trim());
                    e.setPais(paisRT.getText().trim());
                    e.setCiudad(ciudadRT.getText().trim());
                    e.setTelefono(telefonoRT.getText().trim());
                    e.setTipo(tipoCombo.getSelectedItem().toString());
                    e.setPeso(pesoST.getText().trim());
                    e.setPeso(pesoCT.getText().trim());
                    e.setLargo(largoT.getText().trim());
                    e.setAncho(anchoT.getText().trim());
                    e.setAlto(altoT.getText().trim());
                    e.setDescripcion(descripcionT.getText().trim());
                    e.setPeso(pesoT.getText().trim());
                    e.setValorDeclarado(valorDeclaradoT.getText().trim());
                    e.setFechaLimite(fechaLimiteEntregaT.getText().trim());
                    e.setObservaciones(observacioneT.getText().trim());
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
        if ( nºPaqueteT.getText().equals("") || fechaIngresoT.getText().equals("") || nombreDT.getText().equals("") || direccionDT.getText().equals("") || nºViviendaDT .getText().equals("") ||
                codigoPostalDT.getText().equals("") || telefonoDT.getText().equals("") || nombreRT.getText().equals("") || direccionRT.getText().equals("") || nºViviendaRT.getText().equals("") || paisRT.getText().equals("") || 
                ciudadRT.getText().equals("") || telefonoRT.getText().equals("") || tipoCombo.getSelectedItem().equals("") || pesoST.getText().equals("") || pesoCT.getText().equals("") || largoT.getText().equals("") || anchoT.getText().equals("") || 
                altoT.getText().equals("") || descripcionT.getText().equals("") || pesoT.getText().equals("") || valorDeclaradoT.getText().equals("") || fechaLimiteEntregaT.getText().equals("") || observacioneT.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "NO HA SELECIONADO DATOS");
        } else {

        int filaEliminar = tablaPedido.getSelectedRow();
        listaDatos.remove(filaEliminar);
        pintarTabla();
        limpiar();
    }
    }
    
    private boolean validarNºPaquete(String paquete) {
        for (Pedido e : listaDatos) {
            if (e.getNºpaquete().equals(paquete)) {
                return true;
            }
        }

        return false;
    }
    
    public void aleatorio(){
     Random ran = new Random();
        int n=ran.nextInt(100000)+1;
        String val=String.valueOf(n);
        nºPaqueteT.setText(val);
    }
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
    
    public String fechaActual(){
    Date fecha = new Date();
    SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
    return formatofecha.format(fecha); 
    }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientePedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField altoT;
    private javax.swing.JTextField anchoT;
    private javax.swing.JButton atrasB;
    private javax.swing.JTextField ciudadRT;
    private javax.swing.JTextField codigoPostalDT;
    private javax.swing.JTextField descripcionT;
    private javax.swing.JTextField direccionDT;
    private javax.swing.JTextField direccionRT;
    private javax.swing.JButton editarB;
    private javax.swing.JButton eliminarB;
    private javax.swing.JTextField fechaIngresoT;
    private javax.swing.JTextField fechaLimiteEntregaT;
    private javax.swing.JButton guardarB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField largoT;
    private javax.swing.JTextField nombreDT;
    private javax.swing.JTextField nombreRT;
    private javax.swing.JTextField nºPaqueteT;
    private javax.swing.JTextField nºViviendaDT;
    private javax.swing.JTextField nºViviendaRT;
    private javax.swing.JTextField observacioneT;
    private javax.swing.JTextField paisRT;
    private javax.swing.JTextField pesoCT;
    private javax.swing.JTextField pesoST;
    private javax.swing.JTextField pesoT;
    private javax.swing.JButton salirB;
    private javax.swing.JTable tablaPedido;
    private javax.swing.JTextField telefonoDT;
    private javax.swing.JTextField telefonoRT;
    private javax.swing.JComboBox<String> tipoCombo;
    private javax.swing.JTextField valorDeclaradoT;
    // End of variables declaration//GEN-END:variables
}