package br.questoes;
import java.util.*;
public class Questao19 {
	
	/**
	 * Faça um algoritmo para ler dois números inteiros A e B e informar se A é divisível por B.
	 */
	
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		
		float numeroA, numeroB;
		
		System.out.println("Digite um numero inteiro qualquer.");
		numeroA = sc.nextFloat();
		
		System.out.println("Digite um numero inteiro qualquer.");
		numeroB = sc.nextFloat();
		
		if (numeroA % numeroB == 0){
			System.out.println("O numero " + numeroA + " eh  divisivel pelo numero " + numeroB);
			System.exit(0);
		}
		
		else {
			System.out.println("O numero " + numeroA + " nao eh  divisivel pelo numero " + numeroB);
			System.exit(0);
		}
	}
}