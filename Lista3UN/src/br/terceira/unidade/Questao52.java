package br.terceira.unidade;
import java.util.*;
public class Questao52 {

	/**
	 * Faça um Programa que peça um número inteiro e determine se ele é par ou impar. Dica: utilize o operador
módulo (resto da divisão).
	 */
	
	public static void main(String[] args) {
		
		int numero = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Usuario, digite um numero inteiro e positivo qualquer.");
		numero = sc.nextInt();
		
		while (numero < 0){
			System.out.println("Erro! O numero deve ser inteiro e positivo. Tente novamente.");
			numero = sc.nextInt();
		}
		
		if (numero % 2 == 0 || numero == 0){
			System.out.println("Numero digitado: " + numero);
			System.out.println("Este numero eh par.");
		}
		
		else {
			System.out.println("Numero digitado: " + numero);
			System.out.println("Este numero eh impar.");
		}

	}

}
