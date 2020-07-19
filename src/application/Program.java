/*Mechendo com Matrizes, percorrendo etc... */
package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][]	mat = new int [n][n]; //matriz criada
		
		for(int i=0; i<n; i++){//primeiro for percorre a linha no caso 3
			for(int j=0; j<n; j++){//segundo for percorre a coluna da matriz
				mat [i][j] = sc.nextInt(); // linha i e coluna j recebe o teclado com numero int
			}
		}
		System.out.println("Main diagonal: ");
		for (int i=0; i<n; i++) {
			System.out.println(mat[i][i] + "  ");//mostrando a sua diagonal principal 0.0, 1.1, 2.2
		}
		System.out.println();
		int cont = 0;//percorrendo a matriz e, 
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(mat[i][j] < 0) {//mostrando se há números negativos
					cont++;
				}
			}
		}
		System.out.println("Negative Numbers =" + cont);
		sc.close();
	}

}
