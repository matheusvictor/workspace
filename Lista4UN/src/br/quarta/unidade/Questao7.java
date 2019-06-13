package br.quarta.unidade;
import java.util.*;
public class Questao7 {

	/**
	 * Escreva um programa para calcular e mostrar o salário semanal de uma pessoa, determinado pelas condições que
seguem. Enquanto o número de horas trabalhadas for inferior a 40, a pessoa recebe R$15,00 por hora, senão a
pessoa recebe R$600,00 mais R$21,00 para cada hora trabalhada acima de 40 horas. O programa deve pedir o
número de horas trabalhadas como entrada e deve dar o salário como saída
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String nome;
		double horastrabalho = 0;
		int n = 0;
		int contador = 0;
			
		System.out.println("Ola, usario. Sou um programa voltado ao objetivo salarial.");
		System.out.println("Pressione enter para continuar.");
		sc.nextLine();
		
		System.out.println("Digite a quantidade de vezes que deseja executar o programa.");
		System.out.println("Obs.: Limite de 5 vezes.");
		n = sc.nextInt();
		
		while (n < 0 || n > 5){
			System.out.println("Erro! Tente novamente.");
			n = sc.nextInt();
		}
		
		if (n == 0){
			System.out.println("Programa encerrado!");
			System.exit(0);
		}

		do {
		System.out.println(" ");
		System.out.println("Informe o seu nome, por favor.");
		nome = sc.next();
		System.out.println(" ");
		System.out.println(nome + ", quantas horas de trabalho voce realiza por semana?");
		horastrabalho = sc.nextDouble();
		
		int horas = (int) horastrabalho;
		double decimais = horastrabalho - horas;		
		double min = decimais * 60;
		int minutos = (int) min;
		//Esta parte foi feita para que seja feita a conversão.
		
		if (horastrabalho < 40){
			double salario = horastrabalho * 15;
			System.out.println(" ");
			System.out.println("Nome do funcionario: " + nome);
			System.out.println("Horas trabalhadas (por semana): " + horas + " h " + minutos + " min.");
			System.out.printf("Salario semanal: R$ %.2f " , salario);
		}
		
		if (horastrabalho >= 40){
			double salario = 600 + (21 * horastrabalho);
			System.out.println(" ");
			System.out.println("Nome do funcionario: " + nome);
			System.out.println("Horas trabalhadas (por semana): " + horas + " h " + minutos + " min.");
			System.out.printf("Salario semanal: R$ %.2f " , salario);
		}
		
		contador ++;
		
		} while (contador < n);
		
		System.out.println("\nPrograma encerrado!");
		System.exit(0);
	}
}