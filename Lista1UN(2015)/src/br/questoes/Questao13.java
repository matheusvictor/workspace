package br.questoes;
import java.util.*;
public class Questao13 {
	
	/**
	 * A taxa de juros aplicada em fundos depositados em um banco é determinada pelo tempo em que estes ficam
depositados. Para um banco em particular, a seguinte tabela é usada:

TEMPO DE DEPÓSITO (em anos)								TAXA DE JUROS

Maior ou igual a 5 										0,95
Menor do que 5, mas maior ou igual a 4					0,90
Menor que 4, mas maior ou igual a 3						0,85
Menor do que 3, mas maior ou igual a 2					0,75
Menor do que 2, mas maior ou igual a 1					0,65
Menor do que 1											0,55

Usando esta informação, escreva um programa que receba o tempo em que os fundos foram mantidos em
depósito e informe a taxa de juros correspondente.
	 */
	public static void main (String[]args){
		Scanner sc = new Scanner (System.in);
		
		double valordepositado, tempodeposito = 0;
		
		System.out.println("Digite o valor depositado.");
		valordepositado = sc.nextDouble();
		
		while(valordepositado <= 0){
			System.out.println("O valor depositado precisa ser maior que zero. Tente novamente.");
			valordepositado = sc.nextDouble();
		}
		
		System.out.println("Digite o tempo em que o valor ficou depositado em nosso banco.");
		System.out.println("Obs.: Se o tempo for dado em anos e meses, digite apenas numeros. Ex.: para 2 anos e 6 meses, digite: 2,5.");
		tempodeposito = sc.nextDouble();
		
		while(tempodeposito < 0){
			System.out.println("O tempo de deposito precisa ser maior ou igual zero, pelo menos. Tente novamente.");
			valordepositado = sc.nextDouble();
		}
		
		int ano = (int) tempodeposito; //Conservando o valor inteiro numa variavel
		double m = tempodeposito - ano; //Conservando os decimais em uma variavel
		double mes = m * 12; //Transformando os decimais conservados em meses
		int meses = (int) mes; //Conservando apenas o inteiro dos meses encontrados acima
		
		if (tempodeposito >= 5){
			double saldoatual = valordepositado + (valordepositado * 0.95);
			System.out.println("\nTempo deposito: " + ano + " ano(s) e " + meses + " mes(es).");
			System.out.println("Valor depositado: R$ " + valordepositado);
			System.out.println("Juros: 0,95%");
			System.out.println("Saldo atual: R$ " + saldoatual);
		}
		
		else if ((tempodeposito < 5) && (tempodeposito >= 4)){
			double saldoatual = valordepositado + (valordepositado * 0.90);
			System.out.println("\nTempo deposito: " + ano + " ano(s) e " + meses + " mes(es).");
			System.out.println("Valor depositado: R$ " + valordepositado);
			System.out.println("Juros: 0,90%");
			System.out.println("Saldo atual: R$ " + saldoatual);
		}
		
		else if ((tempodeposito < 4) && (tempodeposito >= 3)){
			double saldoatual = valordepositado + (valordepositado * 0.85);
			System.out.println("\nTempo deposito: " + ano + " ano(s) e " + meses + " mes(es).");
			System.out.println("Valor depositado: R$ " + valordepositado);
			System.out.println("Juros: 0,85%");
			System.out.println("Saldo atual: R$ " + saldoatual);
		}
		
		else if ((tempodeposito < 3) && (tempodeposito >= 2)){
			double saldoatual = valordepositado + (valordepositado * 0.75);
			System.out.println("\nTempo deposito: " + ano + " ano(s) e " + meses + " mes(es).");
			System.out.println("Valor depositado: R$ " + valordepositado);
			System.out.println("Juros: 0,75%");
			System.out.println("Saldo atual: R$ " + saldoatual);
		}
		
		else if ((tempodeposito < 2) && (tempodeposito >= 1)){
			double saldoatual = valordepositado + (valordepositado * 0.65);
			System.out.println("\nTempo deposito: " + ano + " ano(s) e " + meses + " mes(es).");
			System.out.println("Valor depositado: R$ " + valordepositado);
			System.out.println("Juros: 0,65%");
			System.out.println("Saldo atual: R$ " + saldoatual);
		}
		
		else if (tempodeposito < 1){
			double saldoatual = valordepositado + (valordepositado * 0.55);
			System.out.println("\nTempo deposito: " + ano + " ano(s) e " + meses + " mes(es).");
			System.out.println("Valor depositado: R$ " + valordepositado);
			System.out.println("Juros: 0,55%");
			System.out.println("Saldo atual: R$ " + saldoatual);
		}
	}
}