package br.questoes;
import java.util.*;
public class Questao6 {
	
	/**
	 * Ler um número inteiro e testar se o valor lido termina com 0 (divisível por 10). Em caso positivo,
	exiba a metade deste número. Caso contrário, exibir a mensagem "O número digitado não termina com 0".
	 */
	public static void main (String[]args){
		Scanner sc = new Scanner (System.in);
		int numero = 0;
		
		System.out.println("Digite um numero inteiro qualquer.");
		numero = sc.nextInt();
		
		if (numero % 10 == 0){	
			System.out.println("O numero " + numero + " termina com zero.");
			
			if (numero > 0){
				System.out.println("A metade desse numero eh " + (numero/2));
			}
		}
		
		else {
			System.out.println("O numero " + numero + " nao termina com zero.");
		}
		
	}
	

}
