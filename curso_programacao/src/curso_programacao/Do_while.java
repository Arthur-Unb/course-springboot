package curso_programacao;

import java.util.Scanner;

public class Do_while {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			char resp;
			do {
				System.out.print("Digite a temperatura em Celsius: ");
				double C = sc.nextDouble();
				double F = ((9 * C) / 5) + 32;
				System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
				System.out.print("Deseja repetir (s/n)? ");
				resp = sc.next().charAt(0);

			} while (resp != 'n');

		}
	}
}
