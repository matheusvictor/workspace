package br.questoes;
import java.util.*;
public class Questao4 {

	/**
	 * Fa�a um Programa que calcule a �rea de um quadrado, em seguida mostre o dobro desta �rea para o usu�rio.
	 */
	public static void main(String[] args) {
		
		double lado = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o numero de um dos lados (em cm), de um quadrado, para saber sua area.");
		System.out.println("Obs.: Digite apenas numeros. O mesmo pode ser decimal.");
		lado = sc.nextDouble();
		
		sc.close();
		
		double area = lado * lado;
		double dobroarea = area * 2;
		
		System.out.println("Medida de um dos lados: " + lado + " cm");
		System.out.println("Area do quadrado: " + area + " cm�");
		System.out.println("Dobro da area: " + dobroarea + " cm�");
	}
}