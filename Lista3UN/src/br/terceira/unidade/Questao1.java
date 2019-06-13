package br.terceira.unidade;
import java.util.*;
public class Questao1 {

	/**
	 * Escreva um programa que lê 5 valores reais, encontra o maior e o menor deles e mostra o resultado.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		float v1, v2, v3, v4, v5;
		
		System.out.println("Usuario, sou um um programa que indica o maior e o menor numero dentre 5 digitados por voce.");
		System.out.println("Obs.: Os numeros devem ser reais.");
		System.out.println(" ");
		System.out.println("Pressione enter para continuar.");
		sc.nextLine();
		
		System.out.println("Digite um numero real qualquer.");
		v1 = sc.nextFloat();
		
		System.out.println("Digite um numero real qualquer.");
		v2 = sc.nextFloat();
		
		System.out.println("Digite um numero real qualquer.");
		v3 = sc.nextFloat();
		
		System.out.println("Digite um numero real qualquer.");
		v4 = sc.nextFloat();
		
		System.out.println("Digite um numero real qualquer.");
		v5 = sc.nextFloat();
		
		sc.close();
		
    if (v1>v2 && v1>v3 && v1>v4 &&v1>v5) {
    	System.out.println(v1 + " eh o maior valor digitado");
    	}
    
    else if (v2>v1 && v2>v3 && v2>v4 && v2>v5){
		System.out.println(v2 + " eh o maior valor digitado");
	}
	
    else if (v3>v1 && v3>v2 && v3>v4 && v3>v5) {
		System.out.println(v3 + " eh o maior valor digitado");
	}
	
    else if (v4>v1 && v4>v2 && v4>v3 && v4>v5) {
		System.out.println(v4 + " eh o maior valor digitado");
		}
	
    else if (v5>v1 && v5>v2 && v5>v3 && v5>v4) {
		System.out.println(v5 + " eh o maior valor digitado");
		}
		
	if (v1<v2 && v1<v3 && v1<v4 && v1<v5) {
		System.out.println(v1 +" eh o menor valor digitado"); 
		}
	
	else if (v2<v1 && v2<v3 && v2<v4 && v2<v5) {
		System.out.println(v2 +" eh o menor valor digitado");
	}
	
	else if (v3<v1 && v3<v2 && v3<v4 && v3<v5) {
		System.out.println(v3 +" eh o menor valor digitado");
		}
	
	else if (v4<v1 && v4<v2 && v4<v3 && v4<v5) {
		System.out.println(v4 +" eh o menor valor digitado");
	}
	
	else if (v5<v1 && v5<v2 && v5<v3 && v5<v4) {
		System.out.println(v5 +" eh o menor valor digitado"); 
		}
	}
}