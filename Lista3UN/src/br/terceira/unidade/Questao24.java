package br.terceira.unidade;
import java.util.*;
public class Questao24 {

	/**
	 * Fa�a um algoritmo para ler tr�s valores reais e informar se estes podem ou n�o formar os lados de um tri�ngulo e
qual tipo de tri�ngulo seria: equil�tero, is�sceles ou escaleno.
	 */
	public static void main(String[] args) {
		
		float lado1, lado2, lado3 = 0;
		
		Scanner sc = new Scanner (System.in);
		
		//Em um triangulo equil�tero, todos os lados devem ter tamanhos iguais.
		//Um triangulo is�sceles precisa ter, ao menos, dois lados com medidas iguais.
		//Um tri�ngulo escaleno apresenta os tr�s lados com medidas diferentes.
		
		System.out.println("Usuario, sou um programa que le tres numeros reais e informo qual tipo de triangulo estes podem formar.");
		System.out.println("Pressione enter para continuar.");
		sc.nextLine();
		
		System.out.println("Digite a medida (em cm) de um dos lados.");
		System.out.println("Obs.: Digite apenas numeros (os mesmos precisam ser reais).");
		lado1 = sc.nextFloat();
		
		System.out.println("Digite a medida (em cm) de um dos lados.");
		System.out.println("Obs.: Digite apenas numeros (os mesmos precisam ser reais).");
		lado2 = sc.nextFloat();
		
		System.out.println("Digite a medida (em cm) de um dos lados.");
		System.out.println("Obs.: Digite apenas numeros (os mesmos precisam ser reais).");
		lado3 = sc.nextFloat();
		
		sc.close();
		
		if (lado2 == lado1 && lado3 == lado1){
			System.out.println(" ");
			System.out.println("Medida do primeiro lado: " + lado1 + " cm");
			System.out.println("Medida do segundo lado: " + lado2 + " cm");
			System.out.println("Medida do terceiro lado: " + lado3 + " cm");
			System.out.println(" ");
			System.out.println("Formam um triangulo equilatero!");
		}
		
		else if ((lado1 != lado2) && (lado2 != lado3) && (lado3 != lado1)){
			System.out.println(" ");
			System.out.println("Medida do primeiro lado: " + lado1 + " cm");
			System.out.println("Medida do segundo lado: " + lado2 + " cm");
			System.out.println("Medida do terceiro lado: " + lado3 + " cm");
			System.out.println(" ");
			System.out.println("Formam um triangulo escaleno!");
		}
		
		else if ((lado1 == lado2 && lado2 != lado3) || (lado1 == lado3 && lado2 != lado3) || (lado1 != lado2 && lado2 == lado3) ){
			System.out.println(" ");
			System.out.println("Medida do primeiro lado: " + lado1 + " cm");
			System.out.println("Medida do segundo lado: " + lado2 + " cm");
			System.out.println("Medida do terceiro lado: " + lado3 + " cm");
			System.out.println(" ");
			System.out.println("Formam um triangulo isosceles!");
		}

	}

}
