package br.quarta.unidade;
import java.util.*;
public class Questao9 {

	/**
	 * Elabore um algoritmo que indique se um número digitado está compreendido entre 20 e 90, ou não
	 */

	public static void main(String[] args) {
		
		int numero = 0;
		int limite = 3;
		//int contador = 0;
	
		Scanner sc = new Scanner (System.in);

		for (int contador = 0; contador < limite; contador ++){
		//while (contador <= limite){
		System.out.println("Usuario, por favor, digite um numero inteiro qualquer.");
		numero = sc.nextInt();
		
		if ((numero >= 20) && (numero <= 90)){
		System.out.println("Numero digitado: " + numero);
		System.out.println("Este numero esta compreendido entre 20 e 90!\n");
	}
		
		else if ((numero < 20) || (numero > 90)){
			System.out.println("Numero digitado: " + numero);
			System.out.println("Este numero nao esta compreendido entre 20 e 90!\n");
		}
		
		//contador ++;
	}
		System.out.println("Programa encerrado! Limite atingido.");
		System.exit(0);
}
	//}	
}