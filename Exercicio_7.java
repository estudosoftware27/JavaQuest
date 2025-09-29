package javaquest;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// Fazer um programa para ler um número inteiro,
		// e depois dizer se este número é negativo ou não.

		System.out.println("Digite um número inteiro:");
		int numeroInteiro = sc.nextInt();

		if (numeroInteiro < 0) {
			System.out.println("É um número Negativo");
		} else if (numeroInteiro == 0) {
			System.out.println("Nulo");
		} else {
			System.out.println("É um número Positivo!");

		}

		sc.close();

	}

}
