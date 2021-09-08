
package punto12;

public class Movimiento {
    private double velocidadInicial;
    private double tiempo;

    public Movimiento(double velocidadInicial,double tiempo){
        this.velocidadInicial = velocidadInicial;
        this.tiempo = tiempo; 
    }
    public double getVelocidadInicial() {
        return velocidadInicial;
    }
    public void setVelocidadInicial(double velocidadInicial) {
        this.velocidadInicial = velocidadInicial;
    }
    public double getTiempo() {
        return tiempo;
    }
    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }
    public double getVelocidadFinal() {
        return velocidadInicial + (9.8*tiempo);
    }
    public double getAltura() {
        return ((getVelocidadFinal()+velocidadInicial)/2)*tiempo;
    }
    public String toString(){
        return "la velocidad final es "+getVelocidadFinal()+" m/s la distancia recorrida es "+getAltura()+" m";
    }
}
