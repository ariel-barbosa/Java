package entidades;

public class IngressoNormal extends Ingresso {

    //atributos para ingresso Normal
    private double valorNormal;

    //Construtor com função super()
    public IngressoNormal() {
        super();
    }

    public IngressoNormal(double valor, double valorNormal) {
        super(valor);
    }

    //Metodo para imprimir valor de ingresso normal
    public double imprimeNormal() {
        return valorNormal;
    }

}