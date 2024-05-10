package aplicacao;

import entidades.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> lista = new ArrayList<>();

        
		//Lendo os dados dos funcionarios
		System.out.print("Quantos funcionários você deseja registrar? ");
		int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sc.nextLine();
			System.out.println("Funcionário #" + i + ": ");

            System.out.println("Nome: ");
            String nome = sc.nextLine();

            //Para não aceitar nomes repetidos
            boolean nomeRepetido = false;

            for (Funcionario funcionario : lista) {
                if (funcionario.getNome().equals(nome)) {
                    nomeRepetido = true;

                    System.out.println("Nome já cadastrado. Digite outro:");
                    nome = sc.nextLine();

                }
            }
                     

            System.out.println("Salário: ");
            double salario = sc.nextDouble();

            lista.add(new Funcionario(nome, salario));

            
        }

        for (Funcionario funcionario : lista) {
            System.out.format("Lista de Funcionarios: ", funcionario.getNome());
        }

        System.out.println("Escolha um funcionário da lista: ");
        String escolhido = sc.nextLine();


        // lista.add(new Funcionario());







        
    }

    

}
