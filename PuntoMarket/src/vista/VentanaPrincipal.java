
package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaPrincipal extends JFrame implements ActionListener {
    
    private JMenuBar barraMenu;
    private JMenu menu;
    private JMenuItem itemMenuReporte, itemMenuConsulta;

    public VentanaPrincipal() {
        
        this.initComponentes();
        this.setTitle("Aplicacion de registro de goleadores - FPC - Ventana Principal");
        //this.setSize(300, 600);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
        
    }
    
    
    public void initComponentes(){
        
        this.barraMenu = new JMenuBar();
        this.setJMenuBar(this.barraMenu);
        
        this.menu = new JMenu("Opciones");
        this.barraMenu.add(this.menu);
        
        this.itemMenuReporte = new JMenuItem("ReporteVentas");
        this.itemMenuReporte.addActionListener(this);
        this.menu.add(this.itemMenuReporte);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        VentanaReporteVentas registro = new VentanaReporteVentas(this, true);
        
    }
    
   
    
    
}
