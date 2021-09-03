
package puntos;

import javax.swing.JOptionPane;


public class Ejercicio1 {

    
    public static void main(String[] args) {
        
        int num1;
        int num2;
        JOptionPane.showMessageDialog(null,"Este programa recibira 2 numeros");
        num1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero 1: "));
        num2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero 2: "));
        
        JOptionPane.showMessageDialog(null,"x = %d\n"+ num1 );
        JOptionPane.showMessageDialog(null,"El valor de %d + %d es %d\n"+ num1+ num1+ ( num1 + num1 ) );
        JOptionPane.showMessageDialog(null,"x=%.2f"+num1 );
        JOptionPane.showMessageDialog(null,"%d - %d\n"+ ( num1 + num2 )+ ( num2 + num1 ) );
    }
    
}
