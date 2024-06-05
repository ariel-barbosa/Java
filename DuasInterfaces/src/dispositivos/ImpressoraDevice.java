package dispositivos;

public class ImpressoraDevice extends Dispositivo implements Impressora {

    // usando herança e interface
    // construtor
     public ImpressoraDevice(String serialNumber) {
        super(serialNumber);
     }

    @Override
    public void processarDocumento(String doc) {
        System.out.println("Processando" + doc);
    }

    @Override
    public void print(String doc) {
        System.out.println("Imprimindo" + doc);
    }

     

}
