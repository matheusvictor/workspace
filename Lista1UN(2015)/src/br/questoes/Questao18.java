package br.questoes;
import java.util.*;
public class Questao18 {
	
	/**
	 * Faça um algoritmo para ler um número inteiro e informar se o número é par ou ímpar.
	 */
	
	public static void main (String[]args){
		Scanner sc = new Scanner (System.in);
		
		int numero = 0;
		
		System.out.println("Digite um numero inteiro qualquer.");
		numero = sc.nextInt();
		
		if (numero % 2 != 0){
			System.out.println("O numero " + numero + " eh impar.");
		}
		
		else{
			System.out.println("O numero " + numero + " eh par.");
		}
	}
}