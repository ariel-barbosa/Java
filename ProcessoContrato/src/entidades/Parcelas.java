package entidades;

import java.util.Date;

public class Parcelas {

    // atributos para Parcela
    private Date vencimento;
    private Double valor;

    // construtor 
    public Parcelas() {

    }
    public Parcelas(Date vencimento, Double valor) {
        this.vencimento = vencimento;
        this.valor = valor;
    }
    

    // getters e setters
    public Date getVencimento() {
        return vencimento;
    }
    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    
}
