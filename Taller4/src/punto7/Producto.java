/*
Código, nombre, precio de compra,
porcentaje de utilidad
 */
package punto7;

public class Producto {
    private String Codigo;
    private String Nombre;
    private int PrecioCompra;
    private int PorcentajeUtilidad;
    public Producto(String Codigo, String Nombre,int PrecioCompra, int PorcentajeUtilidad){
        this.Codigo=Codigo;
        this.Nombre=Nombre;
        this.PrecioCompra=PrecioCompra;
        this.PorcentajeUtilidad=PorcentajeUtilidad;
    }
    public double getPrecioVentaPublico(){
        double porcentaje = (double)PorcentajeUtilidad/100;
        return PrecioCompra + (PrecioCompra*porcentaje);
    }
    public String toString(){
        return "El codigo: "+Codigo+"; Producto: "+Nombre+"; Precio de compra: "+PrecioCompra+"; Porcentaje Utilidad: "+
                PorcentajeUtilidad+"%; precio de venta al publico: "+getPrecioVentaPublico();
    }
    public String getCodigo() {
        return Codigo;
    }
    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public int getPrecioCompra() {
        return PrecioCompra;
    }
    public void setPrecioCompra(int PrecioCompra) {
        this.PrecioCompra = PrecioCompra;
    }
    public int getPorcentajeUtilidad() {
        return PorcentajeUtilidad;
    }
    public void setPorcentajeUtilidad(int PorcentajeUtilidad) {
        this.PorcentajeUtilidad = PorcentajeUtilidad;
    }
}
