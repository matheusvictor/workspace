package br.terceira.unidade;
import java.util.*;
public class Questao27 {

	/**
	 * Elabore um algoritmo que indique se um número digitado está compreendido entre 20 e 90, ou não.
	 */
	public static void main(String[] args) {
		
		int numero = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Usuario, por favor, digite um numero inteiro qualquer.");
		numero = sc.nextInt();
		
		sc.close();
		
		if ((numero >= 20) && (numero <= 90)){
		System.out.println("Numero digitado: " + numero);
		System.out.println("Este numero esta compreendido entre 20 e 90!");
	}
		
		else if ((numero < 20) || (numero > 90)){
			System.out.println("Numero digitado: " + numero);
			System.out.println("Este numero nao esta compreendido entre 20 e 90!");
		}

}

}