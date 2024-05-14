package entidades;

//SuperClasse genérica

public class ContaConmum {

    private Integer numero;
    private String titular;
    protected Double saldo;

    //Construtores
    public ContaConmum() {

    }

    public ContaConmum(Integer numero, String titular, Double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo; 
    }


    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void sacar(double valor) {
        saldo -= valor;
    }

    public void deposito(double valor) {
        saldo += valor;
    }

}
