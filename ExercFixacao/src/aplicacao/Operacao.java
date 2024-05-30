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

        try {

            System.out.println("Valor de saque: ");
            double saq = sc.nextDouble();

            double novosaldo = c.getSaldo() - saq;
            System.out.printf("Novo saldo: %.2f", novosaldo);

            c.saque(saq);

        } catch (RuntimeException e) {

            System.out.println(e.getMessage());
        }
        sc.close();

        
    }
   
}
