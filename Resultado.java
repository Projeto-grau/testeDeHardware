public class Resultado {
    private int cod_resultado;
    private String jogos;
    private String presetGrafico;
    private int fps;
    public Resultado(){

    }
    public Resultado(int cod_resultado, String jogos, String presetGrafico, int fps) {
        this.cod_resultado = cod_resultado;
        this.jogos = jogos;
        this.presetGrafico = presetGrafico;
        this.fps = fps;
    }
    public int getCod_resultado() {
        return cod_resultado;
    }
    public void setCod_resultado(int cod_resultado) {
        this.cod_resultado = cod_resultado;
    }
    public String getJogos() {
        return jogos;
    }
    public void setJogos(String jogos) {
        this.jogos = jogos;
    }
    public String getPresetGrafico() {
        return presetGrafico;
    }
    public void setPresetGrafico(String presetGrafico) {
        this.presetGrafico = presetGrafico;
    }
    public int getFps() {
        return fps;
    }
    public void setFps(int fps) {
        this.fps = fps;
    }
   
}
