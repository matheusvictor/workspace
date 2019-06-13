package br.terceira.unidade;
import java.util.*;
public class Questao22 {

	/**
	 * Faça um algoritmo para ler os coeficiente de uma equação do segundo grau e calcular as suas raízes, na forma Ax²
+ Bx + C, levando em consideração a existência de raízes reais (Δ > 0, a equação possui duas raízes reais e
distintas; Δ = 0, a equação possui raízes reais iguais; Δ < 0, a equação não possui raízes reais).
	 */
	
	public static void main(String[] args) {
		
		float a, b, c = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ola, usuario. Sou um programa feito para calcular as raizes (reais) de uma equaçao do 2º grau, baseando-se nos coeficientes digitados.");
		System.out.println("Tecle enter para continuar.");
		sc.nextLine();
		
		System.out.println("Vale lembrar que a equaçao do 2º grau tem como forma: Ax² + Bx + C");
		System.out.println(" ");
		System.out.println("Obs.: Digite apenas numero. No caso de fraçoes, digite o valor decimal a correspondente a ela, exemplo: 1/2 = 0,5.");
		System.out.println(" ");
		
		System.out.println("Digite um valor correspondente ao coeficiente de A.");
		a = sc.nextFloat();
		
		System.out.println("Digite um valor correspondente ao coeficiente de B.");
		b = sc.nextFloat();
		
		System.out.println("Digite um valor correspondente ao coeficiente de C.");
		c = sc.nextFloat();
		
		sc.close();
	
		System.out.println("Delta = " + b + "² - 4*" + a + "*" + c);
	
		float delta = (b*b) - 4 * a * c;
		//Realizando a operação correspondete ao valor de Delta.
		
		if (delta > 0){
			//O comando Math.sqrt(variavel), serve para calcular a raiz quadrada da variavel desejada, neste cas
			Double x1 = (-b + Math.sqrt(delta)) / (2*a);
			Double x2 = (-b - Math.sqrt(delta)) / (2*a);
			
			System.out.println("O Delta dessa equaçao eh igual a: " + delta);
			System.out.println(" ");
			System.out.println("As raizes dessa equaçao sao: ");
			System.out.println("X' = " + x1);
			System.out.println("X'' = " + x2);
		}
		
		else if (delta == 0){
			//Em ambos os casos (x1 e x2), o valor será o mesmo, pois Delta eh igual a zero, entretanto, optou-se calcular os dois individualemente, somente para ter maior clareza para o usuário.
			Double x1 = (-b + Math.sqrt(delta)) / (2*a);
			Double x2 = (-b - Math.sqrt(delta)) / (2*a);
			
			System.out.println("O Delta dessa equaçao eh igual a: " + delta);
			System.out.println(" ");
			System.out.println("As raizes dessa equaçao sao: ");
			System.out.println("X' = " + x1);
			System.out.println("X'' = " + x2);
		}
		
		else if (delta < 0){
			System.out.println("O Delta dessa equaçao eh igual a: " + delta);
			System.out.println("Nao existe raizes reais, pois Delta eh menor que 0 (zero).");
		}

	}

}