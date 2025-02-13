public class Jogo {
    private String nomeDoJogo;
    private String requisitos;

    public Jogo(){
        
    }
    public Jogo(String nomeDoJogo, String requisitos) {
        this.nomeDoJogo = nomeDoJogo;
        this.requisitos = requisitos;
    }
    public String getNomeDoJogo() {
        return nomeDoJogo;
    }
    public void setNomeDoJogo(String nomeDoJogo) {
        this.nomeDoJogo = nomeDoJogo;
    }
    public String getRequisitos() {
        return requisitos;
    }
    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }
    
}
