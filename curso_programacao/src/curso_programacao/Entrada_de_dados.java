package curso_programacao;

import java.util.Scanner;

public class Entrada_de_dados {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			String x;
			int y;
			double z;
			
			x = sc.next();
			y = sc.nextInt();
			z = sc.nextDouble();
			
			System.out.println("Você digitou: " + x + y + z);
		}
	}

}
