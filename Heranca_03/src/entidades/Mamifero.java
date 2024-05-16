package entidades;

public class Mamifero extends Animal {

    //Atributo para classe Mamifero
    private String alimento;

    //Construtor
    public Mamifero() {
        super();
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
