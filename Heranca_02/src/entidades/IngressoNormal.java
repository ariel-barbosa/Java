package entidades;

public class IngressoNormal extends Ingresso {

    //atributos para ingresso Normal
    protected double valorNormal;

    //Construtor com função super()
    public IngressoNormal() {
        super();
    }

    public IngressoNormal(double valor, double valorNormal) {
        super(valor);
        this.valorNormal = valorNormal;
    }

    //Metodo para imprimir valor de ingresso normal
    public String imprimeNormal() {
        return "Ingresso Normal";
    }

}