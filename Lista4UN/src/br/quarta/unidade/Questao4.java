package br.quarta.unidade;
import java.util.*;
public class Questao4 {
	
	/** Faça a leitura do salário atual e do tempo de serviço de um funcionário. A seguir, calcule o seu salário reajustado.
Funcionários com até 1 ano de empresa, receberão aumento de 10%. Funcionários com mais de um ano de tempo de serviço, receberão aumento de 20%.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		float salarioatual = 0;
		int opc = 0;
		int tempomeses, tempoanos = 0;
		int contador = 0;
		int limite = 0;

		System.out.println("Usuario, sou um programa criado para fazer o seu reajuste salarial de acordo com seu tempo de serviço.");
		System.out.println("Tecle enter para continuar.");
		sc.nextLine();
		
		System.out.println("Digite o numero de vezes que deseja executar o programa.");
		System.out.println("Obs.: O limite eh de 5 vezes.");
		limite = sc.nextInt();
		
		while (limite < 0 || limite > 5){
			System.out.println("Erro! Tente novamente.");
			limite = sc.nextInt();
		}
		
		if (limite == 0){
			System.out.println("Programa encerrado!");
			System.exit(0);
		}
		
		do {
		System.out.println(" ");
		System.out.println("Digite o valor (em reais) do seu salario atual.");
		System.out.println("Obs.: Digite apenas numeros. Ex.: 1.000.500");
		salarioatual = sc.nextFloat();
		
		System.out.println("Digite como prefere informar seu tempo de serviço.");
		System.out.println("1 - Tempo de serviço em meses.");
		System.out.println("2 - Tempo de serviço em anos.");
		System.out.println("3 - Encerrar o programa");
		opc = sc.nextInt();
		
		while ((opc != 1) && (opc != 2) && (opc != 3)){
			System.out.println("Opçao invalida! Tente novamente.");
			opc = sc.nextInt();
		}
		
		if (opc == 1){
			System.out.println(" ");
			System.out.println("Digite o seu tempo de serviço (em meses).");
			tempomeses = sc.nextInt();
				
			while (tempomeses <= 0) {
				System.out.println("Mes invalido! Tente novamente.");
				tempomeses = sc.nextInt();
			}
			
			if ((tempomeses == 12 && tempomeses > 0) || (tempomeses == 1)){
				double reajuste = (salarioatual * 10) / 100;
				double salcomreajuste = salarioatual + reajuste;
				System.out.println("Tempo de serviço: " + tempomeses + " mes(es)");
				System.out.println("Reajuste: R$ " + Math.ceil(reajuste));
				System.out.println("Salario com reajuste: " + Math.ceil(salcomreajuste));
			}	
				else if (tempomeses > 12){
				double reajuste = (salarioatual * 20) / 100;
				double salcomreajuste = salarioatual + reajuste;
				System.out.println("Tempo de serviço: " + tempomeses + "mes(es)");
				System.out.println("Reajuste: R$ " + Math.ceil(reajuste));
				System.out.println("Salario com reajuste: " + Math.ceil(salcomreajuste));
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
				System.out.println("Reajuste: R$ " + Math.ceil(reajuste));
				System.out.println("Salario com reajuste: " + Math.ceil(salcomreajuste));
			}	
				else if (tempoanos > 1){
				double reajuste = (salarioatual * 20) / 100;
				double salcomreajuste = salarioatual + reajuste;
				System.out.println("Tempo de serviço: " + tempoanos + " ano(s)");
				System.out.println("Reajuste: R$ " + Math.ceil(reajuste));
				System.out.println("Salario com reajuste: " + Math.ceil(salcomreajuste));	
			}
		}

			if (opc == 3){
			System.out.println("Programa encerrado!");
			System.exit(0);
		}	
		  contador ++;
		  
		} while (contador < limite);
		
		System.out.println("\nPrograma encerrado!");
		System.exit(0);
		//Esta mensagem sera exibida somente quando o numero limite for atingido.
	}
}