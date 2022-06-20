package Exercicio;

import entitites.Product;

public class Program {

	public static void main(String[] args) {

		Product obj = new Product("ENTRADA", 52.0);

		if (obj.getName() == "ENTRADA") {

			Double x = obj.getPrice();

			System.out.println(x);
		} else {

			System.out.println("Não");
		}

	}

}
