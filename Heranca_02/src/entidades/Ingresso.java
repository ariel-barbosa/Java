package entidades;

public class Ingresso {
    
    //Atributo valor
    protected double valor;

    //Construtor padrão default
    public Ingresso() {

    }

    //Construtor padrão
    public Ingresso(double valor) {
        this.valor = valor;
    }

    //Metodo Imprime
    
    public void imprimeValor() {
        System.out.println("Valor do ingresso VIP: R$" + valor);
    }


    public void setValor(double valor) {
        this.valor = valor;
    }

    

}
