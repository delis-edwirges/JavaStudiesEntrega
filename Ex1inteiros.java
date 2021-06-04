package br.com.generationn;
import java.util.Scanner;
/*Projeto: Exercicio 1 - Núm. Inteiros
 * Alune: Délis Edwirges 
 * Data
 * 1- Faça um programa que receba três inteiros e diga qual deles é o maior.
*/
public class Ex1inteiros {
		public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num1, num2, num3, maiorque;
		
		System.out.println("Digite os números: ");
		num1 = ler.nextInt();
		num2 = ler.nextInt();
		num3 = ler.nextInt();
		
		if(num1>=num2 && num1>=num3) {
			System.out.println("O maior número é: " + num1);
		}
		else if(num2>=num1 && num2>=num3) {
			System.out.println("O maior número é: " + num2);
		}
		else{
			System.out.println("O maior número é: " + num3);
		}
	}
}
