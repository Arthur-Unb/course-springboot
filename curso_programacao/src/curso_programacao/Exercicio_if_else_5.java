package curso_programacao;

import java.util.Scanner;

public class Exercicio_if_else_5 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Digite o código e a quantidade do item: ");
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (x == 1) {
				double k = y * 4;
				System.out.printf("Total: R$ %.2f", k);
			} else if (x == 2) {
				double k = y * 4.50;
				System.out.printf("Total: R$ %.2f", k);
			} else if (x == 3) {
				double k = y * 5.00;
				System.out.printf("Total: R$ %.2f", k);
			} else if (x == 4) {
				double k = y * 2.00;
				System.out.printf("Total: R$ %.2f", k);
			} else if (x == 5) {
				double k = y * 1.50;
				System.out.printf("Total: R$ %.2f", k);
			} 
			
		}

	}

}
