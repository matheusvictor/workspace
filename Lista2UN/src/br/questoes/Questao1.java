package br.questoes;
import java.util.*;
public class Questao1 {

	/**
	 * Fa�a um Programa que pe�a as 4 notas bimestrais e mostre a m�dia.
	 */
	public static void main(String[] args) {
		
		double nota1, nota2, nota3, nota4 = 0;
		String nome, disciplina;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Bem-vindo(a) ao portal do aluno. Digite seu nome para continuar.");
		nome = sc.nextLine();
		
		System.out.println("Digite o nome da disciplina em que deseja entrar com as notas.");
		disciplina = sc.nextLine();
		
		System.out.println("Digite a primeira nota bimestral.");
		nota1 = sc.nextDouble();
		
		System.out.println("Digite a segunda nota bimestral.");
		nota2 = sc.nextDouble();
		
		System.out.println("Digite a terceira nota bimestral.");
		nota3 = sc.nextDouble();
		
		System.out.println("Digite a quarta nota bimestral.");
		nota4 = sc.nextDouble();
		
		sc.close();
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println(" ");
		System.out.println("Nome do(a) aluno(a): " + nome);
		System.out.println("Disciplina: " + disciplina);
		System.out.println("1� nota: " + nota1);
		System.out.println("2� nota: " + nota2);
		System.out.println("3� nota: " + nota3);
		System.out.println("4� nota: " + nota4);
		System.out.printf("Media final: %.1f" , media);
	}
}