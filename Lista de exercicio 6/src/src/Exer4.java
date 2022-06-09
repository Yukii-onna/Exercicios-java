package src;

import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int oposto;
		String frase;
		StringBuilder frasecomp = new StringBuilder();
		char inicial, fina;
		System.out.println("Digite uma frase:");
		frase = ent.nextLine();
		frasecomp.append(frase);
		for (int i = 0; i < frase.length()/2; i++) {
			oposto = frase.length() - 1 - i;
			inicial = frase.charAt(i);
			fina = frase.charAt(oposto);
			frasecomp.setCharAt(i, fina);
			frasecomp.setCharAt(oposto, inicial);
		}
		System.out.printf("%s  %s",frasecomp,frase);
		System.out.println(" ");
		String frase2 = frasecomp.toString();
		if (frase.equals(frase2)) {
			System.out.println("É palindromo.");
		}
		else {
			System.out.println("Não é palindromo");
		}
		ent.close();
	}

}