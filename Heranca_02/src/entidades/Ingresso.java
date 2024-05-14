package entidades;

public class Ingresso {
    
    //Atributo valor
    private double valor;

    //Construtor padrão default
    public Ingresso() {

    }

    //Construtor padrão
    public Ingresso(double valor) {
        this.valor = valor;
    }

    //Metodo Imprime
    public double ImprimeValor() { 
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
