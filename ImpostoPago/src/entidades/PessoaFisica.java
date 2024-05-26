package entidades;

public class PessoaFisica extends Contribuinte {
    
    // atributos para pessoa Fisica (CPF)
    
    private double gastoSaude;

    // construtor
    public PessoaFisica() {
        super();
    }
    public PessoaFisica(double gastoSaude, String nome, double rendaAnual) {
        super(nome, rendaAnual);
    }

    // get e set
    public double getGastoSaude() {
        return gastoSaude;
    }
    public void setGastoSaude(double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }


    // metodo sobreescrito para taxa do tipo abstrato
    // condição para calculo de imposto
    @Override
    public double taxa() {
        if (rendaAnual < 20000.0) {
			return rendaAnual * 0.15 - gastoSaude * 0.5;
		}
		else {
			return rendaAnual * 0.25 - gastoSaude * 0.5;
		}
	}
}
