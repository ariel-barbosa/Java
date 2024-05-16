package entidades;

public class CamaroteSuperior extends Vip {

    private double valorAdicionalSuperior;

    public CamaroteSuperior(double valor, double valorAdicional, double valorAdicionalSuperior) {
        super(valor, valorAdicional);
        this.valorAdicionalSuperior = valorAdicionalSuperior;
    }

    
    public double getValorTotal() {
        return getValorTotal() + valorAdicionalSuperior;
    }

    public void imprimeValorTotal() {
        System.out.println("Valor total do ingresso VIP Superior: R$" + getValorTotal());
    }

    

   
}
