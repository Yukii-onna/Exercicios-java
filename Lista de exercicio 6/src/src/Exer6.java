package src;

import java.util.Scanner;

public class Exer6 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		String palavra;

		System.out.println("Digite uma palava:");
		palavra = ent.nextLine();
		palavra = palavra.trim();

		for(int i=0;i<palavra.length();i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			System.out.println(palavra.charAt(i));
		}
		
		ent.close();
	}

}
