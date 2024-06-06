package services;

// Cllasse que irá implementar os calculos das taxas de imposto para o Brasil e USA

public class ServicoJuros implements TaxaBrasil, TaxaUs {

    private Double taxaBr = 1.02;
    private Double taxaUs = 1.01;

    // construtor
    public ServicoJuros() {

    }
    public ServicoJuros(double taxaBr, double taxaUs) {
        this.taxaBr = taxaBr;
        this.taxaUs = taxaUs;
    }

    // get e set
    public Double getTaxaBr() {
        return taxaBr;
    }
    public void setTaxaBr(Double taxaBr) {
        this.taxaBr = taxaBr;
    }
    public Double getTaxaUs() {
        return taxaUs;
    }
    public void setTaxaUs(Double taxaUs) {
        this.taxaUs = taxaUs;
    }


    // aqui usamos as regras de calcula para taxa de juros no Brasil
    @Override
    public double pagamentoBr(double valor, int meses) {
        return valor * Math.pow(taxaBr, meses);
    }
    @Override
    public double pagamentoUs(double valor, int meses) {
        return valor * Math.pow(taxaUs, meses);
    }
}
