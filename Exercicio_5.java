package javaquest;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Código da peça 1: ");
		int codigopeca1 = sc.nextInt();
		System.out.println("Número de peças 1: ");
		int numeropecas1 = sc.nextInt();
		System.out.println("Valor unitário de cada peça 1: ");
		double valorunitpeca1 = sc.nextDouble();
		double valorapagarpeca1 = numeropecas1 * valorunitpeca1;
		System.out.printf("Valor a pagar da peça 1: R$ %.2f%n", valorapagarpeca1);

		System.out.println("Código da peça 2: ");
		int codigopeca2 = sc.nextInt();
		System.out.println("Número de peças 2: ");
		int numeropecas2 = sc.nextInt();
		System.out.println("Valor unitário de cada peça 2: ");
		double valorunitpeca2 = sc.nextDouble();
		double valorapagarpeca2 = numeropecas2 * valorunitpeca2;
		System.out.printf("Valor a pagar da peça 2: R$ %.2f%n", valorapagarpeca2);
		double valorduaspecas1e2 = valorapagarpeca1 + valorapagarpeca2;
		System.out.printf("Valor a pagar das peças 1 e 2: R$ %.2f%n", valorduaspecas1e2);

		sc.close();
	}

}
