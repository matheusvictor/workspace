package br.questoes;
import java.util.*;
public class Questao10 {

	/**
	 * Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que calcule seu peso
ideal, utilizando as seguintes fórmulas:
. Para homens: (72.7*h) - 58
a. Para mulheres: (62.1*h) - 44.7 (h = altura)
b. Peça o peso da pessoa e informe se ela está dentro, acima ou abaixo do peso.
	 */
	public static void main(String[] args) {
		
		double altura, peso = 0;
		char x;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o seu sexo, por gentileza.");
		System.out.println("M = Masculino");
		System.out.println("F = Feminino");
		x = sc.nextLine().charAt(0);
		
		while ((x != 'M') && (x != 'm') && (x != 'F') && (x != 'f')){
			System.out.println("Erro! Opçao invalida. Tente novamente!");
			x = sc.nextLine().charAt(0);
		}
		
		System.out.println("Digite a sua altura, por favor.");
		altura = sc.nextDouble();
		
		System.out.println("Digite o seu peso (em Kg), por gentileza.");
		System.out.println("Obs.: Digite apenas numero. O mesmo pode conter virgula.");
		peso = sc.nextDouble();
		
		sc.close();
		
		if ((x == 'M') || (x == 'm')){
			double pesoideal = (72.7*altura) - 58;
			System.out.println("Sexo: Masculino");
			System.out.println("Altura: " + altura);
			System.out.println("Peso: " + peso + " Kg");
			System.out.printf("Peso ideal (em Kg): %.2f" , pesoideal);
			
			if (peso == pesoideal){
				System.out.println("\nVoce esta dentro do peso ideal!");
			}
			
			else if (peso < pesoideal){
				System.out.println("\nVoce esta abaixo do peso ideal!");
			}
			
			else if (peso > pesoideal){
				System.out.println("\nVoce esta acima do peso ideal!");
			}
			
		}
		
		else if ((x == 'F') || (x == 'f')){
				double pesoideal = (62.1*altura) - 44.7;
				System.out.println("Sexo: Feminino");
				System.out.println("Altura: " + altura);
				System.out.println("Peso: " + peso + " Kg");
				System.out.printf("Peso ideal (em Kg): %.2f" , pesoideal);
				
				if (peso == pesoideal){
					System.out.println("\nVoce esta dentro do peso ideal!");
				}
				
				else if (peso < pesoideal){
					System.out.println("\nVoce esta abaixo do peso ideal!");
				}
				
				else if (peso > pesoideal){
					System.out.println("\nVoce esta acima do peso ideal!");
				}
		}
		
		}	
}