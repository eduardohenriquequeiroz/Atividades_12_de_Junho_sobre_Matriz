package exercíciosMatriz;

import java.util.Scanner;

public class Valores_inteiros_na_diagonal {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int m[][] = new int [4][4];

		for(int i = 0; i < 4; i++) {
			for(int j = 0; j <4; j++){
				if(i == j) {
					m[i][j] = (int)Math.round(Math.random()*100);
				}
			}
		}
		for(int i = 0; i <4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print("[" + m[i][j] + "]");
			}
			System.out.println("\n-------------");
		}
		ler.close();
	}
}
