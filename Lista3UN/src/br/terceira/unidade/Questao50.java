package br.terceira.unidade;
import java.util.*;
public class Questao50 {

	/**
	 * Faça um Programa para leitura de três notas parciais de um aluno. O programa deve calcular a média alcançada
por aluno e presentar:
A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
A mensagem "Aprovado com Distinção", se a média for igual a 10.
	 */
	
	public static void main(String[] args) {
	
		String nome, disciplina;
		double nota1, nota2, nota3 = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Bem-vind@ ao nosso Portal do Aluno.");
		System.out.println(" ");
		System.out.println("Digite o seu nome, por favor.");
		nome = sc.nextLine();
		
		System.out.println(nome + ", digite o nome da disciplina em que deseja entrar com as notas.");
		disciplina = sc.nextLine();
		
		System.out.println("Digite a primeira nota.");
		nota1 = sc.nextDouble();
		
		System.out.println("Digite a segunda nota.");
		nota2 = sc.nextDouble();
		
		System.out.println("Digite a terceira nota.");
		nota3 = sc.nextDouble();
			
		sc.close();
		
		double media = (nota1+nota2+nota3)/3; 
		
		if ((media >= 7) && (media <= 9.9)){
			System.out.println("Nome do(a) aluno(a): " + nome);
			System.out.println("Disciplina: " + disciplina);
			System.out.println("Media: " + media);
			System.out.println("Situaçao do(a) aluno(a): Aprovado(a)!");
		}
		
		else if (media == 10){
			System.out.println("Nome do(a) aluno(a): " + nome);
			System.out.println("Disciplina: " + disciplina);
			System.out.println("Media: " + media);
			System.out.println("Situaçao do(a) aluno(a): Aprovado(a) com Distinçao!");
		}

		else if (media < 7){
			System.out.println("Nome do(a) aluno(a): " + nome);
			System.out.println("Disciplina: " + disciplina);
			System.out.println("Media: " + media);
			System.out.println("Situaçao do(a) aluno(a): Reprovado(a)!");
		}
		

		else if (media > 10){
			System.out.println("Nome do(a) aluno(a): " + nome);
			System.out.println("Disciplina: " + disciplina);
			System.out.println("Media: " + media);
			System.out.println("Situaçao do(a) aluno(a): Erro!");
			System.out.println("Motivo: Uma ou mais das notas inseridas estao erradas, pois a media maxima eh igual a 10 (dez).");
			System.out.println("Rode o programa novamente para refazer os calculos.");
		}
	}
}