
package parcial;

public class Host {
    private InterfazRed interfazRed;
    private String Equipo;
    private String sistema;
    public Host(String equipo, String sistema){
        this.Equipo=equipo;
        this.sistema=sistema;
        interfazRed= new InterfazRed();
    }
    public void configurar(int A, int B, int C, int D){
        interfazRed.setIP(A+","+B+","+C+","+D);
    }
    public boolean  conectar (Red red){
        for (Host host : red.getHosts()) {
            if(interfazRed.getIP().equals(host.interfazRed.getIP())){
                interfazRed.setRed(red);
                return true;
            }
        }
        return false;
    }
    public String ping (Host host, String msg){
        String mensaje="tiempo agotado para "+host.getEquipo();
        if (host.interfazRed.getRed()!=null) {
            if (host.interfazRed.getRed().getClaseRed().equals(interfazRed.getRed().getClaseRed())) {
                return "Mensaje "+msg+" enviado a "+host.getEquipo();
            }
        }
        return mensaje;
    }
    public String ping(String msg){
        String mensaje="";
        for (Host host : interfazRed.getRed().getHosts()) {
            if (!host.getInterfazRed().getIP().equals(interfazRed.getIP())) {
                mensaje = mensaje+"Mensaje "+msg+" enviado a "+host.getEquipo()+"\n";
            }
            
        }
        return mensaje;
    }
    public InterfazRed getInterfazRed() {
        return interfazRed;
    }
    public void setInterfazRed(InterfazRed interfazRed) {
        this.interfazRed = interfazRed;
    }

    public String getEquipo() {
        return Equipo;
    }

    public void setEquipo(String Equipo) {
        this.Equipo = Equipo;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }
    
}
