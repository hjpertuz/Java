
package Punto8;


public class ClientePreferente extends Cliente {
    
    private int numFondos;
    private Fondo fondo;

    public ClientePreferente(String nombre, String apellido, String nif, int numCuenta, int saldo) {
        super(nombre, apellido, nif, numCuenta, saldo);
    }

    public ClientePreferente(int numFondos, Fondo fondo, String nombre, String apellido, String nif, int numCuenta, int saldo) {
        super(nombre, apellido, nif, numCuenta, saldo);
        this.numFondos = numFondos;
        this.fondo = fondo;
    }
    
    public int getNumFondos() {
        return numFondos;
    }

    public void setNumFondos(int numFondos) {
        this.numFondos = numFondos;
    }

    public Fondo getFondo() {
        return fondo;
    }

    public void setFondo(Fondo fondo) {
        this.fondo = fondo;
    }
    
     public String toString1() {
        return  super.toString() + " \n numFondos: " + numFondos;
    }
}
