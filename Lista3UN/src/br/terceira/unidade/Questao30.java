package br.terceira.unidade;
import java.util.*;
public class Questao30 {

	/**
	 * Faça um Programa que peça dois números e imprima o maior deles.
	 */
	public static void main(String[] args) {
		
		int numero1, numero2 = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Usuario, sou um programa criado para informar qual o maior entre dois numeros inteiros digitados.");
		System.out.println("Pressione enter para continuar.");
		sc.nextLine();
		
		System.out.println("Digite um numero inteiro qualquer.");
		numero1 = sc.nextInt();
		
		System.out.println("Digite um numero inteiro qualquer.");
		numero2 = sc.nextInt();
		
		sc.close();
		
		if (numero1 > numero2){
			System.out.println("Numeros digitados, respectivamente: " + numero1 + " e " + numero2);
			System.out.println("Entre eles, o maior eh o numero: " + numero1);
		}
		
		else {
			System.out.println("Numeros digitados, respectivamente: " + numero1 + " e " + numero2);
			System.out.println("Entre eles, o maior eh o numero: " + numero2);
		}
	}

}
