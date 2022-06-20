package entities;

public class Dolar {

	public double cotacao;
	public double dolares;

	public double reais() {
		return 1.06 * dolares * cotacao;
	}
	
}
