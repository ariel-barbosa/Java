package entidades;

public class CamaroteInferior extends Vip {
    
    private String localizacao;

    //Construtor padrao
    public CamaroteInferior() {
        super();
    }

    public CamaroteInferior(double valorAdicional, String localizacao) {
        super(valorAdicional);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void imprimeLocalizacao() {
        System.out.println("Localização do ingresso: " + localizacao);
    }



    

}
