package aplicacao;

import java.util.Scanner;

import entidades.Cd;
import entidades.Dvd;
import entidades.Midia;

public class TestaMidia {
    public static void main(String[] args) {

        // cria um vetor de elementos que são objetos dA CLASSE Midia
        Midia[] lista = new Midia[10];

        int opcao;

        // preenche o vator com CD's
        for (int i = 0; i < 2; i++) {

            // escolhe se quer CD ou DVD
            System.out.println("Digite 1 para CD ou 2 para DVD");
            Scanner sc = new Scanner(System.in);

            opcao = sc.nextInt();

            if (opcao == 1) {
                lista[i] = new Cd();
            } else {
                lista[i] = new Dvd();
                lista[i].inserirDados();
            }

            sc.close();
        }

        // Imprimindo o conteudo de cada elemento do vetor de acordo com a  
        // classe a que ele pertence (isto e, usando polimorfismo).
        for (int i = 0; i < 2; i++) {
            lista[i].printDados();
        }
        
        
    }
}
