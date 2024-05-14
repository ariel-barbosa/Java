package entidades;
//Esta classe herda caracteristicas da classe ContaConmum
public class ContaEmpresa extends ContaConmum  {

    private Double limiteEmprestimo;

    //Construtor com função super()
    public ContaEmpresa() {
        super(); //está buscando todos os atributos da outra classe
    }

    public ContaEmpresa(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
        super(numero, titular, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    //Emprestimo
    public void emprestimo(double valor) {
        if (valor <= limiteEmprestimo) {
            saldo += valor - 10.0;
        }
    } 
}
