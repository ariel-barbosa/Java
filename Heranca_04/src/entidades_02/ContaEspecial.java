package entidades_02;

public class ContaEspecial extends ContaCorrente {
    
    //atributos
    protected float limite;


    // construtor
    public ContaEspecial() {

    }
    public ContaEspecial(float limite, float saldo) {
        super(saldo);
        this.limite = limite;
    }

    //metodo sacar
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
    @Override
    public String toString() {
        return "ContaEspecial [limite=" + limite + "]";
    }

    
}


