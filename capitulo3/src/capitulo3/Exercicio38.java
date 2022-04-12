package capitulo3;

import java.util.Scanner;

public class Exercicio38 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double n,n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;
		System.out.println("Insira um numero:");
		n = ent.nextDouble();
		n1 = n*1;
		n2 = n*2;
		n3 = n*3;
		n4 = n*4;
		n5 = n*5;
		n6 = n*6;
		n7 = n*7;
		n8 = n*8;
		n9 = n*9;
		n10 = n*10;
		System.out.printf("x1: %.2f \n", n1);
		System.out.printf("x2: %.2f \n", n2);
		System.out.printf("x3: %.2f \n", n3);
		System.out.printf("x4: %.2f \n", n4);
		System.out.printf("x5: %.2f \n", n5);
		System.out.printf("x6: %.2f \n", n6);
		System.out.printf("x7: %.2f \n", n7);
		System.out.printf("x8: %.2f \n", n8);
		System.out.printf("x9: %.2f \n", n9);
		System.out.printf("x10: %.2f", n10);
		ent.close();

	}

}
