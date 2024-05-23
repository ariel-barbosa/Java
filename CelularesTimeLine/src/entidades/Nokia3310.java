package entidades;

public class Nokia3310 extends CelularBasico {

    private float memoria;
    private String camera;
    private String wifi;
    private String bluetooth;

    // construtor
    public Nokia3310() {

    }
    public Nokia3310(float memoria, String camera, String wifi, String bluetooth, String marca, String modelo, float bateria) {
        super(marca, modelo, bateria);
        this.memoria = memoria;
        this.camera = camera;
        this.wifi = wifi;
        this.bluetooth = bluetooth;
    }

    // gets e sets
    public float getMemoria() {
        return memoria;
    }
    public void setMemoria(float memoria) {
        this.memoria = memoria;
    }
    public String getCamera() {
        return camera;
    }
    public void setCamera(String camera) {
        this.camera = camera;
    }
    public String getWifi() {
        return wifi;
    }
    public void setWifi(String wifi) {
        this.wifi = wifi;
    }
    public String getBluetooth() {
        return bluetooth;
    }
    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }

    @Override
    public boolean ligar() {
        return true;
    }

    @Override
    public boolean atender() {
        return true;
    }
    
}
