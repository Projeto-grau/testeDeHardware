public class Comparaçao {
    private int cod_comparaçao;
    private String testeAntigo;
    private String testeAtual;
    public Comparaçao(){
        
    }
    
    public Comparaçao(int cod_comparaçao, String testeAntigo, String testeAtual) {
        this.cod_comparaçao = cod_comparaçao;
        this.testeAntigo = testeAntigo;
        this.testeAtual = testeAtual;
    }

    public int getCod_comparaçao() {
        return cod_comparaçao;
    }

    public void setCod_comparaçao(int cod_comparaçao) {
        this.cod_comparaçao = cod_comparaçao;
    }

    public String getTesteAntigo() {
        return testeAntigo;
    }

    public void setTesteAntigo(String testeAntigo) {
        this.testeAntigo = testeAntigo;
    }

    public String getTesteAtual() {
        return testeAtual;
    }

    public void setTesteAtual(String testeAtual) {
        this.testeAtual = testeAtual;
    }

   
    }
