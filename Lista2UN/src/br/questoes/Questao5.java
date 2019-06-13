package br.questoes;
import java.util.*;
public class Questao5 {

	/**
	 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre
o total do seu salário no referido mês
	 */
	public static void main(String[] args) {
		
		String nome, mes;
		double horas, ganhohora = 0;

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Sou um programa criado para informar o seu salario num referido mes. POr favor, digite o seu nome para continuar.");
		nome = sc.nextLine();
		System.out.println("Digite o nome do mes em que deseja calcular o referido salario.");
		mes = sc.nextLine();
		System.out.println("Digite o valor ganho por hora de trabalho.");
		System.out.println("Obs.: Digite apenas numeros. O mesmo pode conter virgula.");
		ganhohora = sc.nextDouble();
		System.out.println("Digite o numero de horas trabalhadas no referido mes.");
		System.out.println("Obs.: Digite apenas numeros. O mesmo pode conter virgula.");
		horas = sc.nextDouble();
		
		int hora = (int) horas;
		double decimais = horas - hora;
		double min = decimais * 60;
		int minutos = (int) min;
		
		double salario = horas * ganhohora;
		System.out.println("Nome do funcionario: " + nome);
		System.out.println("Mes: " + mes);
		System.out.println("Ganho por hora de trabalho: R$ " + ganhohora);
		System.out.println("Horas trabalhadas no referido mes: " + hora + " h " + minutos + " min.");
		System.out.printf("Salario: R$ %.2f ", salario);
		
	}

}
