public class Recomendaçao {
    
    private int cod_recomendacao;
    private String recomendaçaoDePeças;
    private String compatibilidade;

    public Recomendaçao(){
        
    }

    public Recomendaçao(int cod_recomendacao, String recomendaçaoDePeças, String compatibilidade) {
        this.cod_recomendacao = cod_recomendacao;
        this.recomendaçaoDePeças = recomendaçaoDePeças;
        this.compatibilidade = compatibilidade;
    }

    public int getCod_recomendacao() {
        return cod_recomendacao;
    }

    public void setCod_recomendacao(int cod_recomendacao) {
        this.cod_recomendacao = cod_recomendacao;
    }

    public String getRecomendaçaoDePeças() {
        return recomendaçaoDePeças;
    }

    public void setRecomendaçaoDePeças(String recomendaçaoDePeças) {
        this.recomendaçaoDePeças = recomendaçaoDePeças;
    }

    public String getCompatibilidade() {
        return compatibilidade;
    }

    public void setCompatibilidade(String compatibilidade) {
        this.compatibilidade = compatibilidade;
    }

}
