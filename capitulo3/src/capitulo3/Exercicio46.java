package capitulo3;

import java.util.Scanner;

public class Exercicio46 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double ht,he,sm,vh, voh, sf;
		System.out.println("Insira o valor do salario minimo, horas trabalhadas e as horas extras");
		sm = ent.nextDouble();
		ht = ent.nextDouble();
		he = ent.nextDouble();
		
		vh = sm*1/8;
		voh = sm*1/4;
		
		sf = (vh*ht)+(voh*he);
		System.out.printf("O salario recebido %.2f",sf);
		ent.close();
	}
}