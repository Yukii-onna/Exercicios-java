package src;

import java.util.Scanner;

public class Exer1 {

	public static void medias(double notas []) {
		double media = 0, c = 0;
		for (int j = 0; j<10; j++) {
			media += notas[j];
		}
		media = media/10;
		System.out.println("A media foi: " + media);
		for (int m = 0; m<10; m++) {
			if(notas[m]>media) {
				c++;			}
		}
		System.out.println("Nota acima da média: " + c);
	}

	public static void vetor(double notas[]) {
		double[] nota = new double[10];
		for (int i = 0; i < 10; i++) {
			nota[i] = notas[i];
		}
		medias(nota);
	}

	public static void main(String[] args) {
		double[] notas = new double[10];
		Scanner ent = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite a nota do aluno");
			notas[i] = ent.nextDouble();
		}
		vetor(notas);
		ent.close();
	}

}
