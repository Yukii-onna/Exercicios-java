package src;

import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		String telefone;
		StringBuilder notelefone = new StringBuilder();
		System.out.println("Digite seu número de telefone:");
		telefone = ent.nextLine();
		if (telefone.contains("-")) {
			if (telefone.length() == 9) {
				notelefone.append('9');
				notelefone.append(telefone);
				System.out.printf("%s",notelefone);
			}
			else {
				notelefone.append(telefone);
				System.out.printf("%s",notelefone);
			}
		}
		else {
			if(telefone.length() == 8) {
			notelefone.append('9');
			notelefone.append(telefone);
			System.out.printf("%s",notelefone);
			}
			else {
				notelefone.append(telefone);
				System.out.printf("%s",notelefone);
			}
		}
		ent.close();
	}

}
