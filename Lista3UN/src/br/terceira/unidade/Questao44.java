package br.terceira.unidade;
import java.util.Scanner;
public class Questao44 {

	/**
	 * Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um
triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
Dicas:
Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
Triângulo Equilátero: três lados iguais; Triângulo Isósceles: quaisquer dois lados iguais;
Triângulo Escaleno: três lados diferentes;
	 */
	
	public static void main(String[] args) {
		
	double lado1, lado2, lado3 = 0;
		
		Scanner sc = new Scanner (System.in);
		
		//Em um triangulo equilátero, todos os lados devem ter tamanhos iguais.
		//Um triangulo isósceles precisa ter, ao menos, dois lados com medidas iguais.
		//Um triângulo escaleno apresenta os três lados com medidas diferentes.
		
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
			System.out.println("As medidas digitadas não formam um triangulo.");
		}
	}
}