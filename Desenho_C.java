package exercíciosMatriz;

import java.util.Scanner;

public class Desenho_C {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		char C[][] = {
				{' ', ' ', 'C', ' ',' '},
				{' ', ' ', 'C', ' ',' '},
				{'C', 'C', 'C', 'C','C'},
				{' ', ' ', 'C', ' ',' '},
				{' ', ' ', 'C', ' ',' '},

		};

		System.out.println("Desenho C");
		for(char[]letra: C) {
			for(char coluna: letra) {
				System.out.print(coluna + "\t");
			}
			System.out.println();
		}
		ler.close();

	}

}
