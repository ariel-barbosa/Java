package entidades;

public class Vip extends Ingresso {

    
    //Atributos para classe Vip
    private double valorVip;
    private double valorAdicional;

    //Construtor com função super()
    public Vip() {
        super();
    }
    
    public Vip(double valor, double valorVip, double valorAdicional) {
        super(valor);
        this.valorVip = valorVip;
        this.valorAdicional = valorAdicional;
    }

    //Metodo para retornar valor do ingresso vip
    public double imprimeVip() {
        return valorVip + valorAdicional;
    }
    
}
