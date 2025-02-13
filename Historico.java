public class Historico {
    private int cod_historico;
    private String testesAntigos;

    public Historico(){

    }

    public Historico(int cod_historico, String testesAntigos) {
        this.cod_historico = cod_historico;
        this.testesAntigos = testesAntigos;
    }

    public int getCod_historico() {
        return cod_historico;
    }

    public void setCod_historico(int cod_historico) {
        this.cod_historico = cod_historico;
    }

    public String getTestesAntigos() {
        return testesAntigos;
    }

    public void setTestesAntigos(String testesAntigos) {
        this.testesAntigos = testesAntigos;
    }
 
}
