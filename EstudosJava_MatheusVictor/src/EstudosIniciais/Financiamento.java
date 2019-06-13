package EstudosIniciais;
import java.util.*;
public class Financiamento {
	
	/**
	 Faça um algoritmo que receba o valor do salário de uma pessoa e o valor de um financiamento pretendido. Caso
o financiamento seja menor ou igual a 5 vezes o salário da pessoa, o algoritmo deverá escrever "Financiamento
Concedido"; senão, ele deverá escrever "Financiamento Negado".
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String nome;
		int contador = 0;
		int tentativas = 3;
		double salario = 0;
		//Declarando as variaveis
		
		System.out.println("Usuario, sou um programa criado para fornecer emprestimo.");
		System.out.println("Obs.: Voce tera um limite de 3 tentativas.");
		System.out.println("Tecle ENTER para continuar.");
		sc.nextLine();
		
		System.out.println("Digite o seu nome, por favor.");
		nome = sc.nextLine();
		//Recebendo o nome do usuario
		
		/** do {
			//O programa excutara essa parte, enquanto esta obedecer a condição citada mais abaixo
			 
			System.out.println("\nDigite o valor, em reais, do seu salario.");
			salario = sc.nextDouble();
			//Recebendo o valor do salario
			
			double financiamento = 5 * salario;
			//Declarando uma variavel que obedeça a regra do financiamento
			 
			System.out.println("Digite o valor, em reais, do financiamento pretendido.");
			financiamento = sc.nextDouble();
			//Recebendo o valor do financiamento
			 
			if (financiamento <= salario){
			//Se o salario for correspondente a regra do financiamento...
			 
				System.out.println("\nNome do usuario: " + nome);
				System.out.println("Salario: R$ " + salario);
				System.out.println("Valor do financiamento: R$ " + financiamento);
				System.out.println("Situaçao: Financiamento concedido!");
				System.exit(0);
			}
			
			else {
			//Caso contrario...
				System.out.println("\nFinanciamento negado!");
				System.out.println("Motivo: O valor do financiamento eh maior do que cinco vezes o valor do seu salario.");
			}
						
			contador ++;
			//Contador sempre acrescentando +1, até o limite das tentativas
			 
		} while (contador < tentativas);
		//Condição para o contador continuar funcionando

		System.out.println("Numero de tentativas excedido.");
*/
		for (contador = 0; contador < tentativas; contador ++){
			
			System.out.println("\nDigite o valor, em reais, do seu salario.");
			salario = sc.nextDouble();
			
			double financiamento = 5 * salario;
			
			System.out.println("Digite o valor, em reais, do financiamento pretendido.");
			financiamento = sc.nextDouble();
			
			if (financiamento <= salario){
				System.out.println("\nNome do usuario: " + nome);
				System.out.println("Salario: R$ " + salario);
				System.out.println("Valor do financiamento: R$ " + financiamento);
				System.out.println("Situaçao: Financiamento concedido!");
				System.exit(0);
			}
			
			else {
				System.out.println("\nFinanciamento negado!");
				System.out.println("Motivo: O valor do financiamento eh maior do que cinco vezes o valor do seu salario.");
			}
		}
		
		System.out.println("Numero de tentativas excedido.");
	}

}
