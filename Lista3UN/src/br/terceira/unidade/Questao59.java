package br.terceira.unidade;
import java.util.Scanner;
public class Questao59 {

	/**
	 * Fa�a um Programa que leia tr�s n�meros e mostre o maior e o menor deles.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		float v1, v2, v3 = 0;
		
		System.out.println("Usuario, sou um um programa que indica o maior e o menor numero dentre 3 digitados por voce.");
		System.out.println("Obs.: Os numeros devem ser reais e positivos.");
		System.out.println(" ");
		System.out.println("Pressione enter para continuar.");
		sc.nextLine();
		
		System.out.println("Digite um numero real (e positivo) qualquer.");
		v1 = sc.nextFloat();
		
		System.out.println("Digite um numero real (e positivo) qualquer.");
		v2 = sc.nextFloat();
		
		System.out.println("Digite um numero real (e positivo) qualquer.");
		v3 = sc.nextFloat();
		
		sc.close();
		
    if (v1>v2 && v1>v3) {
    	System.out.println(v1 + " eh o maior valor digitado");
    	}
    
    else if (v2>v1 && v2>v3){
		System.out.println(v2 + " eh o maior valor digitado");
	}
	
    else if (v3>v1 && v3>v2) {
		System.out.println(v3 + " eh o maior valor digitado");
	}
	
	if (v1<v2 && v1<v3) {
		System.out.println(v1 +" eh o menor valor digitado"); 
		}
	
	else if (v2<v1 && v2<v3) {
		System.out.println(v2 +" eh o menor valor digitado");
	}
	
	else if (v3<v1 && v3<v2) {
		System.out.println(v3 +" eh o menor valor digitado");
		}
	}
}