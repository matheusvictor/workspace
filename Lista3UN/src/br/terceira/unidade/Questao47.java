package br.terceira.unidade;
import java.util.*;
public class Questao47 {

	/**
	 * Faça um programa que peça uma data no formato d/m/a e determine se a mesma é uma data válida.
	 */
	
	public static void main(String[] args) {
	
		int dia, mes, ano = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Usuario, sou um programa criado para informar se uma data no formato Dia/Mes/Ano eh ou nao valida.");
		System.out.println("Tecle enter para continuar.");
		sc.nextLine();
		
		System.out.println("Digite o dia. Ex.: 28.");
		dia = sc.nextInt();
		
		while (dia <= 0 || dia > 31){
			System.out.println("Erro! O dia nao deve ser menor ou igual a 0 (zero) e nem maior do que 31.");
			System.out.println("Tente novamente!");
			dia = sc.nextInt();
		}
		
		System.out.println("Digite o mes. Ex.: 6 (junho).");
		System.out.println("Obs.: Digite apenas numero.");
		mes = sc.nextInt();
		
		while (mes <= 0 || mes > 12){
			System.out.println("Mes invalido. Tente novamente!");
			mes = sc.nextInt();
		}
		
		System.out.println("Digite o ano. Ex.: 2014.");
		System.out.println("Obs.: O ano deve conter 4 (quatro) digitos.");
		ano = sc.nextInt();
		
		while (ano <= 0){
			System.out.println("Erro! O mes nao deve ser menor ou igual a 0 (zero) e o mesmo deve conter 4 (quatro) digitos.");
			System.out.println("Tente novamente!");
			ano = sc.nextInt();
		}
		
		sc.close();
		
		if ((mes == 1) && (dia <= 31)){
			System.out.println("Data digitada: " + dia);
			System.out.println("Mes digitado: " + mes);
			System.out.println("Ano digitado: " + ano);
			System.out.println("A data " + dia + "/" + mes + "/" + ano + " eh valida!");
		}
		
		else if ((ano % 4 == 0) && (ano % 100 != 0) && (mes == 2) && (dia <= 29)){
			System.out.println("Data digitada: " + dia);
			System.out.println("Mes digitado: " + mes);
			System.out.println("Ano digitado: " + ano);
			System.out.println("A data " + dia + "/" + mes + "/" + ano + " eh valida!");
		}
		
		else if ((ano % 4 != 0) && (ano % 100 != 0) && (mes == 2) && (dia == 29)){
			System.out.println("Data digitada: " + dia);
			System.out.println("Mes digitado: " + mes);
			System.out.println("Ano digitado: " + ano);
			System.out.println("A data " + dia + "/" + mes + "/" + ano + " nao eh valida!");
		}
		
		else {
			System.out.println("Data digitada: " + dia);
			System.out.println("Mes digitado: " + mes);
			System.out.println("Ano digitado: " + ano);
			System.out.println("A data " + dia + "/" + mes + "/" + ano + " eh valida!");
		}
		
		if ((mes == 3) && (dia <= 31)){
			System.out.println("Data digitada: " + dia);
			System.out.println("Mes digitado: " + mes);
			System.out.println("Ano digitado: " + ano);
			System.out.println("A data " + dia + "/" + mes + "/" + ano + " eh valida!");
		}
		
		else if ((mes == 4) && (dia <= 30)){
			System.out.println("Data digitada: " + dia);
			System.out.println("Mes digitado: " + mes);
			System.out.println("Ano digitado: " + ano);
			System.out.println("A data " + dia + "/" + mes + "/" + ano + " eh valida!");
		} 
		
		else if ((mes == 5) && (dia <= 31)){
			System.out.println("Data digitada: " + dia);
			System.out.println("Mes digitado: " + mes);
			System.out.println("Ano digitado: " + ano);
			System.out.println("A data " + dia + "/" + mes + "/" + ano + " eh valida!");
		}
		
		else if ((mes == 6) && (dia <= 30)){
			System.out.println("Data digitada: " + dia);
			System.out.println("Mes digitado: " + mes);
			System.out.println("Ano digitado: " + ano);
			System.out.println("A data " + dia + "/" + mes + "/" + ano + " eh valida!");
		}
	
		else if ((mes == 7) && (dia <= 31)){
			System.out.println("Data digitada: " + dia);
			System.out.println("Mes digitado: " + mes);
			System.out.println("Ano digitado: " + ano);
			System.out.println("A data " + dia + "/" + mes + "/" + ano + " eh valida!");
		}
		
		else if ((mes == 8) && (dia <= 31)){
			System.out.println("Data digitada: " + dia);
			System.out.println("Mes digitado: " + mes);
			System.out.println("Ano digitado: " + ano);
			System.out.println("A data " + dia + "/" + mes + "/" + ano + " eh valida!");
		}
		
		else if ((mes == 9) && (dia <= 30)){
			System.out.println("Data digitada: " + dia);
			System.out.println("Mes digitado: " + mes);
			System.out.println("Ano digitado: " + ano);
			System.out.println("A data " + dia + "/" + mes + "/" + ano + " eh valida!");
		}
		
		else if ((mes == 10) && (dia <= 31)){
			System.out.println("Data digitada: " + dia);
			System.out.println("Mes digitado: " + mes);
			System.out.println("Ano digitado: " + ano);
			System.out.println("A data " + dia + "/" + mes + "/" + ano + " eh valida!");
		}
		
		else if ((mes == 11) && (dia <= 30)){
			System.out.println("Data digitada: " + dia);
			System.out.println("Mes digitado: " + mes);
			System.out.println("Ano digitado: " + ano);
			System.out.println("A data " + dia + "/" + mes + "/" + ano + " eh valida!");
		}
		
		else if ((mes == 12) && (dia <= 31)){
			System.out.println("Data digitada: " + dia);
			System.out.println("Mes digitado: " + mes);
			System.out.println("Ano digitado: " + ano);
			System.out.println("A data " + dia + "/" + mes + "/" + ano + " eh valida!");
		}
			}
	}