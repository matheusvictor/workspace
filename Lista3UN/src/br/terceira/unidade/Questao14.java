package br.terceira.unidade;
import java.util.*;
public class Questao14 {

	/**
	 * Baseado no ano e peso do modelo de um automóvel, o estado de Nova Jersey determina a sua classe de peso e
taxa de registro usando a seguinte tabela:

ANO DO MODELO			PESO			CLASSE			TAXA DE REGISTRO

1970 ou antes		  Menos de 1200kg     1					16,50
					  De 1200 a 1700 kg   2					25,50
					  Mais de 1700 kg     3					46,50
					  
1971 a 1979			  Menos de 1200 kg    4					27,00
					  De 1200 a 1700 kg   5					30,50
					  Mais de 1700 kg	  6					52,50
					  
1980 ou depois 		 Menos de 3600 kg     7					19,50
					 3600 kg ou mais 	  8					52,50
					 
Usando esta informação escreva um programa que receba o ano e o peso do modelo de um automóvel e
calcule e imprima a classe de peso e a taxa de registro para o carro.
	 */
	public static void main(String[] args) {

		String nome, placa, automovel;
		int anoveiculo;
		double peso;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Usuario, seja bem-vind@ ao nosso registro de automovel.");		
		System.out.println("Para começar a usar o programa tecle enter.");
		sc.nextLine();
				
		System.out.println("Digite o seu nome, por gentileza.");
		nome = sc.nextLine();
		
		System.out.println("Insira o nome do seu automovel.");
		automovel = sc.nextLine();
		
		System.out.println("Digite a placa do seu veiculo. Ex.: AAA-123.");
		placa = sc.nextLine();
		
		System.out.println("Digite o ano do seu veiculo.");
		System.out.println("Obs.: o ano deve conter quatro algarismos. Ex.: 2000");
		anoveiculo = sc.nextInt();
		
		System.out.println("Digite o peso (em Kg) do veiculo.");
		System.out.println("Obs.: Digite apenas numeros (o mesmo pode conter virgulas).");
		peso = sc.nextDouble();
		
		if ((anoveiculo <= 1970) && (peso < 1200)) {
			System.out.println(" ");
			System.out.println("Dono do veiculo: " + nome);
			System.out.println("Nome do automovel: " + automovel);
			System.out.println("Placa do veiculo: " + placa);
			System.out.println("Ano: " + anoveiculo);
			System.out.println("Peso: " + peso + " Kg");
			System.out.println("Classe: 1");
			System.out.println("Taxa de registro: R$ 16,50");
			
		}
		
		else if ((anoveiculo <= 1970) && ((peso == 1200) || (peso <= 1700))) {
				System.out.println(" ");
				System.out.println("Dono do veiculo: " + nome);
				System.out.println("Nome do automovel: " + automovel);
				System.out.println("Placa do veiculo: " + placa);
				System.out.println("Ano: " + anoveiculo);
				System.out.println("Peso: " + peso + " Kg");
				System.out.println("Classe: 2");
				System.out.println("Taxa de registro: R$ 25,50");
		}
			
		else if ((anoveiculo <= 1970) && (peso > 1700)) {
				System.out.println(" ");
				System.out.println("Dono do veiculo: " + nome);
				System.out.println("Nome do automovel: " + automovel);
				System.out.println("Placa do veiculo: " + placa);
				System.out.println("Ano: " + anoveiculo);
				System.out.println("Peso: " + peso + " Kg");
				System.out.println("Classe: 3");
				System.out.println("Taxa de registro: R$ 46,50");
		}
			
		else if ((anoveiculo == 1971) || (anoveiculo <= 1979) && (peso < 1200)) {
				System.out.println(" ");
				System.out.println("Dono do veiculo: " + nome);
				System.out.println("Nome do automovel: " + automovel);
				System.out.println("Placa do veiculo: " + placa);
				System.out.println("Ano: " + anoveiculo);
				System.out.println("Peso: " + peso + " Kg");
				System.out.println("Classe: 4");
				System.out.println("Taxa de registro: R$ 27,00");
		}
			
		else if ((anoveiculo == 1971) || (anoveiculo <= 1979) && ((peso == 1200) || (peso <= 1700))) {
				System.out.println(" ");
				System.out.println("Dono do veiculo: " + nome);
				System.out.println("Nome do automovel: " + automovel);
				System.out.println("Placa do veiculo: " + placa);
				System.out.println("Ano: " + anoveiculo);
				System.out.println("Peso: " + peso + " Kg");
				System.out.println("Classe: 5");
				System.out.println("Taxa de registro: R$ 30,50");
		}
			
		else if ((anoveiculo == 1971 || (anoveiculo <= 1979)) && (peso > 1700)) {
				System.out.println(" ");
				System.out.println("Dono do veiculo: " + nome);
				System.out.println("Nome do automovel: " + automovel);
				System.out.println("Placa do veiculo: " + placa);
				System.out.println("Ano: " + anoveiculo);
				System.out.println("Peso: " + peso + " Kg");
				System.out.println("Classe: 6");
				System.out.println("Taxa de registro: R$ 52,50");
		}
			
		else if ((anoveiculo >= 1980) && (peso < 3600)) {
				System.out.println(" ");
				System.out.println("Dono do veiculo: " + nome);
				System.out.println("Nome do automovel: " + automovel);
				System.out.println("Placa do veiculo: " + placa);
				System.out.println("Ano: " + anoveiculo);
				System.out.println("Peso: " + peso + " Kg");
				System.out.println("Classe: 7");
				System.out.println("Taxa de registro: R$ 19,50");
		}
			
		else if ((anoveiculo >= 1980) && (peso >= 3600)) {
				System.out.println(" ");
				System.out.println("Dono do veiculo: " + nome);
				System.out.println("Nome do automovel: " + automovel);
				System.out.println("Placa do veiculo: " + placa);
				System.out.println("Ano: " + anoveiculo);
				System.out.println("Peso: " + peso + " Kg");
				System.out.println("Classe: 8");
				System.out.println("Taxa de registro: R$ 52,50");
		}

	}

}

