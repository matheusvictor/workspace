package br.terceira.unidade;
import java.util.*;
public class Questao40 {

	/**
	 * Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de
Renda, que depende do salário bruto (conforme tabela abaixo) e 10% para o INSS e que o FGTS corresponde a
11% do Salário Bruto, mas não é descontado (é a empresa que deposita).
O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas
trabalhadas no mês.

Desconto do IR:
Salário Bruto até 900 (inclusive) - isento Salário Bruto até 1500 (inclusive) - desconto de 5%
Salário Bruto até 2500 (inclusive) - desconto de 10%
Salário Bruto acima de 2500 - desconto de 20%
Imprima na tela as informações, dispostas conforme o exemplo
abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.

Salário Bruto: (5 * 220) : R$ 1100,0
(-) IR (5%) : R$ 55,0
(-) INSS ( 10%) : R$ 110,0
FGTS (11%) : R$ 121,0

Total de descontos : R$ 165,0

Salário Liquido : R$ 935,0
 */
	
	public static void main(String[] args) {
		
		String nome;
		double HorasMensais, GanhoHora = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ola, usuario. Sou um programa feito para calcular seu Salario Liquido, baseado no numero de horas trabalhadas com o valor ganho por hora de trabalho.");
		System.out.println("Obs.: O Salario Liquido sera dado a partir dos descontos do INSS, Imposto de Renda e FGTS.");
		System.out.println(" ");
		System.out.println("Pressione enter para continuar.");
		sc.nextLine();
		
		System.out.println("Digite seu nome, por favor.");
		nome = sc.nextLine();
		
		System.out.println("Qual o total de horas de trabalho que voce realiza no mes?");
		System.out.println("Obs.: Digite apenas numeros. O mesmo pode ser decimal.");
		HorasMensais = sc.nextDouble();
		
		while (HorasMensais <= 0){
			System.out.println("Erro! O numero de Horas Mensais nao pode ser menor ou igual a 0 (zero).");
			System.out.println("Tente novamente.");
			HorasMensais = sc.nextDouble();
		}
		
		int horas = (int) HorasMensais;
		//Declarando a variável que irá guardar o número de horas inteiras, ou seja, "excluirá" as horas em decimais.
		
		double decimais = HorasMensais - horas;
		//Aqui, será considerado apenas o números de horas decimais, ou seja, o número de horas inteiro será "excluído". Por exemplo: se o número foi 2.3, será considerado apenas 0.3.
		
		double min = decimais * 60;
		//Ou seja, o valor decimal encontrado será multiplicado por 60, correspondendo assim, aos minutos.
		
		int minutos = (int) min;
		//Aqui o processo será semelhante ao anterior, ou seja, do numero encotrado apenas os inteiros serão considerados.

		System.out.println("Quanto voce ganha por hora de trabalho?");
		System.out.println("Obs.: Digite apenas numeros. O mesmo pode ser decimal.");
		GanhoHora = sc.nextDouble();
		
		while (GanhoHora <= 0){
			System.out.println("Erro! O numero de Ganho por Hora nao pode ser menor ou igual a 0 (zero).");
			System.out.println("Tente novamente.");
			GanhoHora = sc.nextDouble();
		}
		
		double SalarioBruto = GanhoHora * HorasMensais;
		//Operação para obter o salário do referido mês.
		
		System.out.println(" ");
		//Aqui este comando está sendo usando para melhor espaçamento entre as linhas.
		System.out.println("Ganho por hora: R$ " + GanhoHora );
		System.out.println("Hora(s) de trabalho/mes: " + horas + " h " + minutos + " min.");
		System.out.println(" ");
		//Aqui este comando está sendo usando para melhor espaçamento entre as linhas.
				
		if ((SalarioBruto >= 900) && (SalarioBruto <= 1500)){
			double INSS = (SalarioBruto * 10) / 100;
			double IR = (SalarioBruto * 5) / 100;
			double FGTS = (SalarioBruto * 11) / 100;
			//Os Descontos acima podem variar de acordo com o Salario Bruto.]
			double Descontos = (IR + INSS);
			double SalarioLiquido = SalarioBruto - Descontos;
			
			System.out.println(" ");
			System.out.println("Nome do usuario: " + nome);
			System.out.println("Salario Bruto: R$ " + SalarioBruto);
			System.out.println("(-) IR (5%) : R$ " + IR);
			System.out.println("(-) INSS (10%) : R$ " + INSS);
			System.out.println("FGTS (11%): R$ " + FGTS);
			System.out.println("Total de descontos: R$ " + Descontos);
			System.out.printf("Portanto, o seu Salario Liquido eh igual a: R$ %.2f ", SalarioLiquido);
		}
		
		else if (SalarioBruto <= 2500){
			double INSS = (SalarioBruto * 10) / 100;
			double IR = (SalarioBruto * 10) / 100;
			double FGTS = (SalarioBruto * 11) / 100;
			//Os Descontos acima podem variar de acordo com o Salario Bruto.
			double Descontos = (IR + INSS);
			double SalarioLiquido = SalarioBruto - Descontos;
			
			System.out.println(" ");
			System.out.println("Nome do usuario: " + nome);
			System.out.println("Salario Bruto: R$ " + SalarioBruto);
			System.out.println("(-) IR (5%) : R$ " + IR);
			System.out.println("(-) INSS (10%) : R$ " + INSS);
			System.out.println("FGTS (11%): R$ " + FGTS);
			System.out.println("Total de descontos: R$ " + Descontos);
			System.out.printf("Portanto, o seu Salario Liquido eh igual a: R$ %.2f ", SalarioLiquido);
		}
		
		else if (SalarioBruto > 2500){
			double INSS = (SalarioBruto * 10) / 100;
			double IR = (SalarioBruto * 20) / 100;
			double FGTS = (SalarioBruto * 11) / 100;
			//Os Descontos acima podem variar de acordo com o Salario Bruto.
			double Descontos = (IR + INSS);
			double SalarioLiquido = SalarioBruto - Descontos;
			
			System.out.println(" ");
			System.out.println("Nome do usuario: " + nome);
			System.out.println("Salario Bruto: R$ " + SalarioBruto);
			System.out.println("(-) IR (5%) : R$ " + IR);
			System.out.println("(-) INSS (10%) : R$ " + INSS);
			System.out.println("FGTS (11%): R$ " + FGTS);
			System.out.println("Total de descontos: R$ " + Descontos);
			System.out.printf("Portanto, o seu Salario Liquido eh igual a: R$ %.2f ", SalarioLiquido);
		}	
	}
}