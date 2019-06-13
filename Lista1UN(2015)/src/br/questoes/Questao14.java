package br.questoes;
import java.util.*;
public class Questao14 {
	
	/**
	 * Baseado no ano e peso do modelo de um automóvel, o estado de Nova Jersey determina a sua classe de peso e
taxa de registro usando a seguinte tabela:

ANO DO MODELO			PESO			CLASSE			TAXA DE REGISTRO

1970 ou antes		  Menos de 1200kg     1					16,50   ok
					  De 1200 a 1700 kg   2					25,50   ok
					  Mais de 1700 kg     3					46,50   ok
					  
1971 a 1979			  Menos de 1200 kg    4					27,00   ok
					  De 1200 a 1700 kg   5					30,50   ok
					  Mais de 1700 kg	  6					52,50   ok
					  
1980 ou depois 		 Menos de 3600 kg     7					19,50   ok
					 3600 kg ou mais 	  8					52,50   ok
					 
Usando esta informação escreva um programa que receba o ano e o peso do modelo de um automóvel e
calcule e imprima a classe de peso e a taxa de registro para o carro.
	 */
	
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		
		int ano = 0;
		double peso = 0;
		
		System.out.println("Digite o ano do modelo do veiculo.");
		ano = sc.nextInt();
		
		System.out.println("Digite o peso (em Kg) do veiculo.");
		peso = sc.nextDouble();
		
		if ((ano <= 1970) && (peso < 1200)) {
			System.out.println("Ano: " + ano);
			System.out.println("Peso: " + peso + " Kg");
			System.out.println("Classe: 1");
			System.out.println("Taxa de registro: R$ 16,50");
		}
		
		else if ((ano <= 1970) && ((peso == 1200) || (peso <= 1700))) {
				System.out.println("Ano: " + ano);
				System.out.println("Peso: " + peso + " Kg");
				System.out.println("Classe: 2");
				System.out.println("Taxa de registro: R$ 25,50");
		}
			
		else if ((ano <= 1970) && (peso > 1700)) {
				System.out.println("Ano: " + ano);
				System.out.println("Peso: " + peso + " Kg");
				System.out.println("Classe: 3");
				System.out.println("Taxa de registro: R$ 46,50");
		}
			
		else if ((ano == 1971) || (ano <= 1979) && (peso < 1200)) {
				System.out.println("Ano: " + ano);
				System.out.println("Peso: " + peso + " Kg");
				System.out.println("Classe: 4");
				System.out.println("Taxa de registro: R$ 27,00");
		}
			
		else if ((ano == 1971) || (ano <= 1979) && ((peso == 1200) || (peso <= 1700))) {
				System.out.println("Ano: " + ano);
				System.out.println("Peso: " + peso + " Kg");
				System.out.println("Classe: 5");
				System.out.println("Taxa de registro: R$ 30,50");
		}
			
		else if ((ano == 1971 || (ano <= 1979)) && (peso > 1700)) {
				System.out.println("Ano: " + ano);
				System.out.println("Peso: " + peso + " Kg");
				System.out.println("Classe: 6");
				System.out.println("Taxa de registro: R$ 52,50");
		}
			
		else if ((ano >= 1980) && (peso < 3600)) {
				System.out.println("Ano: " + ano);
				System.out.println("Peso: " + peso + " Kg");
				System.out.println("Classe: 7");
				System.out.println("Taxa de registro: R$ 19,50");
		}
			
		else if ((ano >= 1980) && (peso >= 3600)) {
				System.out.println("Ano: " + ano);
				System.out.println("Peso: " + peso + " Kg");
				System.out.println("Classe: 8");
				System.out.println("Taxa de registro: R$ 52,50");
		}
	}
}