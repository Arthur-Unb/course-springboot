package entities;

public class Salary {

	private int id;
	private String name;
	private double salario;

	public Salary(int id, String name, double salario) {
		this.id = id;
		this.name = name;
		this.salario = salario;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalary(double salario) {
		this.salario = salario;
	}

	public double raiseSalary(double raise) {
		raise = raise / 100;
		return salario += salario * raise;
	}

}
