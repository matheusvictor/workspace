package br.terceira.unidade;
import java.util.*;
public class Questao10 {

	/**
	 * Informar o número do mês do ano e mostrar o nome do mês por extenso. Caso o número do mês não exista,
exibir a mensagem "Mês inválido".
	 */
	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		int mes;
		
		System.out.println("Usuario, por favor, digite um numero correspondente a algum mes do ano.");
		mes = sc.nextInt();
		
		while (mes >= 13 || mes <= 0){
		System.out.println("Mes invalido! Tente novamente.");
		mes = sc.nextInt();
		}
		
		switch (mes){
		case 1: System.out.println("Janeiro"); break;
		case 2: System.out.println("Fevereiro"); break;
		case 3: System.out.println("Março"); break;
		case 4: System.out.println("Abril"); break;
		case 5: System.out.println("Maio"); break;
		case 6: System.out.println("Junho"); break;
		case 7: System.out.println("Julho"); break;
		case 8: System.out.println("Agosto"); break;
		case 9: System.out.println("Setembro"); break;
		case 10: System.out.println("Outubro"); break;
		case 11: System.out.println("Novembro"); break;
		case 12: System.out.println("Dezembro"); break;
	
		
		}
	
		
	}

}
