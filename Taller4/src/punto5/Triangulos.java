
package punto5;

public class Triangulos {
    private int base;
    private int altura;
    public Triangulos(int base, int altura){
        this.base=base;
        this.altura=altura;
    }
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public double getArea(){
        return base*altura/2;
    }
    public double getLongitud(){
        double numero =  Math.pow(altura, 2) +  Math.pow((base/2), 2);;
        return Math.sqrt(numero);
    }
    public double getPerimetro(){
        return (2*getLongitud())+base;
    }
    public double getAnguloVertice(){
        double b = (double) base/2;
        double h = (double) altura/b;
        double l = (double)Math.atan(h);
        return l*180/Math.PI;
    }
    public String toString(){
        return "El area es "+getArea()+"\nla longitud de sus lado iguales es "+getLongitud()+
                " \nel perimetro es "+getPerimetro()+" \nel valor del ángulo vértice es "+getAnguloVertice();
    }
}
