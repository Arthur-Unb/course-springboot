package curso_programacao_2;

import java.util.Scanner;

import entities.Student;

public class Exercicio_student {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student student = new Student();
		System.out.println("Digite o nome do aluno: ");
		student.name = sc.next();
		System.out.println("Digite as notas do aluno (nota 1, nota 2 e nota 3): ");
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();

		System.out.printf("Nota final: %.2f\n", student.notaFinal());

		if (student.notaFinal() < 60) {
			System.out.println("Reprovado.");
			System.out.printf("Nota para aprovação: %.2f", student.missingPoints());
		} else {
			System.out.println("Aprovado.");
		}

		sc.close();
	}
}
