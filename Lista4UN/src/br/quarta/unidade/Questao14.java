package br.quarta.unidade;
import java.util.*;
public class Questao14 {

	/**
	 * Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a valor do saque e depois
informar quantas notas de cada valor serão fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. O
valor mínimo é de 10 reais e o máximo de 600 reais. O programa não deve se preocupar com a quantidade de
notas existentes na máquina
	 */
	
	public static void main(String[] args) {
		
		String nome;
		int saque = 0;
		int continuar = 0;		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Bem-vindo(a) ao nosso Caixa Eletrônico. Digite o seu nome para continuar.");
		nome = sc.nextLine();
	
		do {
		System.out.println("\nDeseja realizar operaçao de saque?");
		System.out.println("1 - SIM");
		System.out.println("2 - NAO");
		continuar = sc.nextInt();
			
		while ((continuar != 1)&&(continuar !=2)){
			System.out.println("Opçao invalida. Tente novamente!");
			continuar = sc.nextInt();
			}
		
		if (continuar == 2){
			System.out.println("Programa encerrado!");
			System.exit(0);
		}
		
		if (continuar == 1){		
		System.out.println("\nDigite o valor (em reais) que deseja sacar.");
		System.out.println("Obs.: Digite apenas numeros. O mesmo nao pode conter virgula, pois nao trabalhamos com moedas.");
		System.out.println("Obs.²: Estamos trabalhando com notas de R$ 100, R$ 50, R$ 10, R$ 5 e R$ 1.");
		saque = sc.nextInt();
		
		while (saque < 10 || saque < 0){
			System.out.println("O valor minimo de saque eh de R$ 10. Tente novamente.");
			saque = sc.nextInt();
		}
		
		while (saque > 600){
			System.out.println("O valor maximo para saque eh de R$ 600. Tente novamente.");
			saque = sc.nextInt();
		}
		
		int cem = saque / 100;
		int valor = saque % 100;
		
		int cinquenta = valor / 50;
		int valor2 = valor % 50;
		
		int dez = valor2 / 10;
		int valor3 = valor2 % 10;
		
		int cinco = valor3 / 5;
		int valor4 = valor3 % 5;
		
		int um = valor4 /1;
		int valor5 = valor4 %1;
		
		System.out.println(" ");
		System.out.println("Nome do usuario: " + nome);
		System.out.println("Valor sacado: R$ " + saque );
		System.out.println("Quantidade de notas fornecidas: ");
		
		if (cem > 1){
			System.out.println(cem + " notas de R$ 100.");	
		}
		
		else if (cem == 1){
			System.out.println(cem + " nota de R$ 100.");
		}
		
		if (cinquenta > 1) {
			System.out.println(cinquenta + " notas de R$ 50.");	
		}
		
		else if (cinquenta == 1){
			System.out.println(cinquenta + " nota de R$ 50.");
		}
		
		if (dez > 1) {
			System.out.println(dez + " notas de R$ 10.");	
		}
		
		else if (dez == 1){
			System.out.println(dez + " nota de R$ 10.");
		}
		
		if (cinco > 1) {
			System.out.println(cinco + " notas de R$ 5.");	
		}
		
		else if (cinco == 1){
			System.out.println(cinco + " nota de R$ 5.");
		}
		
		if (um > 1) {
			System.out.println(um + " notas de R$ 1.");	
		}
		
		else if (um == 1){
			System.out.println(um + " nota de R$ 1.");
		}
		
		}
	
} while (continuar == 1);
		
		
}
	}