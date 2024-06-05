package dispositivos;

public class ScannerDevice extends Dispositivo implements Scanner {
    
    // usando herança e interface
    // construtor 
    public ScannerDevice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processarDocumento(String doc) {
        System.out.println("Escaniando" + doc);
    }

    @Override
    public String scan() {
        return "Escaniado!";
    }



}
