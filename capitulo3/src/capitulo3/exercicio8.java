package capitulo3;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Insira o valor do deposito");
		double d, j, r, vt;
		d = ent.nextDouble();
		System.out.println("Insira o valor dos juros");
		j = ent.nextDouble();
		
		r = d*(j/100 + 1) - d;
		vt =  d + (d*(j/100));
		
		System.out.printf("O valor do rendimento e o valor total e respectivamente: %.2f %.2f", r, vt);
		ent.close();

	}

}
