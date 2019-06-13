package br.quarta.unidade;
import java.util.*;
public class Questao5 {

	/**
	 * Faça a leitura do ano atual e do ano de nascimento de uma pessoa e, enquanto a data seja válida, exibir sua
idade. A seguir, informe se a pessoa é bebê (0 a 3 anos), criança (4 a 10 anos), adolescente (11 a 18 anos), adulta
(19 a 50 anos) ou idosa (51 anos em diante).
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String nome;
		int anoatual, anonascimento = 0;
		int contador = 0;
		int limite = 0;
		
		System.out.println("Usuario, sou um programa criado para calcular a idade de uma pessoa.");
		System.out.println("Pressione enter para continuar.");
		sc.nextLine();
		
		System.out.println("Digite a quantidade de vezes que deseja executar o programa.");
		System.out.println("Obs.: Limite de 5 vezes.");
		limite = sc.nextInt();
		
		while (limite > 5 || limite < 0){
			System.out.println("Erro! Tente novamente.");
			limite = sc.nextInt();
		}
		
		if (limite == 0){
			System.out.println("Programa encerrado!");
			System.exit(0);
		}
		
		do {
		System.out.println("\nVoce poderia informar o seu nome, por favor?");
		nome = sc.next();
		
		System.out.println("Prazer em conhecer voce, " + nome);
		System.out.println("Vamos continuar com o nosso programa...");
		
		System.out.println(" ");
		System.out.println("Digite o ano atual, por favor.");
		anoatual = sc.nextInt();
		
		while (anoatual <= 0){
			System.out.println("Erro! Tente novamente.");
			anoatual = sc.nextInt();
		}
		
		System.out.println("Digite o ano de seu nascimento, por gentileza.");
		anonascimento = sc.nextInt();
		
		while (anonascimento <= 0){
			System.out.println("Erro! Tente novamente.");
			anonascimento = sc.nextInt();
		}
		
		if (anonascimento > anoatual){
			System.out.println("Error 404! Execute o programa novamente.");
			System.exit(0);
		}
		
		int idade = anoatual - anonascimento;
		
		if ((idade >= 0) && (idade <=3)){
			System.out.println(" ");
			System.out.println("Nome: " + nome);
			System.out.println("Idade: " + idade);
			System.out.println("Eh um(a) bebe!");
		}
		
		else if ((idade >= 4) && (idade <= 10)){
			System.out.println(" ");
			System.out.println("Nome: " + nome);
			System.out.println("Idade: " + idade);
			System.out.println("Eh um(a) criança!");
		}
		
		else if ((idade >= 11) && (idade <= 18)){
			System.out.println(" ");
			System.out.println("Nome: " + nome);
			System.out.println("Idade: " + idade);
			System.out.println("Eh um(a) adolescente!");
		}
		
		else if ((idade >= 19) && (idade <= 50)){
			System.out.println(" ");
			System.out.println("Nome: " + nome);
			System.out.println("Idade: " + idade);
			System.out.println("Eh um(a) adulto(a)!");
		}
		
		else if ((idade >= 51)){
			System.out.println(" ");
			System.out.println("Nome: " + nome);
			System.out.println("Idade: " + idade);
			System.out.println("Eh um(a) idoso(a)!");
		}
		
		contador ++;
		
	} while (contador < limite);

		System.out.println(" ");
		System.out.println("Programa Encerrado!");
		System.exit(0);
		}
}