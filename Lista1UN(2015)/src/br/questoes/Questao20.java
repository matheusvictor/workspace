package br.questoes;
import java.util.*;
public class Questao20 {

	/**
	 * Faça um algoritmo para ler dois números inteiros e escrever o maior
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numero1, numero2 = 0;
		
		System.out.println("Digite um numero inteiro.");
		numero1 = sc.nextInt();
		
		System.out.println("Digite um numero inteiro.");
		numero2 = sc.nextInt();
		
		sc.close();
		
		if (numero1 > numero2){
			System.out.println("O numero " + numero1 + " eh o maior");
			System.exit(0);
		}
		
		else if (numero2 > numero1){
			System.out.println("O numero " + numero2 + " eh o maior");
			System.exit(0);
		}

	}

}
