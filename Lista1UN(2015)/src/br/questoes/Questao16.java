package br.questoes;
import java.util.Scanner;
public class Questao16 {

	/**
	 * Fa�a um algoritmo para ler um n�mero inteiro e informar se este � maior que 10.
	 */
	
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		
		int numero = 0;
		
		System.out.println("Digite um numero inteiro qualquer.");
		numero = sc.nextInt();
		
		if (numero == 10){
			System.out.println("O numero digitado eh igual a 10.");
			System.exit(0);
		}
		
		if(numero > 10){
			System.out.println("O numero digitado eh maior do que 10.");
			System.exit(0);
		}
		
		else{
			System.out.println("O numero digitado eh menor do que 10.");
			System.exit(0);
		}
	}
}
