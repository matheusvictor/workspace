package UN2_ListaDeProgramacao2;

import java.util.*;

public class Locadora {
	/**
	 * Programa feito para locar DVD's.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String nome, CPF;
		double valordvd1 = 45;
		double valordvd2 = 30;
		double valordvd3 = 15;
		int opc = 0;
		int continuar = 0;
		
		String dvd1 = "O Senhor dos Aneis - A Trilogia";
		String dvd2 = "As Cronicas de Narnia - A Trilogia";
		String dvd3 = "Sherlock Holmes";
		//Criando banco de dados com os DVDs presentes na locadora.

		
		System.out.println("Ola, seja bem-vind@ a nossa locadora.");
		System.out.println("Devido a pouca quantidade de filmes presente em nosso inventario, apenas um filme podera ser locado por vez.");

		System.out.println(" ");
		System.out.println("Digite o seu nome, por favor.");
		nome = sc.nextLine();
		
		System.out.println(nome + ", digite o seu CPF.");
		CPF = sc.nextLine();
		
		System.out.println("Cadastro realizado com sucessso. Confira os dados abaixo:");
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + CPF);
		System.out.println("");
		System.out.println("Pressione enter para continuar e ter acesso a lista dos nossos DVDs.");
		sc.nextLine();
		
		System.out.println("Lista de DVDs da Locadora:" );
		System.out.println(" ");
		System.out.println("1- " + dvd1); // + " - R$ 45,00 (durante 7 dias)");
		System.out.println("2- " + dvd2); // + " - R$ 30,00 (durante 7 dias)");
		System.out.println("3- " + dvd3); // + " - R$ 15,00 (durante 7 dias)");
							
		System.out.println(" ");
		System.out.println("Digite o numero correspondende ao DVD que deseja locar.");
		opc = sc.nextInt();
					
		while (opc >= 4 ) {
			System.out.println("Desculpe, opçao nao existente. Tente novamente.");
			System.out.println("Digite o numero correspondende ao DVD que deseja locar.");
			opc = sc.nextInt();
		}
					
		if (opc == 1){
			System.out.println("Filme escolhido: " + dvd1);
			System.out.println("Valor: R$ " + valordvd1 + " (durante uma semana)");
		}
		
		if (opc == 2){
			System.out.println("Filme escolhido: " + dvd2);
			System.out.println("Valor: R$ " + valordvd2 + " (durante uma semana)");
		}
		
		if (opc == 3){
			System.out.println("Filme escolhido: " + dvd3);
			System.out.println("Valor: R$ " + valordvd3 + " (durante uma semana)");
		}
		
		System.out.println(" ");
		System.out.println("Por favor, lembre-se de devolver o DVD no prazo.");
		System.out.println("Multa: R$ 4,00 por dia de atraso.");
		System.out.println("Volte sempre!");
	}
	
	}
		
