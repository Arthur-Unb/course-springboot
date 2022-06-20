package curso_programacao;

import java.util.Scanner;

public class Exercicio_if_else_6 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Digite o número ");
			double x = sc.nextDouble();
			if (x >= 0 && x <= 25) {
				System.out.println("O número está contido no intervalo [0,25]");
			} else if (x > 25 && x <= 50) {
				System.out.println("O número está contido no intervalo (25,50]");
			} else if (x > 50 && x <= 75) {
				System.out.println("O número está contido no intervalo (50,75]");
			} else if (x > 75 && x <= 100) {
				System.out.println("O número está contido no intervalo (75,100]");
			} else if (x < 0 || x > 100) {
				System.out.println("O número não está contido em nenhum dos intervalos");
			}

		}

	}

}
