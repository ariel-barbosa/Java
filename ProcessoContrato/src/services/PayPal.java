package services;

public class PayPal implements PagOnline {



    // metodo para a taxa de pagamento já definida para o PayPal
    @Override
    public double taxaPagamento(double valor) {
        return valor * 0.02;
    }

    // juros por mês 
    @Override
    public double juros(double valor, int meses) {
        return valor * meses * 0.01;
    }


    
}
