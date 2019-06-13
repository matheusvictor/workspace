package br.quarta.unidade;
import java.util.*;
public class Questao11 {

	/**
	 * Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e
calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
Media de aproveitamento Conceito
Entre 9.1 e 10.0 A
Entre 7.6 e 9.0 B
Entre 6.1 e 7.5 C
Entre 4.1 e 6.0 D
Entre 4.0 e zero E
O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se o
conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String nome, disciplina;
		double nota1, nota2 = 0;
		int limite = 0;
		
		System.out.println("Bem-vind@ ao portal do aluno.");
		System.out.println("Digite o seu nome, por favor.");
		nome = sc.next();
		
		System.out.println("Digite o numero de disciplinas que deseja calcular a medias ao longo do programa.");
		System.out.println("Obs.: O limite de disciplinas eh de 13.");
		limite = sc.nextInt();
		
		while ((limite <= 0) || (limite > 13)){
			System.out.println("Erro! Tente novamente.");
			limite = sc.nextInt();
		}
		
		for (int contador = 1; contador <= limite; contador ++){
		System.out.println(" ");
		System.out.println(nome  + ", digite o nome da disciplina em que deseja entrar com as notas.");
		disciplina = sc.next();
		
		System.out.println("Digite a sua primeira nota.");
		nota1 = sc.nextDouble();
		
		while ((nota1 > 10) || (nota1 < 0)){
			System.out.println("Erro! A nota digitada eh invalida. Tente novamente.");
			nota1 = sc.nextDouble();
		}
		
		System.out.println("Digite a sua segunda nota.");
		nota2 = sc.nextDouble();
		
		while ((nota2 > 10) || (nota2 < 0)){
			System.out.println("Erro! A nota digitada eh invalida. Tente novamente.");
			nota2 = sc.nextDouble();
		}
		
		double media = (nota1+nota2)/2;
		
		if ((media <= 10) && (media >= 9.1)){
			System.out.println(" ");
			System.out.println("Nome do aluno: " + nome);
			System.out.println("Disciplina: " + disciplina);
			System.out.println("Primeira nota: " + nota1);
			System.out.println("Segunda nota: " + nota2);
			System.out.println("Media: " + media);
			System.out.println("Conceito: A");
			System.out.println("APROVADO!");
		}
		
		else if ((media >= 7.6) && (media <= 9)){
			System.out.println(" ");
			System.out.println("Nome do aluno: " + nome);
			System.out.println("Disciplina: " + disciplina);
			System.out.println("Primeira nota: " + nota1);
			System.out.println("Segunda nota: " + nota2);
			System.out.println("Media: " + media);
			System.out.println("Conceito: B");
			System.out.println("APROVADO!");
		}
		
		else if ((media >= 6.1) && (media <= 7.5)){
			System.out.println(" ");
			System.out.println("Nome do aluno: " + nome);
			System.out.println("Disciplina: " + disciplina);
			System.out.println("Primeira nota: " + nota1);
			System.out.println("Segunda nota: " + nota2);
			System.out.println("Media: " + media);
			System.out.println("Conceito: C");
			System.out.println("APROVADO!");
		}
		
		else if ((media >= 4.1) && (media <= 6)){
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
		
		else if (media > 10){
			System.out.println(" ");
			System.out.println("Nome do aluno: " + nome);
			System.out.println("Disciplina: " + disciplina);
			System.out.println("Primeira nota: " + nota1);
			System.out.println("Segunda nota: " + nota2);
			System.out.println("Media: " + media);
			System.out.println(" ");
			System.out.println("ERRO! Uma ou mais das notas digitadas estao incorretas, pois a media nao pode ultrapassar 10.0");
		}
		
		else if (media < 0){
			System.out.println(" ");
			System.out.println("Nome do aluno: " + nome);
			System.out.println("Disciplina: " + disciplina);
			System.out.println("Primeira nota: " + nota1);
			System.out.println("Segunda nota: " + nota2);
			System.out.println("Media: " + media);
			System.out.println(" ");
			System.out.println("ERRO! Uma ou mais das notas digitadas estao incorretas, pois a media precisa ser maior ou igual a zero.");			
		}
			}
		System.out.println(" ");
		System.out.println("Programa encerrado!");
		System.exit(0);
	}
}