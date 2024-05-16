package entidades;

public class Animal {

    //Atributos para classe Animal
    private String nome;
    private float comprimento;
    private int numPatas;
    private String cor;
    private String ambiente;
    private float veloMedia;

    //Construtor padrão
    public Animal() {
        
    }

    public Animal(String nome, float comprimento, int numPatas, String cor, String ambiente, float veloMedia) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numPatas = numPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.veloMedia = veloMedia;
    }

    
    //Metodos get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public float getVeloMedia() {
        return veloMedia;
    }

    public void setVeloMedia(float veloMedia) {
        this.veloMedia = veloMedia;
    }

    //Metodo que imprime um relatorio
    public void dados() {
        System.out.printf(this.nome, this.comprimento, this.numPatas, this.cor, this.ambiente, this.veloMedia);
    }
}
