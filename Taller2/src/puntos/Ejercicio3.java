
package puntos;

import javax.swing.JOptionPane;


public class Ejercicio3 {

   
    public static void main(String[] args) {
      double num1;
      double num2;
      double num3;
      
      JOptionPane.showMessageDialog(null,"Este programa recibira 3 numeros");
      num1=Double.parseDouble(JOptionPane.showInputDialog("ingrese el numero 1: "));
      num2=Double.parseDouble(JOptionPane.showInputDialog("ingrese el numero 2: "));
      num3=Double.parseDouble(JOptionPane.showInputDialog("ingrese el numero 3: "));
      
      double suma;
      double promedio;
      double producto;
      double coeciente;
      double modulo;
      
      suma = num1 + num2 + num3;
      promedio = num1 - num2 - num3;
      producto = num1 * num2 * num3;
      coeciente = num1 / num2 / num3;
      modulo = num1 % num2 % num3;
      
      JOptionPane.showMessageDialog(null,"La suma de los numeros es:"+suma);
      JOptionPane.showMessageDialog(null,"El promedio de los numeros es:"+promedio);
      JOptionPane.showMessageDialog(null,"El producto de los numeros es:"+producto);
      JOptionPane.showMessageDialog(null,"El coeciente de los numeros es:"+coeciente);
      JOptionPane.showMessageDialog(null,"El modulo de los numeros es:"+modulo);
    }
    
}
