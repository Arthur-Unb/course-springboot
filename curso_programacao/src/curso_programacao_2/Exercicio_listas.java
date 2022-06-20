package curso_programacao_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Salary;

public class Exercicio_listas {

	public static void main(String[] args) {

		List<Salary> list = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of employees tha you want to register: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + i + ": ");
			System.out.println("Enter the employee id: ");
			int id = sc.nextInt();

			while (hasId(list, id)) {
				System.out.println("Id already taken. Please, insert new id: ");
				id = sc.nextInt();

			}

			System.out.println("Enter the employee name: ");
			String name = sc.next();
			System.out.println("Enter the employee salary: ");
			double salario = sc.nextDouble();

			list.add(new Salary(id, name, salario));

		}

		System.out.println("Enter the employee id that will have an increase in the salary: ");
		int id_raise = sc.nextInt();

		System.out.println("Enter the percentage id that will have an increase in the salary: ");
		double percentage = sc.nextDouble();

		Salary raise = null;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id_raise) {

				raise = new Salary(list.get(i).getId(), list.get(i).getName(), list.get(i).getSalario());

			}

		}

		System.out.println("Id: " + raise.getId() + "Nome: " + raise.getName() + " Salário com aumento: "
				+ raise.raiseSalary(percentage));

		sc.close();

	}

	public static boolean hasId(List<Salary> list, int id) {
		Salary emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
