package entidades_02;

public class Cliente {
    //atributos para Cliente
    private String nome;

    //construtor
    public Cliente() {

    }
    public Cliente(String nome) {
        this.nome = nome;
    }

    //gets e sets
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    

    //toString
    public String toString() {
        return "Cliente [nome=" + nome + "]";
    }
    
}
