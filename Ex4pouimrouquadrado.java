package br.com.generationn;
import java.util.Scanner;
/*4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/
public class Ex4pouimrouquadrado {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		double raiz, quadrado;
		
		System.out.println("Digite um n�mero inteiro positivo: ");
		numero = ler.nextInt();
		if(numero<-0) {
			System.out.println("N�meros negativos s�o inv�lidos. Tente novamente com um valor positivo.");
			}
		
		else if(numero%2==0) {
		System.out.println("N�mero par: " + numero);
		raiz = Math.sqrt(numero);
		System.out.println("Ra�z: " + raiz);
		}
		else if (numero%2 == 1 ){
		System.out.println("N�mero �mpar: " + numero);
		quadrado = Math.pow(numero, 2);
		System.out.println("Pot�ncia: " + quadrado);
		}
		
	}
}