package entidades;

import exceptions.BusinessException;

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

    // metodo de deposito
    public void deposito(double valor) {
        saldo += valor;
    }

    // metodo para validar o saque antes de sacar
    private void validaSaque(double valor) {
		if (valor > getLimiteSaque()) {
			throw new BusinessException("Erro de saque: A quantia excede o limite de saque");
		} 
		if (valor > getSaldo()) {
			throw new BusinessException("Erro de saque: Saldo insuficiente... seu pobre!!");
		}
	}

    // metodo de saque
    public void saque(double valor) {
        validaSaque(valor);
        saldo -= valor;
    }
    @Override
    public String toString() {
        return "Conta [titular=" + titular + ", saldo=" + saldo + "]";
    }

    

    

    
    
}
