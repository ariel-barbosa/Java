package services;

import java.time.LocalDate;


import entidades.Contrato;
import entidades.Parcelas;


public class ServicoContrato {
	
	private PagOnline pagonline;
    private double valorTotal = 0;
	
	public ServicoContrato(PagOnline pagonline) {
		this.pagonline = pagonline;
	}
	
	public void processarContrato(Contrato contrato, int meses) {
		double pgSimples = contrato.getValorTotal() / meses;

        for (int i = 1; i <= meses; i++) {

            LocalDate dataParcela = contrato.getData().plusMonths(i);
            double juros = pagonline.juros(pgSimples, i);
            double valortaxa = pagonline.taxaPagamento(pgSimples + juros);
            double valorparc = pgSimples + juros + valortaxa;
            contrato.getParcelas().add(new Parcelas(dataParcela, valorparc));
            valorTotal += valorparc;

        }
	}

}
