package br.questoes;
import java.util.*;
public class Questao26 {

	/**
	 * Fa�a um algoritmo para ler o nome, as tr�s notas e o n�mero de faltas de um aluno e escrever qual
a sua situa��o final: Aprovado, Reprovado por Falta ou Reprovado por M�dia. A m�dia para
aprova��o � 7,0 e o limite de faltas � 25% do total de aulas. O n�mero de aulas ministradas no
semestre foi de 80. A reprova��o por falta sobrep�e a reprova��o por M�dia
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String nome;
		double nota1, nota2, nota3 = 0;
		int faltas = 0;
		
		System.out.println("Digite o nome do(a) aluno(a).");
		nome = sc.nextLine();
		
		System.out.println("Digite a 1� nota.");
		nota1 = sc.nextDouble();
		
		while(nota1 < 0 || nota1 > 10){
			System.out.println("Erro! Tente novamente.");
			nota1 = sc.nextDouble();
		}
		
		System.out.println("Digite a 2� nota.");
		nota2 = sc.nextDouble();
		
		while(nota2 < 0 || nota2 > 10){
			System.out.println("Erro! Tente novamente.");
			nota2 = sc.nextDouble();
		}
		
		System.out.println("Digite a 3� nota.");
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
			System.out.println("1� nota: "  + nota1);
			System.out.println("2� nota: "  + nota2);
			System.out.println("3� nota: "  + nota3);
			System.out.println("Media: "  + Math.ceil(media));
			System.out.println("N� de faltas: " + faltas);
			System.out.println("Situa�ao: Reprovado por numero de faltas.");
		}
		
		if (media >= 7 && faltas <= limitefaltas){
			System.out.println("Nome: "  + nome);
			System.out.println("1� nota: "  + nota1);
			System.out.println("2� nota: "  + nota2);
			System.out.println("3� nota: "  + nota3);
			System.out.println("Media: "  + Math.ceil(media));
			System.out.println("N� de faltas: " + faltas);
			System.out.println("Situa�ao: Aprovado.");
		}
		
		else if (media < 7){
			System.out.println("Nome: "  + nome);
			System.out.println("1� nota: "  + nota1);
			System.out.println("2� nota: "  + nota2);
			System.out.println("3� nota: "  + nota3);
			System.out.println("Media: "  + Math.ceil(media));
			System.out.println("N� de faltas: " + faltas);
			System.out.println("Situa�ao: Reprovado por media.");
		}
		

	}

}
