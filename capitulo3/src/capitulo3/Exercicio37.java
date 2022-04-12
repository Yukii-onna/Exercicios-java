package capitulo3;

import java.util.Scanner;

public class Exercicio37 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double sm, sf, o;
		System.out.println("Insira o valor do salario minimo:");
		sm = ent.nextDouble();
		System.out.println("Insira o valor do salario do funcionario:");
		sf = ent.nextDouble();
		o = sf/sm;
		System.out.printf("O funcionario ganha %.2f salarios minimos", o);
		ent.close();
		

	}

}
