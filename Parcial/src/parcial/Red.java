
package parcial;

import java.util.ArrayList;

public class Red {
    private String ClaseRed;
    private String NombreRed;
    private int NumeroHost;
    private ArrayList<Host> Hosts;
    
    public Red(String NombreRed,String ClaseRed){
        this.NombreRed=NombreRed;
        this.ClaseRed=ClaseRed;
        if (!ClaseRed.equals("A") && !ClaseRed.equals("B") && !ClaseRed.equals("C")) {
            throw new Error("Error");
        }
        Hosts = new ArrayList<>();
    }
    public void addHost(Host host){
        if (getClaseRed().equals("A")) {
            if(getHosts().size()<3){
                getHosts().add(host);
            }
        }else if(getClaseRed().equals("B")){
            if(getHosts().size()<5){
                getHosts().add(host);
            }
        }else{
            if(getHosts().size()<7){
                getHosts().add(host);
            }
        }
    }
    
    public String getClaseRed() {
        return ClaseRed;
    }

    public void setClaseRed(String ClaseRed) {
        this.ClaseRed = ClaseRed;
    }

    public String getNombreRed() {
        return NombreRed;
    }

    public void setNombreRed(String NombreRed) {
        this.NombreRed = NombreRed;
    }

    public int getNumeroHost() {
        return NumeroHost;
    }

    public void setNumeroHost(int NumeroHost) {
        this.NumeroHost = NumeroHost;
    }

    public ArrayList<Host> getHosts() {
        return Hosts;
    }

    public void setHosts(ArrayList<Host> Hosts) {
        this.Hosts = Hosts;
    }
}
