package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entidades.Conta;
import entidades.ContaEmpresa;
import entidades.ContaPoupanca;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Conta> lista = new ArrayList<>();
		
		lista.add(new ContaPoupanca(1001, "Alex", 500.00, 0.01));
		lista.add(new ContaEmpresa(1002, "Maria", 1000.0, 400.0));
		lista.add(new ContaPoupanca(1004, "Bob", 300.0, 0.01));
		lista.add(new ContaEmpresa(1005, "Anna", 500.0, 500.0));
		
		double sum = 0.0;
		for (Conta acc : lista) {
			sum += acc.getSaldo();
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
		
		for (Conta acc : lista) {
			acc.deposito(10.0);
		}
		for (Conta acc : lista) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumero(), acc.getSaldo());
		}
	}
}