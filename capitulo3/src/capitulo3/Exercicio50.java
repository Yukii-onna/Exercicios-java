package capitulo3;
import java.util.Scanner;
public class Exercicio50 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int h,m,m1,s;
		System.out.println("Insira horas e minutos:");
		h = ent.nextInt();
		m = ent.nextInt();
		
		h = h*60;
		m1 = h+m;
		s = m1*60;
		System.out.printf("As horas em minutos são: %d \nO total de minutos é: %d \nO total de segundos é: %d", h, m1,s);
		ent.close();
	}

}
