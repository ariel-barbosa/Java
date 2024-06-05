package dispositivos;

public class DeviceCombo extends Dispositivo implements Scanner, Impressora {

    // usando herança e implementanado duas interfaces
    public DeviceCombo() {
        super();
    }
    public DeviceCombo(String serialNumber) {
        super(serialNumber);
    }

    // metodos sobreescritos
    // por herdar a classe Dispositivo irá ter o metodo 
    // processarDocumento

    // como implementa duas interfaces teremos os metodos das duas interfaces
    // nessa classe DeviceCombo
    @Override
    public void processarDocumento(String doc) {
        System.out.println("Processando" + doc);
    }

    @Override
    public String scan() {
        return "Escaniado!";
    }

    @Override
    public void print(String doc) {
        System.out.println("Imprimindo" + doc);
    }

    
    
}
