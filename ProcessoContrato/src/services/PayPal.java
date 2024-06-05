package services;

public class PayPal implements PagOnline {

    // o termo 'final' define que será uma constante
    private static final double taxa_percento = 0.02;
    private static final double juro_mensal = 0.01;

    // metodo para a taxa de pagamento já definida para o PayPal
    @Override
    public double taxaPagamento(double valor) {
        return valor * taxa_percento;
    }

    // juros por mês 
    @Override
    public double juros(double valor, int meses) {
        return valor * meses * juro_mensal;
    }


    
}
