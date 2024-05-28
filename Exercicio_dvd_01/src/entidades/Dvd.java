package entidades;

import java.util.Scanner;

public class Dvd extends Midia {

    // atributos 
    private int nFaixas;

    // construtor
    public Dvd() {
        super();
    }
    public Dvd(int codigo, double preco, String nome, int nFaixas) {
        super(codigo, preco, nome);
        this.nFaixas = nFaixas;
    }

    //Função para impressao do tipo.
    public String getTipo() {
        return "DVD: "; 
    }

    // Função que retorna o conteúdo do campos desta
    // classe e da classe Midia (usando super !).
    public String getDetalhes() {
        return super.getDetalhes() + "\n" +
        "Numero de faixas: " + nFaixas + "\n";  
    }

    public void setFaixas(int nfaix) {
        nFaixas = (nfaix > 0) ? nfaix:0;  // if-else
    }

    public void inserirDados() {
        super.inserirDados();
        Scanner in = new Scanner(System.in);

        System.out.println("Numero de faixas: ");
        int nfaix = in.nextInt();

        setFaixas(nfaix);

        in.close();
    }

// fim
}
