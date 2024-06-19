package exercíciosMatriz;

import java.util.Scanner;

public class Desenho_B {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		char B[][] = {
				{' ', ' ', ' ', 'B'},
				{' ', ' ', 'B', ' '},
				{' ', 'B', ' ', ' '},
				{'B', ' ', ' ', ' '},
		};

		System.out.println("Desenho B");
		for(char[]letra: B) {
			for(char coluna: letra) {
				System.out.print(coluna + "\t");
			}
			System.out.println();
		}
		ler.close();

	}

}
