package br.com.generationn;
import java.util.Scanner;
/*3- Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual
categoria ela se encontra:
- 10-14 infantil
- 15-17 juvenil
- 18-25 adulto*/
public class Ex3Idade {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade;
		
		System.out.println("Insira a sua idade:");
		idade = ler.nextInt();
		
	
		if (idade>=10 && idade<=14) {
		System.out.println("Obrigade por se inscrever, voc� est� na categoria infantil.");
		}
		else if (idade>=15 && idade<=17) {
			System.out.println("Obrigade por se inscrever, voc� est� na categoria juvenil.");
		}
		else if (idade>=18 && idade<=25) {
			System.out.println("Obrigade por se inscrever, voc� est� na categoria adulto.");
		}
		else {
			System.out.println("Infelizmente n�o h� vagas dispon�veis para sua idade.");
		}
	}
}
