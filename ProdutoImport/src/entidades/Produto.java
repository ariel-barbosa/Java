package entidades;

public class Produto {
    
    // atributos para Produto
    private String nome;
    protected Double preco;

    // construtor
    public Produto() {

    }
    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    // get e set 
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double etiquetaPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    
}
