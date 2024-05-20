package entidades_01;

public class Empregado {

    //atributos
    private String nome;
    protected float salario;

    public Empregado(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }


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
