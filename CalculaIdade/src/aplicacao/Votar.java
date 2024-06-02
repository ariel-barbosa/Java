package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Candidato;
import exceptions.IdadeExceptions;

public class Votar {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a idade da pessoa: ");
            int idade = sc.nextInt();

            
            Candidato c = new Candidato(idade);

        try {

            c.setIdade(idade);

        } catch (IdadeExceptions e) {
            
            System.out.println(e.getMessage());

        }

        sc.close();

    }
}
