package br.questoes;
import java.util.Scanner;
public class Questao5 {

	/**
	 * Ler um número inteiro e informar se o número lido é par ou impar
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int numero = 0;
		
		System.out.println("Digite um numero inteiro qualquer.");
		numero = sc.nextInt();
		
		if (numero % 2 != 0){
			System.out.println("O numero " + numero +" eh impar.");
		}
		
		else {
			System.out.println("O numero " + numero +" eh par.");
		}

	}

}
