package br.terceira.unidade;
import java.util.*;
public class Questao25 {

	/**
	 * Faça um algoritmo para ler três números positivos e escrevê-los em ordem crescente.
	 */
	public static void main(String[] args) {
		
		int numero1, numero2, numero3 = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Usuario, sou um programa criado para colocar, em ordem crescente, tres numero inteiros e postivos.");
		System.out.println("Pressione enter para continuar.");
		sc.nextLine();
		
		System.out.println("Digite um numero inteiro e positivo qualquer.");
		numero1 = sc.nextInt();
		
		System.out.println("Digite um numero inteiro e positivo qualquer.");
		numero2 = sc.nextInt();
		
		System.out.println("Digite um numero inteiro e positivo qualquer.");
		numero3 = sc.nextInt();
		
		sc.close();
		
		if (numero1 < numero2 && numero1 < numero3 && numero2 < numero3){
			System.out.println(" ");
			System.out.println("Primeiro numero digitado: " + numero1);
			System.out.println("Segundo numero digitado: " + numero2);
			System.out.println("Terceiro numero digitado: " + numero3);
			System.out.println(" ");
			System.out.println("Ordem crescente dos numeros: " + numero1 + " < " + numero2 + " < " + numero3);
		}
		
		else if (numero1 < numero2 && numero1 < numero3 && numero3 < numero2){
			System.out.println(" ");
			System.out.println("Primeiro numero digitado: " + numero1);
			System.out.println("Segundo numero digitado: " + numero2);
			System.out.println("Terceiro numero digitado: " + numero3);
			System.out.println(" ");
			System.out.println("Ordem crescente dos numeros: " + numero1 + " < " + numero3 + " < " + numero2);
		}
		
		else if (numero2 < numero1 && numero2 < numero3 && numero1 < numero3){
			System.out.println(" ");
			System.out.println("Primeiro numero digitado: " + numero1);
			System.out.println("Segundo numero digitado: " + numero2);
			System.out.println("Terceiro numero digitado: " + numero3);
			System.out.println(" ");
			System.out.println("Ordem crescente dos numeros: " + numero2 + " < " + numero1 + " < " + numero3);
		}
		
		else if (numero2 < numero1 && numero2 < numero3 && numero3 < numero1){
			System.out.println(" ");
			System.out.println("Primeiro numero digitado: " + numero1);
			System.out.println("Segundo numero digitado: " + numero2);
			System.out.println("Terceiro numero digitado: " + numero3);
			System.out.println(" ");
			System.out.println("Ordem crescente dos numeros: " + numero2 + " < " + numero3 + " < " + numero1);
		}
		
		else if (numero3 < numero1 && numero3 < numero2 && numero1 < numero2){
			System.out.println(" ");
			System.out.println("Primeiro numero digitado: " + numero1);
			System.out.println("Segundo numero digitado: " + numero2);
			System.out.println("Terceiro numero digitado: " + numero3);
			System.out.println(" ");
			System.out.println("Ordem crescente dos numeros: " + numero3 + " < " + numero1 + " < " + numero2);
		}
		
		else if (numero3 < numero1 && numero3 < numero2 && numero2 < numero1){
			System.out.println(" ");
			System.out.println("Primeiro numero digitado: " + numero1);
			System.out.println("Segundo numero digitado: " + numero2);
			System.out.println("Terceiro numero digitado: " + numero3);
			System.out.println(" ");
			System.out.println("Ordem crescente dos numeros: " + numero3 + " < " + numero2 + " < " + numero1);
		}	
	}
}