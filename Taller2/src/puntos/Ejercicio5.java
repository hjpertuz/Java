
package puntos;

import javax.swing.JOptionPane;


public class Ejercicio5 {

    
    public static void main(String[] args) {
       
        char caracter;
        caracter=JOptionPane.showInputDialog("Digite un caracter").charAt(0);
        
        int numero;
        
        numero = Character.getNumericValue(caracter);
        
        JOptionPane.showMessageDialog(null,"EL caracter es: "+numero + numero + numero + 1);
        
    }
    
}
