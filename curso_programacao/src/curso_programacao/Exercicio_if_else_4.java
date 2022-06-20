package curso_programacao;

import java.util.Scanner;

public class Exercicio_if_else_4 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			double x;
			double y;

			System.out.println("Digite a hora inicial: ");
			x = sc.nextInt();
			System.out.println("Digite a hora final: ");
			y = sc.nextInt();

			double k = y - x;
			
			
			if ((x > 24 || x < 1) || (y > 24 || y < 1) || (x == y)) {
				
				System.out.println("Digite os valores novamente: ");
				System.out.println("Digite a hora inicial: ");
				x = sc.nextInt();
				System.out.println("Digite a hora final: ");
				y = sc.nextInt();
				
			} 
			if (k < 0) {
				System.out.printf("O jogo durou %.0f hora(s)", k+24);
				
			} else {
				System.out.printf("O jogo durou %.0f hora(s)", k);
				
			}
			
		}

	}

}
