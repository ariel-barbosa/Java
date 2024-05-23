package aplicacao;

import entidades.Empregado;
import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Locale ptBR = Locale.forLanguageTag("pt-BR");
		Locale.setDefault(ptBR);
        Scanner sc = new Scanner(System.in);

        

        // criando objeto lista do tipo Produto
        List<Produto> lista = new ArrayList<>();

        // entrada de dados
        System.out.println("Entre com a quantidade de produtos: ");
        int n = sc.nextInt();

        // controle de entrada de dados de acordo com a quantidade digitada
        for (int i = 1; n <= i; i++) {
            System.out.println("Produto #" + i + " dados:");
			System.out.print("É um produto comum, importado ou usado? (c/i/u)? ");
            char ch = sc.next().charAt(0); 

            // charAt() retorna o valor do char no index específico
            // Como minhas opções possuem apenas um char eu informo o indice 0
            // que é a primeira posição

            System.out.println("Nome do Produto: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.println("Preço do Produto: ");
            double preco = sc.nextDouble();

            // trabalhando com a variavel 'ch' 
            if (ch == 'i') {
                System.out.println("Taxa de Importação: ");
                double taxa = sc.nextDouble();

                // instanciando o objeto lista
                lista.add(new ProdutoImportado(nome, preco, taxa));

            } else if (ch == 'u') {
                System.out.println("Data de fabricação: (DD/MM/AA)");
                String data = sc.nextLine(); // Pega a data do usuário como string

                // // Define o padrão de formatação
                // SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

                //  // Converte a string para Date
                // Date dataConvertida = new SimpleDateFormat(dataString);

                lista.add(new ProdutoUsado(nome, preco, data));             

            } else {

                lista.add(new Produto(nome, preco));
            }
        }

        System.out.println();
		System.out.println("PAYMENTS:");
		for (Empregado emp : lista) {
			System.out.println(emp.getNome() + " - $ " + String.format("%.2f", emp.()));
		}




        sc.close();



    }
}
