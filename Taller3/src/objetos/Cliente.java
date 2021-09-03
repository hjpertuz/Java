
package objetos;

public class Cliente {

    private String NombreCliente;
    private int SaldoInicial;
    private int TotalAbonos;
    private int CreditosAplicados;
    private int LimiteCredito;
    private int NuevoSaldo;
    
     public String getNombreCliente(){return NombreCliente;}
    public void setNombreCliente(String NombreCliente){this.NombreCliente = NombreCliente;}
    
    public int getSaldoInicial(){return SaldoInicial;}
    public void setSaldoInicial(int SaldoInicial){this.SaldoInicial = SaldoInicial;}
    
    public int getTotalAbonos(){return TotalAbonos;}
    public void setTotalAbonos(int TotalAbonos){this.TotalAbonos = TotalAbonos;}
    
    public int getCreditosAplicados(){return CreditosAplicados;}
    public void setCreditosAplicados(int CreditosAplicados){this.CreditosAplicados = CreditosAplicados;}
    
    public int getLimiteCredito(){return LimiteCredito;}
    public void setLimiteCredito(int LimiteCredito){this.LimiteCredito = LimiteCredito;}
    
    public int getNuevoSaldo(){
        NuevoSaldo = SaldoInicial + TotalAbonos - CreditosAplicados;
        return NuevoSaldo;
    }
    public String getMensaje(){
        return NuevoSaldo > LimiteCredito ? "Se excedió el límite de su crédito" : "";
    }

   
}
