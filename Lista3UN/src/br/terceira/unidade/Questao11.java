package br.terceira.unidade;
import java.util.*;
public class Questao11 {

	/**
	 * Faça um algoritmo que receba o valor do salário de uma pessoa e o valor de um financiamento pretendido. Caso
o financiamento seja menor ou igual a 5 vezes o salário da pessoa, o algoritmo deverá escrever "Financiamento
Concedido"; senão, ele deverá escrever "Financiamento Negado".
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		float salario, financiamento = 0;
		
		System.out.println("Usuario, sou um programa de financiamento.");
		System.out.println("Tecle enter para continuar.");
		sc.nextLine();
		
		System.out.println("Digite o valor do seu salario atual (em reais), por gentileza.");
		System.out.println("Obs.: Digite apenas numeros.");
		salario = sc.nextFloat();
		
		System.out.println("Por favor, digite qual o valor (em reais) do financiamento pretendido.");
		System.out.println("Obs.: Digite apenas numeros.");
		financiamento = sc.nextFloat();
		
		sc.close();
		
		if ((salario >= (5 * financiamento))){		
			System.out.println("Financiamento Concedido!");
		}
		
		else if ((salario <= (5 * financiamento))) {
			System.out.println("Financiamento Negado!");
		}

	}

}
