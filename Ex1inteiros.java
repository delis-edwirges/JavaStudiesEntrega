package br.com.generationn;
import java.util.Scanner;
/*Projeto: Exercicio 1 - N�m. Inteiros
 * Alune: D�lis Edwirges 
 * Data
 * 1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
*/
public class Ex1inteiros {
		public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num1, num2, num3, maiorque;
		
		System.out.println("Digite os n�meros: ");
		num1 = ler.nextInt();
		num2 = ler.nextInt();
		num3 = ler.nextInt();
		
		if(num1>=num2 && num1>=num3) {
			System.out.println("O maior n�mero �: " + num1);
		}
		else if(num2>=num1 && num2>=num3) {
			System.out.println("O maior n�mero �: " + num2);
		}
		else{
			System.out.println("O maior n�mero �: " + num3);
		}
	}
}
