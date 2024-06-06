package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import services.ServicoJuros;

public class Programa {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);


        System.out.println(":::: CALCULO DE JUROS :::: \n");

        System.out.print("O imposto será do Brasil ou Estados Unidos? (b/e) ");
        char ch = sc.next().charAt(0); 

         // charAt() retorna o valor do char no index específico
        // Como minhas opções possuem apenas um char eu informo o indice 0
        // que é a primeira posição


        System.out.println("Entre com a quantia para ser calculado o juro: ");
        double quant = sc.nextDouble();

        System.out.println("Em quantos meses será pago? ");
        int quantMes = sc.nextInt();

        // trabalhando com a variavel 'ch'
        if (ch == 'b') {
            ServicoJuros juroBR = new ServicoJuros(quant, quantMes);
            juroBR.pagamentoBr(quant, quantMes);

            System.out.printf("Pagamento após %d meses é %.2f\n", quantMes, juroBR.pagamentoBr(quant, quantMes));

        }
        if (ch == 'e') {
            ServicoJuros juroUS = new ServicoJuros(quant, quantMes);
            juroUS.pagamentoUs(quant, quantMes);

            System.out.printf("Pagamento após %d meses é %.2f\n", quantMes, juroUS.pagamentoUs(quant, quantMes));
        }
        
        sc.close();

    }
}
