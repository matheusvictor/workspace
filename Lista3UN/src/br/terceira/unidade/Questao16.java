package br.terceira.unidade;
import java.util.*;
public class Questao16 {

	/**
	 * Faça um algoritmo para ler um número inteiro e informar se este é maior que 10.
	 */
	public static void main(String[] args) {

		int numero = 0;
		int opc = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Usuario, sou um programa criado para informar se o numero digitado eh maior que 10.");
		System.out.println("Pressione 0 (zero) para continuar.");
		opc = sc.nextInt();
		
		while (opc == 0){
			
		System.out.println("Digite um numero inteiro qualquer.");
		numero = sc.nextInt();
		
		if (numero > 10){
			System.out.println("Numero digitado: " + numero);
			System.out.println("Este numero eh maior que 10!");
		}
		
		else {
			System.out.println("numero digitado: " + numero);
			System.out.println("Este numero nao eh maior que 10!");
		}
		
		System.out.println(" ");
		System.out.println("Deseja continuar o programa? Se sim, tecle 0 (zero), ou entao tecle 1 (um) para sair.");
		opc = sc.nextInt();
			
		if (opc != 0){
		System.out.println("Programa encerrado!");
			}
		
		}

	}

}
