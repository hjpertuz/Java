
package Punto3;

import java.util.Calendar;

public class TestHerencia2 {
    
    public static void main (String [ ] Args) {
        
        Profesor prof = new Profesor ("Juan", "Hernández García", 33);
        prof.setIdProfesor("Prof 22-387-11");
        prof.mostrarDatos();
        
        Calendar calendario = Calendar.getInstance();
        calendario.set(2019,10,22);
        ProfesorInterino inte = new ProfesorInterino("Jose", "P", 30, calendario);
        System.out.println("El profesor interino 1 se incorporó en la fecha: " +calendario.getTime().toString() );
    }    
}
