package le4;

import java.util.Scanner;

public class Exercicio1 {
	
	public static int somanum(int num) {
		if (num==0) {
			return(0);
		}
		else {
			return(num%10) + somanum(num / 10);
		}
	}

	public static void main(String[] args) {
		int n;
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite um número:");
		n = ent.nextInt();
		System.out.println("A soma dos digitos desse número é: " + somanum(n));
		ent.close();
	}

}
