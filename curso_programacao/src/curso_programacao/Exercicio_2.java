package curso_programacao;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			double x;
			double y = 3.14159;

			System.out.printf("Informe o valor do raio do círculo: ");
			x = sc.nextDouble();

			double z = y * Math.pow(x, 2);
			
			System.out.printf("A área da circunferência é de %.4f.\n", z);
		}

	}

}
