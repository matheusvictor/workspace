package br.questoes;
import java.util.*;
public class Questao8 {

	/**
	 * Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
a. o produto do dobro do primeiro com metade do segundo .
b. a soma do triplo do primeiro com o terceiro.
c. o terceiro elevado ao cubo.
	 */
	
	public static void main(String[] args) {
		
		int numero1, numero2 = 0;
		float numero3 = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Usuario, por favor, digite um numero inteiro qualquer.");
		numero1 = sc.nextInt();
		
		System.out.println("Usuario, por favor, digite um numero inteiro qualquer.");
		numero2 = sc.nextInt();
		
		System.out.println("Usuario, por favor, digite um numero real qualquer.");
		numero3 = sc.nextFloat();
		
		sc.close();
		
		float resultado1 = (numero1*2) * (numero2/2);
		float resultado2 = (numero1*3) + numero3;
		float resultado3 = (numero3 * numero3 * numero3);
		
		System.out.println(" ");
		System.out.println("O produto do dobro do primeiro com metade do segundo eh igual a: " + resultado1);
		System.out.println("A soma do triplo do primeiro com o terceiro eh igual a: " + resultado2);
		System.out.println("O terceiro elevado ao cubo eh igual a: " + resultado3);
	}
}