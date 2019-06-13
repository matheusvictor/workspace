package br.questoes;
import java.util.Scanner;
public class Questao17 {
	
	/**
	 * Faça um algoritmo para ler dois números inteiros e informar se estes números são iguais ou
diferentes.
	 */
	
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		
		int numero1, numero2 = 0;
		
		System.out.println("Digite um numero inteiro qualquer.");
		numero1 = sc.nextInt();
		
		System.out.println("Digite um numero inteiro qualquer.");
		numero2 = sc.nextInt();
		
		if (numero1 == numero2){
			System.out.println("Os numeros digitados sao iguais.");
			System.exit(0);
		}
		
		else{
			System.out.println("Os numeros digitados sao diferentes.");
			System.exit(0);
		}	
	}
}