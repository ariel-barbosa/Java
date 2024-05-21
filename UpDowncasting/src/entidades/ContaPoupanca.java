package entidades;

public class ContaPoupanca extends Conta{
    private double juros;

    
    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(int numero, String titular, double saldo, double juros) {
        super(numero, titular, saldo);
        this.juros = juros;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public void alterarSaldo() {
        saldo += saldo * juros;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= 0) {
            return false; // Valor do saque deve ser positivo
        }

        if (valor > saldo) {
            return false; // Saldo insuficiente
        }

        saldo -= valor;
        return true; // Saque realizado com sucesso
    }

    public void updateBalance() {
        
        throw new UnsupportedOperationException("Unimplemented method 'updateBalance'");
    }
}
