package capitulo3;
import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double s, g, i, r;
		System.out.println("Insira o valor do salario:");
		s =  ent.nextDouble();
		g = 50;
		i = s*1/10;
		r = s + g - i;
		System.out.printf("O valor total do salario e: %.2f ",r );
		ent.close();

	}

}
