package curso_programacao;

import java.util.Scanner;

public class Exercicio_if_else_2 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			int x;

			System.out.println("Digite o valor: ");
			x = sc.nextInt();

			if (x%2 == 0) {
				System.out.println("PAR");
			} else {
				System.out.println("ÍMPAR");
			}
		}

	}

}
