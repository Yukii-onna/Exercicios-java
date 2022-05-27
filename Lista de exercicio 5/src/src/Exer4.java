package src;

import java.util.Scanner;

public class Exer4 {
	public static void preenc(int [][] mat) {
		Scanner ent = new Scanner(System.in);
		for(int ln=0;ln<mat.length;ln++) {
			for(int col=0;col<mat[0].length;col++) {
				System.out.println("Digite um número:");
				mat [ln][col]=ent.nextInt();
			}
		}
	}
	public static int calc(int [][] mat) {
		int soma = 0;
		 for(int col=0;col<5;col++) {
			 soma+=mat[3][col];
		 }
		 return soma;
	}
	public static int calc1(int [][] mat) {
		int soma1=0;
		 for(int ln=0;ln<5;ln++) {
			 soma1+=mat[ln][1];
		 }
		 return soma1;
	}
	public static int calc2(int [][] mat) {
		 int soma2=0;
		 for (int pos=0;pos<5;pos++) {
			 soma2+=mat[pos][pos];
		 }
		 return soma2;
	}
	public static int calc3(int [][] mat) {
		int soma3=0;
		int lin=0;
		 for(int col=4;col>=0;col--) {
			 soma3+=mat[lin][col];
			 lin++;
		 }
		return soma3;
	}
	public static int calc4(int [][] mat) {
		int soma4=0;
		for(int ln=0;ln<5;ln++) {
			for(int col=0;col<5;){
				soma4+=mat[ln][col];
			}
		}
		return soma4;
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int [][] mat = new int [5] [5];
		preenc(mat);
		System.out.println("Soma da linha 4:" + calc(mat));
		System.out.println("Soma da coluna 2:" + calc1(mat));
		System.out.println("Soma da diagonal principal:" + calc2(mat));
		System.out.println("Soma da diagonal secundario:" + calc3(mat));
		System.out.println("Soma de toda matriz:" + calc4(mat));
		ent.close();
	}

}
