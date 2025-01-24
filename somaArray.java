/*Crie um programa que receba um array de números inteiros e calcule a soma
 *  de todos os elementos do array.*/

import java.util.Scanner;

public class somaArray {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do array");
		int tamanho = entrada.nextInt();
		
		int[] array = new int[tamanho];
		
		System.out.println("digite os numeros do array: ");
		for (int n = 0; n < tamanho; n++) {
			System.out.println("numero" + (n +1) + ":");
			array[n] = entrada.nextInt();
		}
		
		int soma = 0;
		for (int numero : array) {
			soma += numero;
		}
		
		System.out.println("a soma dos elementos do array é: " + soma);
		
		entrada.close();

	}

}
