import java.util.Scanner;
//Abrir o teclado para uso do usuário

public class ListadeProgramacao2 {

	/**
	 * Programa criado para somar dois números bytes
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		byte num1;
		byte num2;
		
				
		System.out.println ("Ola, usuario! Voce poderia me informar seu nome antes de começarmos?");
		Scanner sc = new Scanner(System.in);
		nome = sc.nextLine();
		
		System.out.println(nome + "," + "dessa vez vamos somar apenas dois numero bytes.");
		System.out.println ("Obs.: os numero podem variar de -128 a 127");
		
		System.out.println ("Entao, vamos começar! Digite o primeiro numero byte: ");
		num1 = sc.nextByte();
		
		System.out.println ("Agora digite o segundo numero, por favor:");
		num2 = sc.nextByte();
		
		int soma = num1+num2;
		
		System.out.println ("O resultado eh:" +soma);
		System.out.println ("Por enquanto, eh so isso. Obrigado por utilizar o programa.");
		System.out.println ("Desenvolvido por: Matheus Victor");

	}

}
