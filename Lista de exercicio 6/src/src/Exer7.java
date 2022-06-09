package src;

import java.util.Scanner;

public class Exer7 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		String caracter;
		System.out.println("Digite uma sequencia de caracteres:");
		caracter = ent.nextLine();
		caracter = caracter.toUpperCase();
		System.out.printf("%s",caracter);
		ent.close();
	}

}
