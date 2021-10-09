
package Punto4;


public class Portatil extends Ordenador {
    
    private double peso;

    public Portatil() {
    }

    public Portatil(double peso) {
        this.peso = peso;
    }

    public Portatil(double peso, double precio, int codigo, String slogan) {
        super(precio, codigo, slogan);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    @Override
    public String verInf(){
        
        return super.infOrdenador() + "Peso: " + this.peso;
    }
    
}
