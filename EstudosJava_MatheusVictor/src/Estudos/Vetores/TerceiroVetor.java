package Estudos.Vetores;
import java.util.*;
public class TerceiroVetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double vetor [];
		int tamanho;
		double elemento;
		
		System.out.println("Digite o tamanho desejado para o vetor.");
		System.out.println("Obs.: O tamanho maximo eh de 10 posiçoes.");
		tamanho = sc.nextInt();
		
		while (tamanho > 10){
			System.out.println("Erro! O tamanho maximo eh de 10 posiçoes.");
			System.out.println("Tente novamente.");
			tamanho = sc.nextInt();
		}
		
		while (tamanho < 0){
			System.out.println("Erro! O tamanho minimo eh de 1 posiçao.");
			System.out.println("Tente novamente.");
			tamanho = sc.nextInt();
		}
		
		vetor = new double [tamanho];
	
		for (int contador = 0; contador < tamanho; contador ++){
			System.out.println("Digite um valor inteiro para ser armazenado na posiçao " + contador + " do vetor.");
			System.out.println("Obs.: O valor digitado sera elevado ao quadrado e armazenado na posiçao atual do vetor.");
			elemento = sc.nextDouble();
			
			vetor [contador] = elemento * elemento;
			// O vetor na posiçao atual do contador, sera igual ao atual valor digitado pelo usuario elevado ao quadrado.
		}
		
		for (int contador = 0; contador < tamanho; contador ++){
			System.out.println("O elemento armazenado na posiçao " + contador + " eh: " + vetor[contador]);
		}
		
		

	}

}
