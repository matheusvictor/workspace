package br.quarta.unidade;
import java.util.*;
public class LoginSenha {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int login, senha = 123;
		int contador = 0;
		int tentativas = 3;
		String email;
		
		while (contador < tentativas){
			
			System.out.println("Digite o seu login:");
			System.out.println("Obs.: Use apenas numeros, sem virgulos, letras ou caracteres especiais.");
			login = sc.nextInt();
			
			System.out.println(" ");
			System.out.println("Digite a sua senha:");
			System.out.println("Obs.: Use apenas numeros, sem virgulos, letras ou caracteres especiais.");
			senha = sc.nextInt();
			
			contador ++;
			
			if ((login == 123) && (senha == 123)){
				System.out.println(" ");
				System.out.println("Efetuando login... Aguarde!");
				System.exit(0);
			}
			
			else {
				System.out.println(" ");
				System.out.println("Login ou senha incorretos!\n");
			}
		}
		
		System.out.println("O numero maximo de tentativas foi atingido. Para recuperar sua senha, digite um e-mail valido.");
		email = sc.next();
		System.out.println("Um e-mail foi enviado. Verifique sua caixa de entrada.");
		System.exit(0);
	}
}