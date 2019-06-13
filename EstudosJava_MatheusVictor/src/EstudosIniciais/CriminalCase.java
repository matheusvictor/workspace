package EstudosIniciais;
import java.util.*;
import java.awt.SplashScreen;
public class CriminalCase {

	/**
	 *Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?" O programa deve no final emitir uma classificação sobre a participação da pessoa no
crime. Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4
como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente"
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String nome, caso;		
		int resposta1, resposta2, resposta3, resposta4, resposta5 = 0;
		
		System.out.println("O programa Criminal Case esta sendo iniciado. Tecle ENTER ate preencher a barra de carregamento.");
		System.out.println(" ");
		System.out.println("LOADING");
		System.out.println("|##        | 20%");
		sc.nextLine();
		System.out.println("LOADING");
		System.out.println("|########  | 80%");
		sc.nextLine();
		System.out.println("LOADING");
		System.out.println("|##########| 100%");
		
		System.out.println("Digite o nome do entrevistado.");
		nome = sc.nextLine();
		
		System.out.println("Digite o numero do caso. Ex.: JXO-123");
		caso = sc.nextLine();
		
		System.out.println("Aguarde um momento.");
		System.out.println("Tecle ENTER ate preencher a barra de carregamento.");
		System.out.println(" ");
		System.out.println("LOADING");
		System.out.println("|##        | 20%");
		sc.nextLine();
		System.out.println("LOADING");
		System.out.println("|########  | 80%");
		sc.nextLine();
		System.out.println("LOADING");
		System.out.println("|##########| 100%");
	
		System.out.println("A sessao de perguntas foi iniciada.");
		System.out.println(" ");
		System.out.println("Telefonou para a vítima?");
		System.out.println("1- Sim");
		System.out.println("0 - Nao");
		resposta1 = sc.nextInt();
		
		while (resposta1 != 1 && resposta1 != 0){
			System.out.println("Opçao invalida! Tente novamente.");
			resposta1 = sc.nextInt();
		}
		
		System.out.println("Esteve no local do crime?");
		System.out.println("1- Sim");
		System.out.println("0 - Nao");
		resposta2 = sc.nextInt();
		
		while (resposta2 != 1 && resposta2 != 0){
			System.out.println("Opçao invalida! Tente novamente.");
			resposta2 = sc.nextInt();
		}
		
		System.out.println("Mora perto da vítima?");
		System.out.println("1- Sim");
		System.out.println("0 - Nao");
		resposta3 = sc.nextInt();
		
		while (resposta3 != 1 && resposta3 != 0){
			System.out.println("Opçao invalida! Tente novamente.");
			resposta3 = sc.nextInt();
		}
		
		System.out.println("Devia para a vítima?");
		System.out.println("1- Sim");
		System.out.println("0 - Nao");
		resposta4 = sc.nextInt();
		
		while (resposta4 != 1 && resposta4 != 0){
			System.out.println("Opçao invalida! Tente novamente.");
			resposta4 = sc.nextInt();
		}
		
		System.out.println("Já trabalhou com a vítima?");
		System.out.println("1- Sim");
		System.out.println("0 - Nao");
		resposta5 = sc.nextInt();
		
		while (resposta5 != 1 && resposta5 != 0){
			System.out.println("Opçao invalida! Tente novamente.");
			resposta5 = sc.nextInt();
		}
		
		int resultado = resposta1 + resposta2 + resposta3 + resposta4 + resposta5;
		
		if (resultado == 2){
			System.out.println("Nome: " + nome);
			System.out.println("Caso: " + caso);
			System.out.println("Situaçao: Suspeito(a).");
		}
		
		else if ((resultado == 3) || (resultado == 4)){
			System.out.println("Nome: " + nome);
			System.out.println("Caso: " + caso);
			System.out.println("Situaçao: Cumplice.");
		}
		
		else if (resultado == 5){
			System.out.println("Nome: " + nome);
			System.out.println("Caso: " + caso);
			System.out.println("Situaçao: Assassino(a).");
		}
		
		else {
			System.out.println("Nome: " + nome);
			System.out.println("Caso: " + caso);
			System.out.println("Situaçao: Inocente.");
		}

	}

}
