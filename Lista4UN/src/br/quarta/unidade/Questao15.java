package br.quarta.unidade;
import java.util.*;
public class Questao15 {

	/**
	 * Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?" O programa deve no final emitir uma classificação sobre a participação da pessoa no
crime. Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4
como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente"
	 */
	
	public static void main(String[] args) {
		
		String nome, cidade;
		int idade = 0;
		int opc1, opc2, opc3, opc4, opc5 = 0;
		int contador = 1;
		int numeroentrevistados = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Tecle ENTER para começar a usar o Assistente Criminal do Departamento de Policia de Gotham City.");
		sc.nextLine();
		
		System.out.println("Digite o numero do total de pessoas que serao entrevistadas.");
		System.out.println("Obs.: O limite eh de 10 pessoas por sessao.");
		numeroentrevistados = sc.nextInt();
		
		while ((numeroentrevistados < 0) || (numeroentrevistados > 10)){
			System.out.println("Erro! Tente novamente.");
			numeroentrevistados = sc.nextInt();
		}
		
		if (numeroentrevistados == 0){
			System.out.println("Programa encerrado por falta de entrevistados.");
			System.exit(0);
		}
		
		do {
		System.out.println(" ");
		System.out.println("Digite o nome da pessoa entrevistada.");
		nome = sc.next();
		
		System.out.println("Digite o nome da cidade onde a pessoa entrevistada reside.");
		cidade = sc.next();
		
		System.out.println("Digite a idade do(a) entrevistado(a).");
		System.out.println("Obs.: Digite apenas numeros. O mesmo deve ser inteiro.");
		idade = sc.nextInt();
		
		while (idade < 13){
			System.out.println("ERRO! O nosso Assistente Criminal so pode ser usado para entrevistar pessoas a partir de 13 anos de idade.");
			System.out.println("Tente novamente.");
			idade = sc.nextInt();		
		}
		
		System.out.println(" ");
		System.out.println("Os dados foram registrados. Agora começaremos a seçao de perguntas.");
		System.out.println(" ");
		
		System.out.println("Telefonou para a vítima?");
		System.out.println("1 - Sim");
		System.out.println("0 - Nao");
		opc1 = sc.nextInt();
		
		while (opc1 != 1 && opc1 != 0){
			System.out.println("Erro! A opçao digitada nao eh valida. Tente novamente!");
			System.out.println("Digite 1 se a resposta for Sim, ou digite 0 se a resposta for Nao.");
			opc1 = sc.nextInt();
		}
		
		System.out.println("Esteve no local do crime?");
		System.out.println("1 - Sim");
		System.out.println("0 - Nao");
		opc2 = sc.nextInt();
		
		while (opc2 != 1 && opc2 != 0){
			System.out.println("Erro! A opçao digitada nao eh valida. Tente novamente!");
			System.out.println("Digite 1 se a resposta for Sim, ou digite 0 se a resposta for Nao.");
			opc2 = sc.nextInt();
		}
		
		System.out.println("Mora perto da vítima?");
		System.out.println("1 - Sim");
		System.out.println("0 - Nao");
		opc3 = sc.nextInt();
		
		while (opc3 != 1 && opc3 != 0){
			System.out.println("Erro! A opçao digitada nao eh valida. Tente novamente!");
			System.out.println("Digite 1 se a resposta for Sim, ou digite 0 se a resposta for Nao.");
			opc3 = sc.nextInt();
		}
		
		System.out.println("Devia para a vítima?");
		System.out.println("1 - Sim");
		System.out.println("0 - Nao");
		opc4 = sc.nextInt();
		
		while (opc4 != 1 && opc4 != 0){
			System.out.println("Erro! A opçao digitada nao eh valida. Tente novamente!");
			System.out.println("Digite 1 se a resposta for Sim, ou digite 0 se a resposta for Nao.");
			opc4 = sc.nextInt();
		}
		
		System.out.println("Já trabalhou com a vítima?");
		System.out.println("1 - Sim");
		System.out.println("0 - Nao");
		opc5 = sc.nextInt();
		
		while (opc5 != 1 && opc5 != 0){
			System.out.println("Erro! A opçao digitada nao eh valida. Tente novamente!");
			System.out.println("Digite 1 se a resposta for Sim, ou digite 0 se a resposta for Nao.");
			opc5 = sc.nextInt();
		}
		
		System.out.println("Seçao encerrada! Confira os dados abaixo:");
		System.out.println(" ");
		
		int soma = opc1 + opc2 + opc3 + opc4 + opc5;
		
		if (soma == 2){
			System.out.println("Nome: " + nome);
			System.out.println("Idade: " + idade);
			System.out.println("Cidade onde reside: " + cidade);
			System.out.println("Status: Suspeito(a).");
		}
		
		else if ((soma == 3) || (soma == 4)){
			System.out.println("Nome: " + nome);
			System.out.println("Idade: " + idade);
			System.out.println("Cidade onde reside: " + cidade);
			System.out.println("Status: Cumplice.");
		}
		
		else if (soma == 5){
			System.out.println("Nome: " + nome);
			System.out.println("Idade: " + idade);
			System.out.println("Cidade onde reside: " + cidade);
			System.out.println("Status: Assassino(a).");
		}
		
		else {
			System.out.println("Nome: " + nome);
			System.out.println("Idade: " + idade);
			System.out.println("Cidade onde reside: " + cidade);
			System.out.println("Status: Inocente.");
		}
		
		contador ++;
		
	} while (contador <= numeroentrevistados);
		
		System.out.println ("\nPrograma encerrado!");
		System.exit(0);
		
		}
}