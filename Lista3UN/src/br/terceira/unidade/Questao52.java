package br.terceira.unidade;
import java.util.*;
public class Questao52 {

	/**
	 * Fa�a um Programa que pe�a um n�mero inteiro e determine se ele � par ou impar. Dica: utilize o operador
m�dulo (resto da divis�o).
	 */
	
	public static void main(String[] args) {
		
		int numero = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Usuario, digite um numero inteiro e positivo qualquer.");
		numero = sc.nextInt();
		
		while (numero < 0){
			System.out.println("Erro! O numero deve ser inteiro e positivo. Tente novamente.");
			numero = sc.nextInt();
		}
		
		if (numero % 2 == 0 || numero == 0){
			System.out.println("Numero digitado: " + numero);
			System.out.println("Este numero eh par.");
		}
		
		else {
			System.out.println("Numero digitado: " + numero);
			System.out.println("Este numero eh impar.");
		}

	}

}
