package entidades;

import java.time.format.DateTimeFormatter;
import java.time.*;


public class Parcelas {

    // atributos para Parcela
    private LocalDate vencimento;
    private Double valor;
    private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("ddd/mmm/yyy");

    // construtor 
    public Parcelas() {

    }
    
    public Parcelas(LocalDate vencimento, Double valor) {
        this.vencimento = vencimento;
        this.valor = valor;
    }
    

    // getters e setters
    public LocalDate getVencimento() {
        return vencimento;
    }
    public void setVencimento(LocalDate vencimento) {
        this.vencimento = vencimento;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "valor: " + valor + ", fmt=" + fmt + "]";
    }

    

    


    
    
}
