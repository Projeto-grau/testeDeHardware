public class Jogo {
    private int cod_jogo;
    private String nome;
    private String requisitos;

    public Jogo(){
        

}

    public Jogo(int cod_jogo, String nome, String requisitos) {
        this.cod_jogo = cod_jogo;
        this.nome = nome;
        this.requisitos = requisitos;
    }

    public int getCod_jogo() {
        return cod_jogo;
    }

    public void setCod_jogo(int cod_jogo) {
        this.cod_jogo = cod_jogo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }
    
}