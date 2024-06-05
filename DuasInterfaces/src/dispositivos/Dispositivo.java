package dispositivos;

public abstract class Dispositivo {

    // atributos
    private String serialNumber;

    // construtor
    public Dispositivo() {

    }
    public Dispositivo(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    // get e set
    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public abstract void processarDocumento(String doc);

}