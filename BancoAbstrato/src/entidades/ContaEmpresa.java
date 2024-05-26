package entidades;

public class ContaEmpresa extends Conta {

	private Double limiteEmp;
	
	public ContaEmpresa() {
		super();
	}

	public ContaEmpresa(Integer conta, String titular, Double saldo, Double limiteEmp) {
		super(conta, titular, saldo);
		this.limiteEmp = limiteEmp;
	}

	public Double getLoanLimit() {
		return limiteEmp;
	}

	public void setLimiteEmp(Double limiteEmp) {
		this.limiteEmp = limiteEmp;
	}
	
	public void emprestimo(double amount) {
		
		if (amount <= limiteEmp) {
			saldo += amount - 10.0;
		}
	}

    @Override
    public void sacar(double valor) {
        saldo -= valor + limiteEmp;
    }
	
	
}