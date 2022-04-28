package Lista;

import java.util.Scanner;

public class prova2 {

	public static void main(String[] args) {
		int n, r, r1, r2, r3;
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite um número:");
		n = ent.nextInt();
		r = n % 2;
		if (r == 0) {
			System.out.println("O número é par");
			System.out.println("O número é múltiplo de 2");
			r = n % 4;
			r1 = n % 6;
			r2 = n % 8;
			if (r == 0) {
				System.out.println("O número é múltiplo de 4");
			}
			if (r1 == 0) {
				System.out.println("O número é múltiplo de 6");
			}
			if (r2 == 0) {
				System.out.println("O número é múltiplo de 8");
			}
		} else {
			System.out.println("O número é ímpar");
			r = n % 3;
			r1 = n % 5;
			r2 = n % 7;
			r3 = n % 9;
			if (r == 0) {
				System.out.println("O número é múltiplo de 3");
			}
			if (r1 == 0) {
				System.out.println("O número é múltiplo de 5");
			}
			if (r2 == 0) {
				System.out.println("O número é múltiplo de 7");
			}
			if (r3 == 0) {
				System.out.println("O número é múltiplo de 9");
			}
		}
		ent.close();
	}
}
