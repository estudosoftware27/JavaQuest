package javaquest;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Número de identificação do Funcionário: ");
		int numero_funcionario = sc.nextInt();

		System.out.println("Número de horas trabalhadas: ");
		double horas_trabalhadas = sc.nextDouble();

		System.out.println("Valor por horas trabalhadas: ");
		double valor_horas_trabalhadas = sc.nextDouble();

		double salario_funcionario = horas_trabalhadas * valor_horas_trabalhadas;

		System.out.println("Esse é o Funcionário Número: " + numero_funcionario);
		System.out.printf("Salário do Funcionário: R$ %.2f%n ", salario_funcionario);

		sc.close();
	}

}
