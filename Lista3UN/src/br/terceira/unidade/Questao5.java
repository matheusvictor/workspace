package br.terceira.unidade;

import java.util.*;

public class Questao5 {

	/**
	 * Ler um número inteiro e informar se o número lido é par ou ímpar.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int numero;
					
		System.out.println("Usuario, digite um numero inteiro qualquer.");
		numero = sc.nextInt();
		sc.close();
		
		if (numero == 0 || numero % 2 == 0){
			System.out.println("Numero digitado: " + numero);
			System.out.println("Este numero eh par.");
		}
		
		else {
			System.out.println("Numero digitado: " + numero);
			System.out.println("Este numero eh impar.");
		}
		
				
	}

}
