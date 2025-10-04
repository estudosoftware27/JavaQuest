package javaquest;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// Leia a hora inicial e a hora final de um jogo.
		// A seguir calcule a duração do jogo, sabendo que o mesmo pode
		// começar em um dia e terminar em outro,
		// tendo uma duração mínima de 1 hora e máxima de 24 horas.
		// Entrada: Saída:
		// 16/ 2 O JOGO DUROU 10 HORA(S)
		// Entrada
		System.out.print("Digite a hora inicial: ");
		int horaInicial = sc.nextInt();

		System.out.print("Digite a hora final: ");
		int horaFinal = sc.nextInt();

		int duracao;

		// Cálculo da duração
		if (horaFinal > horaInicial) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = (24 - horaInicial) + horaFinal;
		}

		// Saída
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

		sc.close();

	}

}
