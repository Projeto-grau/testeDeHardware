public class Resultado {
    private String jogos;
    private String presetGrafico;
    private int fps;
    public Resultado(){

    }
    public Resultado(String jogos, String presetGrafico, int fps) {
        this.jogos = jogos;
        this.presetGrafico = presetGrafico;
        this.fps = fps;
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
