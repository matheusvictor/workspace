package br.terceira.unidade;
import java.util.*;
public class Questao41 {

	/**
	 * Fa�a um Programa que leia um n�mero e exiba o dia correspondente da semana. (1- Domingo, 2- Segunda, etc.),
se digitar outro valor deve aparecer valor inv�lido.
	 */
	
	public static void main(String[] args) {
		
		int dia = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Usuario, digite um numero qualquer correspondente a um dia da semana.");
		dia = sc.nextInt();
		
		sc.close();
	
		switch (dia){
		
		case 1:
			System.out.println("Domingo!");
			break;
			
		case 2:
			System.out.println("Segunda-feira!");
			break;
			
		case 3:
			System.out.println("Ter�a-feira!");
			break;
			
		case 4:
			System.out.println("Quarta-feira!");
			break;
			
		case 5:
			System.out.println("Quinta-feira!");
			break;
			
		case 6:
			System.out.println("Sexta-feira!");
			break;
			
		case 7:
			System.out.println("S�bado!");
			break;
			
		default:
			System.out.println("Valor invalido!");
		}
	}
}