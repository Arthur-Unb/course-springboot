package curso_programacao;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			double x;
			double y;

			System.out.printf("Informe o primeiro valor inteiro: ");
			x = sc.nextInt();
			System.out.printf("Informe o segundo valor inteiro: ");
			y = sc.nextInt();

			double z = x + y;
			
			System.out.printf("A soma dos valores é %.0f.\n", z);
		}

	}

}
