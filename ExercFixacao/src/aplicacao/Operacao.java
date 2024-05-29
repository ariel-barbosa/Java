package aplicacao;
import java.util.Scanner;

import entidades.Conta;


public class Operacao {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        try {
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

            System.out.println("Valor para Sacar: ");
            double saq = sc.nextDouble();

            Conta c = new Conta(num, titu, sald, limit);

            sc.close();

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        
    }
}
