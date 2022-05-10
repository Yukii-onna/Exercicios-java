package le4;

import java.util.Scanner;

public class Exercicio2 {
	static int f=1;
	public static int divisao(int num, int div) {
		int t=0;
		if (num > div) {
			f++;
			return divisao(num - div, div);
		}
		t = f;
		return (t);
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
