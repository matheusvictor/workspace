package br.terceira.unidade;
import java.util.*;
public class Questao37 {

	/**
	 * Fa�a um programa que pergunte o pre�o de tr�s produtos e informe qual produto voc� deve comprar, sabendo
que a decis�o � sempre pelo mais barato.
	 */
	
	public static void main(String[] args) {
		
		String nomeproduto, marca1, marca2, marca3;	
		double valor1, valor2, valor3 = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Usuario, sou um programa criado para comparar o pre�o de 3 produtos (semelhantes e de marcas diferente) e optar pelo mais barato a ser comprado.");
		System.out.println(" ");
		System.out.println("Tecle enter para continuar.");
		sc.nextLine();
		
		System.out.println("Digite o nome do produto.");
		System.out.println("Obs.: o nome do produto sera valido para os tres comparados.");
		nomeproduto = sc.nextLine();
		
		System.out.println(" ");
		System.out.println("Digite o pre�o do primeiro produto.");
		valor1 = sc.nextDouble();
		System.out.println("Digite a marca do primeiro produto.");
		marca1 = sc.next();
		
		System.out.println(" ");
		System.out.println("Digite o pre�o do segundo produto.");
		valor2 = sc.nextDouble();
		System.out.println("Digite a marca do segundo produto.");
		marca2 = sc.next();
		
		System.out.println(" ");
		System.out.println("Digite o pre�o do terceiro produto.");
		valor3 = sc.nextDouble();
		System.out.println("Digite a marca do terceiro produto.");
		marca3 = sc.next();
		
		if (valor1 < valor2 && valor1 < valor3){
			System.out.println("Nome do produto: " + nomeproduto);
			System.out.println("Marca: " + marca1);
			System.out.println("Pre�o: R$ " + valor1);
			System.out.println("Este eh o produto mais barato.");
		}
		
		else if (valor2 < valor1 && valor2 < valor3){
			System.out.println("Nome do produto: " + nomeproduto);
			System.out.println("Marca: " + marca2);
			System.out.println("Pre�o: R$ " + valor2);
			System.out.println("Este eh o produto mais barato.");
		}
		
		else if (valor3 < valor1 && valor3 < valor2){
			System.out.println("Nome do produto: " + nomeproduto);
			System.out.println("Marca: " + marca3);
			System.out.println("Pre�o: R$ " + valor3);
			System.out.println("Este eh o produto mais barato.");
		}
	}
}