package entidades_01;

public class Vendedor extends Empregado {

    protected float comissao;

    //Construtor
    public Vendedor(String nome, float salario, float comissao) {
        super(nome, salario);
        this.comissao = comissao;
    }



    //get e set
    public float getComissao() {
        return comissao;
    }
    public void setComissao(float comissao) {
        this.comissao = comissao;
    }


    //Metodo para calcular salario
    public float calcularSalario() {
        float novoSalario = this.salario + this.comissao;
        return novoSalario;
    }



    //metodo toString
    @Override
    public String toString() {
        return "Vendedor [comissao=" + comissao + ", salario=" + salario + ", getNome()=" + getNome()
                + ", calcularSalario()=" + calcularSalario() + "]";
    }

    
    

    
    
}
