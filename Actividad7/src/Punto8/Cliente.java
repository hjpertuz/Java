
package Punto8;

public class Cliente {
    
    private String nombre;
    private String apellido;
    private String nif;
    private int numCuenta, saldo;
    
    
    public Cliente(String nombre, String apellido, String nif, int numCuenta, int saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nif = nif;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
     @Override
    public String toString() {
        return  "Nif: " + nif + "  Nombre: " + nombre + "  apellido: " + apellido + "\n numCuenta: " + numCuenta + ", saldo: " + saldo ;
    }
}
