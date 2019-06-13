package br.terceira.unidade;
import java.util.*;
public class Questao58 {

	/**
	 * Faça um Programa que leia três números e mostre-os em ordem decrescente.
	 */
	public static void main(String[] args) {
		
		int numero1, numero2, numero3 = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Usuario, sou um programa criado para colocar tres numeros inteiros (distintos) quaisquer em ordem decrescente.");
		System.out.println("Tecle ENTER para continuar.");
		sc.nextLine();
		
		System.out.println("Digite um numero inteiro e positivo qualquer.");
		numero1 = sc.nextInt();
	
		
		System.out.println("Digite um numero inteiro e positivo qualquer.");
		System.out.println("Obs.: O mesmo deve ser diferente do anterior.");
		numero2 = sc.nextInt();
		
		while (numero2 == numero1){
			System.out.println("Erro! O numero digitado deve ser diferente do anterior.");
			System.out.println("Tente novamente!");
			numero2 = sc.nextInt();
		}
		
		System.out.println("Digite um numero inteiro e positivo qualquer.");
		System.out.println("Obs.: O mesmo deve ser diferente do anterior.");
		numero3 = sc.nextInt();
		
		while (numero3 == numero2 || numero3 == numero1){
			System.out.println("Erro! O numero digitado deve ser diferente de um ja digitado.");
			System.out.println("Tente novamente!");
			numero3 = sc.nextInt();
		}
		
		sc.close();
		
		if (numero1 < numero2 && numero1 < numero3 && numero3 < numero2){
			System.out.println("Numero digitados, respectivamente: " + numero1 + ", " + numero2 + " e " + numero3);
			System.out.println("Ordem decrescente dos numeros: " + numero2 + " > " + numero3 + " > " + numero1);	
		}
		
		else if (numero1 < numero2 && numero1 < numero3 && numero2 < numero3){
			System.out.println("Numero digitados, respectivamente: " + numero1 + ", " + numero2 + " e " + numero3);
			System.out.println("Ordem decrescente dos numeros: " + numero3 + " > " + numero2 + " > " + numero1);
		}
		//
		
		else if (numero2 < numero1 && numero2 < numero3 && numero3 < numero1){
			System.out.println("Numero digitados, respectivamente: " + numero1 + ", " + numero2 + " e " + numero3);
			System.out.println("Ordem decrescente dos numeros: " + numero1 + " > " + numero3 + " > " + numero2);
		}
		
		else if (numero2 < numero1 && numero2 < numero3 && numero1 < numero3){
			System.out.println("Numero digitados, respectivamente: " + numero1 + ", " + numero2 + " e " + numero3);
			System.out.println("Ordem decrescente dos numeros: " + numero3 + " > " + numero1 + " > " + numero2);
		}
		
		//
		
		else if (numero3 < numero1 && numero3 < numero2 && numero2 < numero1){
			System.out.println("Numero digitados, respectivamente: " + numero1 + ", " + numero2 + " e " + numero3);
			System.out.println("Ordem decrescente dos numeros: " + numero1 + " > " + numero2 + " > " + numero3);
		}
		
		else if (numero3 < numero1 && numero3 < numero2 && numero1 < numero2){
			System.out.println("Numero digitados, respectivamente: " + numero1 + ", " + numero2 + " e " + numero3);
			System.out.println("Ordem decrescente dos numeros: " + numero2 + " > " + numero1 + " > " + numero3);
		}		
	}
}