package br.questoes;
import java.util.*;
public class Exemplo4 {

	/**
	* Mostre a soma de todos os numero de 1 ate um valor x informado pelo usuario
	*/
	public static void main(String[] args) {
	int numero = 0;
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Usuario, digite um numero inteiro qualquer.");
	numero = sc.nextInt();
	sc.close();
	
	System.out.println("Numero digitado: " + numero);
	
	int soma = 0;
	for (int contador = 1; contador <= numero; contador ++){
	soma = soma + contador;
	//A soma de todos os numero digitados eh sempre soma (ou seja, zero) mais o numero do contador.
		}
	System.out.println("Soma: " + soma);
		}
	}