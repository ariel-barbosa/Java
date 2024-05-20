package aplicacao;

import entidades_02.ContaCorrente;

public class App {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente(1000);

        if (conta.sacar(200)) {
            System.out.println("Saque realizado com sucesso! Saldo atual: " + conta.getSaldo());
        } else {
            System.out.println("Erro ao realizar saque.");
        }

        
    }
}
