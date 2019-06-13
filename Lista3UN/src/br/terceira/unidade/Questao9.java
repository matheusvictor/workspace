package br.terceira.unidade;
import java.util.*;
public class Questao9 {

	/**
	 * Faça a leitura do ano atual e do ano de nascimento de uma pessoa e exibir sua idade. A seguir, informe se a
pessoa é bebê (0 a 3 anos), criança (4 a 10 anos), adolescente (11 a 18 anos), adulta (19 a 50 anos) ou idosa (51
anos em diante).
	 */
	
	public static void main(String[] args) {
		
Scanner sc = new Scanner (System.in);
		
		String nome;
		int anoatual, anonascimento = 0;
		
		System.out.println("Usuario, sou um programa criado para calcular a idade de uma pessoa.");
		System.out.println("Pressione enter para continuar.");
		sc.nextLine();
		
		System.out.println("Bem, para nos conhecermos melhor... voce poderia informar o seu nome, por favor?");
		nome = sc.nextLine();
		
		System.out.println("Prazer em conhecer voce, " + nome);
		System.out.println("Vamos continuar com o nosso programa...");
		
		System.out.println(" ");
		System.out.println("Digite o ano atual, por favor.");
		anoatual = sc.nextInt();
		
		while (anoatual > 2014 || anoatual < 0){
			System.out.println("Erro! Tente novamente.");
			anoatual = sc.nextInt();
		}
		
		System.out.println("Digite o ano de seu nascimento, por gentileza.");
		anonascimento = sc.nextInt();
		
		sc.close();
		
		int idade = anoatual - anonascimento;
		
		if ((idade >= 0) && (idade <=3)){
			System.out.println("Nome: " + nome);
			System.out.println("Idade: " + idade);
			System.out.println("Eh um(a) bebe!");
		}
		
		else if ((idade >= 4) && (idade <= 10)){
			System.out.println("Nome: " + nome);
			System.out.println("Idade: " + idade);
			System.out.println("Eh um(a) criança!");
		}
		
		else if ((idade >= 11) && (idade <= 18)){
			System.out.println("Nome: " + nome);
			System.out.println("Idade: " + idade);
			System.out.println("Eh um(a) adolescente!");
		}
		
		else if ((idade >= 19) && (idade <= 50)){
			System.out.println("Nome: " + nome);
			System.out.println("Idade: " + idade);
			System.out.println("Eh um(a) adulto(a)!");
		}
		
		else if ((idade >= 51)){
			System.out.println("Nome: " + nome);
			System.out.println("Idade: " + idade);
			System.out.println("Eh um(a) idoso(a)!");
		}
		
		}
		
		
		}
