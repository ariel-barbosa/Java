package entidades;

public class Empregado {

    //atributos
    protected String nome;
    protected float salario;

    //get e set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    //metodo toString
    public String toString() {
        return "Empregado [nome=" + nome + ", salario=" + salario + "]";
    }

}
