package br.terceira.unidade;
import java.util.*;
public class Questao42 {

	/**
	 * Faça um Programa que tendo como dados de entrada o preço de custo de um produto e um código de origem,
emita o preço junto de sua procedência. Caso o código não seja nenhum dos especificados, o produto deve ser
classificado como importado. Código de origem: 1 - Sul, 2 - Norte 3 - Leste, 4 - Oeste, 5 ou 6 - nordeste 7 ou 8
Centro-oeste.
	 */
	
	public static void main(String[] args) {
	
		String nomeproduto;
		double preco = 0;
		int cod = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Usuario, sou um programa criado para controle de mercadorias.");
		System.out.println("Tecle ENTER para continuar.");
		sc.nextLine();
		
		System.out.println("Digite o nome do produto.");
		nomeproduto = sc.nextLine();
		
		System.out.println("Digite o preço (em reais) do produto.");
		System.out.println("Obs.: Digite apenas numeros. Ex.: 250,60.");
		preco = sc.nextDouble();
		
		System.out.println("Digite o codigo do produto.");
		System.out.println("Obs.: Os codigos devem ser numero inteiros e vareiam de 1(um) a 9(nove).");
		cod = sc.nextInt();
		
		sc.close();
		
		switch (cod){
		
		case 1:
			System.out.println("Nome do produto: " + nomeproduto);
			System.out.println("Preço: R$ " + preco);
			System.out.println("Codigo do produto: " + cod);
			System.out.println("Origem: Sul");
			break;
			
		case 2:
			System.out.println("Nome do produto: " + nomeproduto);
			System.out.println("Preço: R$ " + preco);
			System.out.println("Codigo do produto: " + cod);
			System.out.println("Origem: Norte");
			break;
			
		case 3:
			System.out.println("Nome do produto: " + nomeproduto);
			System.out.println("Preço: R$ " + preco);
			System.out.println("Codigo do produto: " + cod);
			System.out.println("Origem: Leste");
			break;
			
		case 4:
			System.out.println("Nome do produto: " + nomeproduto);
			System.out.println("Preço: R$ " + preco);
			System.out.println("Codigo do produto: " + cod);
			System.out.println("Origem: Oeste");
			break;
			
		case 5: case 6:
			System.out.println("Nome do produto: " + nomeproduto);
			System.out.println("Preço: R$ " + preco);
			System.out.println("Codigo do produto: " + cod);
			System.out.println("Origem: Nordeste");
			break;
			
		case 7: case 8:
			System.out.println("Nome do produto: " + nomeproduto);
			System.out.println("Preço: R$ " + preco);
			System.out.println("Codigo do produto: " + cod);
			System.out.println("Origem: Centro-oeste");
			break;
			
		default:
			System.out.println("Nome do produto: " + nomeproduto);
			System.out.println("Preço: R$ " + preco);
			System.out.println("Codigo do produto: " + cod);
			System.out.println("Origem: Importado.");
		}
	}
}