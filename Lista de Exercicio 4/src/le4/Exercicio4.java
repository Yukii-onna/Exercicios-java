package le4;

import java.util.Scanner;

public class Exercicio4 {
	static int d = 0;

	public static int divisao(int num, int div) {
		if (num >= div) {
			d = num - div;
			return divisao(d, div);
		}
		else if(num == div) {
			return 0;
		}
		else {
			return num;
		}
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int x, y;
		System.out.println("Digite x e y:");
		x = ent.nextInt();
		y = ent.nextInt();
		System.out.println("A divisão é: " + divisao(x, y));
		ent.close();
	}

}
