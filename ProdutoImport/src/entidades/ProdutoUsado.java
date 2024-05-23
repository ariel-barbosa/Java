package entidades;

import java.sql.Date;

public class ProdutoUsado extends Produto {

    // atributos
    private Date fabricacao;

    // construtor 
    public ProdutoUsado() {
        super();
    }
    public ProdutoUsado(String nome, Double preco, Date fabricacao) {
        super(nome, preco);
        this.fabricacao = fabricacao;
    }

    // get e set
    public Date getFabricacao() {
        return fabricacao;
    }
    public void setFabricacao(Date fabricacao) {
        this.fabricacao = fabricacao;
    }

    
    // metodo da super class
    @Override
    public Double etiquetaPreco() {
        return super.etiquetaPreco();
    }
    
}
