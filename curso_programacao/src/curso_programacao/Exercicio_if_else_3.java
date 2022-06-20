package curso_programacao;

import java.util.Scanner;

public class Exercicio_if_else_3 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			int x;
			int y;

			System.out.println("Digite a hora inicial: ");
			x = sc.nextInt();
			System.out.println("Digite a hora final: ");
			y = sc.nextInt();
			
			double k = (y - x);

			if (k > 24 || k < 1) {
				
				System.out.println("Digite os valores novamente: ");
				System.out.println("Digite a hora inicial: ");
				x = sc.nextInt();
				System.out.println("Digite a hora final: ");
				y = sc.nextInt();
				
			} else {
			
				System.out.printf("O jogos durou %.0f hora(s).", k);
			}
		}

	}

}
