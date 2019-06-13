package br.questoes;
import java.util.*;
public class Questao9 {

	/**
	 * Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento di�rio de
seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de
S�o Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um programa
que leia a vari�vel peso (peso de peixes) e verifique se h� excesso. Se houver, gravar na vari�vel excesso e na vari�vel
multa o valor da multa que Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis com o conte�do ZERO.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double peso = 0;
		
		System.out.println("Ola, usuario! Sou um programa criado para saber se ha excesso de peso na sua pesca!");
		System.out.println("O calculo sera baseado de acordo com o regulamento do Estado de Sao Paulo, ou seja, se ultrapassar o limite de 50 Kg, pagara multa de R$ 4,00 por quilo excedente.");
		System.out.println(" ");
		System.out.println("Tecle ENTER para continuar.");
		sc.nextLine();
		
		System.out.println("Digite o peso (em Kg) de peixes.");
		System.out.println("Digite apenas numeros. O mesmo pode conter virgula.");
		peso = sc.nextDouble();
		
		while (peso < 0){
			System.out.println("Erro! Tente novamente.");
			peso = sc.nextDouble();
		}
		
		sc.close();
		
		if (peso > 50){
		  double excesso = peso - 50;
		  double multa = 4 * excesso;
		  System.out.println("Quantidade de peixes: " + peso + " Kg");
		  System.out.println("Excesso: " + excesso + " Kg");
		  System.out.println("Multa por excesso (de acordo com as normas do Estado de SP): R$ " + multa);
		}
		
		else if (peso <= 50){
			System.out.println("Quantidade de peixes: " + peso + " Kg");
			System.out.println("Excesso: 0 Kg");
			System.out.println("Multa por excesso (de acordo com as normas do Estado de SP): R$ 0,00");
		}

	}

}
