package br.questoes;
import java.util.Scanner;
public class Questao3 {

	/**
	 * Efetuar a leitura de uma nota e, se o valor for maior ou igual a 60, imprimir na tela "APROVADO",
	 * se for menor, imprimir reprovado.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		double nota = 0;
		
		System.out.println("Digite uma nota.");
		nota = sc.nextDouble();
		
		if (nota >= 60){
			System.out.println("APROVADO!");
		}
		
		else {
			System.out.println("REPROVADO!");
		}

	}

}
