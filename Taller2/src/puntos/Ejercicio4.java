
package puntos;

import static java.lang.Math.PI;
import javax.swing.JOptionPane;


public class Ejercicio4 {

    
    public static void main(String[] args) {
        float radio;
        
        JOptionPane.showMessageDialog(null,"solicite el valor del radio de una circunferencia");
        radio=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el radio"));
        
        float longitud;
        float area;
        
        longitud = (float) ((2 * PI) * radio);
        area = (float) (PI * Math.pow(radio, 2));

        JOptionPane.showMessageDialog(null,"La longitud  es: "+longitud);
        JOptionPane.showMessageDialog(null,"El area es: "+area);
    }
    
}
