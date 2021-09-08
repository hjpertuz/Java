
package punto2;

public class Ecuacion {

    private int a;
    private int b;
    private int c;
    private int x;
    
    public int getA(){return a;}
    public void setA(int a){this.a = a;}
    public int getB(){return b;}
    public void setB(int b){this.b = b;}
    public int getC(){return c;}
    public void setC(int c){this.c = c;}
    public int getX(){return x;}
    public void setX(int x){this.x = x;}
    
    public Ecuacion(int a, int b, int c, int x){
        this.a = a;
        this.b = b;
        this.c = c;
        this.x = x;
    }
    public int getY(){
        int y = a*(x*x)+b*x+c;
        return y;
    }
    public String toString(){
        return "para la ecuacion y=("+ a + ")("+ b + "^2)+(" + b + ")(" + x + ")+" + c + " el valor de y es "+getY();
    }
}
