package curso_programacao;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int w;
			double x;
			double y;

			System.out.printf("Informe o n�mero do funcion�rio: ");
			w = sc.nextInt();
			System.out.printf("Informe as horas trabalhadas: ");
			x = sc.nextDouble();
			System.out.printf("Informe o valor por hora trabalhada: ");
			y = sc.nextDouble();
							
			double k = (x * y);
			
			System.out.printf("O sal�rio do funcion�rio %d � de %.2f.\n", w, k);
		}

	}

}
