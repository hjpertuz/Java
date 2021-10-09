
package Punto4;

public class SobreMesa extends Ordenador {
    
    private String tipoTorre;

    public SobreMesa() {
    }

    public SobreMesa(String tipoTorre) {
        this.tipoTorre = tipoTorre;
    }

    public String getTipoTorre() {
        return tipoTorre;
    }

    public void setTipoTorre(String tipoTorre) {
        this.tipoTorre = tipoTorre;
    }

    @Override
    public String verInf() {
        return super.infOrdenador() + "Tipo de Torre: " + this.tipoTorre;
    }
    
    
    
}
