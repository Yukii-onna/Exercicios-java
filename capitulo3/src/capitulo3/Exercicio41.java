package capitulo3;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio41 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double c1, c2, h;
		System.out.println("Insira o valor dos 2 catetos:");
		c1 = ent.nextDouble();
		c2 = ent.nextDouble();
		
		h = Math.sqrt((c1*c1)+(c2*c2));
		System.out.printf("O valor da hipotenusa e: %.2f", h);
		ent.close();
	}
}