package aplicacao;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Locacao;
import entidades.Veiculo;
import servicos.TaxaServicoBrasil;
import servicos.ServicoDeLocacao;
import servicos.TaxaServico;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String modelo = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
		LocalDateTime inicio = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Retorno (dd/MM/yyyy HH:mm): ");
		LocalDateTime fim = LocalDateTime.parse(sc.nextLine(), fmt);
		
		Locacao cr = new Locacao(inicio, fim, new Veiculo(modelo));

		System.out.print("Entre com o preço por hora: ");
		double precoHora = sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		double precoDia = sc.nextDouble();
		
		ServicoDeLocacao servicoLocacao = new ServicoDeLocacao(precoHora, precoDia, new TaxaServicoBrasil());
		
		servicoLocacao.processoRecibo(cr);

		System.out.println("FATURA:");
		System.out.println("Pagamento basico: " + String.format("%.2f", cr.getRecibo().getPagamentoBasico()));
		System.out.println("Imposto: " + String.format("%.2f", cr.getRecibo().getTaxa()));
		System.out.println("Pagamento total: " + String.format("%.2f", cr.getRecibo().getPagamentoTotal()));
		
		sc.close();
	}
}