package entidades_01;

public class Gerente extends Empregado {
    
    //atributos para Gerente
    private String departamento;

    //Construtor
        public Gerente(String nome, float salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }


    //Metodos get e set
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Gerente [salario=" + salario + ", departamento=" + departamento + ", getNome()=" + getNome() + "]";
    }
    

}
