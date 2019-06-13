package br.questoes;
import java.util.*;
public class Questao23 {

	/**
	 * Elabore um algoritmo para testar se uma senha digita é igual a “batatafrita”. Se a senha estiver
correta escreva “Acesso permitido”, do contrario emita a mensagem “Você não tem acesso ao
sistema”.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String senha;
		
		System.out.println("Digite a tenha para ter acesso ao sistema.");
		senha = sc.nextLine();
		
		sc.close();
		
		switch (senha){
		case "batatafrita": System.out.println("Acesso permitido."); break;
		default: System.out.println("Voce nao tem acesso ao sistema.");
		}	
	}
}