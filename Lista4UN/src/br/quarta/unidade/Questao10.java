package br.quarta.unidade;
import java.util.*;
public class Questao10 {

	/**
	 * Faça um Programa que tendo como dados de entrada o preço de custo de um produto e um código de origem,
emita o preço junto de sua procedência. Enquanto o código não seja nenhum dos especificados, o produto deve
ser classificado como importado. Código de origem: 1 - Sul, 2 - Norte 3 - Leste, 4 - Oeste, 5 ou 6 - nordeste 7 ou 8
Centro-oeste.
	 */
	
	public static void main(String[] args) {
		String nomeproduto;
		double preco = 0;
		int opc = 0;
		int cod = 0;
		int contador = 0;
		int limite = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Usuario, sou um programa criado para controle de mercadorias.");
		System.out.println("1 - Executar o programa.");
		System.out.println("2 - SAIR");
		opc = sc.nextInt();
		
		while ((opc != 1) && (opc != 2)){
			System.out.println("Erro! Tente novamente.");
			opc = sc.nextInt();
		}
		
		if (opc == 2){
			System.out.println("Programa encerrado!");
			System.exit(0);
		}
		
		if (opc == 1){
		System.out.println("Digite o numero de vezes que deseja executar o programa.");
		System.out.println("Obs.: Limte de 5 vezes.");
		limite = sc.nextInt();
		
		while ((limite <= 0) || (limite > 5)){
			System.out.println("Erro! Tente novamente.");
			limite = sc.nextInt();
		}
		
		do {
		System.out.println(" ");
		System.out.println("Digite o nome do produto.");
		nomeproduto = sc.next();
		
		System.out.println("Digite o preço (em reais) do produto.");
		System.out.println("Obs.: Digite apenas numeros. Ex.: 250,60.");
		preco = sc.nextDouble();
		
		System.out.println("Digite o codigo do produto.");
		System.out.println("Obs.: Os codigos devem ser numero inteiros e vareiam de 1(um) a 9(nove).");
		cod = sc.nextInt();
		
		while ((cod <= 0) || (cod > 9)){
			System.out.println("Codigo invalido! Tente novamente.");
			cod = sc.nextInt();
		}
		
		switch (cod){
		
		case 1:
			System.out.println("\nNome do produto: " + nomeproduto);
			System.out.println("Preço: R$ " + preco);
			System.out.println("Codigo do produto: " + cod);
			System.out.println("Origem: Sul");
			break;
			
		case 2:
			System.out.println("\nNome do produto: " + nomeproduto);
			System.out.println("Preço: R$ " + preco);
			System.out.println("Codigo do produto: " + cod);
			System.out.println("Origem: Norte");
			break;
			
		case 3:
			System.out.println("\nNome do produto: " + nomeproduto);
			System.out.println("Preço: R$ " + preco);
			System.out.println("Codigo do produto: " + cod);
			System.out.println("Origem: Leste");
			break;
			
		case 4:
			System.out.println("\nNome do produto: " + nomeproduto);
			System.out.println("Preço: R$ " + preco);
			System.out.println("Codigo do produto: " + cod);
			System.out.println("Origem: Oeste");
			break;
			
		case 5: case 6:
			System.out.println("\nNome do produto: " + nomeproduto);
			System.out.println("Preço: R$ " + preco);
			System.out.println("Codigo do produto: " + cod);
			System.out.println("Origem: Nordeste");
			break;
			
		case 7: case 8:
			System.out.println("\nNome do produto: " + nomeproduto);
			System.out.println("Preço: R$ " + preco);
			System.out.println("Codigo do produto: " + cod);
			System.out.println("Origem: Centro-oeste");
			break;
			//caso, no final de cada CASE, fosse usado CONTINUE ao inves de BREAK, o programa retornaria a primeira linha de comando.
			
		default:
			System.out.println("\nNome do produto: " + nomeproduto);
			System.out.println("Preço: R$ " + preco);
			System.out.println("Codigo do produto: " + cod);
			System.out.println("Origem: Importado.");
		}
		
		contador ++;
		
	} while (contador < limite);
}
		System.out.println("\nPrograma encerrado!");
		System.exit(0);
	}
}