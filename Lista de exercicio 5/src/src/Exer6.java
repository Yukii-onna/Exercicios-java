package src;

import java.util.Random;
import java.util.Scanner;

public class Exer6 {
	public static void preenc(int[][] mat) {
		Scanner ent = new Scanner(System.in);
		for (int ln = 0; ln < mat.length; ln++) {
			for (int col = 0; col < mat[0].length; col++) {
				//System.out.printf("Digite um número [%d][%d]:", ln, col);
				//mat[ln][col] = ent.nextInt();
				Random gen = new Random();
				mat[ln][col] = gen.nextInt(10);
			}
		}
	}

	public static void troca1(int[][] mat) {
		int[] linha2 = new int[10];
		int[] linha8 = new int[10];
		for (int col = 0; col < 10; col++) {
			linha2[col] = mat[1][col];
		}
		for (int col = 0; col < 10; col++) {
			linha8[col] = mat[7][col];
		}
		for (int col = 0; col < 10; col++) {
			mat[1][col] = linha8[col];
		}
		for (int col = 0; col < 10; col++) {
			mat[7][col] = linha2[col];
		}
	}

	public static void troca2(int[][] mat) {
		int[] coluna4 = new int[10];
		int[] coluna10 = new int[10];
		for (int ln = 0; ln < 10; ln++) {
			coluna4[ln] = mat[ln][3];
		}
		for (int ln = 0; ln < 10; ln++) {
			coluna10[ln] = mat[ln][9];
		}
		for (int ln = 0; ln < 10; ln++) {
			mat[ln][3] = coluna10[ln];
		}
		for (int ln = 0; ln < 10; ln++) {
			mat[ln][9] = coluna4[ln];
		}
	}

	public static void troca3(int[][] mat) {
		int[] diagonalprin = new int[10];
		int[] diagonalsecu = new int[10];
		int ln = 0;
		for (int col = 0; col < 10; col++) {
			diagonalprin[col] = mat[ln][col];
			ln++;
		}
		ln = 0;
		for (int col = 9; col >= 0; col--) {
			diagonalsecu[ln] = mat[ln][col];
			ln++;
		}
		ln = 0;
		for (int col = 0; col < 10; col++) {
			mat[ln][col] = diagonalsecu[col];
			ln++;
		}
		ln = 0;
		for (int col = 9; col >= 0; col--) {
			mat[ln][col] = diagonalprin[ln];
			ln++;
		}
	}

	public static void troca4(int[][] mat) {
		int[] linha5 = new int[10];
		int[] coluna10 = new int[10];
		for (int coluna = 0; coluna < 10; coluna++) {
			linha5[coluna] = mat[4][coluna];
		}
		for (int linha = 0; linha < 10; linha++) {
			coluna10[linha] = mat[linha][9];
		}
		for (int coluna = 0; coluna < 10; coluna++) {
			mat[4][coluna] = coluna10[coluna];
		}
		for (int linha = 0; linha < 10; linha++) {
			mat[linha][9] = linha5[linha];
		}
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int[][] mat = new int[10][10];
		preenc(mat);
		System.out.println("Primeira Matriz:");
		for (int ln = 0; ln < 10; ln++) {
			for (int col = 0; col < 10; col++) {
				System.out.printf("%d ", mat[ln][col]);
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		troca1(mat);
		System.out.println("Troca linha 2 com linha 8 ");
		for (int ln = 0; ln < 10; ln++) {
			for (int col = 0; col < 10; col++) {
				System.out.printf("%d ", mat[ln][col]);
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		troca2(mat);
		System.out.println("Troca coluna 4 com coluna 10");
		for (int ln = 0; ln < 10; ln++) {
			for (int col = 0; col < 10; col++) {
				System.out.printf("%d ", mat[ln][col]);
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		troca3(mat);
		System.out.println("Troca diagonal principal com diagonal secundaria");
		for (int ln = 0; ln < 10; ln++) {
			for (int col = 0; col < 10; col++) {
				System.out.printf("%d ", mat[ln][col]);
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		troca4(mat);
		System.out.println("Troca linha 5 com coluna 10");
		for (int ln = 0; ln < 10; ln++) {
			for (int col = 0; col < 10; col++) {
				System.out.printf("%d ", mat[ln][col]);
			}
			System.out.println(" ");
		}
		System.out.println(" ");

		ent.close();
	}

}
