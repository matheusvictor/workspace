package br.questoes;
import java.util.*;
public class Questao26 {

	/**
	 * Faça um algoritmo para ler o nome, as três notas e o número de faltas de um aluno e escrever qual
a sua situação final: Aprovado, Reprovado por Falta ou Reprovado por Média. A média para
aprovação é 7,0 e o limite de faltas é 25% do total de aulas. O número de aulas ministradas no
semestre foi de 80. A reprovação por falta sobrepõe a reprovação por Média
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String nome;
		double nota1, nota2, nota3 = 0;
		int faltas = 0;
		
		System.out.println("Digite o nome do(a) aluno(a).");
		nome = sc.nextLine();
		
		System.out.println("Digite a 1ª nota.");
		nota1 = sc.nextDouble();
		
		while(nota1 < 0 || nota1 > 10){
			System.out.println("Erro! Tente novamente.");
			nota1 = sc.nextDouble();
		}
		
		System.out.println("Digite a 2ª nota.");
		nota2 = sc.nextDouble();
		
		while(nota2 < 0 || nota2 > 10){
			System.out.println("Erro! Tente novamente.");
			nota2 = sc.nextDouble();
		}
		
		System.out.println("Digite a 3ª nota.");
		nota3 = sc.nextDouble();
		
		while(nota3 < 0 || nota3 > 10){
			System.out.println("Erro! Tente novamente.");
			nota3 = sc.nextDouble();
		}
		
		System.out.println("Digite o numero de faltas que o aluno teve durante o semestre.");
		faltas = sc.nextInt();
		
		while(faltas < 0){
			System.out.println("Erro! Tente novamente.");
			faltas = sc.nextInt();
		}
		
		double media = (nota1 + nota2 + nota3)/3;
		double limitefaltas = 80 - (0.25 * 80) ;
		
		if (faltas > limitefaltas){
			System.out.println("Nome: "  + nome);
			System.out.println("1ª nota: "  + nota1);
			System.out.println("2ª nota: "  + nota2);
			System.out.println("3ª nota: "  + nota3);
			System.out.println("Media: "  + Math.ceil(media));
			System.out.println("Nº de faltas: " + faltas);
			System.out.println("Situaçao: Reprovado por numero de faltas.");
		}
		
		if (media >= 7 && faltas <= limitefaltas){
			System.out.println("Nome: "  + nome);
			System.out.println("1ª nota: "  + nota1);
			System.out.println("2ª nota: "  + nota2);
			System.out.println("3ª nota: "  + nota3);
			System.out.println("Media: "  + Math.ceil(media));
			System.out.println("Nº de faltas: " + faltas);
			System.out.println("Situaçao: Aprovado.");
		}
		
		else if (media < 7){
			System.out.println("Nome: "  + nome);
			System.out.println("1ª nota: "  + nota1);
			System.out.println("2ª nota: "  + nota2);
			System.out.println("3ª nota: "  + nota3);
			System.out.println("Media: "  + Math.ceil(media));
			System.out.println("Nº de faltas: " + faltas);
			System.out.println("Situaçao: Reprovado por media.");
		}
		

	}

}
