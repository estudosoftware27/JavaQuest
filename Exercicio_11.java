package javaquest;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o Horário inicial do jogo:");
		double horaInicial = sc.nextDouble();
		System.out.println("Digite o Horário de Fim do jogo:");
		double horaFinal = sc.nextDouble();

		double duracao;
		if (horaFinal >= horaInicial) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = (24 - horaInicial) + horaFinal;
		}
		System.out.println("O jogo durou " + duracao + " Horas!");
		sc.close();
	}

}
