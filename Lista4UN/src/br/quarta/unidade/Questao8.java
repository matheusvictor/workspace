package br.quarta.unidade;
import java.util.*;
public class Questao8 {

	/**
	 * Elabore um algoritmo para testar se uma senha digita é igual a “batatafrita”. Enquanto a senha estiver correta
escreva “Acesso permitido”, do contrario emita a mensagem “Você não tem acesso ao sistema”
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String senha = "batatafrita";
		String email;
		int contador = 0;
		int limite = 3;
		
		//for (int contador = 0; contador < limite; contador ++){
		
		while (contador < limite){
		System.out.println("Digite a senha correta para ter acesso ao sistema.");
		senha = sc.nextLine();
		
		switch (senha){
		case "batatafrita":
			System.out.println(" ");
			System.out.println("Efetuando login... Aguarde!");
			System.exit(0);
			break;
			
		default:
			System.out.println("Senha incorreta. Voce nao tem acesso ao sistema!\n");
		}
		
		contador ++;
		
		}
		
		System.out.println("O numero maximo de tentativas foi atingido. Para recuperar sua senha, digite um e-mail valido.");
		email = sc.next();
		System.out.println("Um e-mail foi enviado. Verifique sua caixa de entrada.");
		System.exit(0);
	}
}