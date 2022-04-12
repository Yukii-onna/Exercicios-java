package capitulo3;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio45 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double a, d, r, me;
		System.out.println("Insira o angulo e a distancia:");
		a = ent.nextDouble();
		d = ent.nextDouble();
		r = Math.toRadians(a);
		me = d / Math.cos(r);
		System.out.printf("A medida da escada necessaria e: %.2f metros", me);
		ent.close();

	}
}