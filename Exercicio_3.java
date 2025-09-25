package javaquest;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor do raio do círculo: ");
		double raio = sc.nextDouble();
		double valor_pi = 3.14159;
		double area = valor_pi * Math.pow(raio, 2);
		System.out.printf("Área do círculo = %.4f%n", area);

		sc.close();
	}

}
