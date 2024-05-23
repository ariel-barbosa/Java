package entidades;



public class ProdutoUsado extends Produto {

    // atributos
    private String fabricacao;

    // construtor 
    public ProdutoUsado() {
        super();
    }
    public ProdutoUsado(String nome, Double preco, String data) {
        super(nome, preco);
        this.fabricacao = data;
    }

    // get e set
    public String getFabricacao() {
        return fabricacao;
    }
    public void setFabricacao(String fabricacao) {
        this.fabricacao = fabricacao;
    }

    
    // metodo da super class
    @Override
    public Double etiquetaPreco() {
        return super.etiquetaPreco();
    }
    
}
