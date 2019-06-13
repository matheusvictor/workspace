package br.terceira.unidade;
import java.util.*;
public class Questao57 {

	/**
	 * Uma fruteira está vendendo frutas com a seguinte tabela de preços:
a. Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,0, receberá ainda um
desconto de 10% sobre este total.

Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a 
quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.

Até 5 Kg Acima de 5 Kg
Morango R$ 2,50 por Kg R$ 2,20 por Kg
Maçã R$ 1,80 por Kg R$ 1,50 por Kg
	 */
	
	public static void main(String[] args) {
		
		double quilosmorangos, quilosmacas = 0;
		double valormorango, valormaca;
		double totalmorango, totalmaca;
		double valor;
			
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Seja bem-vindo(a) a Fruteira Boa Saude.");
		System.out.println(" ");
		System.out.println("Confira nossa tabela de preços: ");
		System.out.println("");
		System.out.println("Fruta:                      			          Preço (por quilo): ");
		System.out.println("Morango						R$ 2,50 (ate 5 Kg) ou R$ 2,20 (acima de 5 Kg) ");
		System.out.println("Maça                        			R$ 1,80 (ate 5 Kg) ou R$ 1,50 (acima de 5 Kg)");
		System.out.println(" ");
		System.out.println("Obs.: Clientes que compram mais de 8 Kg em frutas ou ainda se o valor total da compra ultrapassar R$ 25,0, receberá ainda um desconto de 10%.");
		System.out.println(" ");
		System.out.println("Tecle ENTER para continuar.");
		sc.nextLine();
		
		System.out.println("Digite a quantidade (em quilos) de morangos que deseja comprar.");
		System.out.println("Obs.: Digite apenas numeros. O mesmo pode ser decimal.");
		quilosmorangos = sc.nextDouble();
	
		while (quilosmorangos < 1){
			System.out.println("Erro! Eh preciso comprar pelo menos 1 Kg. Tente novamente!");
			quilosmorangos = sc.nextDouble();
		}
		
		if (quilosmorangos > 5){
			totalmorango = quilosmorangos * 2.20;
		}
		
		else {
			totalmorango = quilosmorangos * 2.50;
		}
		
		System.out.println("Digite a quantidade (em quilos) de maças que deseja comprar.");
		System.out.println("Obs.: Digite apenas numeros. O mesmo pode ser decimal.");
		quilosmacas = sc.nextDouble();
		
		while (quilosmacas < 1){
			System.out.println("Erro! Eh preciso comprar pelo menos 1 Kg. Tente novamente!");
			quilosmacas = sc.nextDouble();
		}
		
		if (quilosmacas > 5){
			totalmaca = quilosmacas * 1.50;
		}
		
		else {
			totalmaca = quilosmacas * 1.80;
		}
		
		if ((totalmorango + totalmaca > 25) || (quilosmorangos + quilosmacas > 8)){
			valor = (totalmorango + totalmaca) * 0.10;
		}
		
		else {
			valor = totalmorango + totalmaca;
		}
		
		
		System.out.println(" ");
		System.out.println("Quilos comprados (maça): " + quilosmacas + " Kg");
		System.out.printf("Preço (maça): R$ %.2f " , totalmaca);
		System.out.println("\nQuilos comprados (morango): " + quilosmorangos + " Kg");
		System.out.printf("Preço (morango): R$ %.2f " , totalmorango);
		System.out.println("\nTotal de quilos comprados: " + (quilosmorangos + quilosmacas) + " Kg");
		System.out.printf("Total a pagar: R$ %.2f" , valor);
	}
}