package br.terceira.unidade;
import java.util.*;
public class Questao56 {

	/**
	 * Um posto está vendendo combustíveis com a seguinte tabela de descontos:
	 * 
Álcool: até 20 litros, desconto de 3% por litro acima de 20 litros, desconto de 5% por litro
Gasolina: até 20 litros, desconto de 4% por litro acima de 20 litros, desconto de 6% por litro.

Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: A- álcool, G-gasolina), calcule e imprima o
valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.
*/
	public static void main(String[] args) {
		
		double litros = 0;
		char x;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Seja bem-vindo(a) ao Posto de Abastecimento da Bahia.");
		System.out.println("Tecle ENTER para continuar.");
		sc.nextLine();
		
		System.out.println("Antes de abastecer, confira nossa Super Promoçao!!!");
		System.out.println(" ");
		System.out.println("Gasolina = R$ 2,50 por litro");
		System.out.println("Clientes que abastecerem ate 20 litros de Gasolina recebem 4% de desconto por litro. Acima de 20 litros, recebem ate 6% por litro.");
		System.out.println(" ");
		System.out.println("Alcool = R$ 1,90 por litro.");
		System.out.println("Clientes que abastecerem ate 20 litros de Alcool recebem 3% de desconto por litro. Acima de 20 litros, recebem ate 5% por litro.");
		System.out.println(" ");
		System.out.println("Para continuar, tecle ENTER.");
		sc.nextLine();

		System.out.println("Deseja abastecer com Alcool ou Gasolina? Digite A se deseja abastecer com Alcool, ou G se deseja abastecer com Gasolina.");
		x = sc.nextLine().charAt(0);
		
		while ((x != 'A' && x!= 'a') && (x != 'G' && x != 'g')){
			System.out.println("Opçao invalida. Tente novamente!");
			x = sc.nextLine().charAt(0);	
		}
		
		System.out.println("Digite o numero de litros que deseja abastecer.");
		System.out.println("Obs.: Digite apenas numeros. O mesmo pode ser decimal.");
		litros = sc.nextDouble();
		
		while (litros < 1){
			System.out.println("Erro! Eh preciso abastecer pelo menos 1 litro.");
			System.out.println("Tente novamente!");
			litros = sc.nextDouble();
		}
	
		sc.close();
		
		if ((x == 'A' || x == 'a') && (litros <= 20)){
			double compra = litros * 1.90;
			double descontos = (compra * 3)/100;
			double total = compra - descontos;
			System.out.println(" ");
			System.out.println("Tipo de combustivel: Alcool");
			System.out.println("Litros comprados: " + litros);
			System.out.println("Valor da compra: R$ " + compra);
			System.out.printf("Descontos: R$ %.2f" , descontos);
			System.out.printf("\nTotal a pagar: R$ %.2f" , total);
		}
		
		else if ((x == 'A' || x == 'a') && (litros > 20)){
			double compra = litros * 1.90;
			double descontos = (compra * 5)/100;
			double total = compra - descontos;
			System.out.println(" ");
			System.out.println("Tipo de combustivel: Alcool");
			System.out.println("Litros comprados: " + litros);
			System.out.println("Valor da compra: R$ " + compra);
			System.out.printf("Descontos: R$ %.2f" , descontos);
			System.out.printf("\nTotal a pagar: R$ %.2f" , total);
		} 
		
		else if ((x == 'G' || x == 'g') && (litros <= 20)){
			double compra = litros * 2.50;
			double descontos = (compra * 4)/100;
			double total = compra - descontos;
			System.out.println(" ");
			System.out.println("Tipo de combustivel: Alcool");
			System.out.println("Litros comprados: " + litros);
			System.out.println("Valor da compra: R$ " + compra);
			System.out.printf("Descontos: R$ %.2f" , descontos);
			System.out.printf("\nTotal a pagar: R$ %.2f" , total);
		}
		
		else if ((x == 'G' || x == 'g') && (litros > 20)){
			double compra = litros * 2.50;
			double descontos = (compra * 6)/100;
			double total = compra - descontos;
			System.out.println(" ");
			System.out.println("Tipo de combustivel: Alcool");
			System.out.println("Litros comprados: " + litros);
			System.out.println("Valor da compra: R$ " + compra);
			System.out.printf("Descontos: R$ %.2f" , descontos);
			System.out.printf("\nTotal a pagar: R$ %.2f" , total);
		}	
	}
}