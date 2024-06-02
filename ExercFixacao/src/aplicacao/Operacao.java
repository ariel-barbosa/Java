package aplicacao;
import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;


public class Operacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        
        // entrada de dados da conta bancaria
        System.out.println("Numero: ");
        int num = sc.nextInt();

        System.out.println("Titular: ");
        sc.nextLine();
        String titu = sc.nextLine();

        System.out.println("Saldo inicial: ");
        double sald = sc.nextDouble();

        System.out.println("Limite de Saque: ");
        double limit = sc.nextDouble();

        Conta c = new Conta(num, titu, sald, limit);

        System.out.println("Valor de saque: ");
        double saq = sc.nextDouble();
        
        // bloco try-catch para lançar exceções
        try {

            c.saque(saq);
            System.out.format("Titular: %s \n", titu); 
            System.out.format("Novo saldo: %.2f", sald - saq);
            

        } catch (RuntimeException e) {

            System.out.println(e.getMessage());
        }

        

        sc.close();

        
    }
   
}
