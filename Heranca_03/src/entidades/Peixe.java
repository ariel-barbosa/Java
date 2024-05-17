package entidades;

public class Peixe extends Animal {

    //atributos
    private String caracteristica;

    //metodo construtor
    public Peixe() {
        super();
    }
    public Peixe(String nome, float comprimento, int numPatas, String cor, String ambiente, float veloMedia, String caracteristica) {
        super(nome, comprimento, numPatas, cor, ambiente, veloMedia);
        this.caracteristica = caracteristica;
    }

    //metodos get e set
    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    //metodo para mostrar os dados do peixe
    @Override
    public void dados() {
        System.out.print("\nNome: " + getNome());
        System.out.print("\nComprimento: " + getComprimento());
        System.out.print("\nPatas: " + getNumPatas());
        System.out.print("\nCor: " + getCor());
        System.out.print("\nAmbiente: " + getAmbiente());
        System.out.print("\nVelocidade: " + veloMedia);
        System.out.print("\nCaracteristicas: " + caracteristica);
    }
    

    
}
