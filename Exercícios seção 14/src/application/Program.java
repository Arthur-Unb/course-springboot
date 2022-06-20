package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("Employee #" + (i + 1) + " data: ");
			System.out.print("Outsourced (y/n)? ");
			char out = sc.next().charAt(0);

			if (out == 'y') {

				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Hours: ");
				int hours = sc.nextInt();
				System.out.print("Value per  hour: ");
				double value = sc.nextDouble();
				System.out.print("Additional charge: ");
				double charge = sc.nextDouble();

				Employee emp = new OutsourcedEmployee(name, hours, value, charge);
				list.add(emp);

			} else {

				System.out.println("Name: ");
				String name = sc.next();
				System.out.println("Hours: ");
				int hours = sc.nextInt();
				System.out.println("Value per  hour: ");
				double value = sc.nextDouble();

				Employee emp = new Employee(name, hours, value);
				list.add(emp);

			}

		}

		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}

		sc.close();

	}

}
