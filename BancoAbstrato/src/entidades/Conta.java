package entidades;

public abstract class Conta {
    
    //atributos
    private Integer numero;
    private String titular;
    protected Double saldo;

    // construtor
    public Conta() {

    }
    public Conta(Integer numero, String titular, Double saldo) {
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
        saldo -= valor + 4.89;
    }
    public void deposito(double valor) {
        saldo += valor;
    }

    
}
