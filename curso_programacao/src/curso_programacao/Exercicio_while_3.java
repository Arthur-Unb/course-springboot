package curso_programacao;

import java.util.Scanner;

public class Exercicio_while_3 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Digite o c�digo do combust�vel abastecido: ");
			int codigo = sc.nextInt();

			while (codigo != 4) {

				if (codigo == 1) {
					System.out.println("�lcool: 1 ");
				} else if (codigo == 2) {
					System.out.println("Gasolina: 2 ");
				} else if (codigo == 3) {
					System.out.println("Diesel: 3 ");
				} else if (codigo < 1 || codigo > 4) {
					System.out.println("C�digo inv�lido. ");
				}

				System.out.println("Digite o c�digo do combust�vel abastecido: ");
				codigo = sc.nextInt();
			}

			System.out.println("Muito Obrigado. ");

		}

	}

}
