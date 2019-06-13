package br.questoes;
import java.util.*;
public class Questao6 {
	
	/**
	 * Ler um n�mero inteiro e testar se o valor lido termina com 0 (divis�vel por 10). Em caso positivo,
	exiba a metade deste n�mero. Caso contr�rio, exibir a mensagem "O n�mero digitado n�o termina com 0".
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
