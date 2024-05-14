package aplicacao;

import entidades.ContaEmpresa;

public class Operacao {
    public static void main(String[] args) {
        //Instanciando um objeto do tipo ContaEmpresa
        ContaEmpresa empresa = new ContaEmpresa(8010, "Bob Brown", 0.0, 500.0);


        //Imprimindo info da contap
        System.out.println(empresa.getSaldo());
        System.out.println(empresa.getNumero());
        System.out.println(empresa.getTitular());
        System.out.println(empresa.getLimiteEmprestimo());
        
    }
}
