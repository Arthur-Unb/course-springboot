package curso_programacao_2;

import java.util.Scanner;
import entities.pacote_1;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter rectangle width and height: ");
		pacote_1 pacote = new pacote_1();
		pacote.width = sc.nextDouble();
		pacote.height = sc.nextDouble();

		System.out.println();

		System.out.println("AREA = " + pacote.area());
		System.out.println("PERIMETER = " + pacote.perimeter());
		System.out.println("DIAGONAL = " + pacote.diagonal());

		sc.close();
	}
}
