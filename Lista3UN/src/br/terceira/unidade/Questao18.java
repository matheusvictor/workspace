package br.terceira.unidade;
import java.util.*;
public class Questao18 {

	/**
	 * Fa�a um algoritmo para ler um n�mero inteiro e informar se o n�mero � par ou �mpar.
	 */
	public static void main(String[] args) {

		int numero;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Usuario, digite um numero inteiro qualquer.");
		numero = sc.nextInt();
		
		if (numero % 2 == 0 || numero == 0){
			System.out.println("Numero digitado: " + numero);
			System.out.println("Este numero par!");
		}
		
		else {
			System.out.println("Numero digitado: " + numero);
			System.out.println("Este numero impar!");
		}

	}

}
