package br.terceira.unidade;

import java.util.*;

public class Questao4 {

	/**
	 * Efetuar a leitura de uma nota e, se o valor for maior ou igual a 60, imprimir na tela "APROVADO", se for menor,
imprimir reprovado. Testar ainda se o valor lido foi maior do que 100 ou menor do que zero. Neste caso, imprimir
"NOTA INVÁLIDA".
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int nota = 0;
		
		System.out.println("Usuario, sou um programa que le uma nota, para saber se foi aprovado ou reprovado.");
		System.out.println("Digite enter para continuar.");
		sc.nextLine();
		
		System.out.println("Digite alguma nota.");
		System.out.println("Obs.: Use somente numero(s) inteiro(s).");
		nota = sc.nextInt();
		
		while (nota >= 101 || nota <= 0){
			System.out.println("Nota invalida! Tente novamente.");
			nota = sc.nextInt();
		}
		
		if (nota >= 60 && nota <= 100){
			System.out.println("Aprovado!");
		}
		
		if (nota < 60 && nota >= 0) {
			System.out.println("Reprovado!");
		}
	
}

}