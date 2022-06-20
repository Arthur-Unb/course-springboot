package curso_programacao;

import java.util.Scanner;

public class Exercicio_if_else_7 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Digite o primeiro valor: ");
			double x = sc.nextDouble();
			System.out.println("Digite o segundo valor: ");
			double y = sc.nextDouble();

			if (x > 0 && y > 0) {
				System.out.println("Primeiro quadrante.");
			} else if (x > 0 && y < 0) {
				System.out.println("Quarto quadrante.");
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo quadrante.");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro quadrante.");
			} else if (x == 0 && y != 0) {
				System.out.println("Eixo Y.");
			} else if (y == 0 && x != 0) {
				System.out.println("Eixo X.");
			} else if (x == 0 && y == 0) {
				System.out.println("Origem.");
			}

		}

	}

}
