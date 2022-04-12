package capitulo3;
import java.util.Scanner;
public class Exercicio48 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double a1,a2,a3;
		System.out.println("Insira o valor de dois ângulos:");
		a1 = ent.nextDouble();
		a2 = ent.nextDouble();
		
		a3 = 180 - (a1+a2);
		System.out.print("O terceiro ângulo é: " + a3);
		ent.close();
		}

}
