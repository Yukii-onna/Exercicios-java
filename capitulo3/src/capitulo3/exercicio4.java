package capitulo3;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Insira o valor do salario:");
		
		double s, r, a;
		s=ent.nextDouble();
		a=s*25/100;
		r = a+s;
		System.out.printf("O novo salario e:%.2f",r);
		ent.close();
	}

}
