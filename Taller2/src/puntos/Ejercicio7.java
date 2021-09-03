
package puntos;

import javax.swing.JOptionPane;


public class Ejercicio7 {

    
    public static void main(String[] args) {
        
        double precio,utilidad;
        
        JOptionPane.showMessageDialog(null,"Digite el precio");
        precio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor es: "));
        
        //el porcentaje de margen de utilidad: 9500 / 20000 x 100 = 47.5
        
        utilidad=precio/20000*100;
        
        JOptionPane.showMessageDialog(null,"Su margen de utilidad es: "+utilidad);
    }
    
}
