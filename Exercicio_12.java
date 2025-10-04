package javaquest;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite que horas começa o jogo:");
		int horaInicio = sc.nextInt();
		System.out.println("Digite que horas termina o jogo:");
		int horaTermino = sc.nextInt();
		
		int duracao = 24;
		if (horaInicio < horaTermino) {
			duracao = horaTermino - horaInicio;
		}
		else {
			duracao = duracao - horaInicio + horaTermino;
		}
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		
		
		
		sc.close();

	}

}
