
package Punto3;

import java.util.Calendar;

public class ProfesorInterino extends Profesor {
    
      private Calendar fechaComienzoInterinidad;

    public ProfesorInterino(String nombre, String apellidos, int edad, Calendar fechaInicioInterinidad) {
        super(nombre, apellidos, edad);
        fechaComienzoInterinidad = fechaInicioInterinidad;
    }

    public Calendar getFechaComienzoInterinidad () { 
        return fechaComienzoInterinidad;
    }
    
}
