package br.terceira.unidade;
import java.util.*;
public class Questao28 {

	/**
	 * Um comerciante comprou um produto e quer vendê-lo com um lucro de 45% se o valor da compra for menor que
R$ 20,00; caso contrário, o lucro será de 30%. Elabore um algoritmo que leia o valor do produto e imprima o valor
de venda para o produto.
	 */
	
	public static void main(String[] args) {
		
		String nomeproduto;
		double valorproduto = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ola, usuario. Sou um programa criado para calcular qual o preço de revenda de certo produto.");
		System.out.println(" ");
		System.out.println("Obs.: Se o produto comprado for menos que R$ 20,00 (vinte reais), sera aplicado 45% no preço de revenda. Caso contrario, 30%.");
		System.out.println("Pressione enter para continuar.");
		sc.nextLine();
		
		System.out.println("Digite o nome do produto comprado.");
		nomeproduto = sc.nextLine();
		
		System.out.println("Digite o valor do produto comprado.");
		System.out.println("Obs.: Digite apenas numeros. Ex.: 2,50.");
		valorproduto = sc.nextDouble();
		
		sc.close();
		
		if (valorproduto < 20){
			double revenda = valorproduto + (valorproduto * 0.45);
			System.out.println("Nome do produto: " + nomeproduto);
			System.out.println("Valor do produto: R$ " + valorproduto);
			System.out.printf("Preço de revenda: R$ %.2f " , revenda);
		}
		
		else if (valorproduto >= 20){
			double revenda = valorproduto + (valorproduto * 0.30);
			System.out.println("Nome do produto: " + nomeproduto);
			System.out.println("Valor do produto: R$ " + valorproduto);
			System.out.printf("Preço de revenda: R$ %.2f " , revenda);
		}
	}

}