package br.terceira.unidade;
import java.util.*;
public class Questao13 {
	
	/**
	 * A taxa de juros aplicada em fundos depositados em um banco é determinada pelo tempo em que estes ficam
depositados. Para um banco em particular, a seguinte tabela é usada:

TEMPO DE DEPÓSITO (em anos)								TAXA DE JUROS

Maior ou igual a 5 										0,95
Menor do que 5, mas maior ou igual a 4					0,90
Menor que 4, mas maior ou igual a 3						0,85
Menor do que 3, mas maior ou igual a 2					0,75
Menor do que 2, mas maior ou igual a 1					0,65
Menor do que 1											0,55

Usando esta informação, escreva um programa que receba o tempo em que os fundos foram mantidos em
depósito e informe a taxa de juros correspondente.
	 */
	
	public static void main(String[] args) {
	
		String nome, cpf;
		int anos, idade = 0;
		double valordepositado, tempodeposito = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ola, usuari@. Seja bem-vind@ ao programa para calculo de fundo do Banco Winterfell!");
		System.out.println("Pressione enter para continuar.");
		sc.nextLine();
		
		System.out.println("Antes de começarmos, preciso de alguns de seus dados.");
		System.out.println("Pressione enter para continuar.");
		sc.nextLine();
		
		System.out.println("Digite o seu nome, por gentileza.");
		nome = sc.nextLine();
		
		System.out.println("Por gentileza, informe-nos o seu CPF.");
		cpf = sc.nextLine();
		
		System.out.println(nome + ", quantos anos voce tem?");
		idade = sc.nextInt();
		
		while (idade < 18){
			System.out.println(nome + ", desculpe-nos, mas voce precisa ser maior de idade para ter acesso ao programa.");
			System.out.println("Tente novamente!");
			idade = sc.nextInt();
		}
		
		System.out.println("Digite o valor depositado.");
		System.out.println("Obs.: Digite apenas numero. Ex.: 240,50.");
		valordepositado = sc.nextDouble();
		
		System.out.println("Digite o tempo (anos e/ou meses) em que o valor ficou depositado em nosso banco.");
		System.out.println("Obs.: Se o tempo for dado em anos e meses, digite apenas numeros. Ex.: para 2 anos e 6 meses, digite: 2,5.");
		tempodeposito = sc.nextDouble();
		
		//Convertendo o tempo de deposito para anos e meses.
		int ano = (int) tempodeposito;
		//Criando uma nova variavel cuja o numero inteiro digitado anteriormente sera guardado.
		double m = tempodeposito - ano;
		//Criando uma nova variavel cuja o numero decimal digitado anteriormente sera guardado.
		double mes =  m * 12;
		//Multiplicando o valor decimal por 12, transormando-o em um valor inteiro, correspondende ao mes
		int meses = (int) mes;
		//Criando uma nova variavel cuja o numero inteiro digitado anteriormente sera guardado e correspondera ao numero de meses.
		
		if (tempodeposito >= 5){
			double saldoatual = valordepositado + (valordepositado * 0.95);
			System.out.println(" ");
			System.out.println("Usuario: " + nome);
			System.out.println("Tempo deposito: " + ano + " anos e " + meses + " meses");
			System.out.println("Valor depositado: R$ " + valordepositado);
			System.out.println("Juros: 0,95%");
			System.out.println("Saldo atual: R$ " + saldoatual);
		}
		
		else if ((tempodeposito < 5) && (tempodeposito >= 4)){
			double saldoatual = valordepositado + (valordepositado * 0.90);
			System.out.println(" ");
			System.out.println("Usuario: " + nome);
			System.out.println("Tempo deposito: " + ano + " anos e " + meses + " meses");
			System.out.println("Valor depositado: R$ " + valordepositado);
			System.out.println("Juros: 0,90%");
			System.out.println("Saldo atual: R$ " + saldoatual);
		}
		
		else if ((tempodeposito < 4) && (tempodeposito >= 3)){
			double saldoatual = valordepositado + (valordepositado * 0.85);
			System.out.println(" ");
			System.out.println("Usuario: " + nome);
			System.out.println("Tempo deposito: " + ano + " anos e " + meses + " meses");
			System.out.println("Valor depositado: R$ " + valordepositado);
			System.out.println("Juros: 0,85%");
			System.out.println("Saldo atual: R$ " + saldoatual);
		}
		
		else if ((tempodeposito < 3) && (tempodeposito >= 2)){
			double saldoatual = valordepositado + (valordepositado * 0.75);
			System.out.println(" ");
			System.out.println("Usuario: " + nome);
			System.out.println("Tempo deposito: " + ano + " anos e " + meses + " meses");
			System.out.println("Valor depositado: R$ " + valordepositado);
			System.out.println("Juros: 0,75%");
			System.out.println("Saldo atual: R$ " + saldoatual);
		}
		
		else if ((tempodeposito < 2) && (tempodeposito >= 1)){
			double saldoatual = valordepositado + (valordepositado * 0.65);
			System.out.println(" ");
			System.out.println("Usuario: " + nome);
			System.out.println("Tempo deposito: " + ano + " anos e " + meses + " meses");
			System.out.println("Valor depositado: R$ " + valordepositado);
			System.out.println("Juros: 0,65%");
			System.out.println("Saldo atual: R$ " + saldoatual);
		}
		
		else if (tempodeposito < 1){
			double saldoatual = valordepositado + (valordepositado * 0.55);
			System.out.println(" ");
			System.out.println("Usuario: " + nome);
			System.out.println("Tempo deposito: " + ano + " anos e " + meses + " meses");
			System.out.println("Valor depositado: R$ " + valordepositado);
			System.out.println("Juros: 0,55%");
			System.out.println("Saldo atual: R$ " + saldoatual);
		}
	

	}

}
