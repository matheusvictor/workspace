package br.quarta.unidade;
import java.util.*;
public class Questao12 {

	/**
	 * Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e
unidades do mesmo.
Observando os termos no plural a colocação do "e", da vírgula entre outros. Exemplo: 326 = 3 centenas, 2
dezenas e 6 unidades
	 */
	
	public static void main(String[] args) {
		int numero = 0;
		int n = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a quantidade de vezes que deseja executar o programa.");
		System.out.println("Obs.: O limite eh de 5 vezes.");
		n = sc.nextInt();
		
		while (n < 0 || n > 5){
			System.out.println("Erro! Tente novamente.");
			n = sc.nextInt();
		}
		
		if (n == 0){
			System.out.println("Programa encerrado!");
			System.exit(0);
		}
		
		for (int contador = 0; contador < n; contador ++){
		System.out.println(" ");
		System.out.println("Digite um numero inteiro (e positivo) qualquer, menor do que 1000 (mil).");
		numero = sc.nextInt();
		
		while (numero > 1000 || numero < 0){
			System.out.println("Erro!");
			System.out.println("O numero digitado deve ser positivo e menor do que 1000 (mil). Tente novamente!");
			numero = sc.nextInt();
		}
		
		int centena = numero / 100;
		//O numero dividido por 100 eh igual ao numero de centenas.
		int dezena = (numero%100) / 10;
		//O resto da divisao por 100, dividimos por 10, ou seja, retiramos as centenas e consideramos as casas a nivel decimal.
		int unidade = ((numero%100)%10);
		//O que sobrar das divisoes anteriores, obviamente, sao as unidades.
		
		System.out.println(" ");
		System.out.println("Numero digitado: " + numero);
		
		if (centena == 1){
			System.out.println(centena + " centena");
			}
		
		else if (centena > 1){
			System.out.println(centena + " centenas");
			}
		
		else {
			System.out.println("Nao existe numero de centenas para este numero.");
			}
		
		if (dezena == 1){
			System.out.println(dezena + " dezena");
		}
		
		else if (dezena > 1){
			System.out.println(dezena + " dezenas");
		}
		
		else {
			System.out.println("Nao existe numero de dezenas para este numero.");
		}
		
		//
		
		if (unidade == 1){
			System.out.println(unidade + " unidade");
		}
		
		else if (unidade > 1){
			System.out.println(unidade + " unidades");
		}
		
		else {
			System.out.println("Nao existe numero de unidades para este numero.");
		}
	}
		System.out.println(" ");
		System.out.println("Programa encerrado!");
		System.exit(0);
}
	}