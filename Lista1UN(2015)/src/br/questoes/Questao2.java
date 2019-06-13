package br.questoes;
import java.util.*;
public class Questao2 {

	/**
	 * Efetuar a leitura de uma nota e, se o valor for maior ou igual a 60, imprimir na tela "APROVADO"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		float nota;
		
		System.out.println("Digite uma nota qualquer.");
		nota = sc.nextFloat();
		
		if (nota >= 60){
			System.out.println("APROVADO!");
		}

	}

}