package br.questoes;
import java.util.*;
public class Questao24 {

	/**
	 * Fa�a um algoritmo para ler tr�s valores reais e informar se estes podem ou n�o formar os lados de
um tri�ngulo e qual tipo de tri�ngulo seria: equil�tero, is�sceles ou escaleno.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double lado[] = new double [3];
		
		for (int i = 0; i < 3; i ++){
			
		System.out.println("Digite o tamanho de um dos lados.");
		lado[i] = sc.nextDouble();
		}
		
		
		if (lado[0] + lado[1] >= lado[2]){
			
			if (lado[0] == lado[1] && lado[1] == lado[2] && lado[2] == lado[0]){
				System.out.println("Formam um triangulo equilatero");
			}
			
			else if (lado[0] != lado[1] && lado[1] != lado[2] && lado[2] != lado[0]){
				System.out.println("Formam um triangulo escaleno.");
			}
			
			else {
				System.out.println("Formam um triangulo isosceles.");
			}
	
		}
		
		else {
			System.out.println("Nao formam um triangulo.");
		}
			}
}