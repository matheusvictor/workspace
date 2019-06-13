package br.terceira.unidade;
import java.util.*;
public class Questao38 {

	/**
	 * Faça um Programa que pergunte em que turno você estuda. Peça para digitar M- matutino ou V-Vespertino ou NNoturno.
Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
	 */
	
	public static void main(String[] args) {
		
		String nome;
		char t = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ola, usuario. Digite o seu nome, por favor.");
		nome = sc.nextLine();
		
		System.out.println("Digite o turmo que voce estuda, por gentileza.");
		System.out.println("Obs.: Digite M para Matutino, V para Vespertino ou N para Noturno.");
		t = sc.nextLine().charAt(0);
		
		sc.close();
		
		switch (t){
		case 'm': case 'M':
			System.out.println("Bom dia, " + nome + "!");
		break;
		
		case 'v': case 'V':
			System.out.println("Boa tarde, " + nome + "!");
		break;
		
		case 'n': case 'N':
			System.out.println("Boa noite, " + nome + "!");
		break;
		
		default:
			System.out.println("Turno invalido!");
		}
	}
}