package br.terceira.unidade;
import java.util.*;
public class Questao34 {

	/**
	 * Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
	 */
	public static void main(String[] args) {
		
		char l;
		//Criando uma variavel char correspondente a uma unica letra.
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Usuario, sou um programa criado para verificar se a letra digitada eh uma vogal ou uma consoante.");
		System.out.println("Pressione enter para continuar.");
		sc.nextLine();
		
		System.out.println("Digite uma letra qualquer.");
		l = sc.nextLine().charAt(0);
		
		sc.close();
		
		switch (l){
		
		case 'a': case 'A':
			System.out.println("Letra digitada: " + l);
			System.out.println("Esta letra eh uma vogal.");
			break;
			
		case 'e': case 'E':
			System.out.println("Letra digitada: " + l);
			System.out.println("Esta letra eh uma vogal.");
			break;
			
		case 'i': case 'I':
			System.out.println("Letra digitada: " + l);
			System.out.println("Esta letra eh uma vogal.");
			break;
			
		case 'o': case 'O':
			System.out.println("Letra digitada: " + l);
			System.out.println("Esta letra eh uma vogal.");
			break;
			
		case 'u': case 'U':
			System.out.println("Letra digitada: " + l);
			System.out.println("Esta letra eh uma vogal.");
			break;
			
		default:
			System.out.println("Letra digitada: " + l);
			System.out.println("Esta letra eh uma consoante.");
 		}
	}
}