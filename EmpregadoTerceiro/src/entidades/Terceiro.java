package entidades;

public class Terceiro extends Empregado {

	// atributo apenas da classe Terceiro
	private Double despesaAdd;


	// construtor
	public Terceiro() {
		super();
	}
	public Terceiro(String nome, int horas, Double valorPorHora, Double despesaAdd) {
		super(nome, horas, valorPorHora);
		this.despesaAdd = despesaAdd;
	}

	// gets e sets
	public Double getDespesaAdd() {
		return despesaAdd;
	}
	public void setDespesaAdd(Double despesaAdd) {
		this.despesaAdd = despesaAdd;
	}
	

	// método para pagar o empregado
	@Override
	public double pagamento() {
		return super.pagamento() + despesaAdd * 1.1;
	}
}