public class Recomendaçao {
    private String RecomendaçaoDePeças;
    private String Compatibilidade;

    public Recomendaçao(){
        
    }
    public Recomendaçao(String recomendaçaoDePeças, String compatibilidade) {
        RecomendaçaoDePeças = recomendaçaoDePeças;
        Compatibilidade = compatibilidade;
    }
    public String getRecomendaçaoDePeças() {
        return RecomendaçaoDePeças;
    }
    public void setRecomendaçaoDePeças(String recomendaçaoDePeças) {
        RecomendaçaoDePeças = recomendaçaoDePeças;
    }
    public String getCompatibilidade() {
        return Compatibilidade;
    }
    public void setCompatibilidade(String compatibilidade) {
        Compatibilidade = compatibilidade;
    }
    
}
