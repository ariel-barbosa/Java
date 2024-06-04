package services;

public interface PagOnline {

    // definindo regras da interface
    double taxaPagamento(double valor);
    double juros(double valor, int meses);

    // esta é a declaração que qualquer serviço de contrato deve ter
    
}
