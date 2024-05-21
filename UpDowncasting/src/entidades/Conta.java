package entidades;

public class Conta {
    public int conta;
    public String titular;
    public double saldo;
    

    // construtor Conta
    public Conta(){

    }
    public Conta(int conta, String titular, double saldo) {
        this.conta = conta;
        this.titular = titular;
        this.saldo = saldo;
    }

    //metodo para sacar
    public boolean sacar(float valor) {
        if (valor <= 0) {
            return false; // Valor do saque deve ser positivo
        }

        if (valor > saldo) {
            return false; // Saldo insuficiente
        }

        saldo -= valor;
        return true; // Saque realizado com sucesso
    }

    // metodo para depositar
    public void depositar(float valor) {
        this.saldo += valor;
    }

    // get e set
    public int getConta() {
        return conta;
    }
    public void setConta(int conta) {
        this.conta = conta;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}    

