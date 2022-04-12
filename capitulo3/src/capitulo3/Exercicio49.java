package capitulo3;
import java.util.Scanner;
public class Exercicio49 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double r,d,m,l;
		System.out.println("Insira a quantidade de dinheiro em reais:");
		r = ent.nextDouble();
		d = r/1.80;
		m = r/2;
		l = r/3.57;
		System.out.printf("O valor convertido em dolar é: %.2f \nO valor convertido em marco alemão é: %.2f \nO valor em libra esterlina é: %.2f", d,m,l);
		ent.close();
	}

}
