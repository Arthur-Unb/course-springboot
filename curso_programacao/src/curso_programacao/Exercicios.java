package curso_programacao;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			double x;
			double y;
			double w;

			System.out.printf("Informe o valor da largura: ");
			x = sc.nextDouble();
			System.out.printf("Informe o valor do comprimento: ");
			y = sc.nextDouble();
			System.out.printf("Informe o preço do metro quadrado: ");
			w = sc.nextDouble();

			double z = x * y;
			double v = w * z;
			
			System.out.printf("A área do terreno é de %.2f metros quadrados.\n", z);
			System.out.printf("O preço do terreno é de R$ %.2f.", v);
		}

	}

}
