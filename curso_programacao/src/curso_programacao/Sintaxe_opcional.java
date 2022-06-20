package curso_programacao;

import java.util.Scanner;

public class Sintaxe_opcional {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			int w = 50;
			int x = 2;

			System.out.println("Digite os minutos: ");
			int y = sc.nextInt();

			if (y <= 100) {
				System.out.printf("Valor a pagar: R$ %d ", w);
			} else {
				int k = w + (y - 100) * x;
				System.out.printf("Valor a pagar: R$ %d ", k);

			}

		}

	}

}
