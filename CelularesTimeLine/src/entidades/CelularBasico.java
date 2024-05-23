package entidades;

public class CelularBasico {

    private String marca;
    private String modelo;
    private float bateria;

    // construtor
    public CelularBasico() {

    }
    public CelularBasico(String marca, String modelo, float bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }


     // gets e sets
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public float getBateria() {
        return bateria;
    }
    public void setBateria(float bateria) {
        this.bateria = bateria;
    }
    

    // ligar e atender
    public boolean ligar() {
        return true;
    }

    public boolean atender() {
        return true;
    }


}