package Lista;
import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double vp,r,d,j;
		int mp=0;
		System.out.println("Digite o valor do produto:");
		vp = ent.nextDouble();
		System.out.println("Digite o metodo de pagamento: 1-Dinheiro ou cheque, 2-Cartão, 3-Parcelado ou 4-Parcelado com juros");
		mp = ent.nextInt();
		
		switch (mp) {
			case 1:
				d = vp*10/100;
				r = vp-d;
				System.out.printf("O valor pago é: %.2f", r);
				break;
				
			case 2:
				d = vp*15/100;
				r = vp-d;
				System.out.printf("O valor pago é: %.2f", r);
				break;
			
			case 3:
				System.out.printf("O valor pago é: %.2f", vp);
				break;
				
			case 4:
				j = vp*10/100;
				r = vp+j;
				System.out.printf("O valor pago é: %.2f", r);
				break;
				
			default:
				System.out.print("Operação inválida.");
				break;	
		}
		ent.close();

	}

}
