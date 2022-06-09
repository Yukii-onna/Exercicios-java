package src;

import java.util.Scanner;

public class Exer1 {
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		String frase;
		System.out.println("Digite uma frase:");
		frase = ent.nextLine();
		frase = frase.toUpperCase();
		System.out.print(frase.charAt(0));
		for(int i = 0; i < frase.length();i++) {
			if(frase.charAt(i) == ' ') {
				if(frase.charAt(i+1) == 'E' && frase.charAt(i+2) == ' ') {
				}
				else if(frase.charAt(i+1) == 'D' && frase.charAt(i+2) == 'O' && frase.charAt(i+3) == ' ') {
				}
				else if(frase.charAt(i+1) == 'D' && frase.charAt(i+2) == 'A' && frase.charAt(i+3) == ' ') {
				}
				else if(frase.charAt(i+1) == 'D' && frase.charAt(i+2) == 'E' && frase.charAt(i+3) == ' ') {
				}
				else if(frase.charAt(i+1) == 'D' && frase.charAt(i+2) == 'I' && frase.charAt(i+3) == ' ') {
				}
				else if(frase.charAt(i+1) == 'D' && frase.charAt(i+2) == 'U' && frase.charAt(i+3) == ' ') {
				}
				else if(frase.charAt(i+1) == 'D' && frase.charAt(i+2) == 'O' && frase.charAt(i+3) == 'S' && frase.charAt(i+4) == ' ') {
				}
				else if(frase.charAt(i+1) == 'D' && frase.charAt(i+2) == 'A' && frase.charAt(i+3) == 'S' && frase.charAt(i+4) == ' ') {
				}
				else {
					System.out.print(frase.charAt(i+1));
				}
			}
			
		}
		ent.close();
	}

}
