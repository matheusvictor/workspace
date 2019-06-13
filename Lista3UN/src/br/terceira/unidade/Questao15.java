package br.terceira.unidade;
import java.util.*;
public class Questao15 {

	/**
	 * Desenvolva um algoritmo que leia duas notas de um aluno, um trabalho (todos os valores entre 0 e 10) e sua
frequência, definindo e imprimindo se ele foi aprovado, reprovado ou se fará prova final.

O aluno será reprovado se faltou mais de 15 aulas.
Será aprovado se não for reprovado por falta e sua média for maior que 6,0.
Caso tenha média menor, deverá fazer prova final.
O cálculo da média deve ser feito com peso 3 para a primeira prova, 5 para a segunda prova e 2 para o trabalho.
	 */
	
	public static void main(String[] args) {
		
		String nome, disciplina;
		double nota1, nota2, trabalho;
		int frequencia;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ola, usuario! Seja bem-vindo(a) ao nosso portal do aluno.");		
		System.out.println("Informe-nos o seu nome, por favor.");
		nome = sc.nextLine();
		System.out.println("O nosso programa serve para indicar se voce, " + nome + ", foi aprovado ou reprovado.");
		System.out.println(" ");
		System.out.println("O nosso calculo sera baseado na sua frequencia e na nota da sua media.");
		System.out.println(" ");
		System.out.println("P.S.: Lembrando que as notas vareiam entre 0 e 10.");
		System.out.println("Pressione enter para continuar.");
		sc.nextLine();
		
		System.out.println("Digite a sua nota na primeira prova.");
		nota1 = sc.nextDouble(); 
		
		while (nota1  > 10 || nota1 < 0){
			System.out.println("Nota invalida! Tente novamente.");
			nota1 = sc.nextDouble();
		}
		
		System.out.println("Digite a sua nota na segunda prova.");
		nota2 = sc.nextDouble();
		
		while (nota2  > 10 || nota2 < 0){
			System.out.println("Nota invalida! Tente novamente.");
			nota2 = sc.nextDouble();
		}
		
		System.out.println("Digite a sua nota no trabalho.");
		trabalho = sc.nextDouble();
		
		while (trabalho  > 10 || trabalho < 0){
			System.out.println("Nota invalida! Tente novamente.");
			trabalho = sc.nextDouble();
		}
		
		System.out.println("Digite quantas faltas voce teve durante o semestre.");
		frequencia = sc.nextInt();
		
		while (frequencia < 0){
			System.out.println("Erro. O numero de frequencia nao pode ser menor que 0 (zero).");
			System.out.println("Tente novamente!");
			frequencia = sc.nextInt();
		}
		
		double media = ((nota1*3) + (nota2*5) + (trabalho*2))/3;
		//Calculando a media de acordo com os pesos aplicados em cada nota.
		
		if (frequencia > 15){
			System.out.println(" ");
			System.out.println("Nome do(a) aluno(a): " + nome);
			System.out.println("Nota da primeira prova: " + nota1);
			System.out.println("Nota da sedunga prova: " + nota2);
			System.out.println("Frequencia (faltas): " + frequencia);
			System.out.printf("Media: %.1f ", media);
			System.out.println("\nSituação: REPROVADO(A).");
			System.out.println("Motivo: O(a) aluno(a) foi reprovado(a) por faltas." );
		}
		
		else if ((frequencia <= 15) && (media < 6)){
			System.out.println(" ");
			System.out.println("Nome do(a) aluno(a): " + nome);
			System.out.println("Nota da primeira prova: " + nota1);
			System.out.println("Nota da sedunga prova: " + nota2);
			System.out.println("Frequencia (faltas): " + frequencia);
			System.out.printf("Media: %.1f ", media);
			System.out.println("\nSituação: O(a) aluno(a) devera fazer prova final.");
			System.out.println("Motivo: Media abaixo de 6,0." );
		}
		
		else if ((frequencia <= 15) && (media >= 6)){
			System.out.println(" ");
			System.out.println("Nome do(a) aluno(a): " + nome);
			System.out.println("Nota da primeira prova: " + nota1);
			System.out.println("Nota da sedunga prova: " + nota2);
			System.out.println("Frequencia (faltas): " + frequencia);
			System.out.printf("Media: %.1f ", media);
			System.out.println("\nSituação: APROVADO(A).");
		}
		
		
		
		

		

	}

}
