package br.quartaunidade;
import java.util.*;
public class Questao2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		float vetor [] = new float [3];
		float numero = 0;
		float maior= 0, maior2 = 0;
		
		for (int posicao = 0; posicao < 3; posicao ++){
			
			System.out.println("Digite um numero para ser guardado na posicao " + posicao + " do vetor.");
			numero = sc.nextFloat();
			
			vetor[posicao] = numero;
			
			if (numero > maior){
				maior2 = maior;
				maior = numero;
			}
			
			if (numero < maior){
				//if (numero > maior2){
				maior = maior2;
					maior2 = numero;		
			//	}
			}		
		}
		
		System.out.println("Primeiro numero maior: " + maior);
		System.out.println("Seungo maior numero: " + maior2);
		
		/**
					
		for (int i = 0; i < 30; i ++){
			
			System.out.println("Digite um numero para ser guardado na posicao " + i + " do vetor.");
			numero = sc.nextFloat();
			
			vetor[i] = numero; // Guardando o numero digitado no vetor atual do vetor
											
			if (numero > maior){
				maior2 = maior;
				maior = numero;
			}
			
			if (numero < maior){
				
				if (numero > maior2){
					maior2 = numero;
				}	
			}		
		}
		
		System.out.println("Primeiro maior numero: " + maior);
		System.out.println("Segundo maior numero: " + maior2);		
		
		for (int i = 0; i < 30; i ++){
			if (vetor[i] % 2 == 0){
				System.out.println("O numero " + vetor[i] + " eh par.");
			}
		}
		*/
		}
}