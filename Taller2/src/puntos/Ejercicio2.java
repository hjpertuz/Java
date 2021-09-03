
package puntos;

import javax.swing.JOptionPane;


public class Ejercicio2 {

    public static void main(String[] args) {
        
        int num1;
        int num2;
        JOptionPane.showMessageDialog(null,"Este programa recibira 2 numeros");
        num1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero 1: "));
        num2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero 2: "));
       
        int suma;
        int producto;
        int diferencia;
        suma = num1 + num2;
        diferencia = num1 - num2;
        producto = num1*num2;
        
        JOptionPane.showMessageDialog(null,"La suma de los numeros es:"+suma);
        JOptionPane.showMessageDialog(null,"El producto de los numeros es:"+producto);
        JOptionPane.showMessageDialog(null,"La diferenncia de los numeros es:"+diferencia);
        
    }
    
}
