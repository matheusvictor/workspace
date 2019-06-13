package Estudos.Vetores;
import java.util.*;
public class Exemplo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		/* L� 5 nomes e 5 notas de uma turma,
		calcula e exibe a m�dia das notas da turma e em seguida
		exibe a rela��o de nomes cuja nota � superior a esta m�dia.
		 */
		
		String[] nomes = new String[5];
		// Declarando um vetor tipo String com o tamanho de 5 posi��es.
		
		double[] notas = new double[5];
		// Declarando um vetor tipo Double tamb�m com tamanho de 5 posi��es, j� que s�o 5 alunos.

		double soma = 0;
		double media = 0;
		
		for (int i = 1 ; i <= 5 ; i++){
			
		System.out.println("Entre com o nome do aluno n� " + i);
		nomes[i] = sc.next();
		// Ir� ser digitado o nome do aluno na posi��o atual do contador.
		
		System.out.println("Entre com a nota do aluno n� " + i );
		notas[i] = sc.nextDouble();
		// Ir� ser digitado a nota do aluno na posi��o atual do contador.
		
		soma = soma + notas[i];
		
		}
		
		media = soma / 5;
		// A media da turma sera dada pela soma de todas as notas e divida pela quantidade de alunos.
		
		System.out.println("A media da turma eh: "+ media);
		System.out.println("\nLista dos alunos cuja nota eh superior a media da turma:");
		
		 for(int i = 1; i < 5; i++) {
		 // Outro la�o sera feito para separar os nomes acima da media
		
			 if(notas[i] > media)
				 //Se a nota da posi�ao atual for maior que a media aparecer� o nome do aluno ao final do programa.
		      System.out.println(nomes[i]);    
		        }
		    }
		}