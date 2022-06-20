package curso_programacao;

import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			double a;
			double b;
			double c;

			System.out.printf("Informe o valor a: ");
			a = sc.nextDouble();
			System.out.printf("Informe o valor b: ");
			b = sc.nextDouble();
			System.out.printf("Informe o valor c: ");
			c = sc.nextDouble();

			double v = (a * c)/2;
			double w = 3.14159 * Math.pow(c, 2);
			double x = ((a + b)/2) * c;
			double y = Math.pow(b, 2);
			double z = a * b;

			
			System.out.printf("A área do triângulo é de %.2f.\n", v);
			System.out.printf("A área da circunferência é de %.2f.\n", w);
			System.out.printf("A área do trapézio é de %.2f.\n", x);
			System.out.printf("A área do quadrado é de %.2f.\n", y);
			System.out.printf("A área do retângulo é de %.2f.\n", z);

			
			
		}

	}

}
