package br.terceira.unidade;
import java.util.*;
public class Questao26 {

	/**
	 * Fa�a um algoritmo para ler o nome, as tr�s notas e o n�mero de faltas de um aluno e escrever qual a sua situa��o
final: Aprovado, Reprovado por Falta ou Reprovado por M�dia. A m�dia para aprova��o � 7,0 e o limite de faltas �
25% do total de aulas. O n�mero de aulas ministradas no semestre foi de 80. A reprova��o por falta sobrep�e a
reprova��o por M�dia.
	 */
	public static void main(String[] args) {
		
		String nome, disciplina;
		double nota1, nota2, nota3 = 0;
		int faltas = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Bem-vindo(a) ao nosso portal do aluno.");
		System.out.println("Digite o seu nome para continuar.");
		nome = sc.nextLine();
		
		System.out.println(nome + ", digite o nome da disciplina em que deseja entrar com as notas.");
		disciplina = sc.nextLine();
		
		System.out.println("Digite a sua primeira nota.");
		nota1 = sc.nextDouble();
		
		System.out.println("Digite a sua segunda nota.");
		nota2 = sc.nextDouble();
		
		System.out.println("Digite a sua terceira nota.");
		nota3 = sc.nextDouble();
		
		System.out.println("Digite o numero de faltas durante o semestre.");
		faltas = sc.nextInt();
		
		sc.close();
		
		double media = (nota1 + nota2 + nota3)/3;
		
		//O total de aula ministrada eh foi de 80 e a frequencia minima precisa ser de 25%, ou seja, 20 aulas. Portanto, o aluno devera ter o numero de faltas menor ou igual a 20.
		if (media >=  7 && faltas <= 20){
			System.out.println("Nome do(a) aluno(a): " + nome);
			System.out.println("Disciplina: " + disciplina);
			System.out.println("Primeira nota: " + nota1);
			System.out.println("Segunda nota: " + nota2);
			System.out.println("Terceira nota: " + nota3);
			System.out.println("Media: " + media);
			System.out.println("Frequencia (n� de faltas): " + faltas);
			System.out.println("Situa�ao do(a) aluno(a): Aprovado(a)!");
			System.out.println(" ");
			System.out.println("Obs�.: A frequencia minima eh de 25% do total de aulas ministradas.");
			System.out.println("Obs�.: Total de aulas ministradas = 80 aulas.");
			System.out.println("Obs�.: A reprova�ao por falta sobrepoe a reprova�ao por Media.");
		}
		
		else if (media < 7 && faltas <= 20){
			System.out.println("Nome do(a) aluno(a): " + nome);
			System.out.println("Disciplina: " + disciplina);
			System.out.println("Primeira nota: " + nota1);
			System.out.println("Segunda nota: " + nota2);
			System.out.println("Terceira nota: " + nota3);
			System.out.println("Media: " + media);
			System.out.println("Frequencia (n� de faltas): " + faltas);
			System.out.println("Situa�ao do(a) aluno(a): Reprovado(a) por Media!");
			System.out.println(" ");
			System.out.println("Obs�.: A frequencia minima eh de 25% do total de aulas ministradas.");
			System.out.println("Obs�.: Total de aulas ministradas = 80 aulas.");
			System.out.println("Obs�.: A reprova�ao por falta sobrepoe a reprova�ao por Media.");
		}
		
		else if (media >= 7 && faltas > 20){
			System.out.println("Nome do(a) aluno(a): " + nome);
			System.out.println("Disciplina: " + disciplina);
			System.out.println("Primeira nota: " + nota1);
			System.out.println("Segunda nota: " + nota2);
			System.out.println("Terceira nota: " + nota3);
			System.out.println("Media: " + media);
			System.out.println("Frequencia (n� de faltas): " + faltas);
			System.out.println("Situa�ao do(a) aluno(a): Reprovado(a) por numero de faltas!");
			System.out.println(" ");
			System.out.println("Obs�.: A frequencia minima eh de 25% do total de aulas ministradas.");
			System.out.println("Obs�.: Total de aulas ministradas = 80 aulas.");
			System.out.println("Obs�.: A reprova�ao por falta sobrepoe a reprova�ao por Media.");
		}
		
		else if (media < 7 && faltas > 20){
			System.out.println("Nome do(a) aluno(a): " + nome);
			System.out.println("Disciplina: " + disciplina);
			System.out.println("Primeira nota: " + nota1);
			System.out.println("Segunda nota: " + nota2);
			System.out.println("Terceira nota: " + nota3);
			System.out.println("Media: " + media);
			System.out.println("Frequencia (n� de faltas): " + faltas);
			System.out.println("Situa�ao do(a) aluno(a): Reprovado(a) por numero de faltas e por media!");
			System.out.println(" ");
			System.out.println("Obs�.: A frequencia minima eh de 25% do total de aulas ministradas.");
			System.out.println("Obs�.: Total de aulas ministradas = 80 aulas.");
			System.out.println("Obs�.: A reprova�ao por falta sobrepoe a reprova�ao por Media.");
		}
	
		}

	}

