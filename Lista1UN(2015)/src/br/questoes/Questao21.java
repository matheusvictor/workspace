package br.questoes;
import java.util.*;
public class Questao21 {

	/**
	 * Faça um algoritmo para ler duas variáveis inteiras A e B e garantir que A e B fiquem em ordem
crescente, ou seja, a variável A deverá armazenar o menor valor fornecido e a variável B o maior
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int numero1, numero2 = 0;
		
		System.out.println("Digite um numero inteiro A.");
		numero1 = sc.nextInt();
		
		System.out.println("Digite um numero inteiro B.");
		numero2 = sc.nextInt();
		
		if (numero1 > numero2){
			int a = numero1;
			int b = numero2;
			System.out.println("Variavel A: " + a + " > variavel B : " + b);
		}
		
		else if (numero2 > numero1){
			int a = numero2;
			int b = numero1;
			System.out.println("Variavel A: " + a + " > variavel B : " + b);
		}
		

	}

}
