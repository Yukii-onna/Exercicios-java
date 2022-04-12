package capitulo3;

import java.util.Scanner;

public class Exercicio39 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double an, aa, ia, im, is, id;
		System.out.println("Insira o ano de nascimneto e o ano atual:");
		an = ent.nextDouble();
		aa = ent.nextDouble();
		ia = aa - an;
		im = ia*12;
		is = im*4;
		id = is*7;
		System.out.printf("Idade atual: %.2f \n", ia);
		System.out.printf("Idade em mes: %.2f \n", im);
		System.out.printf("Idade em semana: %.2f \n", is);
		System.out.printf("Idade em dias: %.2f", id);
		ent.close();
	}
}