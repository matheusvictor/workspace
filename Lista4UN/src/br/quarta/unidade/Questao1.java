package br.quarta.unidade;
import java.util.*;
public class Questao1 {
	/**
	 *  Escreva um programa que lê 5 valores reais, encontra o maior e o menor deles e mostra o resultado.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		float numero1, numero2, numero3, numero4, numero5 = 0;
		int n = 0;
		
		System.out.println("Usuario, sou um um programa que indica o maior e o menor numero dentre 5 digitados.");
		System.out.println("Obs.: Os numeros devem ser reais.");
		System.out.println(" ");
		System.out.println("Pressione enter para continuar.");
		sc.nextLine();
		
		System.out.println("Digite a quantidade de vezes que deseja executar o programa.");
		System.out.println("Obs.: O limite eh de 5 vezes.");
		n = sc.nextInt();
		
		while (n < 0 || n > 5){
			System.out.println("Erro! Tente novamente.");
			n = sc.nextInt();
		}
		
		if (n == 0){
			System.out.println("Programa encerrado!");
			System.exit(0);
		}
		
		for (int contador = 0; contador < n; contador ++){
			
			System.out.println("Digite um numero real qualquer.");
			numero1 = sc.nextFloat();
			
			System.out.println("Digite um segundo numero real qualquer.");
			numero2 = sc.nextFloat();
			
			System.out.println("Digite um terceiro numero real qualquer.");
			numero3 = sc.nextFloat();
			
			System.out.println("Digite um quarto numero real qualquer.");
			numero4 = sc.nextFloat();
			
			System.out.println("Digite um quinto numero real qualquer.");
			numero5 = sc.nextFloat();
			
			if (numero1 > numero2 && numero1 > numero3 && numero1 > numero4 && numero1 > numero5){
				System.out.println(" ");
				System.out.println(numero1 + " eh o maior numero digitado.");
			}
			
			if (numero2 > numero1 && numero2 > numero3 && numero2 > numero4 && numero2 > numero5){
				System.out.println(" ");
				System.out.println(numero2 + " eh o maior numero digitado");
			}
			
			if (numero3 > numero1 && numero3 > numero2 && numero3 > numero4 && numero3 > numero5) {
				System.out.println(" ");
				System.out.println(numero3 + " eh o maior numero digitado");
			}
			
			if (numero4 > numero1 && numero4 > numero2 && numero4 > numero3 && numero4 > numero5) {
				System.out.println(" ");
				System.out.println(numero4 + " eh o maior numero digitado");
				}
			
			if (numero5 > numero1 && numero5 > numero2 && numero5 > numero3 && numero5 > numero4) {
				System.out.println(" ");
				System.out.println(numero5 + " eh o maior numero digitado");
				}
				
			if (numero1 < numero2 && numero1 < numero3 && numero1 < numero4 && numero1 < numero5) {
				System.out.println(" ");
				System.out.println(numero1 +" eh o menor numero digitado"); 
				}
			
			if (numero2 < numero1 && numero2 < numero3 && numero2 < numero4 && numero2 < numero5) {
				System.out.println(" ");
				System.out.println(numero2 +" eh o menor numero digitado");
			}
			
			if (numero3 < numero1 && numero3 < numero2 && numero3 < numero4 && numero3 < numero5) {
				System.out.println(" ");
				System.out.println(numero3 +" eh o menor numero digitado");
				}
			
			if (numero4 < numero1 && numero4 < numero2 && numero4 < numero3 && numero4 < numero5) {
				System.out.println(" ");
				System.out.println(numero4 +" eh o menor numero digitado");
			}
			
			if (numero5 < numero1 && numero5 < numero2 && numero5 < numero3 && numero5 < numero4) {
				System.out.println(" ");
				System.out.println(numero5 +" eh o menor numero digitado"); 
				}
			
			System.out.println("\nPrograma encerrado!");
			System.exit(0);
		}
	}	
}