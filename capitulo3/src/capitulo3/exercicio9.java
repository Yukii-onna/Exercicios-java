package capitulo3;
import java.util.Scanner;
public class exercicio9 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double a, b, r;
		System.out.println("Insira o valor da altura:");
		a = ent.nextDouble();
		System.out.println("Insira o valor da base:");
		b = ent.nextDouble();
		
		r =  a*b/2;
		System.out.printf("O valor da area e: %.2f", r);
		ent.close();
		

	}

}
