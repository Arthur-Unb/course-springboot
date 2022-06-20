import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		System.out.println("Olá Mundo!");
		System.out.println("Bom dia!");
		int y = 32;
		System.out.println(y);
		double x = 10.35784;
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		System.out.println("Resultado = " + x + " Metros");
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		String nome = "Arthur";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
	}

}
