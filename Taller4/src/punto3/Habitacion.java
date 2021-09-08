
package punto3;

public class Habitacion {

    private int Largo;
    private int Ancho;
    private int Alto;
    private double Enchape;
    private double Papel;
    public Habitacion(int Largo, int Ancho, int Alto){
        this.Largo = Largo;
        this.Ancho = Ancho;
        this.Alto = Alto;
    }
    public int getLargo() {return Largo;}
    public void setLargo(int Largo) {this.Largo = Largo;}
    public int getAncho() {return Ancho;}
    public void setAncho(int Ancho) {this.Ancho = Ancho;}
    public int getAlto() {return Alto;}
    public void setAlto(int Alto) {this.Alto = Alto;}
    public double getEnchape() {
        Enchape = Largo*Ancho;
        return Enchape;
    }
    public double getPapel() {
        Papel = ((Largo*Alto)+(Ancho*Alto))*2;
        return Papel;
    }
    public String toString(){
        return "La cantidad de enchape que se requiere es "+getEnchape()+" m^2\n"+
                "la cantidad de papel tapiz que se requiere es "+getPapel()+" m^2";
    }
    
}
