package br.questoes;
import java.util.*;
public class Questao22 {

	/**
	 * Faça um algoritmo para ler os coeficiente de uma equação do segundo grau e calcular as suas
raízes, na forma Ax2 + Bx + C, levando em consideração a existência de raízes reais (Δ > 0, a
equação possui duas raízes reais e distintas; Δ = 0, a equação possui raízes reais iguais; Δ < 0, a
equação não possui raízes reais).
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		float a, b, c = 0;
		
		System.out.println("Digite o valor do coeficiente A.");
		a = sc.nextFloat();
		
		System.out.println("Digite o valor do coeficiente B.");
		b = sc.nextFloat();
		
		System.out.println("Digite o valor do coeficiente C.");
		c = sc.nextFloat();
		
		System.out.println("Equaçao a ser resolvida: " + a + "x² + " + b + "x + " + c);
		
		System.out.println("Delta = " + b + "² - 4*" + a + "*" + c);
		
		float delta = (b*b) - 4 * a * c;
		//O comando Math.sqrt(variavel), serve para calcular a raiz quadrada da variavel
		double x1 = (-b + Math.sqrt(delta)) / (2*a);
		double x2 = (-b - Math.sqrt(delta)) / (2*a);
		
		if (delta > 0){
			System.out.println("O Delta dessa equaçao eh igual a: " + delta);
			System.out.println("As raizes dessa equaçao sao: ");
			System.out.println("X' = " + x1);
			System.out.println("X'' = " + x2);
		}
		
		else if (delta == 0){
			System.out.println("O Delta dessa equaçao eh igual a: " + delta);
			System.out.println("As raizes dessa equaçao sao: ");
			System.out.println("X' e X''= " + x1);
		}
		
		else if (delta < 0){
			System.out.println("O Delta dessa equaçao eh igual a: " + delta);
			System.out.println("Nao existe raizes reais.");
		}
	}
}