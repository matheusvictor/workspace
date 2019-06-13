package br.questoes;
import java.util.*;
public class Questao25 {

	/**
	 * Faça um algoritmo para ler três números positivos e escrevê-los em ordem crescente
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		float numero1, numero2, numero3 = 0;
		
		System.out.println("Digite um numero positivo qualquer.");
		numero1 = sc.nextFloat();
		
		while (numero1 <= 0){
			System.out.println("O numero precisa ser positivo. Digite novamente.");
			numero1 = sc.nextFloat();
		}
		
		System.out.println("Digite um numero positivo qualquer.");
		numero2 = sc.nextFloat();
		
		while (numero2 <= 0){
			System.out.println("O numero precisa ser positivo. Digite novamente.");
			numero2 = sc.nextFloat();
		}
		
		System.out.println("Digite um numero positivo qualquer.");
		numero3 = sc.nextFloat();
		
		while (numero3 <= 0){
			System.out.println("O numero precisa ser positivo. Digite novamente.");
			numero3 = sc.nextFloat();
		}
		
		if (numero1 > numero2 && numero1 > numero3 && numero2 > numero3){
			System.out.println("Ordem crescente: " + numero1 + " > " + numero2 + " > " + numero3);
		}
		
		else if (numero1 > numero2 && numero1 > numero3 && numero3 > numero2){
			System.out.println("Ordem crescente: " + numero1 + " > " + numero3 + " > " + numero2);
		}
		
		else if (numero2 > numero1 && numero2 > numero3 && numero1 > numero3){
			System.out.println("Ordem crescente: " + numero2 + " > " + numero1 + " > " + numero3);
		}
		
		else if (numero2 > numero1 && numero2 > numero3 && numero3 > numero1){
			System.out.println("Ordem crescente: " + numero2 + " > " + numero3 + " > " + numero1);
		}
		
		else if (numero3 > numero1 && numero3 > numero2 && numero1 > numero2){
			System.out.println("Ordem crescente: " + numero3 + " > " + numero1 + " > " + numero2);
		}
		
		else if (numero3 > numero1 && numero3 > numero2 && numero2 > numero1){
			System.out.println("Ordem crescente: " + numero3 + " > " + numero2 + " > " + numero1);
		}

	}

}
