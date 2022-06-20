package curso_programacao;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int w;
			int x;
			int y;
			int z;

			System.out.printf("Informe o primeiro valor: ");
			w = sc.nextInt();
			System.out.printf("Informe o segundo valor: ");
			x = sc.nextInt();
			System.out.printf("Informe o terceiro valor: ");
			y = sc.nextInt();
			System.out.printf("Informe o quarto valor: ");
			z = sc.nextInt();

			
			double k = ((w*x)-(y*z));
			
			System.out.printf("Diferença igual a %.0f.\n", k);
		}

	}

}
