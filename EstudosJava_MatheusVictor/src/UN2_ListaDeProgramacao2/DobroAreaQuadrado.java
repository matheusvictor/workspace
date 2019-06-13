package UN2_ListaDeProgramacao2;

import java.util.*;

public class DobroAreaQuadrado {

	/**
	 * Programa que calcula o dobro da área de um quadrado.
	 */
	public static void main(String[] args) {
		
		int opc = 0;
		double lado = 0;
		//Declarando a variável inicial.
		
		Scanner sc = new Scanner (System.in);
		//Abrindo o teclado para o usuário.
		
		System.out.println("Ola, usuario. Sou um programa que calcula o dobro da area de um quadrado.");
		System.out.println("Pressione enter para continuar.");
		sc.nextLine();
		
		System.out.println("A area de um quadrado eh obtida elevando um dos lados ao quadrado.");
		System.out.println("Formula matematica para a area de um quadrado: A = l x l");
		System.out.println("Pressione enter para continuar.");
		sc.nextLine();
		
		while (opc == 0) {
			//Estabelecendo condição "enquanto", ou seja, enquanto a opção for igual a zero o programa irá funcionar.
			System.out.println("Digite o lado (em centimetros) de um dos lados.");
			lado = sc.nextDouble();
			
			double Area = lado * lado;
			//Realizando a operação correspondende a área do quadrado.
			
			System.out.println("A area desse quadrado eh igual a: " + Area + " cm²");
			
			double DobroArea = Area * 2;
			//Realizando a operação correspondende ao dobro da área.
			
			System.out.println("Portanto, o dobro da área desse mesmo quadrado eh igual a: " + DobroArea + " cm²");
			
			System.out.println(" ");
			//Aqui, usado para melhor espaçamento entre as linhas.
			
			System.out.println("Digite 0 (zero) para continuar usando o programa. Ou digite 1 (um) para sair.");
			opc = sc.nextInt();
			
			if (opc != 0) {
				System.out.println("Programa finalizado! Obrigado por usar.");
		}
		}
		
				
	}
}