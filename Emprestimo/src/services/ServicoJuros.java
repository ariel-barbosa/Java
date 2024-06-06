package services;

import exceptions.JurosExceptions;

public class ServicoJuros implements TaxaBrasil, TaxaUs {

    private Double taxaBr = 1.02;
    private Double taxaUs = 1.01;

    // Constructor
    public ServicoJuros() {

    }

    public ServicoJuros(double taxaBr, double taxaUs) {
        // Validação das taxas de juros aqui (opcional)
        if (taxaBr <= 0 || taxaUs <= 0) {
            throw new JurosExceptions("As taxas de juros devem ser valores positivos.");
        }
        this.taxaBr = taxaBr;
        this.taxaUs = taxaUs;
    }
    

    // Getters and Setters
    public Double getTaxaBr() {
        return taxaBr;
    }

    public Double getTaxaUs() {
        return taxaUs;
    }

    public void setTaxaBr(Double taxaBr) {
        // Validação da taxa de juros aqui (opcional)
        if (taxaBr <= 0) {
            throw new JurosExceptions("A taxa de juros não pode ser zero ou negativa.");
        }
        this.taxaBr = taxaBr;
    }
    
    public void setTaxaUs(Double taxaUs) {
        // Validação da taxa de juros aqui (opcional)
        if (taxaUs <= 0) {
            throw new JurosExceptions("A taxa de juros não pode ser zero ou negativa.");
        }
        this.taxaUs = taxaUs;
    }

    @Override
    public double pagamentoBr(double valor, int meses) throws JurosExceptions {
    if (valor <= 0 || meses <= 0) {
        throw new JurosExceptions("O valor e o número de meses devem ser positivos.");
    }
        return valor * Math.pow(taxaBr, meses);
    }

    @Override
    public double pagamentoUs(double valor, int meses) throws JurosExceptions {
    if (valor <= 0 || meses <= 0) {
        throw new JurosExceptions("O valor e o número de meses devem ser positivos.");
    }
        return valor * Math.pow(taxaUs, meses);
    }

}

