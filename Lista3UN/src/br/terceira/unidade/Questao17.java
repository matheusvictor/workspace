package br.terceira.unidade;
import java.util.*;
public class Questao17 {

	/**
	 * Faça um algoritmo para ler dois números inteiros e informar se estes números são iguais ou diferentes.
	 */
	public static void main(String[] args) {
		
		float numero1, numero2;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Usuario, sou um programa que compara dois numero reais.");
		System.out.println("Tecle enter para continuar.");
		sc.nextLine();
		
		System.out.println("Digite um numero inteiro qualquer.");
		numero1 = sc.nextFloat();
		
		System.out.println("Digite um numero inteiro qualquer.");
		numero2 = sc.nextFloat();
		
		if (numero1 == numero2){
			System.out.println("Numero digitados, respectivamente: " + numero1 + " e " + numero2);
			System.out.println("Estes numeros sao iguais.");
		}
		
		else {
			System.out.println("Numero digitados, respectivamente: " + numero1 + " e " + numero2);
			System.out.println("Estes numeros sao diferentes.");
		}
		
	

	}

}
