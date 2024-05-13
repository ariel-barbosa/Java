package entidades;


public class Funcionario {

    //Atributos do Funcionario
    private String nome;
    private double salario;
    private double aumento;
    

    //Construtor padrão
    public Funcionario() {

    }

    public Funcionario(String nome, double salario, double aumento) {
        setNome(nome);
        setSalario(salario);
        this.aumento = aumento;
    }

    //sobrecarga
    public Funcionario(String nome, double salario) {
        setNome(nome);
        setSalario(salario);
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

    public void aplicarAumento(double porcentagem) {
        double aumentoSalario = this.salario * (porcentagem / 100);
        this.salario += aumentoSalario;
    }
    


    
    

    
    //Método toString

    
}
