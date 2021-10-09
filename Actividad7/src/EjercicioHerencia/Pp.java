
package EjercicioHerencia;

public class Pp {
    public static void main(String[] args) {
        
        Person p = new Person(45, "Jose", "Pe", 18);
        System.out.println(p.retornarDatos());
        
        Doctor d = new Doctor(75, "Andres", "Per", 56, "Cirujano","P");
        System.out.println(d.retornarDatos());
        
        Teacher t = new Teacher(35, "Leo", "Pert", 28, "Sistema", "UPC");
        System.out.println(t.retornarDatos());
    }
}
