package br.questoes;
import java.util.*;
public class Questao8 {
	
	/**
	 * Faça a leitura do salário atual e do tempo de serviço de um funcionário. A seguir, calcule o seu
salário reajustado. Funcionários com até 1 ano de empresa, receberão aumento de 10%.
Funcionários com mais de um ano de tempo de serviço, receberão aumento de 20%.
	 */
	
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		
		double salario = 0;
		int temposervico = 0;
		int opc;
		
		System.out.println("Digite o valor do salario atual.");
		salario = sc.nextDouble();
		
		while (salario <= 0){
			System.out.println("Salario invalido. Tente novamente.");
			salario = sc.nextDouble();
		}
		
		System.out.println("Escolha a opçao em que deseja calcular o tempo de serviço:");
		System.out.println("1 - Tempo de serviço em meses.");
		System.out.println("2 - Tempo de serviço em anos.");
		opc = sc.nextInt();
		
		while (opc != 1 && opc != 2){
			System.out.println("Opçao invalida. Tente novamente.");
			opc = sc.nextInt();
		}
	
		if (opc == 1){
			
			System.out.println("Digite o tempo de serviço em meses.");
			temposervico = sc.nextInt();
			
			while (temposervico < 0){
				System.out.println("Tempo de serviço invalido. Tente novamente.");
				temposervico = sc.nextInt();
			}
			
			if (temposervico == 0){
				System.out.println("\nSalario: R$ " + salario);
				System.out.println("Tempo de serviço: " + temposervico + " mes(es)");
				System.out.println("Nao houve reajuste salarial.");
			}
			
			if (temposervico <= 12 && temposervico > 0){
				double reajuste = (salario * 0.10);
				double novosalario = salario + reajuste;
				System.out.println("\nAntigo salario: R$ " + salario);
				System.out.println("Tempo de serviço: " + temposervico + " mes(es)");
				System.out.println("Reajuste: R$ " + reajuste + " (10%).");
				System.out.println("Salario atual: R$ " + novosalario);
			}
			
			else if (temposervico > 12){
				double reajuste = (salario * 0.20);
				double novosalario = salario + reajuste;
				System.out.println("\nAntigo salario: R$ " + salario);
				System.out.println("Tempo de serviço: " + temposervico + " mes(es)");
				System.out.println("Reajuste: R$ " + reajuste + " (20%).");
				System.out.println("Salario atual: R$ " + novosalario);
			}
			
		}
		
		if (opc == 2){
			
			System.out.println("Digite o tempo de serviço em anos.");
			temposervico = sc.nextInt();
			
			while (temposervico < 0){
				System.out.println("Tempo de serviço invalido. Tente novamente.");
				temposervico = sc.nextInt();
			}
			
			if (temposervico == 0){
				System.out.println("\nSalario: R$ " + salario);
				System.out.println("Tempo de serviço: " + temposervico + " ano(s)");
				System.out.println("Nao houve reajuste salarial.");
			}
			
			if (temposervico <= 1 && temposervico > 0){
				double reajuste = (salario * 0.10);
				double novosalario = salario + reajuste;
				System.out.println("\nAntigo salario: R$ " + salario);
				System.out.println("Tempo de serviço: " + temposervico + " ano(s)");
				System.out.println("Reajuste: R$ " + reajuste + " (10%).");
				System.out.println("Salario atual: R$ " + novosalario);
			}
			
			else if (temposervico > 1){
				double reajuste = (salario * 0.20);
				double novosalario = salario + reajuste;
				System.out.println("\nAntigo salario: R$ " + salario);
				System.out.println("Tempo de serviço: " + temposervico + " ano(s)");
				System.out.println("Reajuste: R$ " + reajuste + " (20%).");
				System.out.println("Salario atual: R$ " + novosalario);
			}
		}
		
		
		
	}

}
