public class Atualizaçao {
    private int cod_atualizacao;
    private String jogosNovos;
    private String peçasNovas;

    public Atualizaçao(){

    }

    public Atualizaçao(int cod_atualizacao, String jogosNovos, String peçasNovas) {
        this.cod_atualizacao = cod_atualizacao;
        this.jogosNovos = jogosNovos;
        this.peçasNovas = peçasNovas;
    }

    public int getCod_atualizacao() {
        return cod_atualizacao;
    }

    public void setCod_atualizacao(int cod_atualizacao) {
        this.cod_atualizacao = cod_atualizacao;
    }

    public String getJogosNovos() {
        return jogosNovos;
    }

    public void setJogosNovos(String jogosNovos) {
        this.jogosNovos = jogosNovos;
    }

    public String getPeçasNovas() {
        return peçasNovas;
    }

    public void setPeçasNovas(String peçasNovas) {
        this.peçasNovas = peçasNovas;
    }
    
}
