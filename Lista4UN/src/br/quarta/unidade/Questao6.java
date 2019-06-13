package br.quarta.unidade;
import java.util.*;
public class Questao6 {

	/**
	 * Faça um algoritmo que receba o valor do salário de uma pessoa e o valor de um financiamento pretendido.
Enquanto o financiamento seja menor ou igual a 5 vezes o salário da pessoa, o algoritmo deverá escrever
"Financiamento Concedido"; senão, ele deverá escrever "Financiamento Negado".

Este programa poderia ser construido, tambem, com WHILE ou DO WHILE
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double salario, emprestimo = 0;
		int n = 5;
		//int contador = 0;
		
		System.out.println("Usuario, sou um programa de financiamento. Voce tera 5 tentativas para tentar conseguir o emprestimo.");
		System.out.println("Tecle ENTER para continuar.");
		sc.nextLine();
		
		for (int contador = 0; contador < n; contador ++){
			
			System.out.println("Digite o valor do seu salario.");
			salario = sc.nextDouble();
			
			while (salario <= 0){
			System.out.println("O valor do salario precisa ser maior do que zero. Tente novamente!");
			salario = sc.nextDouble();
			}
			
			System.out.println("Digite o valor do financiamento pretendido.");
			emprestimo = sc.nextDouble();
			
			while (emprestimo <= 0){
			System.out.println("O valor do emprestimo precisa ser maior do que zero. Tente novamente!");
			emprestimo = sc.nextDouble();
			}

			double limite = 5 * salario;
			
			if (emprestimo <= limite){
			System.out.println(" ");
			System.out.println("Salario: R$ " + salario);
			System.out.println("Emprestimo solicitado: R$ " + emprestimo);
			System.out.println("Financiamento concedido!");
			System.exit(0);
			}
			
			else {
			System.out.println(" ");
			System.out.println("Salario: R$ " + salario);
			System.out.println("Emprestimo solicitado: R$ " + emprestimo);
			System.out.println("Financiamento negado!");
			System.out.println("Motivo: O valor do emprestimo eh maior do que cinco vezes o valor do seu salario.");
			System.out.println(" ");
			}
			
			//contador ++;
		}
			System.out.println("Voce ja expirou o numero de tentativas.");
			System.exit(0);
			}
	}