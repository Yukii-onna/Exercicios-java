package Lista;
import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		double salario,somasal=0,maior=1;
		int filhos,totalhab=0,somafilhos=0,quantbaixo=0;
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite o sal�rio (ou negativo p/parar)");
		salario = ent.nextDouble();
		while(salario>=0) {
			System.out.println("Digite a quantidade de filhos:");
			filhos = ent.nextInt();
			totalhab++;
			somasal = somasal+salario;
			somafilhos = somafilhos + filhos;
			if(salario>maior) {
				maior = salario;
			}
			else if(salario<=100) {
				quantbaixo++;
			}
			System.out.println("Digite o sal�rio (ou negativo para parar):");
			salario = ent.nextDouble();
		}
		if(totalhab > 0) {
			System.out.println("A m�dia de sal�rios � R$:" + (somasal/totalhab));
			System.out.println("A m�dia de filhos �:" + (somafilhos/totalhab));
			System.out.println("O maior sal�rio � R$:" + maior);
			System.out.println("O percentual de pessoas com renda abaixo de 100 reais: " + ((quantbaixo*100.0)/totalhab));
		}
		ent.close();
	}

}
