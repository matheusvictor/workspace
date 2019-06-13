package br.terceira.unidade;

import java.util.*;

public class Questao7 {

	/**
	 * Ler um número e informar se ele é positivo, negativo ou neutro (zero).
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		float numero;
		
		System.out.println("Usuario, digite um numero real qualquer.");
		numero = sc.nextFloat();
		sc.close();
		
		if (numero > 0){
			System.out.println("Voce digitou um numero real positivo.");
			System.out.println("O numero digitado foi: " + numero);
		}
		
		if (numero == 0){
			System.out.println("Voce digitou um numero neutro.");
			System.out.println("O numero digitado foi: " + numero);
		}
		
		if (numero < 0){
			System.out.println("Voce digitou um numero real negativo.");
			System.out.println("O numero digitado foi: " + numero);
		}

	}

}
