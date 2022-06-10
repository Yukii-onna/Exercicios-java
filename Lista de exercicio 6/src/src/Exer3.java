import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		String dia,mes;
		String [] meses = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
		StringBuilder ndia = new StringBuilder();
		System.out.println("Digite o dia de nascimento: (dd/mm/aa)");
		dia = ent.nextLine();
		dia = dia.trim();
		ndia.append(dia.substring(0, 2));
		
		ndia.append(" de ");
		
		mes = dia.substring(3,5);
		
		ndia.append(meses[Integer.parseInt(mes)-1]);

		ndia.append(" de ");

		ndia.append(dia.substring(6,10));

		System.out.printf("%s", ndia);
		ent.close();

	}

}
