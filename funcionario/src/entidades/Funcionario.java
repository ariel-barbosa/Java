package entidades;

public class Funcionario {

    //Atributos do Funcionario
    private String nome;
    private double salario;
    private double novoSalario;
    private double aumento;

    //Construtor padrão
    public Funcionario() {

    }

    public Funcionario(String nome, double salario, double novoSalario, double aumento) {
        setNome(nome);
        setSalario(salario);
        setNovoSalario(novoSalario);
        setAumento(aumento);
    }

    //get e set para 'nome'
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //get e set para 'salario'
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    //get e set para 'novoSalario'
    public double getNovoSalario() {
        return novoSalario;
    }
    public void setNovoSalario(double novoSalario) {
        this.novoSalario = novoSalario;
    }

    //get e set para 'aumento'
    public double getAumento() {
        return aumento;
    }
    public void setAumento(double aumento) {
        this.aumento = aumento;
    }

    public void aumentaSalario(double salario) {
        salario = salario + this.aumento;
    }



    
}
