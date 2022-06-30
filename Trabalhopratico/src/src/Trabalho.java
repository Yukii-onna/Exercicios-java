package src;

import java.io.*;
import java.util.Scanner;
import java.time.LocalDate;

public class Trabalho {

	public static void preench(double[][] tabela) { // procedimento para preencher a matriz com os valores do txt
		Scanner ent1 = new Scanner(System.in);
		System.out.println("Digite o nome do arquivo a ser lido:");
		String local = ent1.nextLine();
		File arq = new File("C:\\Users\\joojp\\Desktop\\texto\\tp\\" + local + ".txt"); // chamar o arquivo
		int pos = 0, ln = 0;
		String[] linha;
		try {
			Scanner arq1 = new Scanner(arq); // Scanner para poder ler o arquivo
			while (arq1.hasNextLine()) { // Ler as linhas do arquivo
				pos = 0;
				String lin = arq1.nextLine(); // Gravar as linhas em uma String
				linha = lin.split("	"); // Dividir as linhas em um vetor
				if (ln != 4) {
					for (int col = 0; col < 4; col++) {
						double db = Double.parseDouble(linha[pos]); // transformar string para double
						if (ln == 2) {
							tabela[ln][col] = 0; // deixar zerado na matriz as vendas do dia;
						} else {
							tabela[ln][col] = db; // salvar em uma matriz o estoque, preço de venda e custo de procução
						}
						pos++;
					}
					ln++;
				}
			}
			arq1.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
			e.printStackTrace();
		}
	}

	public static boolean verificaestoque(int col, double[][] tabela) { // função para verificar se há estoque
																		// disponivel
		if (tabela[0][col] > 0) { // verifica se há estoque
			double vn = tabela[0][col] - 1.0;
			tabela[0][col] = vn; // modifica na tabela para retirar a compra, caso haja estoque
			return true;
		} else {
			return false;
		}
	}

	public static double lucro(int IL, int IE, int AL, int AE, double[][] tabela) {	// função para calcular o lucro total
		double lucro1 = IL * (tabela[1][0]);
		lucro1 -= (IL * (tabela[3][0]));

		double lucro2 = IE * (tabela[1][1]);
		lucro1 -= (IE * (tabela[3][1]));

		double lucro3 = AL * (tabela[1][2]);
		lucro1 -= (AL * (tabela[3][2]));

		double lucro4 = AE * (tabela[1][3]);
		lucro1 -= (AE * (tabela[3][3]));

		double lucrototal = lucro1 + lucro2 + lucro3 + lucro4;
		return lucrototal;
	}

	public static void preencharq(double[][] tabela, double lucrototal) {	// procedimento para preencher um novo arquivo
		try {
			LocalDate data = LocalDate.now();
			String exer = ("Relatório " + data);	//Criar um novo arquivo com a data
			FileWriter arq = new FileWriter("C:\\Users\\joojp\\Desktop\\texto\\tp\\" + exer + ".txt");
			for (int ln = 0; ln < 4; ln++) {
				for(int col=0;col<4;col++) {
					arq.write(Double.toString(tabela[ln][col]));	//Escrever no arquivo a nova tabela
					arq.write("	");
				}
				arq.write("\n");
			}
			arq.write("Lucro Total: " + lucrototal);
			arq.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double[][] tabela = new double[4][4];
		int i = 0;
		int IL = 0, IE = 0, AL = 0, AE = 0;

		preench(tabela); // procedimento para preencher a tabela
		while (i == 0) { // laço para realizar o registro de vendas
			System.out.println("Deseja realizar alguma venda? (1-Sim 2-Não)");
			int j = ent.nextInt();

			switch (j) {
			case 1:
				System.out.println(
						"Qual mascara deseja vender? (1-Infantil Lisa, 2-Infantil Estampada, 3-Adulta Lisa, 4-Adulta Estampada)");
				j = ent.nextInt();
				switch (j) {
				case 1:
					if (verificaestoque(0, tabela)) { // verificação de estoque
						IL++;
						tabela[2][0]=IL;
						break;
					} else {
						System.out.println("Venda inválida. Falta de estoque.");
					}
					break;
				case 2:
					if (verificaestoque(1, tabela)) { // verificação de estoque
						IE++;
						tabela[2][1]=IE;
						break;
					} else {
						System.out.println("Venda inválida. Falta de estoque.");
					}
					break;
				case 3:
					if (verificaestoque(2, tabela)) { // verificação de estoque
						AL++;
						tabela[2][2]=AL;
						break;
					} else {
						System.out.println("Venda inválida. Falta de estoque.");
					}
					break;
				case 4:
					if (verificaestoque(3, tabela)) { // verificação de estoque
						AE++;
						tabela[2][3]=AE;
						break;
					} else {
						System.out.println("Venda inválida. Falta de estoque.");
					}
					break;
				}
				break;

			case 2:
				i = 1;
				break;

			default:
				System.out.println("Operação inválida");
			}

			preencharq(tabela, lucro(IL, IE, AL, AE, tabela));

		}
		ent.close();
	}

}
