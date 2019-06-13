package br.terceira.unidade;
import java.util.*;
public class Questao8 {

	/**
	 * Faça a leitura do salário atual e do tempo de serviço de um funcionário. A seguir, calcule o seu salário reajustado.
Funcionários com até 1 ano de empresa, receberão aumento de 10%. Funcionários com mais de um ano de tempo de serviço, receberão aumento de 20%.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		float salarioatual;
		int opc;
		int tempomeses, tempoanos;
		
		System.out.println("Usuario, sou um programa criado para fazer o seu reajuste salarial de acordo com seu tempo de serviço.");
		System.out.println("Digite enter para continuar.");
		sc.nextLine();
		
		System.out.println("Digite o valor (em reais) do seu salario atual.");
		System.out.println("Obs.: Digite apenas numeros. Ex.: 1.000.500");
		salarioatual = sc.nextFloat();
		
		System.out.println("Digite como prefere informar seu tempo de serviço.");
		System.out.println("1 - Tempo de serviço em meses.");
		System.out.println("2 - Tempo de serviço em anos.");
		opc = sc.nextInt();
		
		while (opc < 1 || opc > 2){
			System.out.println("Opçao invalida! Tente novamente.");
			opc = sc.nextInt();
		}
		
		if (opc == 1){
			System.out.println("Digite o seu tempo de serviço (em meses).");
			tempomeses = sc.nextInt();
				
			while (tempomeses <= 0) {
				System.out.println("Mes invalido! Tente novamente.");
				tempomeses = sc.nextInt();
			}
			
			if (tempomeses == 12 && tempomeses > 0){
				double reajuste = (salarioatual * 10) / 100;
				double salcomreajuste = salarioatual + reajuste;
				System.out.println("Tempo de serviço: " + tempomeses + " mes(es)");
				System.out.println("Reajuste: R$ " + reajuste);
				System.out.println("Salario com reajuste : R$ " + salcomreajuste);
			}	
				else if (tempomeses > 12){
				double reajuste = (salarioatual * 20) / 100;
				double salcomreajuste = salarioatual + reajuste;
				System.out.println("Tempo de serviço: " + tempomeses + " mes(es)");
				System.out.println("Reajuste: R$ " + reajuste);
				System.out.println("Salario com reajuste: R$ " + salcomreajuste);
			}	
		}
		
		if (opc == 2){
			System.out.println("Digite o seu tempo de serviço (em anos).");
			tempoanos = sc.nextInt();
				
			while (tempoanos <= 0) {
				System.out.println("Ano invalido! Tente novamente.");
				tempoanos = sc.nextInt();
			}
			
			if (tempoanos == 1 && tempoanos > 0){
				double reajuste = (salarioatual * 10) / 100;
				double salcomreajuste = salarioatual + reajuste;
				System.out.println("Tempo de serviço: " + tempoanos + " ano(s)");
				System.out.println("Reajuste: R$" + reajuste);
				System.out.println("Salario com reajuste : R$ " + salcomreajuste);
			}	
				else if (tempoanos > 1){
				double reajuste = (salarioatual * 20) / 100;
				double salcomreajuste = salarioatual + reajuste;
				System.out.println("Tempo de serviço: " + tempoanos + " ano(s)");
				System.out.println("Reajuste: R$ " + reajuste);
				System.out.println("Salario com reajuste: R$ " + salcomreajuste);
			}	
		}
		
		
	}
}