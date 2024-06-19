package exercíciosMatriz;

import java.util.Scanner;

public class Desenho_A {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		char A[][] = {
				{'A', 'A', 'A', 'A'},
				{'A', 'A', 'A', ' '},
				{'A', 'A', ' ', ' '},
				{'A', ' ', ' ', ' '},
		};

		System.out.println("Desenho A");
		for(char[]letra: A) {
			for(char coluna: letra) {
				System.out.print(coluna + "\t");
			}
			System.out.println();
		}
		ler.close();
	}
}
