package entidades;

import java.util.Scanner;

public class Cd extends Midia {

    private int nMusicas;

    // construtor
    public Cd() {

    }
    public Cd(int codigo, double preco, String nome, int nMusicas) {
        super(codigo, preco, nome);
        this.nMusicas = nMusicas;
    }

    //Função para impressao do tipo.
    public String getTipo() {
        return "CD: ";  }
    // Função que retorna o conteúdo do campos desta
    // classe e da classe Midia (usando super !).
    public String getDetalhes() {
        return super.getDetalhes() + "\n" +
        "Numero de musicas: " + nMusicas + "\n";
    }

    public void setMusica(int nMus) {
        nMusicas = (nMus > 0) ? nMus : 0;
        // Essa linha acima usa um operador ternário
        // é um atalho para escrever uma instrução if-else
        // condição ? valorSeVerdadeiro : valorSeFalso 
    }

    public void inserirDados() {
        // leitura de dados
        super.inserirDados();

        Scanner in = new Scanner(System.in);
        // leitura de dados do teclado
        System.out.println("Numero de Musicas: ");
        int nMus = in.nextInt();

        // Enviando os dados lidos para as funcoes set.
        setMusica(nMus);

        in.close();
    } 
}
