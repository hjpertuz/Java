
package punto10;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Reloj {
    private int horas;
    private int minutos;
    private int segundos;
    private int formato;
    public Reloj(int formato){
        Calendar calendario = new GregorianCalendar();
        this.horas = calendario.get(Calendar.HOUR_OF_DAY);
        this.minutos = calendario.get(Calendar.MINUTE);
        this.segundos = calendario.get(Calendar.SECOND);
        this.formato = formato;
    }
    public String getHora(){
        if (formato==0) {
            return getHoraMilitar();
        }else if(formato==1){
            return getAMPM();
        }else{
            return getTexto();
        }
        
    }
    public int getHoras() {return horas;}
    public void setHoras(int horas) {this.horas = horas;}
    public int getMinutos() {return minutos;}
    public void setMinutos(int minutos) {this.minutos = minutos;}
    public int getSegundos() {return segundos;}
    public void setSegundos(int segundos) {this.segundos = segundos;}
    public int getFormato() {return formato;}
    public void setFormato(int formato) {this.formato = formato;}
    
    public void SSP(){this.segundos++;}
    public void MMP(){this.minutos++;}
    public void HHP(){this.horas++;}
    public void SSM(){this.segundos--;}
    public void MMM(){this.minutos--;}
    public void HHM(){this.horas--;}
    
    public String getHoraMilitar(){
        return this.horas+":"+this.minutos+":"+this.segundos;
    }
    public String getAMPM(){
        String ampm = this.horas >= 12 ? "p.m":"a.m";
        int h = this.horas > 12 ? this.horas-12:this.horas;
        return h+":"+this.minutos+":"+this.segundos+" "+ampm;
    }
    public String getTexto(){
        int h = this.horas > 12 ? this.horas-12:this.horas;
        String ampm = this.horas >= 12 ? "p.m":"a.m";
        String[] a = {"empunto","una","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez","once","doce","trece","catorce",
        "quince","dieciseis","diecisiete","dieciocho","diecinueve","veinte"};
        String[] b = {"veinte","treinta","cuarenta","cincuenta","cincuenta"};
        String min="";
        if (minutos>20) {
            String m = minutos+"";
            int d = Integer.valueOf(m.substring(0, 1));
            int u = Integer.valueOf(m.substring(1, 2));
            min = b[d-2]+" y "+a[u];
        }else{
            min = a[minutos];
        }
        return a[h]+" y "+min+" "+ampm;
    }
}
