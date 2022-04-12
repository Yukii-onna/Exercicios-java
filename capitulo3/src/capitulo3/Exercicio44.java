package capitulo3;

import java.util.Scanner;

public class Exercicio44 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double m1,m2,a,p;
		System.out.println("Insira as duas medidas em metro:");
		m1 = ent.nextDouble();
		m2 = ent.nextDouble();
		a = m1*m2;
		p = a*18;
		System.out.printf("A area do comodo em metros quadrados e: %.2f \n", a);
		System.out.printf("A quantidade de potencia necessaria e: %.2f", p);
		ent.close();
		
		}
	}