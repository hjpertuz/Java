
package parcial;

public class Parcial {

    public static void main(String[] args) {
        Red red = new Red("UPC","A");
        Host host1 = new Host("PC1","Windows");
        host1.configurar(191, 168, 0, 1);
        red.addHost(host1);
        System.out.println(host1.conectar(red));
        Host host2 = new Host("PC2","Windows");
        host2.configurar(191, 168, 0, 3);
        red.addHost(host2);
        System.out.println(host2.conectar(red));
        Host host3= new Host("PC3","Windows");
        host3.configurar(191, 168, 0, 4);
        red.addHost(host3);
        System.out.println(host3.conectar(red));
        Host host4= new Host("PC4","Windows");
        host4.configurar(191, 168, 0, 5);
        red.addHost(host4);
        System.out.println(host4.conectar(red));
        System.out.println(host1.ping(host4, "Hola"));
        System.out.println(host1.ping("paquete 2"));
    }
    
}
