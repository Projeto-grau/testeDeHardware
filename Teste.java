public class Teste {
    private String tipoDeTeste;
    private String duraçaoDoTeste;
    private int temperatura;

    public Teste(){

    }

    public Teste(String tipoDeTeste, String duraçaoDoTeste, int temperatura) {
        this.tipoDeTeste = tipoDeTeste;
        this.duraçaoDoTeste = duraçaoDoTeste;
        this.temperatura = temperatura;
    }
    public String getTipoDeTeste() {
        return tipoDeTeste;
    }
    public void setTipoDeTeste(String tipoDeTeste) {
        this.tipoDeTeste = tipoDeTeste;
    }
    public String getDuraçaoDoTeste() {
        return duraçaoDoTeste;
    }
    public void setDuraçaoDoTeste(String duraçaoDoTeste) {
        this.duraçaoDoTeste = duraçaoDoTeste;
    }
    public int getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
    
}
