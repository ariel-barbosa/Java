package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
    
    // atributos para Contrato
    private Integer numero;
    private Date data;

    // para associar as parcelas ao contrato fazemos uma Lista
    // do tipo <Parcelas>
    List<Parcelas> parcelas = new ArrayList<Parcelas>();


    // construtor
    public Contrato() {

    }
    public Contrato(Integer numero, Date data) {
        this.numero = numero;
        this.data = data;
    }

    // getters e setters
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }

    // metodo getParcelas
    public List<Parcelas> getParcelas() {
        return parcelas;
    }

    

    

}
