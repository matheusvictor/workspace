package br.questoes;
import java.util.*;
public class Questao6 {

	/**
	 * Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius.
C = (5 * (F-32) / 9).
	 */
	public static void main(String[] args) {
		
		double Farenheit = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o numero de graus Farenheit que deseja converter para graus Celsius.");
		System.out.println("Obs.: Digite apenas numeros. O mesmo pode conter virgula.");
		Farenheit = sc.nextDouble();
		
		double Celsius = (5 * (Farenheit-32) / 9);
		
		System.out.println(Farenheit + "ºF eh corresponde igual a: " + Math.ceil(Celsius) + "ºC");
		//O comando Math.ceil serve para transformar dizimas periodicas em numeros decimais.

	}

}
