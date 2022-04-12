package capitulo3;

import java.util.Scanner;

public class Exercicio40 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double s1, c1, c2, c1j, c2j, sf;
		System.out.println("Insira o valor do salario:");
		s1 = ent.nextDouble();
		System.out.println("Insira o valor da conta 1");
		c1 = ent.nextDouble();
		System.out.println("Insira o valor da conta 2");
		c2 = ent.nextDouble();
		
		c1j = c1+(c1*2/100);
		c2j = c2+(c2*2/100);
		
		sf = s1 - c1j -c2j;
		
		System.out.printf("Restara %.2f reais", sf);
		ent.close();

	}
}