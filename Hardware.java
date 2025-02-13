public class Hardware {
    private int cod_hardware;
    private String processador;
    private int memoriaRam;
    private int placaDeVideo;

    public Hardware(){

    }

    public Hardware(int cod_hardware, String processador, int memoriaRam, int placaDeVideo) {
        this.cod_hardware = cod_hardware;
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.placaDeVideo = placaDeVideo;
    }

    public int getCod_hardware() {
        return cod_hardware;
    }

    public void setCod_hardware(int cod_hardware) {
        this.cod_hardware = cod_hardware;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getPlacaDeVideo() {
        return placaDeVideo;
    }

    public void setPlacaDeVideo(int placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }

}
