package br.terceira.unidade;
import java.util.*;
public class Questao60 {

	/** O Hipermercado Tabajara está com uma promoção de carnes que é imperdível.
	 * 
Até 5 Kg 						Acima de 5 Kg

File Duplo R$ 4,90 por Kg 		R$ 5,80 por Kg
Alcatra R$ 5,90 por Kg 			R$ 6,80 por Kg
Picanha R$ 6,90 por Kg 			R$ 7,80 por Kg

Confira:
a. Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção, porém
não há limites para a quantidade de carne por cliente. Se compra for feita no cartão Tabajara o cliente receberá
ainda um desconto de 5% sobre o total a compra.
Escreva um programa que peça o tipo e a quantidade de carne 
comprada pelo usuário e gere um cupom fiscal, contendo as informações da compra: tipo e quantidade de carne,
preço total, tipo de pagamento, valor do desconto e valor a pagar.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String nome;
		int tipodecarne = 0;
		int opc = 0;
		double peso;
		
		System.out.println("Bem-vindo ao Hipermercado Tabajara!");
		System.out.println(" ");
		System.out.println("Confira nossa Promoção de Carnes. Esta imperdivel!");
		System.out.println(" ");
		System.out.println("Tipo de carne: 					Preço (por quilo): ");
		System.out.println(" ");
		System.out.println("File Duplo (cod. 1)            			R$ 4,90 (até 5 Kg) ou R$ 5,80 (acima de 5 Kg).");
		System.out.println("Alcatra (cod. 2)				R$ 5,90 (até 5 Kg) ou R$ 6,80 (acima de 5 Kg).");
		System.out.println("Picanha (cod. 3)				R$ 6,90 (até 5 Kg) ou R$ 7,80 (acima de 5 Kg).");
		
		System.out.println(" ");
		System.out.println("Obs.: Cada cliente so podera levar um tipo de carne, entretanto, a quantidade (em quilos) da mesma eh opcional.");
		System.out.println(" ");
		System.out.println("Tecle ENTER para continuar.");
		sc.nextLine();
		
		System.out.println("Digite o seu nome, por favor.");
		nome = sc.nextLine();
		
		System.out.println("A compra sera feita usando o Cartao Tabajara?");
		System.out.println(" ");
		System.out.println("1- Sim");
		System.out.println("2- Nao");
		opc = sc.nextInt();
		
		while (opc != 1 && opc != 2){
			System.out.println("Erro. Tente novamente!");
			opc = sc.nextInt();	
		}
		
		System.out.println("Digite o numero do código correspondente ao tipo da carne que deseja comprar. Ex.: Digite 3 caso deseje comprar Picannha.");
		tipodecarne = sc.nextInt();
		
		while (tipodecarne < 1 || tipodecarne > 3){
			System.out.println("Opçao invalida! Tente novamente.");
			tipodecarne = sc.nextInt();
		}
		
		System.out.println("Digite a quantidade (em quilos) que deseja comprar.");
		System.out.println("Obs.: Digite apenas numeros. O mesmo pode conter virgula.");
		peso = sc.nextDouble();
		
		while (peso <= 0){
			System.out.println("Erro! Eh preciso comprar, no minimo, 1 Kg de carne.");
			peso = sc.nextDouble();
		}

		sc.close();
		
		if (opc == 1){
			
			if (tipodecarne == 1 && peso <=5){
				double compra = peso * 4.90;
				double descontos = (compra * 5)/100;
				double total = compra - descontos;
		System.out.println(" ");
		System.out.println("Nome do cliente: " + nome);
		System.out.println("Tipo de carne: File Duplo (cod. 1)");
		System.out.println("Quantidade: " + peso + " Kg");
		System.out.println("Valor da compra: R$ " + compra);
		System.out.println("Tipo de pagamento: Cartao Tabajara.");
		System.out.println("Descontos: R$ " + Math.ceil(descontos));
		System.out.printf("Total a pagar: R$ %.2f" , total);
			}
			
				else if (tipodecarne == 1 && peso > 5){
				double compra = peso * 5.80;
				double descontos = (compra * 5)/100;
				double total = compra - descontos;
		System.out.println(" ");
		System.out.println("Nome do cliente: " + nome);
		System.out.println("Tipo de carne: File Duplo (cod. 1)");
		System.out.println("Quantidade: " + peso + " Kg");
		System.out.println("Valor da compra: R$ " + compra);
		System.out.println("Tipo de pagamento: Cartao Tabajara.");
		System.out.println("Descontos: R$ " + Math.ceil(descontos));
		System.out.printf("Total a pagar: R$ %.2f" , total);
			}
			
				else if (tipodecarne == 2 && peso <=5){
				double compra = peso * 5.90;
				double descontos = (compra * 5)/100;
				double total = compra - descontos;
		System.out.println(" ");
		System.out.println("Nome do cliente: " + nome);
		System.out.println("Tipo de carne: Alcatra (cod. 2)");
		System.out.println("Quantidade: " + peso + " Kg");
		System.out.println("Valor da compra: R$ " + compra);
		System.out.println("Tipo de pagamento: Cartao Tabajara.");
		System.out.println("Descontos: R$ " + Math.ceil(descontos));
		System.out.printf("Total a pagar: R$ %.2f" , total);
			}
			
				else if (tipodecarne == 2 && peso > 5){
				double compra = peso * 6.80;
				double descontos = (compra * 5)/100;
				double total = compra - descontos;
		System.out.println(" ");
		System.out.println("Nome do cliente: " + nome);
		System.out.println("Tipo de carne: Alcatra (cod. 2)");
		System.out.println("Quantidade: " + peso + " Kg");
		System.out.println("Valor da compra: R$ " + compra);
		System.out.println("Tipo de pagamento: Cartao Tabajara.");
		System.out.println("Descontos: R$ " + Math.ceil(descontos));
		System.out.printf("Total a pagar: R$ %.2f" , total);
			}
			
				else if (tipodecarne == 3 && peso <=5){
				double compra = peso * 6.90;
				double descontos = (compra * 5)/100;
				double total = compra - descontos;
		System.out.println(" ");
		System.out.println("Nome do cliente: " + nome);
		System.out.println("Tipo de carne: Picanha (cod. 3)");
		System.out.println("Quantidade: " + peso + " Kg");
		System.out.println("Valor da compra: R$ " + compra);
		System.out.println("Tipo de pagamento: Cartao Tabajara.");
		System.out.println("Descontos: R$ " + Math.ceil(descontos));
		System.out.printf("Total a pagar: R$ %.2f" , total);
			}
			
				else if (tipodecarne == 3 && peso > 5){
				double compra = peso * 7.80;
				double descontos = (compra * 5)/100;
				double total = compra - descontos;
		System.out.println(" ");
		System.out.println("Nome do cliente: " + nome);
		System.out.println("Tipo de carne: Picanha (cod. 3)");
		System.out.println("Quantidade: " + peso + " Kg");
		System.out.println("Valor da compra: R$ " + compra);
		System.out.println("Tipo de pagamento: Cartao Tabajara.");
		System.out.println("Descontos: R$ " + Math.ceil(descontos));
		System.out.printf("Total a pagar: R$ %.2f" , total);
			}
			
		}
			//
		
		if (opc == 2){
			
				if (tipodecarne == 1 && peso <=5){
				double compra = peso * 4.90;
		System.out.println(" ");
		System.out.println("Nome do cliente: " + nome);
		System.out.println("Tipo de carne: File Duplo (cod. 1)");
		System.out.println("Quantidade: " + peso + " Kg");
		System.out.println("Valor da compra: R$ " + compra);
		System.out.println("Tipo de pagamento: A vista.");
		System.out.println("Descontos: Pagamentos a vista nao ha descontos.");
		System.out.printf("Total a pagar: R$ %.2f" , compra);
			}
			
				else if (tipodecarne == 1 && peso > 5){
				double compra = peso * 5.80;
		System.out.println(" ");
		System.out.println("Nome do cliente: " + nome);
		System.out.println("Tipo de carne: File Duplo (cod. 1)");
		System.out.println("Quantidade: " + peso + " Kg");
		System.out.println("Valor da compra: R$ " + compra);
		System.out.println("Tipo de pagamento: A vista.");
		System.out.println("Descontos: Pagamentos a vista nao ha descontos.");
		System.out.printf("Total a pagar: R$ %.2f" , compra);
			}
				else if (tipodecarne == 2 && peso <=5){
				double compra = peso * 5.90;
		System.out.println(" ");
		System.out.println("Nome do cliente: " + nome);
		System.out.println("Tipo de carne: Alcatra (cod. 2)");
		System.out.println("Quantidade: " + peso + " Kg");
		System.out.println("Valor da compra: R$ " + compra);
		System.out.println("Tipo de pagamento: A vista.");
		System.out.println("Descontos: Pagamentos a vista nao ha descontos.");
		System.out.printf("Total a pagar: R$ %.2f" , compra);
			}
				else if (tipodecarne == 2 && peso > 5){
				double compra = peso * 6.80;
		System.out.println(" ");
		System.out.println("Nome do cliente: " + nome);
		System.out.println("Tipo de carne: Alcatra (cod. 2)");
		System.out.println("Quantidade: " + peso + " Kg");
		System.out.println("Valor da compra: R$ " + compra);
		System.out.println("Tipo de pagamento: A vista.");
		System.out.println("Descontos: Pagamentos a vista nao ha descontos.");
		System.out.printf("Total a pagar: R$ %.2f" , compra);
			}
	
				else if (tipodecarne == 3 && peso <=5){
				double compra = peso * 6.90;
		System.out.println(" ");
		System.out.println("Nome do cliente: " + nome);
		System.out.println("Tipo de carne: Picanha (cod. 3)");
		System.out.println("Quantidade: " + peso + " Kg");
		System.out.println("Valor da compra: R$ " + compra);
		System.out.println("Tipo de pagamento: A vista.");
		System.out.println("Descontos: Pagamentos a vista nao ha descontos.");
		System.out.printf("Total a pagar: R$ %.2f" , compra);
			}
			
				else if (tipodecarne == 3 && peso > 5){
				double compra = peso * 7.80;
		System.out.println(" ");
		System.out.println("Nome do cliente: " + nome);
		System.out.println("Tipo de carne: Picanha (cod. 3)");
		System.out.println("Quantidade: " + peso + " Kg");
		System.out.println("Valor da compra: R$ " + compra);
		System.out.println("Tipo de pagamento: A vista.");
		System.out.println("Descontos: Pagamentos a vista nao ha descontos.");
		System.out.printf("Total a pagar: R$ %.2f" , compra);
			}				
		}
	}
}