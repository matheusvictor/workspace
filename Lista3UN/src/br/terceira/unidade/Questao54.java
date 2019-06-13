package br.terceira.unidade;
import java.util.Scanner;
public class Questao54 {

	/**
	 * Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar. O
resultado da operação deve ser acompanhado de uma frase que diga se o número é: par ou ímpar; positivo ou
negativo; inteiro ou decimal.
	 */
	public static void main(String[] args) {	
		
		char x;
		float numero1, numero2;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Usuario, sou uma calculadora basica criada para fazer uma operaçao entre dois numeros reais.");
		System.out.println("Tecle enter para continuar.");
		sc.nextLine();
		
		System.out.println("Digite um numero real qualquer.");
		numero1 = sc.nextFloat();
		
		System.out.println("Digite um numero real qualquer.");
		numero2 = sc.nextFloat();
		
		System.out.println("Digite a operaçao desejada. Ex.: + , - , * ou /");
		x = sc.next().charAt(0);
		
		sc.close();
		
		double soma = numero1 + numero2;
		double subtracao = numero1 - numero2;
		double multiplicacao = numero1 * numero2;
		double divisao = numero1 / numero2;
		//Como as operaçoes nao podem ser postas dentro do switch, as fizemos antes, criando assim novas variaveis.
		
		
		switch (x) {
		
		case '+':
			System.out.println("A soma entre " + numero1 + " e " + numero2 + " eh: " + soma);
			
			if (soma % 2 == 0){
			System.out.println("O resultado da soma eh um numero par!");
			}
			
			else {
				System.out.println("O resultado da soma eh um numero impar!");
			}
			
			if (soma < 0){
				System.out.println("O resultado da soma eh um numero negativo.");
			}
			
			else if (soma == 0){
				System.out.println("O resultado da soma eh um numero neutro.");
			}
			
			else if (soma > 0){
				System.out.println("O resultado da soma eh um numero positivo.");
			}
			
			if (soma == (int)(numero1 + numero2)){
				System.out.println("O resultado eh um numero inteiro.");
			}
			
			else{
				System.out.println("O resultado eh um numero decimal.");
			}
			break;
			
		case '-':
			System.out.println("A subtraçao entre " + numero1 + " e " + numero2 + " eh: " + subtracao);
			
			if (subtracao % 2 == 0){
			System.out.println("O resultado da subtraçao eh um numero par!");
			}
			
			else {
				System.out.println("O resultado da subtraçao eh um numero impar!");
			}
			
			if (subtracao < 0){
				System.out.println("O resultado da subtraçao eh um numero negativo.");
			}
			
			else if (subtracao == 0){
				System.out.println("O resultado da subtraçao eh um numero neutro.");
			}
			
			else if (subtracao > 0){
				System.out.println("O resultado da subtraçao eh um numero positivo.");
			}
			
			if (subtracao == (int)(numero1 - numero2)){
				System.out.println("O resultado eh um numero inteiro.");
			}
			
			else{
				System.out.println("O resultado eh um numero decimal.");
			}
			break;
			
		case '*':
			System.out.println("A multiplicaçao entre " + numero1 + " e " + numero2 + " eh: " + multiplicacao);
			
			if (multiplicacao % 2 == 0){
				System.out.println("O resultado da multiplicaçao eh um numero par!");
				}
				
				else {
					System.out.println("O resultado da multiplicaçao eh um numero impar!");
				}
				
				if (multiplicacao < 0){
					System.out.println("O resultado da multiplicaçao eh um numero negativo.");
				}
				
				else if (multiplicacao == 0){
					System.out.println("O resultado da subtraçao eh um numero neutro.");
				}
				
				else if (multiplicacao > 0){
					System.out.println("O resultado da multiplicaçao eh um numero positivo.");
				}
				
				if (multiplicacao == (int)(numero1 * numero2)){
					System.out.println("O resultado eh um numero inteiro.");
				}
				
				else{
					System.out.println("O resultado eh um numero decimal.");
				}
			break;
			
		case '/':
			System.out.printf ("A divisao entre " + numero1 + " e " + numero2 + " eh: %.2f" , divisao);
			System.out.println(" ");
			if (divisao % 2 == 0){
				System.out.println("O resultado da divisao eh um numero par!");
				}
				
				else {
					System.out.println("O resultado da divisao eh um numero impar!");
				}
				
				if (divisao < 0){
					System.out.println("O resultado da divisao eh um numero negativo.");
				}
				
				else if (divisao == 0){
					System.out.println("O resultado da divisao eh um numero neutro.");
				}
				
				else if (divisao > 0){
					System.out.println("O resultado da divisao eh um numero positivo.");
				}
				
				if (divisao == (int)(numero1 / numero2)){
					System.out.println("O resultado eh um numero inteiro.");
				}
				
				else{
					System.out.println("O resultado eh um numero decimal.");
				}
			break;				
		}
	}
}