package Estudos.Vetores;
import java.util.*;
public class Exemplo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		/* Lê 5 nomes e 5 notas de uma turma,
		calcula e exibe a média das notas da turma e em seguida
		exibe a relação de nomes cuja nota é superior a esta média.
		 */
		
		String[] nomes = new String[5];
		// Declarando um vetor tipo String com o tamanho de 5 posições.
		
		double[] notas = new double[5];
		// Declarando um vetor tipo Double também com tamanho de 5 posições, já que são 5 alunos.

		double soma = 0;
		double media = 0;
		
		for (int i = 1 ; i <= 5 ; i++){
			
		System.out.println("Entre com o nome do aluno nº " + i);
		nomes[i] = sc.next();
		// Irá ser digitado o nome do aluno na posição atual do contador.
		
		System.out.println("Entre com a nota do aluno nº " + i );
		notas[i] = sc.nextDouble();
		// Irá ser digitado a nota do aluno na posição atual do contador.
		
		soma = soma + notas[i];
		
		}
		
		media = soma / 5;
		// A media da turma sera dada pela soma de todas as notas e divida pela quantidade de alunos.
		
		System.out.println("A media da turma eh: "+ media);
		System.out.println("\nLista dos alunos cuja nota eh superior a media da turma:");
		
		 for(int i = 1; i < 5; i++) {
		 // Outro laço sera feito para separar os nomes acima da media
		
			 if(notas[i] > media)
				 //Se a nota da posiçao atual for maior que a media aparecerá o nome do aluno ao final do programa.
		      System.out.println(nomes[i]);    
		        }
		    }
		}