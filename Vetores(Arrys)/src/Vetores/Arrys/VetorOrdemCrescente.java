package Vetores.Arrys;
import java.util.*;
import java.util.Arrays;

	public class VetorOrdemCrescente {

	/**
	 * Fa�a um algoritmo para ler tr�s n�meros positivos e escrev�-los em ordem crescente
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int Valores[] = new int [3];
		
		for (int i = 0; i < Valores.length; i ++){
			System.out.println("Digite o " + (i + 1) + "� numero positivo");
			Valores[i] = sc.nextInt();
			
			while (Valores[i] <= 0){
				System.out.println("O numero digitado precisa ser positivo. Tente novamente.");
				Valores[i] = sc.nextInt();			
			}
		}
		
		Arrays.sort(Valores);
		
		System.out.println("\nOrdem crescente do vetor: ");
		for (int i = 0; i < Valores.length; i ++){
			System.out.println(Valores[i]);

		}
	

	}

}

