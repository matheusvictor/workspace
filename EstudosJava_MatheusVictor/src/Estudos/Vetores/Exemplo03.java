package Estudos.Vetores;
import java.util.*;
public class Exemplo03 {

	/* L� 5 nomes e 5 notas de uma turma,
	calcula e exibe a m�dia das notas da turma e em seguida
	exibe a rela��o de nomes cuja nota � superior a esta m�dia.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int tamanho = 0;
		double soma = 0;
		
		System.out.println("Digite a quantidade de alunos na sala.");
		tamanho = sc.nextInt();
		
		String nome[] = new String [tamanho]; //Declara�ao combinada
		
		double nota[];
		nota = new double [tamanho]; // Declara��o 'fracionada'
			
		for (int i = 0; i < tamanho; i ++){

			System.out.println("Digite o nome do aluno n� " + i);
			nome[i] = sc.next();
			System.out.println("Digite a nota do aluno n� " + i);
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
				System.out.println("Aluno n� " + i + ": " + nome[i]);
			}
		}
		
		
		

	}

}
