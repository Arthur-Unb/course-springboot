package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program_2 {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		System.out.println("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Product #" + (i + 1) + " data: ");
			System.out.println("Common, used or imported (c/u/i)? ");
			char x = sc.next().charAt(0);

			if (x == 'i') {
				System.out.println("Name: ");
				String name = sc.next();
				System.out.println("Price: ");
				double price = sc.nextDouble();
				System.out.println("Custom fee: ");
				double customFee = sc.nextDouble();

				list.add(new ImportedProduct(name, price, customFee));

			} else if (x == 'c') {
				System.out.println("Name: ");
				String name = sc.next();
				System.out.println("Price: ");
				double price = sc.nextDouble();

				list.add(new Product(name, price));

			} else if (x == 'u') {
				System.out.println("Name: ");
				String name = sc.next();
				System.out.println("Price: ");
				double price = sc.nextDouble();
				System.out.println("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());

				list.add(new UsedProduct(name, price, date));
			}

			System.out.println("PRICE TAGS: ");
			for (Product prod : list) {
				System.out.println(prod.priceTag());

			}

		}

		sc.close();

	}

}
