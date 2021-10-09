
package Punto4;


public class Ppal {

    
    public static void main(String[] args) {
        
        Ordenador ord = new Portatil(16, 16000, 123, "atx");
        System.out.println(ord.verInf());
        
        Ordenador ord2 = new SobreMesa("atx");
        System.out.println(ord2.verInf());
                
    }
    
    public static void imprimirOrdenador(Ordenador ordenador){
        
        System.out.println("Informacion del Ordenador: ");
        System.out.println("---------------------------");
        String tipo = (ordenador instanceof Portatil) ? "Portatil" : "Sobremesa";
        System.out.println("Tipo: " + tipo);
        System.out.println(ordenador.verInf());
    }
}
