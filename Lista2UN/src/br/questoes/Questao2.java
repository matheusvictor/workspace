package br.questoes;
import java.util.*;
public class Questao2 {

	/**
	 * Fa�a um Programa que converta metros para cent�metros.
	 */
	public static void main(String[] args) {
		
		double metros = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o numero de metros que deseja converter para centimetros.");
		System.out.println("Obs.: o mesmo pode ser decimal.");
		metros = sc.nextDouble();
		
		sc.close();
		
		double centrimetros = metros / 100;
		
		System.out.println(metros + " metros eh igual a: " + centrimetros + " centimetros");
	}
}