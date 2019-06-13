package br.terceira.unidade;
import java.util.*;
public class Questao21 {

	/**
	 * Faça um algoritmo para ler duas variáveis inteiras A e B e garantir que A e B fiquem em ordem crescente, ou seja,
a variável A deverá armazenar o menor valor fornecido e a variável B o maior.
	 */
	public static void main(String[] args) {
		
		int numero1, numero2 = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Usuario, sou um programa que coloca dois numeros inteiro digitados na ordem crescente.");
		
		System.out.println("Digite um numero inteiro qualquer.");
		numero1 = sc.nextInt();
		
		System.out.println("Digite um numero inteiro qualquer.");
		numero2 = sc.nextInt();
		
		sc.close();
		
		if (numero1 < numero2){
			System.out.println("Maior numero: " + numero2);
			System.out.println("Menor numero: " + numero1);
			System.out.println("Ordem crescente: " + numero1 + " < " + numero2);
	}
		
		else if (numero1 > numero2){
			System.out.println("Maior numero: " + numero1);
			System.out.println("Menor numero: " + numero2);
			System.out.println("Ordem crescente: " + numero2 + " < " + numero1);
		}
		
		else if (numero1 == numero2){
			System.out.println("Numero digitados, respectivamente: " + numero1 + " e " + numero2);
			System.out.println("Os numeros sao iguais.");
		}
	

}

}