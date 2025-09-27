package javaquest;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de A:");
		double A = sc.nextDouble();
		System.out.println("Digite o valor de B:");
		double B = sc.nextDouble();
		System.out.println("Digite o valor de C:");
		double C = sc.nextDouble();
		double areaDoTriangulo = (A * C) / 2;
		System.out.printf("Área do triângulo: %.3f%n", areaDoTriangulo);
		double pi = 3.14159;
		double areaDoCirculo = Math.pow(C, 2) * pi;
		System.out.printf("Área do Círculo: %.3f%n", areaDoCirculo);
		double areaDoTrapezio = ((A + B) * C) / 2;
		System.out.printf("Área do Trapézio: %.3f%n", areaDoTrapezio);
		double areaDoQuadrado = Math.pow(B, 2);
		System.out.printf("Área do Quadrado: %.3f%n", areaDoQuadrado);
		double areaDoRetangulo = A * B;
		System.out.printf("Área do Retângulo: %.3f%n", areaDoRetangulo);

		sc.close();
	}

}
