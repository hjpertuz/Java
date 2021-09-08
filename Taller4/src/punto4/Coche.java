
package punto4;

public class Coche {
    private String color;
    private String marca;
    private String modelo;
    private int NumCaballos;
    private int NumPuertas;
    private String matricula;
    public Coche(String color,String marca,String modelo,int NumCaballos,int NumPuertas,String matricula){
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.NumCaballos = NumCaballos;
        this.NumPuertas = NumPuertas;
        this.matricula = matricula;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getNumCaballos() {
        return NumCaballos;
    }
    public void setNumCaballos(int NumCaballos) {
        this.NumCaballos = NumCaballos;
    }
    public int getNumPuertas() {
        return NumPuertas;
    }
    public void setNumPuertas(int NumPuertas) {
        this.NumPuertas = NumPuertas;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String toString(){
        return "Marca: "+marca+"; color: "+color+"; modelo: "+modelo+"; numero de caballos: "+NumCaballos+
                "; numero de puertas: "+NumPuertas+"; matricula: "+matricula+";";
    }
}
