package br.com.generationn;
import java.util.Scanner;
/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/
public class Ex4pouimrouquadrado {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		double raiz, quadrado;
		
		System.out.println("Digite um número inteiro positivo: ");
		numero = ler.nextInt();
		if(numero<-0) {
			System.out.println("Números negativos são inválidos. Tente novamente com um valor positivo.");
			}
		
		else if(numero%2==0) {
		System.out.println("Número par: " + numero);
		raiz = Math.sqrt(numero);
		System.out.println("Raíz: " + raiz);
		}
		else if (numero%2 == 1 ){
		System.out.println("Número ímpar: " + numero);
		quadrado = Math.pow(numero, 2);
		System.out.println("Potência: " + quadrado);
		}
		
	}
}