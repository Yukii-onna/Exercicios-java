package src;
import java.util.Scanner;
public class Exer2 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		String texto;
		StringBuilder textonovo = new StringBuilder();
		System.out.println("Digite um texto:");
		texto = ent.nextLine();
		texto = texto.trim();
		for(int i =0; i < texto.length();i++) {
			if(texto.charAt(i)!=' ') {
				textonovo.append(texto.charAt(i));
			}
			if(texto.charAt(i)==' ' && texto.charAt(i+1) != ' ') {
				textonovo.append(' ');
			}
		}
		System.out.printf("%s",textonovo);
		ent.close();
	}

}
