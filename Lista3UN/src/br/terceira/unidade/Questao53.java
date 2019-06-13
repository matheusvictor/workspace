package br.terceira.unidade;
import java.util.*;
public class Questao53 {

	/**
	 * Faça um Programa que peça um número e informe se o número é inteiro ou decimal. Dica: utilize uma função de
arredondamento.
	 */
	
	public static void main(String[] args) {
		
		float numero = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Usuario, digite um numero real qualquer.");
		numero = sc.nextFloat();
		
		sc.close();
		
		 if (numero == (int) numero){
			System.out.println("Numero digitado: " + numero);
			System.out.println("Este numero eh inteiro.");
		}
		
		else {
			System.out.println("Numero digitado: " + numero);
			System.out.println("Este numero eh decimal.");
		}
		
	}
}