package curso_programacao;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int p1;
			int n1;
			double v1;
			int p2;
			int n2;
			double v2;
			
			System.out.printf("Informe o c�digo da pe�a 1: ");
			p1 = sc.nextInt();
			System.out.printf("Informe o n�meros de pe�as 1: ");
			n1 = sc.nextInt();
			System.out.printf("Informe o pre�o da pe�a 1: ");
			v1 = sc.nextDouble();
			System.out.printf("Informe o c�digo da pe�a 2: ");
			p2 = sc.nextInt();
			System.out.printf("Informe o n�meros de pe�as 2: ");
			n2 = sc.nextInt();
			System.out.printf("Informe o pre�o da pe�a 2: ");
			v2 = sc.nextDouble();
			
							
			double k = ((n1*v1) + (n2*v2));
			double l = (n1*v1);
			double m = (n2*v2);
			
			System.out.printf("O pre�o total das pe�as 1 (c�digo %d) � de %.2f\n", p1, l);
			System.out.printf("O pre�o total das pe�as 2 (c�digo %d) � de %.2f\n", p2, m);
			System.out.printf("O valor total a pagar � de %.2f", k);
		}

	}

}
