package curso_programacao;

import java.util.Scanner;

public class Exercicio_if_else_8 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Digite o salário: ");
			double x = sc.nextDouble();

			if (x <= 2000.00) {
				System.out.println("Isento");
			} else if( x > 2000.00 && x <= 3000.00) {
				double k = 0.08 * (x - 2000.00);
				System.out.printf("R$ %.2f", k);
				
			} else if( x > 3000.00 && x <= 4500.00) {
				double k = (0.08 * 1000.00) + (0.18 * (x - 3000.00));
				System.out.printf("R$ %.2f", k);
				
			} else if( x > 4500) {
				double k = (0.08 * 1000.00) + (0.18 * (x - 3000.00)) + (0.28 * (x - 4500));
				System.out.printf("R$ %.2f", k);
			}
		}

	}

}
