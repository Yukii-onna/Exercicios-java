package capitulo3;
import java.util.Scanner;
public class Exercicio47 {

	public static void main(String[] args) {
		int nd,nl;
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite o numero de lados:");
		nl = ent.nextInt();
		nd = nl * (nl-3)/2;
		System.out.printf("O numero de diagonais é: %d", nd);
		ent.close();
	}

}
