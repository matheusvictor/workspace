package br.terceira.unidade;
import java.util.*;
public class Questao40 {

	/**
	 * Fa�a um programa para o c�lculo de uma folha de pagamento, sabendo que os descontos s�o do Imposto de
Renda, que depende do sal�rio bruto (conforme tabela abaixo) e 10% para o INSS e que o FGTS corresponde a
11% do Sal�rio Bruto, mas n�o � descontado (� a empresa que deposita).
O Sal�rio L�quido corresponde ao Sal�rio Bruto menos os descontos. O programa dever� pedir ao usu�rio o valor da sua hora e a quantidade de horas
trabalhadas no m�s.

Desconto do IR:
Sal�rio Bruto at� 900 (inclusive) - isento Sal�rio Bruto at� 1500 (inclusive) - desconto de 5%
Sal�rio Bruto at� 2500 (inclusive) - desconto de 10%
Sal�rio Bruto acima de 2500 - desconto de 20%
Imprima na tela as informa��es, dispostas conforme o exemplo
abaixo. No exemplo o valor da hora � 5 e a quantidade de hora � 220.

Sal�rio Bruto: (5 * 220) : R$ 1100,0
(-) IR (5%) : R$ 55,0
(-) INSS ( 10%) : R$ 110,0
FGTS (11%) : R$ 121,0

Total de descontos : R$ 165,0

Sal�rio Liquido : R$ 935,0
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
		//Declarando a vari�vel que ir� guardar o n�mero de horas inteiras, ou seja, "excluir�" as horas em decimais.
		
		double decimais = HorasMensais - horas;
		//Aqui, ser� considerado apenas o n�meros de horas decimais, ou seja, o n�mero de horas inteiro ser� "exclu�do". Por exemplo: se o n�mero foi 2.3, ser� considerado apenas 0.3.
		
		double min = decimais * 60;
		//Ou seja, o valor decimal encontrado ser� multiplicado por 60, correspondendo assim, aos minutos.
		
		int minutos = (int) min;
		//Aqui o processo ser� semelhante ao anterior, ou seja, do numero encotrado apenas os inteiros ser�o considerados.

		System.out.println("Quanto voce ganha por hora de trabalho?");
		System.out.println("Obs.: Digite apenas numeros. O mesmo pode ser decimal.");
		GanhoHora = sc.nextDouble();
		
		while (GanhoHora <= 0){
			System.out.println("Erro! O numero de Ganho por Hora nao pode ser menor ou igual a 0 (zero).");
			System.out.println("Tente novamente.");
			GanhoHora = sc.nextDouble();
		}
		
		double SalarioBruto = GanhoHora * HorasMensais;
		//Opera��o para obter o sal�rio do referido m�s.
		
		System.out.println(" ");
		//Aqui este comando est� sendo usando para melhor espa�amento entre as linhas.
		System.out.println("Ganho por hora: R$ " + GanhoHora );
		System.out.println("Hora(s) de trabalho/mes: " + horas + " h " + minutos + " min.");
		System.out.println(" ");
		//Aqui este comando est� sendo usando para melhor espa�amento entre as linhas.
				
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