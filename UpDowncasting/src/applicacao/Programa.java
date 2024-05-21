package applicacao;

import entidades.Conta;
import entidades.ContaComercial;
import entidades.ContaPoupanca;
	

public class Programa {

	public static void main(String[] args) {

		Conta acc = new Conta(1001, "Alex", 0.0);
		ContaComercial bacc = new ContaComercial(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		Conta acc1 = bacc;
		Conta acc2 = new ContaComercial(1003, "Bob", 0.0, 200.0);
		Conta acc3 = new ContaPoupanca(1004, "Anna", 0.0, 0.01);

		
		// DOWNCASTING	
		ContaComercial acc4 = (ContaComercial)acc2;
		acc4.sacar(100.0);
		
		// ContaComercial acc5 = (ContaComercial)acc3;
		if (acc3 instanceof ContaComercial) {
			ContaComercial acc5 = (ContaComercial)acc3;
			acc5.sacar(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof ContaPoupanca) {
			ContaPoupanca acc5 = (ContaPoupanca)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}
}
