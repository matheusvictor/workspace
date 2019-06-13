package br.terceira.unidade;
import java.util.*;
public class Questao19 {

	/**
	 * Faça um algoritmo para ler dois números inteiros A e B e informar se A é divisível por B.
	 */
	public static void main(String[] args) {

		int numero1, numero2;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Usuario, sou um programa criado para ler dois numeros inteiro e informar se o primeiro eh divisivel pelo segundo.");
		System.out.println("Tecle enter para continuar.");
		sc.nextLine();
		
		System.out.println("Digite um numero inteiro qualquer.");
		numero1 = sc.nextInt();
		
		System.out.println("Digite um numero inteiro qualquer.");
		numero2 = sc.nextInt();
		
		sc.close();
		
		if (numero1 % numero2 == 0){
			System.out.println("Numeros digitados, respectivamente: " + numero1 + " e " + numero2);
			System.out.println(numero1 + " eh divisivel por " + numero2);
		}
		
		else {
			System.out.println("Numeros digitados, respectivamente: " + numero1 + " e " + numero2);
			System.out.println(numero1 + " nao eh divisivel por " + numero2);
		}

	}

}
