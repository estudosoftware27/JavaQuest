package javaquest;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Digite o primeiro número:");
		int numero1 = sc.nextInt();
		System.out.println("Digite o segundo número:");
		int numero2 = sc.nextInt();
		int soma = numero1 + numero2;
		System.out.println("Esse é o Resultado: " + soma);

		sc.close();

	}

}
