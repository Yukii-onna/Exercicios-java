package le4;

import java.util.Scanner;

public class Exercicio5 {
	public static double fat(double n) {
		if(n==0||n==1) {
			return(1);
		}
		else return(n*fat(n-1));
	}
	public static double res(double n) {
		double S = 0;
		for (double par = 1; par <=n;par++) {
			S = S + (1/(fat(par)));
		}
		return(S);
		}
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int n;
		System.out.println("Defina um valor para n:");
		n = ent.nextInt();
		System.out.printf("O resultado é: %.1f", res(n));
		ent.close();
	}

}
