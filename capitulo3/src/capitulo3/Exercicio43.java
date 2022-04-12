package capitulo3;

import java.util.Scanner;

public class Exercicio43 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double c, f;
		System.out.println("Insira a temperatura em celsius:");
		c = ent.nextDouble();
		f = 180 * (c + 32) / 100;
		System.out.printf("Temperatura em farenheit: %.2f", f);
		ent.close();
	}
}