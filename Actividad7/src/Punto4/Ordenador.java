
package Punto4;

public abstract class Ordenador {
    
    private double precio;
    private int codigo;
    private String slogan;

    public Ordenador() {
    }

    public Ordenador(double precio, int codigo, String slogan) {
        this.precio = precio;
        this.codigo = codigo;
        this.slogan = slogan;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getSlogan() {
        return slogan;
    }
    
    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }
    
    public String infOrdenador(){
        System.out.println("Informacion del ordenador");
        return "Codigo: " + this.codigo + " Precio: " + this.precio + " Slogan: " + this.slogan;
    }
    
    public abstract String verInf(); 
}
