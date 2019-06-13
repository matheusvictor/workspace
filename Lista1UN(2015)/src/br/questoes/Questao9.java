package br.questoes;
import java.util.*;
public class Questao9 {
	
	/**
	 * Faça a leitura do ano atual e do ano de nascimento de uma pessoa e exibir sua idade. A seguir,
informe se a pessoa é bebê (0 a 3 anos), criança (4 a 10 anos), adolescente (11 a 18 anos), adulta
(19 a 50 anos) ou idosa (51 anos em diante).
	 */
	
	public static void main (String[]args){
		Scanner sc = new Scanner (System.in);
		
		int anonascimento, anoatual;
		
		System.out.println("Digite o ano atual.");
		anoatual = sc.nextInt();
		
		while (anoatual <= 0){
			System.out.println("Ano invalido. Tente novamente.");
			anoatual = sc.nextInt();
		}
				
		System.out.println("Digite o ano de nascimento.");
		anonascimento = sc.nextInt();
		
		while (anonascimento <= 0 || anonascimento > anoatual){
			System.out.println("Ano invalido. Tente novamente.");
			anonascimento = sc.nextInt();
		}
				
		int idade = (anoatual - anonascimento);
		
		if (idade >= 0 && idade <= 3){
			System.out.println("Idade: " + idade);
			System.out.println("Eh um bebe.");
		}
		
		else if (idade >=4 && idade <= 10){
			System.out.println("Idade: " + idade);
			System.out.println("Eh uma criança.");
		}
		
		else if (idade >= 11 && idade <= 18){
			System.out.println("Idade: " + idade);
			System.out.println("Eh um adolescente.");
		}
		
		else if (idade >= 19 && idade <= 50){
			System.out.println("Idade: " + idade);
			System.out.println("Eh um adulto.");
		}
		
		else if (idade >= 51){
			System.out.println("Idade: " + idade);
			System.out.println("Eh um idoso.");
		}
	}
}