package entidades;

public class PessoaJuridica extends Contribuinte{
    
    // atributos para pessoa Jurídica (CNPJ)
    private int numFuncionario;

    // construtor
    public PessoaJuridica() {
        super();
    }
    public PessoaJuridica(int numFuncionario, String nome, double rendaAnual) {
        super(nome, rendaAnual);
        this.numFuncionario = numFuncionario;
    }

    // get e set
    public int getNumFuncionario() {
        return numFuncionario;
    }
    public void setNumFuncionario(int numFuncionario) {
        this.numFuncionario = numFuncionario;
    }



    @Override
	public double taxa() {
		if (numFuncionario > 10) {
			return rendaAnual * 0.14;
		}
		else {
			return rendaAnual * 0.16;
		}
	}
}

    

