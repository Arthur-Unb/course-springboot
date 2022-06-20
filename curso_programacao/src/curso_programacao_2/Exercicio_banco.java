package curso_programacao_2;

import java.util.Scanner;

import entities.Banco;

public class Exercicio_banco {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Banco banco;

		System.out.print("Enter account number: ");
		int account = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);

		if (response == 'y') {

			System.out.println("Enter initial deposit value: ");
			double value = sc.nextDouble();

			banco = new Banco(account, name, value);
		} else {
			banco = new Banco(account, name);
		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.println(banco.toString());
		
		System.out.println("Enter a deposit value: ");
		double amount = sc.nextDouble();
		banco.deposit(amount);
		
		System.out.println("Updated value: ");
		System.out.println(banco.toString());
		
		
		System.out.println("Enter a withdraw value: ");
		double amount1 = sc.nextDouble();
		banco.withdraw(amount1);
		
		System.out.println("Updated value: ");
		System.out.println(banco.toString());

		sc.close();

	}

}
