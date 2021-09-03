
package puntos;

import javax.swing.JOptionPane;


public class Ejercicio6 {
    
 public static void main(String[] args) {   
        float altura, peso = 0, bmc;
        
        JOptionPane.showMessageDialog(null,"Introduce tu altura en Metros: ");
        altura = Float.parseFloat(JOptionPane.showInputDialog("su altura es: "));
        JOptionPane.showMessageDialog(null,"Introduce tu peso en kg: ");
        peso = Float.parseFloat(JOptionPane.showInputDialog("su peso es: "));
       /*Bajo peso = menos de 18.5
        Peso normal = 18.5–24.9
        Sobrepeso = 25–29.9
        Obesidad = BMC de 30 ó mayor*/

        bmc = peso/(altura * altura);

        if(bmc <= 18.5){
            JOptionPane.showMessageDialog(null,"Tu peso Esta bajo");
        }
        else if(bmc >= 18.5 && bmc <= 24.9){
            JOptionPane.showMessageDialog(null,"Tu peso esta normal");
        }
        else if(bmc >= 25 && bmc <= 29.9){
            JOptionPane.showMessageDialog(null,"Tienes Sobrepeso");
        }
        else if(bmc >= 30 && bmc <= 34.9){
            System.out.print("Tienes Obesidad Grado 1");
        }

    }
   
}
    
