package br.questoes;
import java.util.Scanner;
public class Questao11 {
	
	/**
	 * Faça um algoritmo que receba o valor do salário de uma pessoa e o valor de um financiamento
pretendido. Caso o financiamento seja menor ou igual a 5 vezes o salário da pessoa, o algoritmo
deverá escrever "Financiamento Concedido"; senão, ele deverá escrever "Financiamento Negado
	 */
	
	public static void main (String[] main){
		Scanner sc = new Scanner (System.in);
		
		double salario, emprestimo = 0;
		
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
			System.out.println("\nSalario: R$ " + salario);
			System.out.println("Emprestimo solicitado: R$ " + emprestimo);
			System.out.println("Financiamento concedido!");
			System.exit(0);
			}
			
			else {
			System.out.println("\nSalario: R$ " + salario);
			System.out.println("Emprestimo solicitado: R$ " + emprestimo);
			System.out.println("Financiamento negado!");
			System.out.println("Motivo: O valor do emprestimo eh maior do que cinco vezes o valor do seu salario.");
			System.exit(0);
			}		
		}
}