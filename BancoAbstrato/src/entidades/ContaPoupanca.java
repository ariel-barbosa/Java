package entidades;

public class ContaPoupanca extends Conta {

    // atributo desta classe
    private Double taxaJuro;

    // construtor 
    public ContaPoupanca() {
        super();
    }
    public ContaPoupanca(Integer conta, String titular, Double saldo, Double taxaJuro) {
        super(conta, titular, saldo);
        this.taxaJuro = taxaJuro;
    }


    public Double getTaxaJuro() {
        return taxaJuro;
    }
    public void setTaxaJuro(Double taxaJuro) {
        this.taxaJuro = taxaJuro;
    }

    @Override
    public boolean sacar(double valor) {
        return super.sacar(valor);
    }


    


   

    

    
    
}
