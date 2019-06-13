package Estudos.Vetores;
import java.util.*;
public class SegundoVetor {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		int vetor[];
		// Lembrando que, o vetor sempre inicia na posiçao zero
		int elemento;
		int tamanho;
		
		System.out.println("Digite o tamanho do vetor.");
		tamanho = sc.nextInt();
		
		vetor = new int [tamanho];
		
		for (int i = 0; i < tamanho; i ++){
			// Enquanto o contador for o menor que o tamanho do vetor...
			System.out.println("Digite um valor inteiro para ser armazenado na posiçao " + i + " do vetor.");
			elemento = sc.nextInt();
			
			vetor [i] = elemento;
			// Aqui estamos dizendo que: na posiçao atual do contador, o elemento sera igual ao elemento atual digitado pelo usuario.
			
			//System.out.println("O vetor na posiçao " + i + " eh: " + vetor[i]);
			//Caso quisessemos que, a cada linha, fosse informado a posiçao e o elemento, usuariamos a linha do cod acima.
		}
		
		for (int i = 0; i < tamanho; i ++){
			System.out.println("O vetor na posiçao " + i + " eh: " + vetor[i]);
		}
		
	}

}