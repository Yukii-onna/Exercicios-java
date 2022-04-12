package capitulo3;

import java.util.Scanner;

public class Exercicio36 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double dma, dme, a;
		System.out.println("Insira a diagonal maior:");
		dma = ent.nextDouble();
		System.out.println("Insira a diagonal menor");
		dme = ent.nextDouble();
		a = (dma*dme)/2;
		System.out.printf("A area do losangulo: %.2f", a);
		ent.close();

	}

}
