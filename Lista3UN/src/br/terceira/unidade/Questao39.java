package br.terceira.unidade;
import java.util.*;
public class Questao39 {

	/**
	 * As Organiza��es Tabajara resolveram dar um aumento de sal�rio aos seus colaboradores e lhe contratam para
desenvolver o programa que calcular� os reajustes. Fa�a um programa que recebe o sal�rio de um colaborador e
o reajuste segundo o seguinte crit�rio, baseado no sal�rio atual:

sal�rios at� R$ 280,0 (incluindo) : aumento de 20%
sal�rios entre R$ 280,0 e R$ 70,0 : aumento de 15%
sal�rios entre R$ 70,0 e R$ 150,0 : aumento de 10%
sal�rios de R$ 150,0 em diante : aumento de 5%

Ap�s o aumento ser realizado, informe na tela:
o sal�rio antes do reajuste;
o percentual de aumento aplicado;
o valor do aumento; o novo sal�rio, ap�s o aumento
	 */
	
	public static void main(String[] args) {
		
		String nome, cpf;
		double salario = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ola, usuario. Sou um programa de reajuste salarial das Organiza�oes Tabajara.");
		System.out.println("Tecle ENTER para continuar.");
		sc.nextLine();
		
		System.out.println("Usuario, por favor, digite o seu nome.");
		nome = sc.nextLine();
		
		System.out.println("Digite o seu CPF, por gentileza.");
		cpf = sc.nextLine();
		
		System.out.println(nome + ", digite o seu salario atual (em reais).");
		System.out.println("Obs.: Digite apenas numeros. Ex.: 250,89.");
		salario = sc.nextDouble();
		
		if (salario <= 280){
			double reajuste = salario + (salario * 0.20);
			System.out.println(" ");
			System.out.println("Nome do usuario: " + nome);
			System.out.println("CPF: " + cpf);
			System.out.println("Salario (s/ reajuste): R$ " + salario);
			System.out.println("Percentual aplicado: 20%");
			System.out.println("Salario (c/ reajuste): " + reajuste);
		}
		
		else if ((salario >= 70) && (salario <= 280)){
			double reajuste = salario + (salario * 0.15);
			System.out.println(" ");
			System.out.println("Nome do usuario: " + nome);
			System.out.println("CPF: " + cpf);
			System.out.println("Salario (s/ reajuste): R$ " + salario);
			System.out.println("Percentual aplicado: 15%");
			System.out.println("Salario (c/ reajuste): " + reajuste);
		}
		
		else if ((salario >= 70) && (salario <= 150)){
			double reajuste = salario + (salario * 0.10);
			System.out.println(" ");
			System.out.println("Nome do usuario: " + nome);
			System.out.println("CPF: " + cpf);
			System.out.println("Salario (s/ reajuste): R$ " + salario);
			System.out.println("Percentual aplicado: 10%");
			System.out.println("Salario (c/ reajuste): " + reajuste);
		}
		
		else if (salario >= 150){
			double reajuste = salario + (salario * 0.05);
			System.out.println(" ");
			System.out.println("Nome do usuario: " + nome);
			System.out.println("CPF: " + cpf);
			System.out.println("Salario (s/ reajuste): R$ " + salario);
			System.out.println("Percentual aplicado: 5%");
			System.out.println("Salario (c/ reajuste): R$ " + reajuste);
		}
	}
}