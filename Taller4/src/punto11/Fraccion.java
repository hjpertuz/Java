
package punto11;

public class Fraccion {
    private int numerador;
    private int denominador;
    public Fraccion(int num, int den) {
        this.numerador = num;
        if(den==0){
            den = 1;
        }
        this.denominador = den;
        simplificar();
    }
    public int getDenominador() {
        return denominador;
    }
    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    public int getNumerador() {
        return numerador;
    }
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }       
    public void Sumar(int num,int den){
        numerador = ((numerador*den)+(denominador*num));
        denominador = denominador*den;
        simplificar();
    }
    public void Restar(int num,int den){
        numerador = ((numerador*den)-(denominador*num));
        denominador = denominador*den;
        simplificar();
    }
    public void Multiplicar(int num,int den){
        numerador = numerador*num;
        denominador = denominador*den;
        simplificar();
    }
    public void Dividir(int num,int den){
        numerador = numerador*den;
        denominador = denominador*num;
        simplificar();
    }
    private int mcd() {
        int u = Math.abs(numerador); 
        int v = Math.abs(denominador); 
        if (v == 0) {
            return u;
        }
        int r;
        while (v != 0) {
            r = u % v;
            u = v;
            v = r;
        }
        return u;
    }
    private void simplificar() {
        int n = mcd();
        numerador = numerador / n;
        denominador = denominador / n;
    }
    @Override
    public String toString() {
        simplificar();
        return numerador + "/" + denominador;
    }    
}
