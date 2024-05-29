package entidades;

public class Conta {
    
    // atributos
    private Integer numero;
    private String titular;
    private Double saldo;
    private Double limiteSaque;

    // construtor
    public Conta() {

    }
    public Conta(int numero, String titular, double saldo, double limiteSaque) {

        // exeçôes
        if (saldo == 0) {
            throw new RuntimeException("Saldo Insuficiente");
        }
        if (limiteSaque < saldo) {
            throw new RuntimeException("Limite insificiente");
        }
        
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    // get e set
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
    
    public Double getLimiteSaque() {
        return limiteSaque;
    }
    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    // metodo de saque
    public void sacar(double valor) {

    }

    
    
}
