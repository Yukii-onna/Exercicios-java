package capitulo3;
import java.util.Scanner;
public class exercicio6 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Insira o salario base:");
		double s, i, g,  r;
		s = ent.nextDouble();
		i = s*7/100;
		g = s*5/100;
		r = s + g - i;
		
		System.out.printf("O total do salario e:%.2f", r);
		ent.close();

	}

}
