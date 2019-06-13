package br.questoes;
import java.util.*;
public class Questao12 {

	/**
	 * Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal,
usando a seguinte fórmula: (72.7*altura) - 58
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double altura = 0;
		
		System.out.println("Para saber seu peso 'ideal', digite a sua altura (em metros).");
		altura = sc.nextDouble();
		
		sc.close();
		
		double pesoideal = (72.7*altura)-58;
		
		System.out.println("De acordo com a sua altura, o seu peso ideal eh igual a: " + Math.ceil(pesoideal)+" Kg");
	}
}