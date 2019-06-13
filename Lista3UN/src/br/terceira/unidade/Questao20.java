package br.terceira.unidade;
import java.util.*;
public class Questao20 {

	/**
	 * Faça um algoritmo para ler dois números inteiros e escrever o maior.
	 */
	public static void main(String[] args) {
		
		int numero1, numero2;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Usuario, sou um programa que le dois numero inteiros e informa qual deles eh o maior.");
		System.out.println("Tecle enter para continuar.");
		sc.nextLine();
		
		System.out.println("Digite um numero inteiro qualquer");
		numero1 = sc.nextInt();
		
		System.out.println("Digite um numero inteiro qualquer.");
		numero2 = sc.nextInt();
		
		if (numero1 > numero2){
			System.out.println(" ");
			System.out.println("Primeiro numero digitado: " + numero1);
			System.out.println("Segundo numero digitado: " + numero2);
			System.out.println(numero1 + " eh o maior entre eles.");
		}
		
		else if (numero1 < numero2) {
			System.out.println(" ");
			System.out.println("Primeiro numero digitado: " + numero1);
			System.out.println("Segundo numero digitado: " + numero2);
			System.out.println(numero2 + " eh o maior entre eles.");
		}
		
		else if (numero1 == numero2) {
			System.out.println(" ");
			System.out.println("Primeiro numero digitado: " + numero1);
			System.out.println("Segundo numero digitado: " + numero2);
			System.out.println("Os numeros digitados sao iguais.");
		}


	}

}
