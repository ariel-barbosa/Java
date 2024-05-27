package entidades;

import java.util.Scanner;

public abstract class Midia {

    // atributos
    private int codigo;
    private double preco;
    private String nome;

    // construtor
    public Midia() {

    }
    public Midia(int codigo, double preco, String nome) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }


    // Métodos para inserir valores nos campos.
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    // metodos para retornar valores contidos nos campos
    public int getCodigo() {
        return codigo;
    }
    public double getPreco() {
        return preco;
    }
    public String getNome() {
        return nome;
    }
    
    // Função para impressao dos dados do tipo.
    public String getTipo() {
        return "Midia: ";
    }

    // Função que retorna o conteúdo do campos em forma de String.
    public String getDetalhes() {
    return "Codigo: " + getCodigo() + "\n" +
            "Preco: "  + getPreco()  + "\n" +
            "Nome: "   + getNome()   + "\n";
    }

    // Função para impressao dos dados via getDetalhes().
    public void printDados() {
        String s = getTipo() + "\n" + getDetalhes() + "\n";  
        System.out.println(s);
    }
    @Override
    public String toString() {
        return "Midia [codigo=" + codigo + ", preco=" + preco + ", nome=" + nome + "]";
    }

    // Função para leitura dos dados via teclado
    public void inserirDados() {
        Scanner in = new Scanner(System.in);

        // Leitura de dados do teclado
        System.out.println("\n entre com o código: ");
        int cod = in.nextInt();

        
    }
    
}
