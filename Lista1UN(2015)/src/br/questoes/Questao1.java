package br.questoes;
import java.util.*;
public class Questao1 {

	/**
	 *Escreva um programa que lê 5 valores reais, encontra o maior e o menor deles e mostra o resultado.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		float maior = 0;
		float menor = 0;
		int tamanho = 5;
		
		for (int i = 0; i < tamanho; i ++){
			
			System.out.println("Digite o " +(i +1)+ "º numero.");	
			float valor = sc.nextFloat();
			
			if (i == 0){
				maior = valor;
				menor = maior;
			}
			
			if(valor > maior)
				maior = valor;
			
			if(valor < menor)
			 menor = valor;
			
		}
		
		System.out.println("Maior numero: " + maior);
		System.out.println("Menor numero: " + menor);
	}

}
