package br.terceira.unidade;
import java.util.*;
public class Questao31 {

	/**
	 * Fa�a um Programa que pe�a um valor e mostre na tela se o valor � positivo ou negativo.
	 */
	public static void main(String[] args) {
		
		float valor = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Usuario, digite um numero real qualquer.");
		valor = sc.nextFloat();
		
		sc.close();
		
		if (valor > 0){
			System.out.println("Numero digitado: " + valor);
			System.out.println("Este numero eh positivo!");
		}
		
		else {
			System.out.println("Numero digitado: " + valor);
			System.out.println("Este numero eh negativo!");
		}
	}
}
