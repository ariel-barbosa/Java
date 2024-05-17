package entidades;

public class Mamifero extends Animal {

    //Atributo para classe Mamifero
    private String alimento;
    public Object ursoCanada;

    //Construtor
    public Mamifero(String string) {
        super();
    }


    public Mamifero(String nome, float comprimento, int numPatas, String cor, String ambiente, float veloMedia, String alimento) {
        super(nome, comprimento, numPatas, cor, ambiente, veloMedia);
        this.alimento = alimento;
    }


    //get e set
    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public void dados() {
        System.out.print("\nNome: " + getNome());
        System.out.print("\nComprimento: " + getComprimento());
        System.out.print("\nPatas: " + getNumPatas());
        System.out.print("\nCor: " + getCor());
        System.out.print("\nAmbiente: " + getAmbiente());
        System.out.print("\nAlimento: " + alimento);
        System.out.println("\n");
    }
    

    
    
}
