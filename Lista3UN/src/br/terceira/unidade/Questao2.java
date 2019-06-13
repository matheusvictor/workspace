package br.terceira.unidade;

import java.util.*;
import java.io.*;

public class Questao2 {

	/**
	 * Efetuar a leitura de uma nota e, se o valor for maior ou igual a 60, imprimir na tela "APROVADO".
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int nota;
		
		System.out.println("Usuario, digite uma nota qualquer.");
		System.out.println("Obs.: O numero deve ser inteiro.");
		nota = sc.nextInt();
		sc.close();
		
		if (nota >= 60){
			System.out.println("APROVADO!");
			}
		
		else {
			System.out.println("Valor digitado: " + nota);
		}

	}

}
