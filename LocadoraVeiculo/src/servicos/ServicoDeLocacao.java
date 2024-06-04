package servicos;

import java.time.Duration;

import entidades.Locacao;
import entidades.Recibo;

public class ServicoDeLocacao {

	private Double precoPorDia;
	private Double precoPorHora;
	
	private TaxaServico taxaServico;

	public ServicoDeLocacao(Double precoPorDia, Double precoPorHora, TaxaServico taxaServico) {
		this.precoPorDia = precoPorDia;
		this.precoPorHora = precoPorHora;
		this.taxaServico = taxaServico;
	}
	
	public void processoRecibo(Locacao locacao) {
		
		double minutos = Duration.between(locacao.getInicio(), locacao.getFim()).toMinutes();		
		double horas = minutos / 60.0;
		
		double pagamentoBasico;
		if (horas <= 12.0) {
			pagamentoBasico = precoPorHora * Math.ceil(horas);
		}
		else {
			pagamentoBasico = precoPorDia * Math.ceil(horas / 24);
		}

		double taxa = taxaServico.taxa(pagamentoBasico);

		locacao.setRecibo(new Recibo(pagamentoBasico, taxa));
	}
}