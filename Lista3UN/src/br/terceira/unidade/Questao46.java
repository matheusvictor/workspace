package br.terceira.unidade;
import java.util.*;
public class Questao46 {

	/**
	 * Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este
ano é ou não bissexto.
	 */
	
	public static void main(String[] args) {
		
		int ano = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Usuario, sou um programa criado para informar se determinado ano eh ou nao bissexto.");
		System.out.println("Tecle enter para continuar.");
		sc.nextLine();
		
		System.out.println("Por favor, digite um ano qualquer (com 4 digitos).");
		ano = sc.nextInt();
		
		while (ano <= 0){
			System.out.println("Ano invalido. Tente novamente!");
			ano = sc.nextInt();
		}
		
		//Se o ano for maior que 400, o resto da divisao devera ser igual a zero para o mesmo ser bissexto.
		if (ano % 400 == 0){
			System.out.println("Ano digitado: " + ano);
			System.out.println("Este ano eh bissexto!");
		}
		
		else if ((ano % 4 == 0) && (ano % 100 != 0)){
			System.out.println("Ano digitado: " + ano);
			System.out.println("Este ano eh bissexto!");
		}
		
		else {
			System.out.println("Ano digitado: " + ano);
			System.out.println("Este ano nao eh bissexto!");
		}
	}	
}