package br.questoes;
import java.util.Scanner;
public class Questao12 {
	
	/**
	 * Escreva um programa para calcular e mostrar o salário semanal de uma pessoa, determinado pelas
condições que seguem. Se o número de horas trabalhadas for inferior a 40, a pessoa recebe
R$15,00 por hora, senão a pessoa recebe R$600,00 mais R$21,00 para cada hora trabalhada
acima de 40 horas. O programa deve pedir o número de horas trabalhadas como entrada e deve dar
o salário como saída.
	 */
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		
		double horastrabalhadas = 0;
		
		System.out.println("Digite o numero de horas trabalhadas.");
		horastrabalhadas = sc.nextDouble();
		
		int horas = (int) horastrabalhadas; //Isolando o numero sem as casas decimais
		double decimais = horastrabalhadas - horas; // conservando os decimais em uma outra variavel
		double min = decimais * 60; // Transformando as casas decimais em minutos
		

		if (horastrabalhadas < 40){
			double salario = horastrabalhadas * 15;
			System.out.println("Horas trabalhadas (semana): " + horas + "h " + Math.ceil(min) + "min.");
			System.out.println("Salario semanal: R$ " + salario);
		}
		
		if (horastrabalhadas >= 40){
			double salario = 600 + (21 * horastrabalhadas);
			System.out.println("Horas trabalhadas (semana): " + horas + "h " + min + "min.");
			System.out.println("Salario semanal: R$ " + salario);
		}	
	}
}