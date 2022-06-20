package entities;

public class Pacote_2 {

	public String name;
	public double grossSalary;
	public double tax;

	public double netSalary() {
		return grossSalary - tax;
	}

	public void increase(double percentage) {
		grossSalary += (grossSalary * percentage) / 100.00;
	}

	public String toString() {
		return name + ", " + "$ " + String.format("%.2f", netSalary());

	}
}
