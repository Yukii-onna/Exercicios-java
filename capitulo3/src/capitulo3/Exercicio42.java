package capitulo3;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio42 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double r, pi, r3, c, a, v;
		System.out.println("Insira o valor do raio:");
		r = ent.nextDouble();
		pi = 3.14;
		c = 2 * pi*r;
		a = pi*(r*r);
		r3 = Math.pow(r, 3);
		v = (r3*pi*3)/4;
		System.out.printf("O comprimento do circulo e: %.2f \n", c);
		System.out.printf("A area do circulo e: %.2f \n", a);
		System.out.printf("O volume do circulo e: %.2f", v);
		ent.close();
	}
}