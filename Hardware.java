public class Hardware {
    private String processador;
    private int memoriaRam;
    private int PlacaDeVdeo;

    public Hardware(){

    }

    public Hardware(String processador, int memoriaRam, int placaDeVdeo) {
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        PlacaDeVdeo = placaDeVdeo;
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
    public int getPlacaDeVdeo() {
        return PlacaDeVdeo;
    }
    public void setPlacaDeVdeo(int placaDeVdeo) {
        PlacaDeVdeo = placaDeVdeo;
    }


}
