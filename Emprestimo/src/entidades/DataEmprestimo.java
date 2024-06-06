package entidades;

public class DataEmprestimo {

    // private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("ddd/mmm/yyy");

    // atributos
    private Double valorEmp;
    private Integer meses;

    // construtor
    public DataEmprestimo() {

    }
    public DataEmprestimo(Double valorEmp, Integer meses) {
        this.valorEmp = valorEmp;
        this.meses = meses;
    }

    // get e set
    public Double getValorEmp() {
        return valorEmp;
    }
    public void setValorEmp(Double valorEmp) {
        this.valorEmp = valorEmp;
    }
    public Integer getMeses() {
        return meses;
    }
    public void setMeses(Integer meses) {
        this.meses = meses;
    }

    

}
