package javaquest;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de A: ");
		int A = sc.nextInt();
		System.out.println("Digite o valor de B: ");
		int B = sc.nextInt();
		System.out.println("Digite o valor de C: ");
		int C = sc.nextInt();
		System.out.println("Digite o valor de D: ");
		int D = sc.nextInt();
		int diferenca = (A * B - C * D);
		System.out.println("DIFERENÇA = " + diferenca);

		sc.close();

	}

}
