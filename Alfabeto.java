package exercíciosMatriz;

import java.util.Scanner;

public class Alfabeto {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		char A[][] = {
				{'a', 'b', 'c', 'd', 'e'},
				{'f', 'g', 'h', 'i', 'j'},
				{'k', 'l', 'm', 'n', 'o'},
				{'p', 'q', 'r', 's', 't'},
		};

		System.out.println("Matriz A");
		for(char[]letra:A) {
			for(char coluna: letra) {
				System.out.print(coluna + "\t");
			}
			System.out.println();
		}
		ler.close();
	}
}
