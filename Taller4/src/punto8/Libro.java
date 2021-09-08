
package punto8;

public class Libro {
    private String Titulo;
    private String PrimerNombre;
    private String SegundoNombre;
    private String PrimerApellido;
    private String ISBN;
    private int Paginas;
    private String Edicion;
    private String Editorial;
    private String Ciudad;
    private String Pais;
    private String FechaEdicion;
    public String toString(){
        return "Título: "+Titulo+"\n"+Edicion+"a. edición\nAutor: "+PrimerApellido+","+SegundoNombre+"."+PrimerNombre+
                "\nISBN: "+ISBN+"\n"+Editorial+", "+Ciudad+" ("+Pais+"),"+FechaEdicion+"\n"+
                Paginas+" páginas";
    }
    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
    public String getPrimerNombre() {
        return PrimerNombre;
    }
    public void setPrimerNombre(String PrimerNombre) {
        this.PrimerNombre = PrimerNombre;
    }
    public String getSegundoNombre() {
        return SegundoNombre;
    }
    public void setSegundoNombre(String SegundoNombre) {
        this.SegundoNombre = SegundoNombre;
    }
    public String getPrimerApellido() {
        return PrimerApellido;
    }
    public void setPrimerApellido(String PrimerApellido) {
        this.PrimerApellido = PrimerApellido;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public int getPaginas() {
        return Paginas;
    }
    public void setPaginas(int Paginas) {
        this.Paginas = Paginas;
    }
    public String getEdicion() {
        return Edicion;
    }
    public void setEdicion(String Edicion) {
        this.Edicion = Edicion;
    }
    public String getEditorial() {
        return Editorial;
    }
    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }
    public String getCiudad() {
        return Ciudad;
    }
    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }
    public String getPais() {
        return Pais;
    }
    public void setPais(String Pais) {
        this.Pais = Pais;
    }
    public String getFechaEdicion() {
        return FechaEdicion;
    }
    public void setFechaEdicion(String FechaEdicion) {
        this.FechaEdicion = FechaEdicion;
    }
}
