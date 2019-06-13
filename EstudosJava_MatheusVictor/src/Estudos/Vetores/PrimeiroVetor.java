package Estudos.Vetores;
import java.util.*;
public class PrimeiroVetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	
		int vetor[]; 
		//Ex.: int vetor[] = new int[10]; == declaração combinada
		// O vetor, ao contrario de uma variavel comum, necessita dos colchetes
		// O vetor sempre começa da posiçao zero
		
		/**
		 * Vale lembrar que: posiçao e elemento sao coisas distintas.
		 * Ex.: Um vetor tem quatro posições: 0, 1, 2, 3. Os elementos desse vetor sao, respectivamente: 2, 4, 6, 8.
		 * Em que posicao esta o elemento 4? Na posição 1.
		 * Que elemento esta na posição 2? Elemento 6.
		 */
		
		/**
		 * int nro = new int[10];
b) declarando um vetor para armazenar 10 valores do tipo real (ou monetários)

double salario = new double[10];
c) declarando um vetor para armazenar o nome dos 12 meses do ano

String mes = new String[12];


Leia mais em: Vetores em Java http://www.devmedia.com.br/vetores-em-java/21449#ixzz3YN8XqCJP
		 */
		
		int tamanho;
		double x = 2.5;
		
		System.out.println("Digite o tamannho do vetor.");
		tamanho = sc.nextInt();
		sc.close();
		
		vetor = new int [tamanho];
		// O vetor tera o tamanho limitado de acordo com o que fora digitado pelo usuario
		//vetor = new int[tamanho] serve para alocação de espaço do vetor

		for (int contador = 0; contador < tamanho; contador ++){
			//Enquanto o contador for menor que o tamanho do vetor....
			vetor [contador] = contador + 1;
			
			System.out.println("O vetor na posiçao " + contador + " eh: " + vetor [contador]);
			
		}
	}
}