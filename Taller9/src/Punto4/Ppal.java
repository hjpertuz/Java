
package Punto4;

public class Ppal {
    
   private static int claveEmpleado;

    public static void main(String[] args) {
        
        Empleado empleado=new Empleado();
        Empleado almacen=new Almacen();
        Empleado distribuidor=new Distribuidor();
        Empleado planta=new Planta();
        Empleado corporativo=new Corporativo();
        Empleado directivo=new Directivo();
        
        boolean con=true;
        char sel='y';
        do{
            do{
                System.out.println("Ingrese clave del empleado " + claveEmpleado);
                if(claveEmpleado>=1&&claveEmpleado<=250){
                    System.out.println("Empleado de Almacen");
                    almacen.obtenerDatosNomina();
                    almacen.imprimirNomina();
                    con=true;
                }else
                    if(claveEmpleado>=251&&claveEmpleado<=500){
                        System.out.println("Empleado de Distribuidor");
                        almacen.obtenerDatosNomina();
                        almacen.imprimirNomina();
                    con=true;
                    }else
                        if(claveEmpleado>=501&&claveEmpleado<=1000){
                            System.out.println("Empleado de Produccion");
                            planta.obtenerDatosNomina();
                            planta.imprimirNomina();
                        con=true;    
                        }else
                            if(claveEmpleado>=1001&&claveEmpleado<=1200){
                                System.out.println("Empleado Corporativo");
                                corporativo.obtenerDatosNomina();
                                corporativo.imprimirNomina();
                            con=true;
                            }else
                                if(claveEmpleado>=1201&&claveEmpleado<=1300){
                                      System.out.println("Empleado Directivo");
                                      directivo.obtenerDatosNomina();
                                      directivo.imprimirNomina();
                            con=true;
                                }else{
                                    con=false;
                                }
            }while(con==false);
            System.out.println("Quieres obtener la nomnia de otro empleado: " + "\n Y/N" + sel);
        }while(sel=='Y');
    }
}
