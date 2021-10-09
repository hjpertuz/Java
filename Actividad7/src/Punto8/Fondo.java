
package Punto8;


public class Fondo {
    
    private String numero;
    private double saldoMensual;
    
    public Fondo() {
        this.numero = "";
        this.saldoMensual = 0;
    }

    public Fondo(String numero, double saldoMensual) {
        this.numero = numero;
        this.saldoMensual = saldoMensual;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldoMensual() {
        return saldoMensual;
    }

    public void setSaldoMensual(double saldoMensual) {
        this.saldoMensual = saldoMensual;
    }

    @Override
    public String toString() {
        return  "  numero: " + numero + ", saldo Mensual: " + saldoMensual ;
    }
}
