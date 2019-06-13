package br.terceira.unidade;
import java.util.*;
public class Questao36 {

	/**
	 * Faça um Programa que leia três números e mostre o maior deles. 9. Faça um Programa que leia três números e
mostre o maior e o menor deles.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		float numero1, numero2, numero3 = 0;
		
		System.out.println("Usuario, sou um um programa que indica o maior e o menor numero dentre 3 digitados.");
		System.out.println("Obs.: Os numeros devem ser reais.");
		System.out.println(" ");
		System.out.println("Pressione enter para continuar.");
		sc.nextLine();
		
		System.out.println("Digite um numero real qualquer.");
		numero1 = sc.nextFloat();
		
		System.out.println("Digite um numero real qualquer.");
		numero2 = sc.nextFloat();
		
		System.out.println("Digite um numero real qualquer.");
		numero3 = sc.nextFloat();
		
		sc.close();
		
    if (numero1 > numero2 && numero1 > numero3) {
    	System.out.println(" ");
    	System.out.println(numero1 + " eh o maior valor digitado");
    	}
    
    else if (numero2 > numero1 && numero2 > numero3){
    	System.out.println(" ");
		System.out.println(numero2 + " eh o maior valor digitado");
	}
	
    else if (numero3 > numero1 && numero3 > numero2) {
    	System.out.println(" ");
		System.out.println(numero3 + " eh o maior valor digitado");
	}
	
	if (numero1< numero2 && numero1 < numero3) {
		System.out.println(" ");
		System.out.println(numero1 +" eh o menor valor digitado"); 
		}
	
	else if (numero2 < numero1 && numero2 < numero3) {
		System.out.println(" ");
		System.out.println(numero2 +" eh o menor valor digitado");
	}
	
	else if (numero3 < numero1 && numero3 < numero2) {
		System.out.println(" ");
		System.out.println(numero3 +" eh o menor valor digitado");
		}
	}
}