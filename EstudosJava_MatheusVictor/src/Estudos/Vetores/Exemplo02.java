package Estudos.Vetores;
import java.util.*;
public class Exemplo02 {

	/* Fa�a um programa que leia a quatidade de alunos numa classe, os nomes e as notas destes.
	Calcule e exiba a m�dia das notas da turma e em seguida exiba a rela��o de nomes cuja nota � superior a esta m�dia.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int tamanho;
	
		System.out.println("Digite quantos alunos ha na classe.");
		tamanho = sc.nextInt();
	
		String nomes [] = new String[tamanho];
		// Declarando um vetor tipo String com o tamanho de X posi��es.
		
		double notas [];
		// Declarando um vetor tipo Double tamb�m com tamanho de X posi��es, j� que s�o X alunos.

		notas = new double [tamanho];
		
		double soma = 0;
		double media = 0;
		
		for (int i = 1 ; i <= tamanho ; i++){
			
		System.out.println("Entre com o nome do aluno n� " + i);
		nomes[i] = sc.next();
		// Ir� ser digitado o nome do aluno na posi��o atual do contador.
		
		System.out.println("Entre com a nota do aluno n� " + i );
		notas[i] = sc.nextDouble();
		// Ir� ser digitado a nota do aluno na posi��o atual do contador.
		
		soma = soma + notas[i];
		
		}
		
		media = soma / tamanho;
		// A media da turma sera dada pela soma de todas as notas e divida pela quantidade de alunos.
		
		System.out.println("A media dos alunos eh: "+ media);
		System.out.println("\nLista dos alunos cuja nota eh superior a media da turma:");
		
		 for(int i = 1; i <= tamanho; i++) {
		 // Outro la�o sera feito para separar os nomes acima da media
		
		 if (notas[i] > media)
		 //Se a nota da posi�ao atual for maior que a media aparecer� o nome do aluno da posi��o atual ao final do programa.
		 System.out.println (nomes[i]);    
		        }
		    }
		}