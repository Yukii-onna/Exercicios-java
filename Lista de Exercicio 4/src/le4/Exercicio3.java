package le4;

import java.util.Scanner;

public class Exercicio3 {
	static int d = 0;
	public static int divisao(int num, int div) {
		if (num >= div) {
			d = num - div;
			System.out.println(" " + d );
			return divisao(d, div);
		}
		return (d);
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int numerador, denominador;
		System.out.println("Digite o númerador e o denominador:");
		numerador = ent.nextInt();
		denominador = ent.nextInt();
		System.out.println("A divisão é: " + divisao(numerador, denominador));
		ent.close();
	}

}
