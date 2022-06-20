package curso_programacao_2;

import java.util.Scanner;
import entities.Pacote_2;

public class Exercicio_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Pacote_2 pacote = new Pacote_2();
		
		System.out.println("Entre o nome do funcionário: ");
		pacote.name = sc.next();
		System.out.println("Entre o salário do funcionário: ");
		pacote.grossSalary = sc.nextDouble();
		System.out.println("Entre o imposto do funcionário: ");
		pacote.tax = sc.nextDouble();
		
		System.out.println("Empregado: " + pacote);
		
		System.out.println("Qual o aumento salarial percentual? ");
		double percentage = sc.nextDouble();
		pacote.increase(percentage);
		
		System.out.println();
		System.out.println("Novo salário: " + pacote);;
		
		sc.close();
	}
}
