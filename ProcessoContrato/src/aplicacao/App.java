package aplicacao;

import entidades.Contrato;
import services.ServicoContrato;
import services.PayPal;
import entidades.Parcelas;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato:");

        System.out.printf("Número: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.printf("Data: ");
        String dataS = sc.nextLine();
        LocalDate data = LocalDate.parse(dataS, fmt);

        System.out.printf("Valor do contrato: ");
        double valor = sc.nextDouble();

        Contrato contrato = new Contrato(numero, data, valor);

        System.out.printf("Quantidade de parcelas: ");
        int quant = sc.nextInt();

        ServicoContrato serc = new ServicoContrato(new PayPal());

        serc.processarContrato(contrato, quant);

        System.out.println("Parcelas:");
        for (Parcelas parcelas : contrato.getParcelas()) {
            System.out.println(parcelas);
            
        }

        sc.close();

    }
}