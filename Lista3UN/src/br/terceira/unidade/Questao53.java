package br.terceira.unidade;
import java.util.*;
public class Questao53 {

	/**
	 * Fa�a um Programa que pe�a um n�mero e informe se o n�mero � inteiro ou decimal. Dica: utilize uma fun��o de
arredondamento.
	 */
	
	public static void main(String[] args) {
		
		float numero = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Usuario, digite um numero real qualquer.");
		numero = sc.nextFloat();
		
		sc.close();
		
		 if (numero == (int) numero){
			System.out.println("Numero digitado: " + numero);
			System.out.println("Este numero eh inteiro.");
		}
		
		else {
			System.out.println("Numero digitado: " + numero);
			System.out.println("Este numero eh decimal.");
		}
		
	}
}