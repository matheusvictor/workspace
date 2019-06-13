package br.terceira.unidade;
import java.util.*;
public class Questao23 {

	/**
	 * Elabore um algoritmo para testar se uma senha digita é igual a “batatafrita”. Se a senha estiver correta escreva
“Acesso permitido”, do contrario emita a mensagem “Você não tem acesso ao sistema”.
	 */
	
	public static void main(String[] args) {
	
		String senha;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Por favor, digite a senha correta para ter acesso ao sistema.");
		System.out.println("Obs.: A senha nao deve conter espaço entre os caracteres.");
		senha = sc.nextLine();
		
		sc.close();
		
		switch (senha){
		case "batatafrita":
			System.out.println("Acesso permitido!");
			break;
			
		default:
			System.out.println("Voce nao tem acesso ao sistema!");
		}

	}

}
