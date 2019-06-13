package br.quartaunidade;
import java.util.*;
public class Questao1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numero;
		int nulo = 0, branco = 0;
		int soma1 = 0, soma2 = 0, soma3 = 0, soma4 = 0;
		
		System.out.println("Candidato 1 = 1.");
		System.out.println("Candidato 2 = 2.");
		System.out.println("Candidato 3 = 3.");
		System.out.println("Candidato 4 = 4.");
		System.out.println("Voto nulo = 5.");
		System.out.println("Voto em branco = 6.");
		System.out.println("Para encerrar a votaçao = 0.");
		
		do {
		System.out.println("\nDigite o numero do candidato.");
		numero = sc.nextInt();
	
		while (numero > 6 || numero < 0){
			System.out.println("Numero invalido. Tente novamente.");
			numero = sc.nextInt();
		}

		System.out.println("Voto efetuado com sucesso!");
		
		if (numero == 1){
			soma1 = soma1 + 1;
		}
		
		else if (numero == 2){
			soma2 = soma2 + 1;
		}
		
		else if (numero == 3){
			soma3 = soma3 + 1;
		}
		
		else if (numero == 4){
			soma4 = soma4 + 1;
		}
		
		else if (numero == 5){
			nulo = nulo + 1;
		}
		
		else if (numero == 6){
			branco = branco + 1;
		}

		 }	 while (numero != 0);
			
			System.out.println("\nNumero de votos do canditado 1: " + soma1);
			System.out.println("Numero de votos do canditado 2: " + soma2);
			System.out.println("Numero de votos do canditado 3: " + soma3);
			System.out.println("Numero de votos do canditado 4: " + soma4);
			System.out.println("Numero de votos nulos: " + nulo);
			System.out.println("Numero de votos em branco: " + branco);
		
	}

}