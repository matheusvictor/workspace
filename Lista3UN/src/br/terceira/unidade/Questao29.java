package br.terceira.unidade;
import java.util.*;
public class Questao29 {

	/**
	 * Faça um algoritmo para ler um salário e atualizá-lo de acordo com a tabela abaixo.
	 * 
	 * Faixa Salarial 							Aumento
	 * 
	 * até 600,00								 30%
	 * 600,01 até 1.100,00						 25%
	 * 1.100,01 a 2.400,00						 20%
	 * 2.400,01 até 3.550,00        			 15%
	 * Acima de 3.550,00						 10%
	 */
	public static void main(String[] args) {
		
		String nome;
		double salario = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Usuario, sou um programa criado para atualizar o valor de um salario.");
		System.out.println("A atualizaçao salarial sera dada de acordo com a tabela abaixo: ");
		System.out.println(" ");
		System.out.println(" Faixa Salarial (em reais) 				        Aumento");
		System.out.println(" até 600,00						     	  30%");
		System.out.println(" 600,01 até 1.100,00				        	  25%");
		System.out.println(" 1.100,01 a 2.400,00					          20%");
		System.out.println(" 2.400,01 até 3.550,00        		         	          15%");
		System.out.println(" Acima de 3.550,00					          10%");

		System.out.println(" ");
		System.out.println("Tecle enter para continuar.");
		sc.nextLine();
		
		System.out.println("Por favor, digite o seu nome.");
		nome = sc.nextLine();
		
		System.out.println(nome + ", digite o valor (em reais) do seu salario atual.");
		System.out.println("Obs.: Digite apenas numeros. Ex.: 250,89.");
		salario = sc.nextDouble();
		
		sc.close();
		
		if (salario <= 600){
			double reajuste = salario + (salario * 0.30);
			System.out.println(" ");
			System.out.println("Nome do usuario: " + nome);
			System.out.println("Salario antigo: R$ " + salario);
			System.out.printf("Salario atualizado: R$ %.2f " , reajuste);
		}
		
		else if ((salario >= 600.01) && (salario < 1100)){
			double reajuste = salario + (salario * 0.25);
			System.out.println(" ");
			System.out.println("Nome do usuario: " + nome);
			System.out.println("Salario antigo: R$ " + salario);
			System.out.printf("Salario atualizado: R$ %.2f " , reajuste);
		}
		
		else if ((salario >= 1100.01) && (salario < 2400)){
			double reajuste = salario + (salario * 0.20);
			System.out.println(" ");
			System.out.println("Nome do usuario: " + nome);
			System.out.println("Salario antigo: R$ " + salario);
			System.out.printf("Salario atualizado: R$ %.2f " , reajuste);
		}
		
		else if ((salario >= 2400.01) && (salario < 3550)){
			double reajuste = salario + (salario * 0.15);
			System.out.println(" ");
			System.out.println("Nome do usuario: " + nome);
			System.out.println("Salario antigo: R$ " + salario);
			System.out.printf("Salario atualizado: R$ %.2f " , reajuste);
		}
		
		else if (salario > 3550){
			double reajuste = salario + (salario * 0.10);
			System.out.println(" ");
			System.out.println("Nome do usuario: " + nome);
			System.out.println("Salario antigo: R$ " + salario);
			System.out.printf("Salario atualizado: R$ %.2f " , reajuste);
		}

	}

}