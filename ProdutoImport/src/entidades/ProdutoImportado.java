package entidades;

public class ProdutoImportado extends Produto {
    // atributos
    private Double taxaAlfandega;


    // construtor
    public ProdutoImportado() {
        super();
    }
    public ProdutoImportado(String nome, Double preco, Double taxaAlfandega) {
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;
    }

    // get e set
    public Double getTaxaAlfandega() {
        return taxaAlfandega;
    }
    public void setTaxaAlfandega(Double taxaAlfandega) {
        this.taxaAlfandega = taxaAlfandega;
    }


    // sobreescrevendo metodo da super class
    @Override 
    public Double etiquetaPreco() {
        return super.etiquetaPreco();
    }

    // método preçoTotal
    public Double precoTotal() {
        // Calcula o preço total com base no preço base e na taxa de alfândega
        return preco + (preco * taxaAlfandega / 100);
    }
    
}
