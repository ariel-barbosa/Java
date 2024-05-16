package entidades;

public class Peixe extends Animal {

    //atributos
    private String caracteristica;

    //metodo construtor
    public Peixe() {
        super();
    }

    //metodos get e set
    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    //metodo para mostrar os dados do peixe
    @Override
    public void dados() {
        System.out.printf(this.caracteristica);
    }
    

    
}
