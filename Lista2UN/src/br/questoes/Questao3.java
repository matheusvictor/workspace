package br.questoes;
import java.util.*;
public class Questao3 {

	/**
	 * Fa�a um programa que pe�a o raio de um c�rculo, calcule e mostre sua �rea.
	 */
	public static void main(String[] args) {
		
		double raio;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o raio (em cm) de uma circunferencia para saber a sua area.");
		System.out.println("Obs.: Digite apenas numeros. O mesmo pode ser decimal.");
		raio = sc.nextDouble();
		
		sc.close();

		double area = 2 * 3.14 * raio;
		
		System.out.println("A area de um circulo, cujo raio eh igual a " + raio + " cm, eh igual a: " + area + " cm�.");
	}

}
