package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Empregado;
import entidades.Terceiro;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Empregado> list = new ArrayList<>();
		
		System.out.print("Quantos Empregados: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Empregado #" + i + " dados:");
			System.out.print("É Terceirizado (y/n)? ");
			char ch = sc.next().charAt(0);

			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.print("Horas: ");
			int horas = sc.nextInt();

			System.out.print("Valor por Hora: ");
			double valorPorHora = sc.nextDouble();

			if (ch == 'y') {
				System.out.print("Valor da Despesa Adicional: ");
				double despesaAdd = sc.nextDouble();
				list.add(new Terceiro(nome, horas, valorPorHora, despesaAdd));
			}
			else {
				list.add(new Empregado(nome, horas, valorPorHora));
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Empregado emp : list) {
			System.out.println(emp.getNome() + " - $ " + String.format("%.2f", emp.pagamento()));
		}
		
		sc.close();
	}
}