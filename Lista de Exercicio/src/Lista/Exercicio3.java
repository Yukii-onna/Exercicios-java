package Lista;
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double vn, d,vap,van,qn,qp,m;
		System.out.println("Digite o valor de um quarto:");
		vn = ent.nextDouble();
		d = vn - (vn*25/100);
		System.out.printf("O valo da diaria promocional é: %.2f\n",d);
		qn = 38;
		qp = 60;
		vap = qp*d;
		van = qn*vn;
		System.out.printf("O valor da diaria promocional é: %.2f \nO valor arrecadado do quarto nonrmal é: %.2f \n",vap,van);
		m = vap-van;
		System.out.printf("A diferença é de: %.2f", m);
		ent.close();
	}

}
