package entidades;

public class Empregado {

	// atributos para Empregado interno
	private String nome;
	private Integer horas;
	private Double valorPorHora;
	

	// construtor 
	public Empregado() {
	}
	public Empregado(String nome, Integer horas, Double valorPorHora) {
		this.nome = nome;
		this.horas = horas;
		this.valorPorHora = valorPorHora;
	}


	// gets e sets
	public String getnome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getHours() {
		return horas;
	}
	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	public Double getValuePerHour() {
		return valorPorHora;
	}
	public void setvalorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	// método para pagar o empregado
	public double pagamento() {
		return horas * valorPorHora;
	}
}