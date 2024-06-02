package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Candidato;
import exceptions.IdadeExceptions;

public class Votar {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        try {
            
            Candidato c = new Candidato();

            c.setNome("Ariel");
            c.setIdade(13);
            
        } catch (IdadeExceptions e) {
            
            System.out.println(e.getMessage());

        }

        sc.close();

    }
}
