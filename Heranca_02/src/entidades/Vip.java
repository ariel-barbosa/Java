package entidades;

public class Vip extends Ingresso {

    
    //Atributos para classe Vip
    private double valorAdicional;

    //Construtor com função super()
    public Vip() {
        
    }

    public Vip(double valorAdicional) {
        super();
    }
    
    public Vip(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    

    //Metodo para retornar valor do ingresso vip
    @Override //Sobreescreve o metodo da SuperClass
    public void imprimeValor() {
        System.out.println("Valor do ingresso VIP: R$" + (valor + valorAdicional));
    }


    
    
}
