package br.terceira.unidade;
import java.util.*;
public class Questao43 {

	/**
	 * Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e
calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:

Media de aproveitamento 			 Conceito

Entre 9.0 e 10.0 						A
Entre 7.5 e 9.0 						B
Entre 6.0 e 7.5 						C
Entre 4.0 e 6.0 						D
Entre 4.0 e zero 						E

O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se o
conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.
	 */
	public static void main(String[] args) {
		
		String nome, disciplina;
		double nota1, nota2;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ola, usuario, bem-vind@ ao portal do aluno.");
		System.out.println("Digite o seu nome, por favor.");
		nome = sc.nextLine();
		
		System.out.println(nome  + ", digite o nome da disciplina em que deseja entrar com as notas.");
		disciplina = sc.nextLine();
		
		System.out.println("Digite a sua primeira nota.");
		nota1 = sc.nextDouble();
		
		System.out.println("Digite a sua segunda nota.");
		nota2 = sc.nextDouble();
		
		sc.close();
		
		double media = (nota1+nota2)/2;
		
		if ((media <= 10) && (media >= 9)){
			System.out.println(" ");
			System.out.println("Nome do aluno: " + nome);
			System.out.println("Disciplina: " + disciplina);
			System.out.println("Primeira nota: " + nota1);
			System.out.println("Segunda nota: " + nota2);
			System.out.println("Media: " + media);
			System.out.println("Conceito: A");
			System.out.println("APROVADO!");
		}
		
		else if ((media >= 7.5) && (media <= 9)){
			System.out.println(" ");
			System.out.println("Nome do aluno: " + nome);
			System.out.println("Disciplina: " + disciplina);
			System.out.println("Primeira nota: " + nota1);
			System.out.println("Segunda nota: " + nota2);
			System.out.println("Media: " + media);
			System.out.println("Conceito: B");
			System.out.println("APROVADO!");
		}
		
		else if ((media >= 6) && (media <= 7.5)){
			System.out.println(" ");
			System.out.println("Nome do aluno: " + nome);
			System.out.println("Disciplina: " + disciplina);
			System.out.println("Primeira nota: " + nota1);
			System.out.println("Segunda nota: " + nota2);
			System.out.println("Media: " + media);
			System.out.println("Conceito: C");
			System.out.println("APROVADO!");
		}
		
		else if ((media >= 4) && (media <= 6)){
			System.out.println(" ");
			System.out.println("Nome do aluno: " + nome);
			System.out.println("Disciplina: " + disciplina);
			System.out.println("Primeira nota: " + nota1);
			System.out.println("Segunda nota: " + nota2);
			System.out.println("Media: " + media);
			System.out.println("Conceito: D");
			System.out.println("REPROVADO!");
		}
		
		else if ((media <= 4) && (media >= 0)){
			System.out.println(" ");
			System.out.println("Nome do aluno: " + nome);
			System.out.println("Disciplina: " + disciplina);
			System.out.println("Primeira nota: " + nota1);
			System.out.println("Segunda nota: " + nota2);
			System.out.println("Media: " + media);
			System.out.println("Conceito: E");
			System.out.println("REPROVADO!");
		}
	}
}