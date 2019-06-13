package br.terceira.unidade;
import java.util.*;
public class Questao12 {

	/**
	 * Escreva um programa para calcular e mostrar o sal�rio semanal de uma pessoa, determinado pelas condi��es que
seguem. Se o n�mero de horas trabalhadas for inferior a 40, a pessoa recebe R$15,00 por hora, sen�o a pessoa
recebe R$600,00 mais R$21,00 para cada hora trabalhada acima de 40 horas. O programa deve pedir o n�mero
de horas trabalhadas como entrada e deve dar o sal�rio como sa�da.
	 */
	
	public static void main(String[] args) {
		
		String nome;
		int horastrabalho;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ola, usario. Sou um programa voltado ao objetivo salarial.");
		System.out.println("Pressione enter para continuar.");
		sc.nextLine();
		
		System.out.println("Informe o seu nome, por favor.");
		nome = sc.nextLine();
		
		System.out.println(nome + ", quantas horas de trabalho voce realiza por semana?");
		System.out.println("Obs.: Digite apenas numeros inteiros. Ex.: 3");
		horastrabalho = sc.nextInt();
		
		sc.close();
		
		/** int horas = (int) horastrabalho;
		double decimais = horastrabalho - horas;		
		double min = decimais * 60;
		int minutos = (int) min;
		*/
		//Esta parte foi feita para que, caso o n�mero fosse em decimal, fosse feito a convers�o. Entretanto, nesata quest�o, podemos ignor�-la.
		
		if (horastrabalho < 40){
			double salario = horastrabalho * 15;
			System.out.println("Nome do funcionario: " + nome);
			System.out.println("Horas trabalhadas (por semana): " + horastrabalho + " h");
			System.out.println("Salario semanal: R$ " + salario);
		}
		
		if (horastrabalho >= 40){
			double salario = 600 + (21 * horastrabalho);
			System.out.println("Nome do funcionario: " + nome);
			System.out.println("Horas trabalhadas (por semana): " + horastrabalho + " h");
			System.out.println("Salario semanal: R$ " + salario);
		}
	}

}
