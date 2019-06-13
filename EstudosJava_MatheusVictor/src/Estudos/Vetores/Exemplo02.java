package Estudos.Vetores;
import java.util.*;
public class Exemplo02 {

	/* Faça um programa que leia a quatidade de alunos numa classe, os nomes e as notas destes.
	Calcule e exiba a média das notas da turma e em seguida exiba a relação de nomes cuja nota é superior a esta média.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int tamanho;
	
		System.out.println("Digite quantos alunos ha na classe.");
		tamanho = sc.nextInt();
	
		String nomes [] = new String[tamanho];
		// Declarando um vetor tipo String com o tamanho de X posições.
		
		double notas [];
		// Declarando um vetor tipo Double também com tamanho de X posições, já que são X alunos.

		notas = new double [tamanho];
		
		double soma = 0;
		double media = 0;
		
		for (int i = 1 ; i <= tamanho ; i++){
			
		System.out.println("Entre com o nome do aluno nº " + i);
		nomes[i] = sc.next();
		// Irá ser digitado o nome do aluno na posição atual do contador.
		
		System.out.println("Entre com a nota do aluno nº " + i );
		notas[i] = sc.nextDouble();
		// Irá ser digitado a nota do aluno na posição atual do contador.
		
		soma = soma + notas[i];
		
		}
		
		media = soma / tamanho;
		// A media da turma sera dada pela soma de todas as notas e divida pela quantidade de alunos.
		
		System.out.println("A media dos alunos eh: "+ media);
		System.out.println("\nLista dos alunos cuja nota eh superior a media da turma:");
		
		 for(int i = 1; i <= tamanho; i++) {
		 // Outro laço sera feito para separar os nomes acima da media
		
		 if (notas[i] > media)
		 //Se a nota da posiçao atual for maior que a media aparecerá o nome do aluno da posição atual ao final do programa.
		 System.out.println (nomes[i]);    
		        }
		    }
		}