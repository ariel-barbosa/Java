package entidades_02;

public class ContaCorrente {

    protected float saldo;

    //construtor 
    public ContaCorrente() {
    }
    public ContaCorrente(float saldo) {
        this.saldo = saldo;
    }
    

    //metodos get e set
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    // metodo para depositar
    public void depositar(float valor) {
        this.saldo += valor;
    }

    // metodo para sacar
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
    

    // metodo transferir do tipo boolean
    public boolean transferir(float valor, ContaCorrente contaDestino) {
        if (valor <= 0) {
            return false; // Valor da transferência deve ser positivo
        }

        if (valor > saldo) {
            return false; // Saldo insuficiente
        }

        saldo -= valor;
        contaDestino.saldo += valor;
        return true; // Transferência realizada com sucesso
    }

    //metodo toString
    public String toString() {
        return "ContaCorrente [saldo=" + saldo + "]";
    }
}
