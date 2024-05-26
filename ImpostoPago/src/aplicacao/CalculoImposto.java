package aplicacao;

import entidades.Contribuinte;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculoImposto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // criando list do tipo Contribuinte
        List<Contribuinte> lista = new ArrayList<>();

        // entrada de dados
        System.out.printf("Informe a quantidade de contribuintes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sc.nextLine();

            System.out.printf("\nContribuinte #%d: \n", i);
            System.out.printf("Pessoa física ou jurídica? (f/j): ");
            char ch = sc.next().charAt(0);

            sc.nextLine();

            if (ch == 'f') {
                System.out.printf("Nome: ");
                String nome = sc.nextLine();
                System.out.printf("Renda anual: ");
                double renda = sc.nextDouble();
                System.out.printf("Gastos com saúde: ");
                double gastos = sc.nextDouble();
                //Adiciona os atributos a lista com o construtor de Fisica\\
                lista.add(new PessoaFisica(nome, renda, gastos));

            } else if (ch == 'j') {
                System.out.printf("Nome: ");
                String nome = sc.nextLine();
                System.out.printf("Renda anual: ");
                double renda = sc.nextDouble();
                System.out.printf("Quantidade de Funcionarios: ");
                int numFuncionario = sc.nextInt();
                //Adiciona os atributos a lista com o construtor de Juridico\\
                lista.add(new PessoaJuridica(nome, renda, numFuncionario));
            }
        }

        // criando variavel Total e já atribuindo a ela o valor 0
        double total = 0;

        System.out.println("Taxas Pagas: ");

        for (Contribuinte contribuinte : lista) {
            System.out.printf("\n%s: R$ %.2f", contribuinte.getNome(), contribuinte.taxa());
            total = total + contribuinte.taxa();
        }

        System.out.printf("\n\nO total de taxas pagas foi R$ 3%.2f", total);

        sc.close();

        
    }
}
