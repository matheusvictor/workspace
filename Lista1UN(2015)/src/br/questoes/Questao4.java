package br.questoes;
import java.util.*;
public class Questao4 {

	/**
	 * Efetuar a leitura de uma nota e, se o valor for maior ou igual a 60, imprimir na tela "APROVADO",
se for menor, imprimir reprovado. Testar ainda se o valor lido foi maior do que 100 ou menor do
que zero. Neste caso, imprimir "NOTA INVÁLIDA".
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		double nota = 0;
		
		System.out.println("Digite uma nota.");
		nota = sc.nextDouble();
		
		if (nota >= 60 && nota <= 100){
			System.out.println("APROVADO!");
		}
		
		else if (nota < 60 && nota >= 0) {
			System.out.println("REPROVADO!");
		}

		if(nota > 100 || nota < 0){
			System.out.println("NOTA INVALIDA!");
		}
		

	}

}