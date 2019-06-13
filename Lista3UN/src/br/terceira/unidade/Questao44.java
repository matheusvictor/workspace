package br.terceira.unidade;
import java.util.Scanner;
public class Questao44 {

	/**
	 * Fa�a um Programa que pe�a os 3 lados de um tri�ngulo. O programa dever� informar se os valores podem ser um
tri�ngulo. Indique, caso os lados formem um tri�ngulo, se o mesmo �: equil�tero, is�sceles ou escaleno.
Dicas:
Tr�s lados formam um tri�ngulo quando a soma de quaisquer dois lados for maior que o terceiro;
Tri�ngulo Equil�tero: tr�s lados iguais; Tri�ngulo Is�sceles: quaisquer dois lados iguais;
Tri�ngulo Escaleno: tr�s lados diferentes;
	 */
	
	public static void main(String[] args) {
		
	double lado1, lado2, lado3 = 0;
		
		Scanner sc = new Scanner (System.in);
		
		//Em um triangulo equil�tero, todos os lados devem ter tamanhos iguais.
		//Um triangulo is�sceles precisa ter, ao menos, dois lados com medidas iguais.
		//Um tri�ngulo escaleno apresenta os tr�s lados com medidas diferentes.
		
		System.out.println("Usuario, sou um programa que le tres numeros (inteiros ou decimais) e informo qual tipo de triangulo estes podem formar.");
		System.out.println("Pressione enter para continuar.");
		sc.nextLine();
		
		System.out.println("Digite a medida (em cm) de um dos lados.");
		System.out.println("Obs.: Digite apenas numeros. Ex.: 2,5");
		lado1 = sc.nextDouble();
		
		System.out.println("Digite a medida (em cm) de um dos lados.");
		System.out.println("Obs.: Digite apenas numeros. Ex.: 2,5");
		lado2 = sc.nextDouble();
		
		System.out.println("Digite a medida (em cm) de um dos lados.");
		System.out.println("Obs.: Digite apenas numeros. Ex.: 2,5");
		lado3 = sc.nextDouble();
		
		sc.close();
		
		if (lado1 + lado2 > lado3 || lado1 + lado3 > lado2){
			
		
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
		
		else { 
			System.out.println("As medidas digitadas n�o formam um triangulo.");
		}
	}
}