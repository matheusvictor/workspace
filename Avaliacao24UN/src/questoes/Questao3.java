package questoes;
import java.util.*;
public class Questao3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int tamanhovetor = 10;
		
		int vetor [] = new int [tamanhovetor];
		//Declaração mista de um vetor inteiro cujo tamanho eh limitado por uma variavel
		int soma = 0;
		//int elemento = 0;
		
		for (int i = 0; i < tamanhovetor; i ++){
			System.out.println("Digite um numero inteiro para ser alocado na posicao " + i + " do vetor.");
			//elemento = sc.nextInt();
			vetor[i] = sc.nextInt();
			//Guardar na posição atual do vetor, o elemento digitado
			
			//vetor[i] = 2*(i + 1);
			soma = soma + vetor[i];			
		}
		
		for (int i = 0; i < tamanhovetor; i ++){
			System.out.println("O vetor na posiçao " + i + " eh: " + vetor[i]);	
		}
		System.out.println("A soma de todos os numero eh: " + soma);
	}
}