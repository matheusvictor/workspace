package br.questoes;
import java.util.Scanner;
public class Questao15 {

	/**
	 * Desenvolva um algoritmo que leia duas notas de um aluno, um trabalho (todos os valores entre 0 e
10) e sua frequência, definindo e imprimindo se ele foi aprovado, reprovado ou se fará prova final.
O aluno será reprovado se faltou mais de 15 aulas. Será aprovado se não for reprovado por falta e
sua média for maior que 6,0. Caso tenha média menor, deverá fazer prova final. O cálculo da
média deve ser feito com peso 3 para a primeira prova, 5 para a segunda prova e 2 para o trabalho.
	 */
	
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		
		double nota1, nota2, trabalho = 0;
		int frequencia = 0;
		
		System.out.println("Digite a 1ª nota do aluno.");
		nota1 = sc.nextDouble();
		
		while (nota1 < 0 || nota1 > 10){
			System.out.println("Nota invalida. Tente novamente.");
			nota1 = sc.nextDouble();
		}
		
		System.out.println("Digite a 2ª nota do aluno.");
		nota2 = sc.nextDouble();
		
		while (nota2 < 0 || nota2 > 10){
			System.out.println("Nota invalida. Tente novamente.");
			nota2 = sc.nextDouble();
		}
		
		System.out.println("Digite a nota que o aluno tirou no trabalho.");
		trabalho = sc.nextDouble();
		
		while (trabalho < 0 || trabalho > 10){
			System.out.println("Nota invalida. Tente novamente.");
			trabalho = sc.nextDouble();
		}
		
		System.out.println("Digite o numero de faltas que o aluno teve durante o sementre/unidade.");
		frequencia = sc.nextInt();
		
		while (frequencia < 0){
			System.out.println("Erro! Tente novamente.");
			frequencia = sc.nextInt();
		}
		
		double media = ((nota1*3) + (nota2*5) + (trabalho*2))/3;
		//Calculando a media de acordo com os pesos aplicados em cada nota.
		
		if (frequencia > 15){
			System.out.println("1ª nota: " + nota1);
			System.out.println("2ª nota: " + nota2);
			System.out.println("Nota do trabalho: " + trabalho);
			System.out.println("Media: " + Math.ceil(media));
			System.out.println("Nº de faltas durante o semestre/unidade: " + frequencia);
			System.out.println("Situaçao: REPROVADO POR NÚMERO DE FALTAS.");
		}
		
		else if (frequencia <= 15 && media >= 6){
			System.out.println("1ª nota: " + nota1);
			System.out.println("2ª nota: " + nota2);
			System.out.println("Nota do trabalho: " + trabalho);
			System.out.println("Media: " + Math.ceil(media));
			System.out.println("Nº de faltas durante o semestre/unidade: " + frequencia);
			System.out.println("Situaçao: APROVADO.");
		}
		
		else if (frequencia <= 15 && media < 6){
			System.out.println("1ª nota: " + nota1);
			System.out.println("2ª nota: " + nota2);
			System.out.println("Nota do trabalho: " + trabalho);
			System.out.println("Media: " + Math.ceil(media));
			System.out.println("Nº de faltas durante o semestre/unidade: " + frequencia);
			System.out.println("Situaçao: PROVA FINAL.");
		}		
	}
}