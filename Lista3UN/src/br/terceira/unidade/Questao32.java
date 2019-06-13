package br.terceira.unidade;
import java.util.*;
public class Questao32 {

	/**
	 * Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M -
Masculino, Sexo Inválido.
	 */
	
	public static void main(String[] args) {
		
		String nome;
		char s;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Usuario, por favor, digite o seu nome.");
		nome = sc.nextLine();
		
		System.out.println(nome + ", digite o seu sexo (F se for feminino, ou M se for masculino).");
		s = sc.nextLine().charAt(0);
		
		sc.close();
		
		switch (s){
		
		case 'f': case 'F':
			System.out.println("Nome: " + nome);
			System.out.println("Sexo: Feminino");
			break;
			
		case 'm': case 'M':
			System.out.println("Nome: " + nome);
			System.out.println("Sexo: Masculino");
			break;
		
		default:
			System.out.println("Sexo invalido!");
		}
	}
}
