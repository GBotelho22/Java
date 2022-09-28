import java.lang.String;

public class Tanque {

    private float volumeMax;
    private float volumeAtual;
    private float volumeMin;
    private String info;
    private float cont;
    private boolean bomba;

    public Tanque() {
    }

    public void encher(float litros) {
        this.cont = this.cont + litros;
        this.volumeAtual = this.volumeMin  + this.cont;
    }

    public void esvaziar(float litros) {
        this.cont = this.cont - litros;
        this.volumeAtual = this.volumeMin + this.cont;
    }

    public void setVolumeMax(float valor) {
        this.volumeMax = valor;
    }

    public void setVolumeMin(float min) {
        this.volumeMin = min;
    }

    public float getVolumeMax() {
        return this.volumeMax;
    }

    public float getVolumeAtual() {
        return this.volumeAtual;
    }

    public float getVolumeMin() {
        return this.volumeMin;
    }

    public String exibirinfo() {
        this.bomba = this.getVolumeAtual() < this.getVolumeMax();

        if(this.bomba == true) {
            this.info = "Ligada";
        } else {
            this.info = "Desligado";
        }

        return (this.info);
    }
}