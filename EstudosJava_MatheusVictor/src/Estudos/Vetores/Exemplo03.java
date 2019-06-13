package Estudos.Vetores;
import java.util.*;
public class Exemplo03 {

	/* Lê 5 nomes e 5 notas de uma turma,
	calcula e exibe a média das notas da turma e em seguida
	exibe a relação de nomes cuja nota é superior a esta média.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int tamanho = 0;
		double soma = 0;
		
		System.out.println("Digite a quantidade de alunos na sala.");
		tamanho = sc.nextInt();
		
		String nome[] = new String [tamanho]; //Declaraçao combinada
		
		double nota[];
		nota = new double [tamanho]; // Declaração 'fracionada'
			
		for (int i = 0; i < tamanho; i ++){

			System.out.println("Digite o nome do aluno nº " + i);
			nome[i] = sc.next();
			System.out.println("Digite a nota do aluno nº " + i);
			nota[i] = sc.nextDouble();
			
			soma = soma + nota[i];
			//Relizando a soma das notas de todos os alunos
		}
		
		double media = soma / 5;
		//Caculo para media geral da turma
	
		System.out.println("A media geral da turma eh: " + media);
		System.out.println("\nLista dos alunos acima da media:");
		
		for (int i = 0; i < 5; i ++){
			
			if (nota[i] > media){
				System.out.println("Aluno nº " + i + ": " + nome[i]);
			}
		}
		
		
		

	}

}
