package br.questoes;
import java.util.*;
public class Questao11 {

	/**
	 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule
e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para
o INSS e 5% para o sindicato, faça um programa que nos dê:
. salário bruto.
a. quanto pagou ao INSS.
b. quanto pagou ao sindicato.
c. o salário líquido.
d. calcule os descontos e o salário líquido, conforme a tabela abaixo:
e. + Salário Bruto : R$
f. - IR (11%) : R$
g. - INSS (8%) : R$
h. - Sindicato ( 5%) : R$
= Salário Liquido : R$
Obs.: Salário Bruto - Descontos = Salário Líquido.
	 */
	
	public static void main(String[] args) {
		
		String nome, mes;
		double horastrabalho, ganhohora = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ola, usuario! Sou um programa criado para calcular seu Salário Líquido.");
		System.out.println("Tecle ENTER para continuar.");
		sc.nextLine();
		
		System.out.println("Digite o seu nome, por favor.");
		nome = sc.nextLine();
		System.out.println("Digite o nome do referido mes.");
		mes = sc.nextLine();
		System.out.println("Digite o numero total de horas trabalhadas no mes.");
		System.out.println("Obs.: Para 2h 30 min., digite 2,5.");
		horastrabalho = sc.nextDouble();
		
		int h = (int) horastrabalho;
		double decimais = horastrabalho - h;
		double min = decimais * 60;
		int minutos = (int) min;
		
		System.out.println("Digite o valor (em R$) ganho por hora de trabalho.");
		System.out.println("Obs.: Digite apenas numeros. O mesmo pode conter virgula.");
		ganhohora = sc.nextDouble();
		
		sc.close();
		
		double salariobruto = horastrabalho*ganhohora;
		double ir = (salariobruto * 11) / 100;
		double inss = (salariobruto * 8)/100;
		double sindicato = (salariobruto*5)/100;
		double descontos = inss + ir + sindicato;
		double salarioliquido = salariobruto - descontos;
		
		System.out.println(" ");
		System.out.println("Nome do funcionario: " + nome);
		System.out.println("Mes: " + mes);
		System.out.println("Horas de trabalho (durante o mes): " + h + " h " + minutos + " min.");
		System.out.println("Ganho por hora: R$ " + ganhohora);
		System.out.println("Salário Bruto : R$ " + salariobruto);
		System.out.println("- IR (11%): R$ " + Math.ceil(ir));
		System.out.println("- INSS (8%): R$ " + Math.ceil(inss));
		System.out.println("- Sindicato ( 5%): R$ " + Math.ceil(sindicato));
		System.out.printf("= Salário Liquido: R$ %.2f" , salarioliquido);
	
		System.exit(0);
	}
}
