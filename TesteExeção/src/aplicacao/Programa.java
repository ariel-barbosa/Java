package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
		
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição Invalida!");
		}
		catch (InputMismatchException e) {
			System.out.println("Entrada Errada");
		}
		
		
		System.out.println("Fim do Programa");
		sc.close();

	}

}