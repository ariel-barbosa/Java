package entidades;

public class ContaEmpresa extends Conta {

	private Double limiteEmp;
	
	public ContaEmpresa() {
		super();
	}

	public ContaEmpresa(Integer number, String holder, Double balance, Double limiteEmp) {
		super(number, holder, balance);
		this.limiteEmp = limiteEmp;
	}

	public Double getLoanLimit() {
		return limiteEmp;
	}

	public void setLimiteEmp(Double limiteEmp) {
		this.limiteEmp = limiteEmp;
	}
	
	public void loan(double amount) {
		if (amount <= limiteEmp) {
			saldo += amount - 10.0;
		}
	}

    @Override
    public boolean sacar(double valor) {
        return super.sacar(valor);
    }
	
	
}