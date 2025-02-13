public class Teste {
    private int cod_teste;
    private String tipoDeTeste;
    private String duraçaoDeTeste;
    private int temperatura;

    public Teste(){

    }

    public Teste(int cod_teste, String tipoDeTeste, String duraçaoDeTeste, int temperatura) {
        this.cod_teste = cod_teste;
        this.tipoDeTeste = tipoDeTeste;
        this.duraçaoDeTeste = duraçaoDeTeste;
        this.temperatura = temperatura;
    }

    public int getCod_teste() {
        return cod_teste;
    }

    public void setCod_teste(int cod_teste) {
        this.cod_teste = cod_teste;
    }

    public String getTipoDeTeste() {
        return tipoDeTeste;
    }

    public void setTipoDeTeste(String tipoDeTeste) {
        this.tipoDeTeste = tipoDeTeste;
    }

    public String getDuraçaoDeTeste() {
        return duraçaoDeTeste;
    }

    public void setDuraçaoDeTeste(String duraçaoDeTeste) {
        this.duraçaoDeTeste = duraçaoDeTeste;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

}
