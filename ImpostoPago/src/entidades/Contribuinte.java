package entidades;

public abstract class Contribuinte {
    
    // atributos
    private String nome;
    protected double rendaAnual;

     // construtor
    public Contribuinte() {

    }
    public Contribuinte(String nome, double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }


    // get e set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getRenda() {
        return rendaAnual;
    }
    public void setRenda(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    // metodo do tipo abstrato
    public abstract double taxa();


     
}
