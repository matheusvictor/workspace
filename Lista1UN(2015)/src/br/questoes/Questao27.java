package br.questoes;
import java.util.*;
public class Questao27 {

	/**
	 * Elabore um algoritmo que indique se um número digitado está compreendido entre 20 e 90, ou
não.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		float numero = 0;
		
		System.out.println("Digite um numero.");
		numero = sc.nextFloat();
		
		sc.close();
		
		if (numero >= 20 && numero <= 90){
			System.out.println("O numero digitado esta entre 20 e 90.");
			System.exit(0);
		}
		
		else { 
			System.out.println("O numero digitado nao esta entre 20 e 90.");
			System.exit(0);
		}

	}

}
