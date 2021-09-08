
package punto1;

public class Rectangulo {
    private int base;
    private int altura;
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    public int ClacularArea(){
        return base * altura;
    }
    public int ClacularPerimetro(){
        return 2 * (base + altura);
    }
    public String toString(){
        return "el area es "+ClacularArea()+" y el perimetro es "+ClacularPerimetro();
    }
}
