package src;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		String dia;
		StringBuilder ndia = new StringBuilder();
		System.out.println("Digite o dia de nascimento: (dd/mm/aa)");
		dia = ent.nextLine();
		dia = dia.trim();
		for (int i = 0; i < 2; i++) {
			ndia.append(dia.charAt(i));
		}

		ndia.append(" de ");

		if (dia.charAt(3) == '0' && dia.charAt(4) == '1') {
			ndia.append("Janeiro");
		} else if (dia.charAt(3) == '0' && dia.charAt(4) == '2') {
			ndia.append("Fevereiro");
		} else if (dia.charAt(3) == '0' && dia.charAt(4) == '3') {
			ndia.append("Março");
		} else if (dia.charAt(3) == '0' && dia.charAt(4) == '4') {
			ndia.append("Abril");
		} else if (dia.charAt(3) == '0' && dia.charAt(4) == '5') {
			ndia.append("Maio");
		} else if (dia.charAt(3) == '0' && dia.charAt(4) == '6') {
			ndia.append("Junho");
		} else if (dia.charAt(3) == '0' && dia.charAt(4) == '7') {
			ndia.append("Julho");
		} else if (dia.charAt(3) == '0' && dia.charAt(4) == '8') {
			ndia.append("Agosto");
		} else if (dia.charAt(3) == '0' && dia.charAt(4) == '9') {
			ndia.append("Setembro");
		} else if (dia.charAt(3) == '1' && dia.charAt(4) == '0') {
			ndia.append("Outubro");
		} else if (dia.charAt(3) == '1' && dia.charAt(4) == '1') {
			ndia.append("Novembro");
		} else if (dia.charAt(3) == '1' && dia.charAt(4) == '2') {
			ndia.append("Dezembro");
		}

		ndia.append(" de ");

		for (int i = 6; i < dia.length(); i++) {
			ndia.append(dia.charAt(i));
		}

		System.out.printf("%s", ndia);
		ent.close();
	}

}
