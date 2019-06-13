package lt;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vendedor v = new Vendedor();
		int opc;
		
		do{
			System.out.println("Selecione uma opc.:");
			System.out.println("1- Executar");
			System.out.println("0 - Sair do programa.");
			opc = sc.nextInt();
			
			if(opc == 0){
				System.out.println("\nPrograma encerrado!");
				System.exit(0);
			}
			
			System.out.println("Nome do vendedor:");
			v.nome = sc.next();
			System.out.println("Salario base (R$): ");
			v.salBase = sc.nextDouble();
			System.out.println("Total de vendas (R$): ");
			v.totalVendas = sc.nextDouble();
			System.out.println("Nº de dependentes:");
			v.numeroDeDependentes = sc.nextInt();
			
			v.calcularComissao();
			v.calcularSalarioBruto();
			v.calcularBonus();
			v.calcularIRPF();
			v.calcularINSS();
			v.calcularSalarioFamilia();
			v.calcularSalarioLiquido();
			v.imprimirFolhaPagamento();
		
		}while(opc != 0);
		
		
	}
	
}