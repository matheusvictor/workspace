package br.questoes;
import java.util.Scanner;
public class Questao15 {

	/**
	 * Desenvolva um algoritmo que leia duas notas de um aluno, um trabalho (todos os valores entre 0 e
10) e sua frequ�ncia, definindo e imprimindo se ele foi aprovado, reprovado ou se far� prova final.
O aluno ser� reprovado se faltou mais de 15 aulas. Ser� aprovado se n�o for reprovado por falta e
sua m�dia for maior que 6,0. Caso tenha m�dia menor, dever� fazer prova final. O c�lculo da
m�dia deve ser feito com peso 3 para a primeira prova, 5 para a segunda prova e 2 para o trabalho.
	 */
	
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		
		double nota1, nota2, trabalho = 0;
		int frequencia = 0;
		
		System.out.println("Digite a 1� nota do aluno.");
		nota1 = sc.nextDouble();
		
		while (nota1 < 0 || nota1 > 10){
			System.out.println("Nota invalida. Tente novamente.");
			nota1 = sc.nextDouble();
		}
		
		System.out.println("Digite a 2� nota do aluno.");
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
			System.out.println("1� nota: " + nota1);
			System.out.println("2� nota: " + nota2);
			System.out.println("Nota do trabalho: " + trabalho);
			System.out.println("Media: " + Math.ceil(media));
			System.out.println("N� de faltas durante o semestre/unidade: " + frequencia);
			System.out.println("Situa�ao: REPROVADO POR N�MERO DE FALTAS.");
		}
		
		else if (frequencia <= 15 && media >= 6){
			System.out.println("1� nota: " + nota1);
			System.out.println("2� nota: " + nota2);
			System.out.println("Nota do trabalho: " + trabalho);
			System.out.println("Media: " + Math.ceil(media));
			System.out.println("N� de faltas durante o semestre/unidade: " + frequencia);
			System.out.println("Situa�ao: APROVADO.");
		}
		
		else if (frequencia <= 15 && media < 6){
			System.out.println("1� nota: " + nota1);
			System.out.println("2� nota: " + nota2);
			System.out.println("Nota do trabalho: " + trabalho);
			System.out.println("Media: " + Math.ceil(media));
			System.out.println("N� de faltas durante o semestre/unidade: " + frequencia);
			System.out.println("Situa�ao: PROVA FINAL.");
		}		
	}
}