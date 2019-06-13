package br.quarta.unidade;
import java.util.*;
public class Financiamento {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double salario, financiamento = 0;
		int contador = 0;
		//O contador ira iniciar do zero.
		int tentativas = 5;
		//Definindo o limite maximo que o laço sera rodado.
		
		System.out.println("Usuario, sou um programa criado para fornecer emprestimo.");
		System.out.println("Obs.: Voce tera um limite de 5 tentativas.");
		System.out.println("Tecle ENTER para continuar.");
		sc.nextLine();
	
		do {	
			//o DO executa o codigo antes mesmo de testat uma condicional, entretanto, nao deixa de obdece-la no final deste
			System.out.println("Digite o valor do seu salario.");
			salario = sc.nextDouble();
			System.out.println("Digite o valor do financiamento pretendido.");
			financiamento = sc.nextDouble();
			
			if (financiamento <= (5*salario)){
				System.out.println(" ");
				System.out.println("Financiamento Concedido!");
				System.exit(0);
				//Caso as condições se encaixe, eh necessário parar o programa para que este nao continue rodando.
			}
			
			else {
				System.out.println(" ");
				System.out.println("Financiamento Negado!");
			}
			
			contador ++;
			//Caso a condicional ainda nao tenha sido efetuada, o programa continuara rodando ate o numero limite.
			//Neste caso, o contador estara sempre contando +1
			
		}	while (contador < tentativas);
		//O programa  sera executado ENQUANTO o contador nao atinge o limite.
		
		System.out.println("Numero de tentativas excedidas.");
		//Caso o usuario estoure o limite de tentativas, essa mensagem sera exibida
	}
}