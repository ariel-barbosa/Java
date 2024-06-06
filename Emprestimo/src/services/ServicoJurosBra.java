package services;

public class ServicoJurosBra implements TaxaBrasil {

    private static Double taxaDeJuros = 1.02;

    // construtor
    public ServicoJurosBra() {

    }
    public ServicoJurosBra(double taxaDeJuros) {
        ServicoJurosBra.taxaDeJuros = taxaDeJuros;
    }

    // get e set
    public Double getTaxaDeJuros() {
        return taxaDeJuros;
    }
    public void setTaxaDeJuros(Double taxaDeJuros) {
        ServicoJurosBra.taxaDeJuros = taxaDeJuros;
    }


    // aqui usamos as regras de calcula para taxa de juros no Brasil
    @Override
    public double pagamento(double valor, int meses) {
        return valor * Math.pow(1 + taxaDeJuros / 100, meses);
    }

    



    
    
}
