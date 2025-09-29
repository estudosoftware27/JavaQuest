package javaquest;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// Fazer um programa para ler um número inteiro
		// e dizer se este número é par ou ímpar.

		System.out.println("Digite qualquer número inteiro:");
		int numeroImparouPar = sc.nextInt();
		if (numeroImparouPar % 2 == 0) {
			System.out.println("Esse é um número inteiro Par!");
		} else {
			System.out.println("Esse é um número inteiro Ímpar!");
		}

		sc.close();

	}

}
