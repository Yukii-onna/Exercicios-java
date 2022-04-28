package Lista;
import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		double i,n,r,d;
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite um número positivo e inteiro:");
		n = ent.nextDouble();
		r = 0;
		for(i = 1; i <= n; i++) {
			d = 1/i;
			r = d+r;
			System.out.println("O valor de d é:" + d);
		}
		System.out.printf("O resultado é: %.0f", r);
		ent.close();
	}

}
