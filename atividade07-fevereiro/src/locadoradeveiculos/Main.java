package locadoradeveiculos;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Scanner scnumerico = new Scanner (System.in);
		int opc;
		
		System.out.println("Digite o numero total de veiculos que deseja cadastrar no Patio.");
		int qntd = sc.nextInt();
		
		Patio patio = new Patio(qntd);
				
		do{
			System.out.println("#################################");
			System.out.println("Digite a opçao desejada:");
			System.out.println("1 - Cadastrar.");
			System.out.println("2 - Excluir.");
			System.out.println("3- Listar.");
			System.out.println("4- Listar por marca.");
			System.out.println("0 - Sair");
			System.out.println("##################################");
			opc = scnumerico.nextInt();
			
			while(opc < 0 || opc > 4){
				System.out.println("Tente novamente.");
				opc = scnumerico.nextInt();
			}
			
			if(opc == 1){			
				
				System.out.println("Numero do Chassi.");
				int numeroChassi = scnumerico.nextInt();
				System.out.println("Placa:");
				String placa = sc.next();
				System.out.println("Cor:");
				String cor = sc.next();
				System.out.println("Marca:");
				String marca = sc.next();
				
				Veiculo v = new Veiculo(numeroChassi, cor, marca, placa);
				patio.adicionarVeiculo(v);
			}
	
			else if(opc == 2){
				System.out.println("Para remover um veiculo, digite o numero do chassi.");
				int numeroChassi = scnumerico.nextInt();
								
				if(patio.getVeiculos() != null){
					patio.excluirVeiculo(numeroChassi);
				}
			}
			
			else if(opc == 3){
				patio.listarVeiculos();
			}
			
			else if(opc == 4){
				System.out.println("Para listar veiculos de uma determinada marca, digite o nome desta.");
				String marca = sc.next();
				
				if(patio.getVeiculos() != null){
					patio.listarMarca(marca);
				}

			}
			
			else if(opc  == 0){
				System.out.println("Programa encerrado!");
				System.exit(0);
			}
			
			
		}while(opc != 0);
		
	
	}

}
