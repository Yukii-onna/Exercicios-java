package capitulo3;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double s, p, s1, p1;
		System.out.println("Insira o salario:");
		s = ent.nextDouble();
		System.out.println("Insira a porcentagem:");
		p = ent.nextDouble();
		
		s1 = s + (s*p/100);
		p1 = s*(p/100 + 1) - s;		
		
		System.out.printf("O novo salario e: %.2f, %.2f", s1, p1);
		ent.close();
	}

}
