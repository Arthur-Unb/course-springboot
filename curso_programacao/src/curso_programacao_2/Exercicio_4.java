package curso_programacao_2;

import java.util.Scanner;

import entities.Dolar;

public class Exercicio_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Dolar dolar = new Dolar();

		System.out.println("Digite a cota��o do d�lar: ");
		dolar.cotacao = sc.nextDouble();
		System.out.println("Quantos d�lares ser�o comprados? ");
		dolar.dolares = sc.nextDouble();
		System.out.println("Valor a ser pago em reais: " + dolar.reais());

		sc.close();
	}
}
