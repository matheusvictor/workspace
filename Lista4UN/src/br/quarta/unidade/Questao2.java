package br.quarta.unidade;
import java.util.*;
public class Questao2 {

	/**
	 * Ler 5 números inteiros e informar quais números lidos são par ou impar
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n = 5;
		int numero = 0;
		//int limite = 0;
		
		System.out.println("Usuario, sou um programa que le 5 numeros inteiros e informo quais deles sao impares e quais sao pares.");
		
		for (int contador = 0; contador < n; contador ++){
		System.out.println("\nDigite um numero inteiro qualquer.");
		numero = sc.nextInt();
		
		//do {
		
		if (numero % 2 == 0){
			System.out.println("Numero digitado: " + numero);
			System.out.println("Este numero eh par!");
		}
		
		else {
			System.out.println("Numero digitado: " + numero);
			System.out.println("Este numemero eh impar!");
		}
		
		numero ++;
		
	} //while (numero <= limite);

		System.out.println("\nPrograma encerrado!");
		System.exit(0);
		}
}