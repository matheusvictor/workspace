package banco;

import java.util.Scanner;

public class Main {

	public static void menu(){
		System.out.println("##################################");
		System.out.println("1- Add. conta pop..");
		System.out.println("2- Add. conta corrente.");
		System.out.println("3- Listar todas as contas.");
		System.out.println("##################################");
	}
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Scanner scNumerico = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		
		do{
			menu();
			opcao = scNumerico.nextInt();
			
			if (opcao == 1) {
				System.out.println("Digite o numero da conta pop.");
				int numero = scNumerico.nextInt();
				
				System.out.println();
				
				Conta contaPop = new ContaPoupanca();
				contaPop.setNumero(numero);
				contaPop.setSaldo(0);
				
				if(cliente.adicionar(contaPop)){
					System.out.println("Conta pop. adicionada com sucesso!");
					System.out.println("A conta adicionada tem seu saldo inicial igual a R$ 0,00.");
				} else{
					System.out.println("Erro ao adicionar conta poupanca.");
				}
			}
			
			else if(opcao == 2){
				System.out.println("Digite o numero da conta corrente.");
				int numero = scNumerico.nextInt();
				
				System.out.println();
				
				Conta contaCorrente = new ContaCorrente();
				contaCorrente.setNumero(numero);
				contaCorrente.setSaldo(0);
				
				if(cliente.adicionar(contaCorrente)){
					System.out.println("Conta corrente adicionada com sucesso!");
					System.out.println("A conta adicionada tem seu saldo inicial igual a R$ 0,00.");
				} else{
					System.out.println("Erro ao adicionar conta corrente.");
				}
			}
			
			else if(opcao == 3){
				cliente.listarContas();
			}
			
			else{
				System.out.println("Programa encerrado!");
				System.exit(0);
			}
			
		}while(opcao != 3);
		

	}

}
