package br.questoes;
import java.util.*;
public class Questao11 {

	/**
	 * Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. Calcule
e mostre o total do seu sal�rio no referido m�s, sabendo-se que s�o descontados 11% para o Imposto de Renda, 8% para
o INSS e 5% para o sindicato, fa�a um programa que nos d�:
. sal�rio bruto.
a. quanto pagou ao INSS.
b. quanto pagou ao sindicato.
c. o sal�rio l�quido.
d. calcule os descontos e o sal�rio l�quido, conforme a tabela abaixo:
e. + Sal�rio Bruto : R$
f. - IR (11%) : R$
g. - INSS (8%) : R$
h. - Sindicato ( 5%) : R$
= Sal�rio Liquido : R$
Obs.: Sal�rio Bruto - Descontos = Sal�rio L�quido.
	 */
	
	public static void main(String[] args) {
		
		String nome, mes;
		double horastrabalho, ganhohora = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ola, usuario! Sou um programa criado para calcular seu Sal�rio L�quido.");
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
		System.out.println("Sal�rio Bruto : R$ " + salariobruto);
		System.out.println("- IR (11%): R$ " + Math.ceil(ir));
		System.out.println("- INSS (8%): R$ " + Math.ceil(inss));
		System.out.println("- Sindicato ( 5%): R$ " + Math.ceil(sindicato));
		System.out.printf("= Sal�rio Liquido: R$ %.2f" , salarioliquido);
	
		System.exit(0);
	}
}
