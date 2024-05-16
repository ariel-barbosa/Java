package entidades;

public class Mamifero extends Animal {

    //Atributo para classe Mamifero
    private String alimento;

    //Construtor
    public Mamifero(String string) {
        super();
    }


    public Mamifero(String nome, float comprimento, int numPatas, String cor, String ambiente, float veloMedia) {
        super
    }


    //get e set
    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public void dados() {
        System.out.printf(this.alimento);
    }

    
    
}
