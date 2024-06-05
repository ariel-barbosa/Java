package entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
    
    // atributos para Contrato
    private Integer numero;
    private LocalDate data;
    private Double valorTotal;

    // para associar as parcelas ao contrato fazemos uma Lista
    // do tipo <Parcelas>
    private List<Parcelas> parcelas = new ArrayList<Parcelas>();

    // construtor
    public Contrato() {

    }
    public Contrato(Integer numero, LocalDate data, Double valorTotal) {
        this.numero = numero;
        this.data = data;
        this.valorTotal = valorTotal;
    }

    // getters e setters
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    // metodo getParcelas
    public List<Parcelas> getParcelas() {
        return parcelas;
    }

    

    

}
