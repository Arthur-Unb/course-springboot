package curso_programacao;

import java.util.Scanner;

public class Exercicio_while_2 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Digite a coordenada x: ");
			int x = sc.nextInt();

			System.out.println("Digite a coordenada y: ");
			int y = sc.nextInt();

			while (x != 0 && y != 0) {
				
				if (x > 0 && y > 0) {
					System.out.println("Primeiro quadrante.");
				} else if (x > 0 && y < 0) {
					System.out.println("Quarto quadrante.");
				} else if (x < 0 && y > 0) {
					System.out.println("Segundo quadrante.");
				} else if (x < 0 && y < 0) {
					System.out.println("Terceiro quadrante.");
				} else if (x == 0 && y != 0) {
					System.out.println("");
				} else if (y == 0 && x != 0) {
					System.out.println("");
				} else if (x == 0 && y == 0) {
					System.out.println("");
				}
				
				System.out.println("Digite a coordenada x: ");
				x = sc.nextInt();

				System.out.println("Digite a coordenada y: ");
				y = sc.nextInt();

			}

		}

	}
}
