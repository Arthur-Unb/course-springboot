package curso_programacao;

import java.util.Scanner;

public class Exercicio_while_1 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Digite a senha: ");
			int senha = sc.nextInt();

			while (senha != 2002) {

				System.out.println("Senha inválida");
				senha = sc.nextInt();
			}

			System.out.println("Acesso permitido. ");

		}

	}
}
