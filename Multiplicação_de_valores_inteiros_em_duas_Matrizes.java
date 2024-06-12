package exercíciosMatriz;

import java.util.Scanner;

public class Soma_de_valores_pares_em_Matriz {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int A[][] = new int [3][3];
		int B[][] = new int [3][3];
		int C[][] = new int [3][3];

		for(int l = 0; l < 3; l++) {
			for(int c = 0; c <3; c++){
				A[l][c] = (int)Math.round(Math.random()*100);
				B[l][c] = (int)Math.round(Math.random()*100);
				C[l][c] += A[l][c] * B[l][c];
				
			}
		}
		System.out.println("Matriz A");
		for(int i = 0; i <3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("["+A[i][j]+"]");
			}
			System.out.println("\n-------------");
		}
		System.out.print("Matriz B");
		for(int i = 0; i <3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("["+B[i][j]+"]");
			}
			System.out.println("\n-------------");
		}
		System.out.println("Matriz C");
		for(int i = 0; i <3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("["+C[i][j]+"]");
			}
			System.out.println("\n-------------");
		}
	}
}
