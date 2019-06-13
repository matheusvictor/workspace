package br.questoes;
import java.util.Scanner;
public class Questao7 {
	
	/**
	 * Ler um número e informar se ele é positivo, negativo ou neutro (zero).
	 */
	
	public static void main (String[] args){
		
		Scanner sc = new Scanner (System.in);
		
		float numero = 0;
		
		System.out.println("Digite um numero.");
		numero = sc.nextFloat();
		
		if (numero == 0){
			System.out.println("O numero " + numero + " eh neutro.");
		}
		
		else if (numero > 0){
			System.out.println("O numero " + numero + " eh positivo.");
		}
		
		else if (numero < 0){
			System.out.println("O numero " + numero + " eh negativo.");
		}
	}

}
